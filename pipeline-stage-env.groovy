// plugin timestamper

pipeline {
  agent any
  environment {
    name1 = "jeff"
    name2 = "john"
  }

  stages {
    stage('Build') {
      name3 = Jessie
    } 
    steps{
      echo "name ${name1}"
      echo "name ${name2}"
      echo "name ${name3}"
    }
    stage('TEST') {
      steps{
        echo "name ${name1}"
        echo "name ${name2}"
        echo "name ${name3}" 
      }
    }
  }
}
