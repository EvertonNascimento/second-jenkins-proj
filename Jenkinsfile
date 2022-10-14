pipeline{
    agent any
    tools{
        Maven 'Maven'
    }
    stages{
        stage("build jar"){
            steps{
                scripts{
                    echo "building jar"
                    sh 'mvn package'
                }
            }

        }
        stage("deploy"){}
        stage("send jar to artifactory"){}
    }

}
