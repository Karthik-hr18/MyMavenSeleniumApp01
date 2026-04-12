```groovy
pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Karthik-hr18/MyMavenSeleniumApp01'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Selenium') {
            steps {
                sh 'java -jar target/MyMavenSeleniumApp01-1.0-SNAPSHOT.jar'
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
```
