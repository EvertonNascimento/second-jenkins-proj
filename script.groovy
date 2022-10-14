def buildJar(){
    echo "buiding the jarfile"
    sh 'mvn package'
}

def buildImage(){
    echo "bulding docker image and pushing to repository"
    withCredentials()
}
def deployApp(){}

return this