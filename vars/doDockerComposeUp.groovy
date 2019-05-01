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

def void call() {
  def String command = "docker-compose up --build -d"

  sh(script: command)
  
}
