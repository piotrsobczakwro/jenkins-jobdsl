pipeline {
    agent any
    stages {
        stage ('Install') {
            steps {
                sh "curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube_latest_amd64.deb"
                sh "sudo dpkg -i minikube_latest_amd64.deb"
            }
        }
        stage ('Minikube Start') {
            steps {
                sh "sudo usermod -aG docker $USER && newgrp docker"
                sh "minikube start"
            }
        }
    
    }
}
