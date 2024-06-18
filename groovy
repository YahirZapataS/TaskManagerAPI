pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t your-dockerhub-username/taskmanager .'
            }
        }
        stage('Push Docker Image') {
            steps {
                withDockerRegistry([ credentialsId: 'dockerhub', url: '' ]) {
                    sh 'docker push your-dockerhub-username/taskmanager'
                }
            }
        }
        stage('Deploy') {
            steps {
                sshagent(['your-ssh-credentials']) {
                    sh 'ssh your-server "docker pull your-dockerhub-username/taskmanager && docker run -d -p 8080:8080 your-dockerhub-username/taskmanager"'
                }
            }
        }
    }
}
