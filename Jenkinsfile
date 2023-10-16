pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                script {
                    sh 'mvn clean'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    def commitId = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
                    def DOCKER_IMAGE = "juliocardona/asset-ms:${commitId}"
                    sh "docker build -t $DOCKER_IMAGE ."
                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                script {
                    def DOCKERHUB_TOKEN = vault path: 'secret/docker-hub', key: 'DOCKERHUB_JULIOCARDONA_TOKEN', vaultUrl: 'http://localhost:8200'
                    sh "docker login -u juliocardona -p $DOCKERHUB_TOKEN"
                    def commitId = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
                    def DOCKER_IMAGE = "juliocardona/asset-ms:${commitId}"
                    sh "docker push $DOCKER_IMAGE"
                }
            }
        }
    }

    post {
        always {
            script {
                def commitId = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
                def DOCKER_IMAGE = "juliocardona/asset-ms:${commitId}"
                sh "docker rmi -f $DOCKER_IMAGE || true"
            }
        }
    }
}
