pipeline {
  //agent any
  agent {
    label "master_node"
    customWorkspace "/home/helloworld"
  }
  stages{
    stage("build") {
      steps{
        echo "Hello World"
      }
    }
  }
}