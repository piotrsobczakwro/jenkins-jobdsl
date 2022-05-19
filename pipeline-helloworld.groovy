pipeline {
  //agent any
  agent {
    node {
        // Declared label
        label "master_node1"
        //Declared custom workspace
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