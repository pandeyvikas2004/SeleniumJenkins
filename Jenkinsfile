pipeline {
agent any
  environment {
    PATH = "/opt/apache-mavem-3.6.3/bin:$PATH"
              }
stages {
stage ('build code') {
steps {
echo 'started'
sh "mvn clean install"
}

}
}
}
