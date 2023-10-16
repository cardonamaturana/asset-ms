pipeline {
    agent any

    environment {
        DOCKER_IMAGE_BASE = "juliocardona/asset-ms"
        // No pongas la versión del DOCKER_IMAGE aquí, la definiremos en los pasos
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
                    def commitId = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
                    def DOCKER_IMAGE = "${DOCKER_IMAGE_BASE}:${commitId}"
                    // Construye tu imagen de Docker
                    sh "docker build -t $DOCKER_IMAGE ."
                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                script {
                    // Adquirir el token de Vault
                    def DOCKERHUB_TOKEN = vault path: 'secret/docker-hub', key: 'DOCKERHUB_JULIOCARDONA_TOKEN', vaultUrl: 'http://localhost:8200'

                    // Inicia sesión en DockerHub
                    withCredentials([string(credentialsId: 'DOCKERHUB_CREDENTIALS', variable: 'DOCKERHUB_PASS')]) {
                        sh "docker login -u juliocardona -p $DOCKERHUB_PASS"
                    }

                    def commitId = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
                    def DOCKER_IMAGE = "${DOCKER_IMAGE_BASE}:${commitId}"
                    // Envía tu imagen a DockerHub
                    sh "docker push $DOCKER_IMAGE"
                }
            }
        }
    }

    post {
        always {
            // Limpia el entorno al final, independientemente de si la ejecución fue exitosa o no
            def commitId = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
            def DOCKER_IMAGE = "${DOCKER_IMAGE_BASE}:${commitId}"
            sh "docker rmi -f $DOCKER_IMAGE || true"
        }
    }
}
