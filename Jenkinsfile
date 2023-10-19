pipeline {
    agent any

    environment {
            DOCKERHUB_TOKEN    = vault path: 'secret/dockerhub', key: 'JULIOCARDONA_TOKEN', vaultUrl: 'http://127.0.0.1:8200'
        }

    stages {
        stage('Clean') {
            steps {
                script {
                    bat 'mvn clean'
                }
            }
        }

/*
        stage('Install') {
            steps {
                script {
                    bat 'mvn install'
                }
            }
        }

*/
        stage('Show Docker & Docker Compose versions') {
            steps {
                script {
                    bat 'docker --version'

                    echo 'Construyendo docker image ...'
                    echo '.............................'
                    echo '.............................'
                    echo '......DOCKERFILE BUILD.......'
                    echo '.............................'
                    echo '.............................'
                    bat 'docker build -f Dockerfile-java .'

                    bat 'docker-compose --version'
                }
            }
        }
    }
}
