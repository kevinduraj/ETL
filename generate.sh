#!/bin/bash 
#---------------------------------------------------------------#

PROGRAM="BrowseDirectory"
GROUP="alfa"


#---------------------------------------------------------------#
function QuickStart() {

mvn archetype:generate                                  \
    -DartifactId=${PROGRAM}                             \
    -DgroupId=${GROUP}                                  \
    -DarchetypeArtifactId=maven-archetype-quickstart    \
    -DinteractiveMode=false 
}

#---------------------------------------------------------------#
#                     Main 
#---------------------------------------------------------------#

QuickStart


#---------------------------------------------------------------#
