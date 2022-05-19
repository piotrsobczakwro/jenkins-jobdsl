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
          script {
            def name = "Peter"
            // if statement in groovy
            if(name == "Peter")
              println("Hi,${name}")
            else
              println("You are not Peter")
        }
        sleep 10
        echo "Hello world after 10secounds "
        }
      }
    }
  }
}