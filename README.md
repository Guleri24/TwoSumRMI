# TwoSumRMI
Calculates sum of two numbers using Java RMI


https://user-images.githubusercontent.com/43719098/163730255-ba3d9375-c20b-480a-bc20-1f1a9a87e808.mp4



## Project setup
* JDK 18
* Git 
* Access to terminal/command prompt
* And will power ;-)

1. Open terminal and Clone the repo
```
  git clone https://github.com/Guleri24/TwoSumRMI.git
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
```
linux:    After this enter key

Windows:  RmiRegistry window opens -> Allow access -> Leave it open; 
          Go to the same cmd prompt and enter
```

5. Start Server & Client
```
  java Server.java
```
Open another terminal window and in the same project directory
```
  java Client.java
```

## Optional : Linux only
For using the exec.sh file
1. Open the exec.sh file in any text editor
2. Edit `alacritty` with your terminal e.g. xterm, gnome-terminal, konsole, etc
3. Make it executable
```
  chmod +x exec.sh
```
