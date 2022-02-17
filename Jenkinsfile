pipeline {
agent any
  tools {
    maven 'maven3.6.3' 
  }
stages {
stage ('build code') {
steps {
echo 'started'
bat 'mvn clean install'
}

}
}
}
