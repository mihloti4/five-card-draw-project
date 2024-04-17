# Five-card-draw
  Problem Statement
    Five-card draw is a variant of poker where each player receives a hand of 5 cards, is then
    allowed to swap any number of those cards for new ones, and then competes against each
    other based on the standard 5 card poker hand strength. You need to design and develop
    a console-based application which will deal and evaluate poker hands for a simplified
    version of the five-card draw variant. Like the five-card draw variant, the application will
    have to deal a hand of 5 cards, but unlike the five-card draw variant, no swapping will be
    allowed. 

## Authors

github.com/mihloti4/five-card-draw-project

## Development

This program is developed using Java, OpenJDK 11. <br />
Testing is done using JUnit 4.8.1 <br />
Program should be run in a bash terminal.

## Installation
 Download the Zip containing the code on the repo or clone the repository. <br />
 Once downloaded or cloned, open up the folder directory in your bash terminal and run:


## Usage/Examples
In your bash terminal, run the shell script to compile and execute the program.

```bash
./run.sh
Shuffling ... Shuffling ... Shuffling ...
Your hand: 2♢ 5♡ 2♤ 3♧ 4♤ 
You have: One Pair

Do you wish to draw again? Y/N >
```

To run the Unit tests run the shell script with the -t flag.

##bash to run the tests
./run.sh -t


##Structure**

Five-card-draw-project
|
│   README.md
│   .gitignore     
│   run.sh                      //script to compile and run program, run with -t flag for tests
|
└─── external libraries        //contains jar executables to aid in running tests with JUnit and 
│   |      
|   |   junit-4.8.1.jar
│   |   hamcrest-core-1.3.jar
|   |   OpenJDK 11   
│   
└─── src                        //contains all Java source files
|   │   *
|
└─── test                       //contains all unit test classes
    |   *
