pipeline {
  //agent any
  agent {
    label "master"
  }
  stages{
    stage("build") {
      steps{
        echo "Hello World"
      }
    }
  }
}