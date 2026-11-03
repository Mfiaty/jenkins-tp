   pipeline {
       agent any
       stages {
           stage('Deploy') {
               steps {
                   retry(3) {
                       bat 'flakey-deploy.bat'
                   }
                   timeout(time: 3, unit: 'MINUTES') {
                       bat 'health-check.bat'
                   }
               }
           }
           stage('Deploy compose') {
               steps {
                   timeout(time: 3, unit: 'MINUTES') {
                       retry(5) {
                           bat 'flakey-deploy.bat'
                       }
                   }
               }
           }
       }
   }
