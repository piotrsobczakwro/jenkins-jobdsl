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
    stage('expression condition') {
      when {
          expression {
            version == "1.0"
          }
        }
      }
      steps {
        echo "Building ..."
      }
    }
  }
}