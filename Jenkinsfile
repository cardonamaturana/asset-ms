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

        stage('Install') {
            steps {
                script {
                    bat 'mvn install'
                }
            }
        }
    }
}
