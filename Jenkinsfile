pipeline {
agent any
tools {
    maven 'Maven'
}

environment {
    // Optional: set display for headless execution
    DISPLAY = ':99'
}

stages {

    stage('Checkout') {
        steps {
            git branch: 'master', url: 'https://github.com/Karthik-hr18/MyMavenSeleniumApp01'
        }
    }

    stage('Build') {
        steps {
            sh 'mvn clean compile'
        }
    }

    stage('Test (Selenium)') {
        steps {
            // Run tests in headless mode
            sh 'mvn test -Dheadless=true'
        }
    }

}

post {
    success {
        echo 'Selenium tests passed ✅'
    }
    failure {
        echo 'Selenium tests failed ❌'
    }
}

}
