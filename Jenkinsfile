   pipeline {
       agent any
       stages {
           stage('Build') {
               steps {
                   bat 'docker run --rm -v "%WORKSPACE%":/project -v gradle-cache:/home/gradle/.gradle -w /project gradle:jdk21 gradle build --no-daemon'
               }
           }
           stage('Test') {
               steps {
                   bat 'docker run --rm -v "%WORKSPACE%":/project -v gradle-cache:/home/gradle/.gradle -w /project gradle:jdk21 gradle check --no-daemon'
               }
           }
       }

       post {
           always {
               archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
               junit 'build/test-results/**/*.xml'
           }
       }
   }
