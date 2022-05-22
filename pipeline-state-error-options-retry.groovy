pipeline {
  agent any
  stages {
    stage('Build') {
      options:
      {
        retry(3)
      }
      tools {
        maven 'maven_3_8_5'
      }
      steps {
        sh echo 'before'
        sh 'mvn --version'
        error "After error"
      }
    }
  }
}