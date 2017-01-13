# Papercut - Print Job Costing
The application created will  accept print jobs of various types and calculate the printing cost.

## Getting Started
The project has been developed using JAVA 7. It is a plain vanilla java project .
To run it on your local machine, please import the project into you eclipse. Build it using the eclipse build tool . This will create the associated binaries. The project can run using Run as -> Java application.

### Prerequisites
For this application to run on your local machine - Java version 7 needs to be installed on the machine.
The input to the application is a csv file having - the total number of documents to be printed, the number of coloured pages, double sided or single sided.
```
Give examples
```
The input file will be in the format                                            

20,10,true

 where 20= the total number of documents, 10= number of coloured pages , true= double sided print.
 
 The output will be the net cost of printing 20 pages including the 10 coloured pages.
 
 ## Running the tests
The application has been tested for positiveand negative scenarios.The test cases have been implemented using JUnits.
A Junit Test suite will execute all the indiviual test cases.
