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
                    echo 'Obtener el hash del último commit'
                    def output = bat(script: 'git rev-parse HEAD', returnStdout: true).trim()
                    def commitHash = output.split('\n')[-1]
                    echo "Commit Hash: ${commitHash}"
                    echo 'Construir la imagen Docker usando el hash del commit como tag'
                    bat "docker build -t asset-ms:${commitHash} -f Dockerfile-java ."
                    echo 'Monstrando directorios...'
                    bat 'dir target'
                    echo 'Mostrando directorios nuevamente'
                    bat 'dir'
                    bat 'docker-compose --version'

                }
            }
        }
    }
}
