pipeline {
  agent any
  tools {
    maven 'Maven'
  }
  stages {
    stage("build") {
      steps {
        echo 'building the application'
        sh "mvn install"
      }
    }
    stage("test") {
      steps {
      }
    }
  }
}

node {
}
