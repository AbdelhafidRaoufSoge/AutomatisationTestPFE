pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Étape pour récupérer le code source depuis Git
                git 'https://github.com/AbdelhafidRaoufSoge/AutomatisationTestPFE.git'
            }
        }

        stage('Build') {
            steps {
                // Étape pour construire le projet Gradle Kotlin
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                // Étape pour exécuter les tests unitaires
                sh './gradlew test'
            }
        }
    }

    post {
        success {
            // Si le pipeline réussit, envoyer un e-mail de notification
            emailext body: "Le build du projet Gradle Kotlin a réussi.",
                     subject: "Build du projet Kotlin réussi",
                     to: "raouf.abdelhafid@outlook.fr"
        }
        failure {
            // Si le pipeline échoue, envoyer un e-mail de notification
            emailext body: "Le build du projet Gradle Kotlin a échoué.",
                     subject: "Échec du build du projet Kotlin",
                     to: "raouf.abdelhafid@outlook.fr"
        }
    }
}
