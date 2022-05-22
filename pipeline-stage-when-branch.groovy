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
  }
}
