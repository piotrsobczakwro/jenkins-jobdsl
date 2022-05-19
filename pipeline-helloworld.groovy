pipeline {
  //agent any
  agent {
    node {
        label "master_node"
        customWorkspace "/home/helloworld"
    }
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