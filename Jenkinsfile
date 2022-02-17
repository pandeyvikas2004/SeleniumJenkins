pipeline {
agent none
  tools {
    maven 'maven-3.6.3' 
  }
stages {
stage ('build code') {
steps {
echo 'started'
sh 'mvn clean install'
}

}
}
}
