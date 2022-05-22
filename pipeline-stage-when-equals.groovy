pipeline {
  agent any
  environment{
    some_name = 'jeff'
    version = "1.0"
  }
  stages {

    stage('Build') {
      when {
            equals expected: 'jeff', actual: some_name
      }
      steps {
        echo "You are on prod... "
      }
    }

   stage('Build when not') {
      when {
        not{
          equals expected: 'jeff', actual: some_name
        }
      }
      steps {
        echo "when not ... "
      }
    }

    stage('expression condition correct version') {
      when {
        expression {
          version == "1.0"
        }
      }
      steps {
        echo "Building ..."
      }
    }
  
    stage('expression condition incorrect version') {
      when {
        expression {
          version == "2.0"
        }
      }
      steps {
        echo "Building ..."
      }
    }

    stage('alloff correct values') {
      when {
        allOf {
          environment name: "version", value: "1.0"
          environment name: "some_name", value: "jeff"
        }
      }
      steps {
        echo "Building allOf"
      }
    }

    stage('alloff one incorrect values') {
      when {
        allOf {
          environment name: "version", value: "2.0"
          environment name: "some_name", value: "jeff"
        }
      }
      steps {
        echo "Building allOf"
      }
    }
    
  }
}
