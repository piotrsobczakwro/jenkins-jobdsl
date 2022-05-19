// Declarative pipeline - example 1
/* groovylint-disable-next-line CompileStatic */
pipeline {
  agent any
  stages {
    stage('dowork') {
      steps {
        echo "I'm working"
      }
    }
  }
  post {
    always {
        mail to: 'piotrsobczak.wro@gmail.com',
        subject: "STATUS FOR PROJECT: ${currentBuild.fullDisplayName}",
        body:"RESULT: ${currentBuild.result}"
    }
  }
}
