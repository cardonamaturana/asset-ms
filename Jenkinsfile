def NEW_DOCKER_IMAGE = "${DOCKER_IMAGE_BASE}:${commitId}"

pipeline {
    agent any

    environment {
        DOCKERHUB_TOKEN = vault path: 'secret/docker-hub', key: 'DOCKERHUB_JULIOCARDONA_TOKEN', vaultUrl: 'http://localhost:8200'
    }
    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Agrega una etiqueta basada en el ID del commit a la imagen
                    def commitId = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
                    def DOCKER_IMAGE = "${DOCKER_IMAGE_BASE}:${commitId}"

                    sh "docker build -t $DOCKER_IMAGE ."
                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                script {
                    // Inicia sesión en DockerHub usando el token
                    withCredentials([string(credentialsId: 'DOCKERHUB_TOKEN', variable: 'TOKEN')]) {
                        sh "docker login -u $DOCKERHUB_USER -p $TOKEN"
                        sh "docker push $DOCKER_IMAGE"
                    }
                }
            }
        }
    }

    post {
        always {
            // Limpia el entorno al final
            sh "docker rmi -f ${DOCKER_IMAGE} || true"
        }
    }
}
