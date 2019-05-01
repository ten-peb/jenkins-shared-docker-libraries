def void call(String container,String cmd){
    def String fullCmd 
    
    fullCmd = 'docker exec ' + container + ' ' + cmd
    sh(fullCmd)
}