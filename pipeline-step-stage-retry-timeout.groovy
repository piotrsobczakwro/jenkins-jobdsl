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
    stage("Retry") {
      steps {
        //retry option
        retry(3) {
          echo "Retry option"
          //error in retry
          error "error in retry"
        }
      }
    }
      stage("Timeout") {
        steps {
          timeout(time: 10, unit:'SECONDS') {
            echo "Sleeping in timeout"
            sleep 12
      }
    }
  }
}
