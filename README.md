# Jenkins Shared Library for Docker operations

## Description:

A general encapsulation of Docker related commands and resources.

## Index

### Global Functions

#### doDockerBuild

Executes the "docker build" command.

##### Parameters

* String tag  -- the image tag you want assigned to image
* (optional) String dir  -- Path to the Dockerfile (default: ".")

