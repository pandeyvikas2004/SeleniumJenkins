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
steps {
  echo "Test succeeded"
                     cucumber buildStatus: 'SUCCESS',
                                            failedFeaturesNumber: 0,
                                            failedScenariosNumber: 0,
                                            skippedStepsNumber: 0,
                                            failedStepsNumber: 0,
                                            fileIncludePattern: '**/*.json',
                                            sortingMethod: 'ALPHABETICAL'

      }
}
stage('Email')
        {
          steps{
        env.ForEmailPlugin = env.WORKSPACE
        emailext mimeType: 'text/html',
        body: '${FILE, path="overview-features.html"}',
        subject: currentBuild.currentResult + " : " + env.JOB_NAME,
        to: 'vikas.1.pandey@coforge.com'
        }   
        }


}
}
