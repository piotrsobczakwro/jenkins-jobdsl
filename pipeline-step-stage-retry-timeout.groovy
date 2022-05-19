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
    stage("Build") {
      steps {
        retry(3) {
          echo "Retry option"
          error "error in retry"
        }
        sleep 2
        echo "afer retry "
        }
      }
    }
  }
}