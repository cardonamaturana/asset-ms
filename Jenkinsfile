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

        stage('Install') {
            steps {
                script {
                    bat 'mvn install'
                }
            }
        }

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
                    commitHash = output.split('\n')[-1]
                    env.COMMIT_HASH = commitHash
                    echo "Commit Hash: ${commitHash}"
                    echo 'Monstrando directorios...'
                    bat 'dir target'
                    echo 'Mostrando directorios nuevamente'
                    bat 'dir'
                    echo 'Construir la imagen Docker usando el hash del commit como tag'
                    bat "docker build -t juliocardona/asset-ms:${commitHash} -f Dockerfile-java ."

                    bat 'docker-compose --version'

                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                script {
                    // Salir de cualquier sesión previa de Docker Hub
                    bat "docker logout"

                    // Login en Docker Hub
                    bat 'echo ${DOCKERHUB_TOKEN} credenciales1'
                    bat 'echo %DOCKERHUB_TOKEN% credenciales2'
                    bat 'echo $DOCKERHUB_TOKEN credenciales3'
                    bat 'docker login -u juliocardona --password ${DOCKERHUB_TOKEN}'

                    // Subir la imagen
                    bat "docker push juliocardona/asset-ms:${env.COMMIT_HASH}"

                    // Opcional: Salir de Docker Hub al finalizar
                    bat "docker logout"
                }
            }
        }




    }
}
