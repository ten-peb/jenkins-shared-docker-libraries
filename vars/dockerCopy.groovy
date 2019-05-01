def void call(String src,String dest){
    def String fullCmd 
    
    fullCmd = "docker cp " + src + " " + dest
    sh(fullCmd)
}