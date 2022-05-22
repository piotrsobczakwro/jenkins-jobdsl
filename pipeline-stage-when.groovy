pipeline {
  agent any
  environment{
    DEPLOY_TO = 'production'
  }
  stages {
    stage('Build') {
      when {
        environment name :  'production'
      }
      steps {
        echo "You are on prod... "
      }
    }
  }
}