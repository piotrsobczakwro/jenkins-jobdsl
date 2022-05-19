pipeline {
  //agent any
  agent {
    label "master_node"
  }
  stages{
    stage("build") {
      steps{
        echo "Hello World"
      }
    }
  }
}