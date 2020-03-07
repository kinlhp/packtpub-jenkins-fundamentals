node('master') {
    stage('Fetch source code') {
        git url: 'https://github.com/kinlhp/packtpub-jenkins-fundamentals.git'
    }

    dir('chapter05') {
        printMessage('Running pipeline')

        stage('Testing') {
            sh 'python3 test_functions.py'
        }

        printMessage('Pipeline complete')
    }
}

def printMessage(message) {
    echo "${message}"
}
