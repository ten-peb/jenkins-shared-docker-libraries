# Jenkins Shared Library for Docker operations

## Description:

A general encapsulation of Docker related commands and resources. Purpose of
this shared library is to simplify the creation of Jenkins pipelines and avoid
as much as possible the use of arcane Jenkins callouts. 

## Index

### Global Functions

#### dockerCopy

Provide a wrapper to the "docker copy" command sequence

##### Parameters

* String src        where is the file coming from?
* String dest       where is it going?

Both src and dest can be of the form [container:]path or simply path allowing
files to be transported from or to a particular running container.

```
    // copy into a container
    dockerCopy('app.war','tomcat_container:/var/lib/tomcat8/ROOT')

    // copy from a container
    dockerCopy('tomcat_container:/var/log/mail.log','mail.log')

```

#### doDockerBuild

Executes the "docker build" command. Assumption is made that a Dockerfile
exists in the current working or designated directory.


##### Parameters

* String tag  -- the image tag you want assigned to image
* (optional) String dir  -- Path to the Dockerfile (default: ".")

```

   doDockerBuild('latest')

```


