#!groovy
node {

    stage('Checkout'){
            echo 'Descargando repositorio'			
            currentStage = 'Checkout'                
            checkout scm
    } 
    stage('Deploy'){
        withMaven(jdk: 'JAVA_1_8_121', maven: 'MAVEN_3_5_0') {
            sh "mvn clean deploy"
        }
    }
}