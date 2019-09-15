pipeline {
    agent {
        docker {
            image 'maven:3.6-jdk-11'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('cleanWs') {
            steps {
                cleanWs()
            }
        }
        stage('checkout scm') {
            steps {
                checkout scm
            }
        }
        stage('clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }

        }
    }

    post {
        always {
            junit '**/target/surefire-reports/**/*.xml'
        }
    }
}