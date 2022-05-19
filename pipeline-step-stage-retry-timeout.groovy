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
        //retry option
        retry(3) {
          echo "Retry option"
          //error in retry
          error "error in retry"
        }
        sleep 2
        echo "afer retry "
        timeout(time: 10, unit:'SECONDS')
        {
          echo "Sleeping in timeout"
          sleep 12
        }
      }
    }
  }
}
