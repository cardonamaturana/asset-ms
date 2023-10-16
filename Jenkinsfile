pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "juliocardona/asset-ms:${env.GIT_COMMIT}"
        DOCKERHUB_TOKEN = vault path: 'secret/docker-hub', key: 'DOCKERHUB_JULIOCARDONA_TOKEN', vaultUrl: 'http://vault-compose:8200'
    }
    stages {
        stage('Clean') {
            steps {
                script {
                    // Asumiendo que estás usando Maven
                    sh 'mvn clean'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Ejecuta tus pruebas. Ejemplo para Maven:
                    sh 'mvn test'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Construye tu imagen de Docker
                    sh "docker build -t $DOCKER_IMAGE ."
                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                script {
                    // Inicia sesión en DockerHub
                    withCredentials([usernamePassword(credentialsId: DOCKERHUB_CREDENTIALS, passwordVariable: 'DOCKERHUB_PASS', usernameVariable: 'DOCKERHUB_USER')]) {
                        sh "docker login -u $DOCKERHUB_USER -p $DOCKERHUB_PASS"
                    }

                    // Envía tu imagen a DockerHub
                    sh "docker push $DOCKER_IMAGE"
                }
            }
        }
    }

    post {
        always {
            // Limpia el entorno al final, independientemente de si la ejecución fue exitosa o no
            sh "docker rmi -f $DOCKER_IMAGE || true"
        }
    }
}

