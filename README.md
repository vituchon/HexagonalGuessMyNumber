# HexagonalGuessMyNumber

* It is a fork of [this project](https://github.com/viewfromthecodeface/HexagonalGuessMyNumber)
* I provide a new way of displaying the results to an end-user without touching the domain layer thus following the Open Closed principle. 
   * I added new class that follow the display interface for displaying results in an OS native GUI (a.k.a "window")

Accompanying tutorial at https://www.viewfromthecodeface.com/portfolio/clean-code-hexagonal-architecture/

## Build and run

Assuming that you are an user using a computer with your working directory on HexagonalGuessMyNumber folder (where you just download the code)

`user@computer:./HexagonalGuessMyNumber$`

### Build
* `$ mkdir bin`
* `$ javac $(find . -iname "*.java" -printf '%p ') -d bin`

### Run
after compiling the source classes into a directory, like "bin" you could do:
* `$ java -cp bin com.viewfromthecodeface.hexagonal.Game`

or

* `$ cd bin`
* `$ java com.viewfromthecodeface.hexagonal.Game`
