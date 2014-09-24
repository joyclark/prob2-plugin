# prob2-plugin

This project was extracted from the https://github.com/bendisposto/prob2 repository. It contains the generic Eclipse and the Rodin Integration plug-ins, i.e., the mapping of Eclipse views to ProB 2.0 components are defined here. The content of the views is defined in https://github.com/bendisposto/prob2.


## Building
Maven 3 is required to build the project: 
  <pre>
  cd master
  mvn clean verify 
  </pre>  

This will produce the update site for the plug-in in the folder `de.prob2.updatesite/target`

## Bugs 
Because of a bug in Eclipse, ProB 2.0 crashes on some Linux systems after using it for about 3 minutes. We hope, that this issue will be fixed when Rodin switches to Eclipse 4.x (planned for Rodin 3.1).

## Setup Development Environment
Import all projects to Eclipse
Set target platform to de.prob2.rodin3.target/rodin3.target


(c) 2014 Jens Bendisposto et.al. , all rights reserved
