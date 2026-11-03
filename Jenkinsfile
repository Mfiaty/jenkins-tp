   pipeline {
       agent any
       stages {
           stage('Test') {
               steps {
                   bat 'docker run --rm -v "%WORKSPACE%":/project -v gradle-cache:/home/gradle/.gradle -w /project gradle:jdk21 gradle check --no-daemon'
               }
           }
       }
       post {
           always {
               junit 'build/test-results/**/*.xml'
           }
       }
   }
