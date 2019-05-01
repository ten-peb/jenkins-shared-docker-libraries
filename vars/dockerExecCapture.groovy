def String[] call(String container,String cmd){
    def String fullCmd
    def String[] retval
    
    fullCmd = 'docker exec ' + container + ' ' + cmd
    retval = sh(script: fullCmd,returnStdout: true).trim().split("\\r?\\n")
    return retval
    
}
