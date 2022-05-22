// plugin timestamper

pipeline {
  agent any
  options {
    timestamps()
  }

  stages {
    stage('Build') {
      tools {
        maven 'maven_3_8_5'
      }
      // options {
      //   retry(3)
      //   //timestamp option in stage 
      //   timestamps()
      // }
      steps {
        echo "before"
        sh 'mvn --version'
      }
    }
    stage('TEST') {
      steps {
        script {
          // variable in jenkins 
          echo "hello world"
        }
      }
    }
  }
}