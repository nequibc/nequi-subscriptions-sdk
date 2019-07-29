#!groovy
node {

    stage('Checkout'){
            echo 'Descargando repositorio'			
            currentStage = 'Checkout'                
            checkout scm
    } 

    withMaven(
        sh "mvn clean deploy"
    }
}