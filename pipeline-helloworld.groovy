pipeline {
  //agent any
  agent {
    node {
        label "master_node1"
        customWorkspace "/home/helloworld"
    }
  }
  stages {
    stage("build") {
      steps {
        echo "Hello World"
      }
    }
  }
}