pipeline {
  agent any

  stages {

    stage('Build on branch main') {
      when {
            branch 'main'
      }
      steps {
        echo "You are on prod...on multibranch "
      }
    }
    stage('Build on branch dev') {
      when {
            branch 'dev'
      }
      steps {
        echo "You are on dev... on multibranch"
      }
    }

  }
}
