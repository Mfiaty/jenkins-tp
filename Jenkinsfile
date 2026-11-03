   pipeline {
       agent any
       stages {
           stage('Build') {
               steps {
                   bat 'echo Hello World'
                   bat '''
                       echo Multiline batch steps works too
                       dir
                   '''
                   bat 'set'
               }
           }
       }
   }
