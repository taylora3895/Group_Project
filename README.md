# Carolina Panthers 2026 Java Group Project

## Organization

### 01_Group_Member_Code
Contains the original PanthersPlayers2026.java submitted by the group member.
It has been preserved as supplied.

### 02_Alani_Working_Draft
Contains the individual contribution in development form. It includes
development notes and testing comments.

### 03_Alani_Clean_Final
Contains the cleaned version intended for the final project.

## Java Requirements

The project uses Java Swing for the GUI. Player information is read from
an external CSV file, and selected player information can be written to a
text file.

## Running the program

Open the desired version in Visual Studio Code and make sure the `data`
folder remains beside the Java source files.

Compile:

javac src/*.java

Run from the version's directory:

java -cp src PanthersApp

The program expects:

data/panthers_players_2026.csv

and creates:

data/saved_players.txt

when player information is saved.

## GitHub

The original group member code and the individual contribution are kept
in separate folders so the development history is clear.
