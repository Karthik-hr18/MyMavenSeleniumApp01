
pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Karthik-hr18/MyMavenSeleniumApp01.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Selenium') {
            steps {
                sh 'java -jar target/*shaded.jar'
            }
        }

    }

    post {
        success {
            echo 'Selenium executed successfully ✅'
        }
        failure {
            echo 'Build failed ❌'
        }
    }
}
