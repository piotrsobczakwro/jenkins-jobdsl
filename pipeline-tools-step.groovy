pipeline {
  //agent any
  agent any
  stages {
    stage("Build") {
      tools: {
        maven: 'maven_3_8_5'
      }
      steps {
        sh 'mvn --version'
      }
    }
  }
}