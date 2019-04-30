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

def void call(String tag,String dir='.') {
  def String command = "docker build -t " + tag + " " + dir

  sh(script: command)
  
}
