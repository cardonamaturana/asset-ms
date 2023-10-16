pipeline {
    agent any

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
                    bat 'docker-compose --version'
                }
            }
        }
    }
}
