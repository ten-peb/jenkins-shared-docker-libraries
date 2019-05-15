///////////////////////////////////////////////////////////////////////
//
// File: doDockerBuild.groovy
//
// Description/Purpose:
//     Encapsulation of docker build command for use with docker
//     build pipelines
//
// Author:   Peter L. Berghold <pberghold@tenna.com>
//
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

def void call(String tag,String[] args,String dir='.') {
  def String command = "docker build "
  for(String arg:args){
    command = command + "--build-arg ${arg} "
  }
  command = command + "  -t " + tag + " " + dir
  sh(script: command)
  
}
