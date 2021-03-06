pipeline {
  agent any

  stages {

    stage('Build on branch main') {
      when {
            branch 'main'
      }
      steps {
        echo "You are on prod... "
      }
    }
    stage('Build on branch dev') {
      when {
            branch 'madevin'
      }
      steps {
        echo "You are on dev... "
      }
    }

  }
}
