pipeline{
	agent any
		
	stages{
		stage('Preparation'){
			steps{
				git url: 'https://github.com/BharadwajAyinapurapu/Java_Jenkins.git'
			}
		}
		
		stage('Execute'){
			steps{
				sh 'rm -rf Java.tar'
				sh 'javac palindrome.java'
				sh 'java palindrome 987'
			}
		}

		stage('Test'){
			steps{
				sh 'bash maincode.sh'
			}
		}

		stage('Build'){
			steps{
				sh 'tar -cvf Java.tar palindrome.java palindrome.class testcases.txt actual out maincode.sh Jenkinsfile'
				archiveArtifacts artifacts: 'Java.tar'
			}
		}

	}
}
		
					
