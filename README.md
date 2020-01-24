## INTRO

This is a credit card processing program.

## RUN-THROUGH

- 'main.java' contains all methods for this program. When outlining the project, I was initially going to create a separate class for the Luhn10 check. Later, I decided against it since the check only required one method. 
- I used Sublime Text to write most of my methods. I then transferred all my material to intelliJ IDEA to write my JUnit tests. I specifically created tests to check the accuracy of the Luhn10 check, the parsing method, the print method, and the charge/credit methods.

## WHY I CHOSE JAVA

- Initially I was going to use Python for this challenge as it is the language I have the most experience with. However, after understanding the nature of the problem, I switched over to Java to be able to utilize priority queues (more details below) and easily write tests. IntelliJ allowed me to seamlessly write unit tests which allowed me to compare the results from individual methods and determine the accuracy of the methods.

## MAJOR DESIGN DECISIONS

- I started the project out with solely using hashmaps to store each user's balance, limits, and credit card numbers. However, this fails to include any way to keep track of the users themselves. For this, I added a priority queue to keep track of all of users' names in alphabetical order. This would allow for each member to be accessed quickly.

- I intiially thought about the project in terms of Python and thought of using multiple dictionaries to store balance, limits, and credit card numbers for each user. When I switched to Java, I used hashmaps to achieve the same effect with the key being the name and value being what was recorded for each user. 

- If the user did not pass the Luhn10 check, the credit card number is stored as "ERROR" in the corresponding hashmap. Then, when all of the user's information is printed, if their credit card number contains "Error," the program will not print the balance. 

## HOW TO RUN

- Using an IDE is the easiest way to run this code. I was able to run my code in Eclipse, IntelliJ IDEA, and Microsoft Visual Studio. 


