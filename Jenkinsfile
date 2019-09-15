pipeline {
    agent any
    stages {
        stage('checkout scm') {
            checkout scm
        }
        stage('clean') {
            sh 'mvn clean'
        }
        stage('compile') {
            sh 'mvn compile'
        }
        stage('test') {
            sh 'mvn test'
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/**/*.xml'
        }
    }
}