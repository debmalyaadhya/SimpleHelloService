String branchName = "master"
String gitCredentials = "GIT_Credentials"
String repoUrl = "https://github.com/debmalyaadhya/SimpleHelloService.git"

node {
  // Start Stages
    stage('Clone') {
      // Clones the repository from the current branch name
      echo 'Make the output directory'
      sh 'mkdir -p build'

      echo 'Cloning files from (branch: "' + branchName + '" )'
      dir('build') {
          git branch: branchName, credentialsId: 	gitCredentials, url: repoUrl
      }     
    } 
  
    stage('build') {
           dir('build') {
                sh './gradlew clean build'
           }
    }
}