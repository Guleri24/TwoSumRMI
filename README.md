# TwoSumRMI
Calculates sum of two numbers using Java RMI

## Project setup
* JDK 18
* Access to terminal
* And will power ;-)

1. Clone the repo
```
  https://github.com/Guleri24/TwoSumRMI.git
```
2. Go to the project directory
```
  cd TwoSumRMI
```
3. Compile all Java programs
```
  javac *.java
```
4. Start the registry service by the rmiregistry tool
```
  On Linux or Mac > rmiregistry &  
  On Windows      > start rmiregistry
```
After this enter key

5. Start Server & Client
```
  java Server.java
```
Open another terminal window and in the same project directory
```
  java Client.java
```
