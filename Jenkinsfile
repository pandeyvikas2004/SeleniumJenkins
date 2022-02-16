pipeline {
agent any
  tools {
    maven 'apache-maven-3.6.3' 
  }
stages {
stage ('Compile Stage') {
steps {
echo 'started'
bat'mvn clean compile'
}
}
stage ('Testing Stage') {
steps {
bat'mvn test'
}
}
stage ('Install Stage') {
steps {
bat'mvn install'
}
}
}
}
