#case "$1" in
#    -t) mkdir ./test_output 1> /dev/null
#        javac -d ./test_output -cp ./lib/junit-4.8.1.jar ./src/*java ./test/*.java
#        java -cp .:test_output/:lib/junit-4.8.1.jar:lib/hamcrest-core-1.3.jar TestRunner
#    ;;
#    *)  mkdir ./output 1> /dev/null
#        javac -d ./output ./src/*.java
#        printf "Manifest-Version: 1.0\nClass-Path: .\nMain-Class: Main\n" > ./output/Manifest.txt
#        jar cfm ./output/FiveHandPoker.jar ./output/Manifest.txt ./output/*.class
#        java -jar ./output/FiveHandPoker.jar
#    ;;
#esac
