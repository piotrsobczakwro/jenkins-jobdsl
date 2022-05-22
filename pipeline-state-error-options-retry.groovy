pipeline {
  agent any
  stages {
    stage('Build') {
      tools {
        maven 'maven_3_8_5'
      }
      options {
        retry(3)
      }
      steps {
        echo "before"
        sh 'mvn --version'
        error "After error"
      }
    }
    stage('Build with failure') {
      steps {
        script {
          currentBuild.result = "FAILURE"
        }
      }
    }
  }
}