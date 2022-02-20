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
stage ('Report code') {
steps {echo "Test succeeded"
                     cucumber buildStatus: 'SUCCESS',
                                            failedFeaturesNumber: 0,
                                            failedScenariosNumber: 0,
                                            skippedStepsNumber: 0,
                                            failedStepsNumber: 0,
                                            fileIncludePattern: '**/*.json',
                                            sortingMethod: 'ALPHABETICAL'

      }
}
}
}
