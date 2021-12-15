# HexagonalGuessMyNumber
The example code showing a guess my number game done with and without 'hexagonal architecture' using for displaying the augmented capabilities of a os native gui bring us (using "a good and old Window" instead of the stdout)

Accompanying tutorial at https://www.viewfromthecodeface.com/portfolio/clean-code-hexagonal-architecture/

## Build and run

Assuming that you are an user using a computer with your working directory on HexagonalGuessMyNumber folder (were you just download the code)

`user@computer:./HexagonalGuessMyNumber`

### Build
* `$ mkdir bin`
* `$ javac $(find . -iname "*.java" -printf '%p ') -d bin`

### Run
after compiling the source classes into a directory, like "bin" you could do:
* `$ java -cp bin com.viewfromthecodeface.hexagonal.Game`
or
* `$ cd bin`
* `$ java com.viewfromthecodeface.hexagonal.Game`
