   pipeline {
       agent {
           docker { image 'node:26.13.0-alpine3.24' }
       }
       stages {
           stage('Test') {
               steps {
                   sh 'node --eval "console.log(process.arch,process.platform)"'
               }
           }
       }
   }
