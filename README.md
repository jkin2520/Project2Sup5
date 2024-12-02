Java Assignment Project: Magic Square, Unique Subarrays, and Palindromic Substring

Project Overview

This project is an introduction to Java programming, consisting of three separate tasks:

Magic Square: A static method to determine if a 2D matrix is a magic square.

Unique Subarrays: Count the number of unique subarrays in a given array that sum to a specified target value.

Palindromic Substring: Find the longest palindromic substring in a given string.

Each task has been implemented following best practices, with corresponding unit tests to validate the behavior of the methods. The project utilizes JUnit 5 for testing and Git for version control.

Project Structure

The project is structured as follows:

MagicSquareProject/
  |- MagicSquare.java
  |- MagicSquareTest.java
  |- UniqueSubarrays.java
  |- UniqueSubarraysTest.java
  |- PalindromicSubstring.java
  |- PalindromicSubstringTest.java
  |- libs/
      |- junit-platform-console-standalone.jar
  |- README.md

File Descriptions

MagicSquare.java: Contains the method isMagicSquare which determines if a given 2D matrix is a magic square.

MagicSquareTest.java: Unit tests for MagicSquare using JUnit 5.

UniqueSubarrays.java: Contains the method countUniqueSubarrays which counts the number of unique subarrays that sum to a given value.

UniqueSubarraysTest.java: Unit tests for UniqueSubarrays.

PalindromicSubstring.java: Contains the method findLongestPalindromicSubstring which finds the longest palindromic substring in a given string.

PalindromicSubstringTest.java: Unit tests for PalindromicSubstring.

libs/: Contains the JUnit library (junit-platform-console-standalone.jar) for unit testing.

Getting Started

Prerequisites

Java Development Kit (JDK): You need JDK 8 or later installed to compile and run the Java files.

JUnit 5: Used for running the unit tests. The JAR file for JUnit 5 is included in the libs directory.

Git: Git is required for version control and collaboration.

Setting Up the Project

Clone the Repository

Clone the repository from GitHub using the following command:

git clone https://github.com/yourusername/JavaAssignmentProject.git
cd JavaAssignmentProject

Compile the Java Files

Use the following command to compile the Java files, including specifying the JUnit library in the classpath:

javac -cp .:libs/junit-platform-console-standalone.jar MagicSquare.java MagicSquareTest.java UniqueSubarrays.java UniqueSubarraysTest.java PalindromicSubstring.java PalindromicSubstringTest.java

Run Unit Tests

To run the unit tests, use the following command:

java -cp .:libs/junit-platform-console-standalone.jar org.junit.runner.JUnitCore MagicSquareTest UniqueSubarraysTest PalindromicSubstringTest

Usage

Magic Square Check

The isMagicSquare method checks if a 2D matrix is a magic square. A magic square is a square matrix in which the sum of each row, column, and both diagonals is the same.

Example:

int[][] matrix = {
    {2, 7, 6},
    {9, 5, 1},
    {4, 3, 8}
};
boolean result = MagicSquare.isMagicSquare(matrix);
System.out.println(result); // Output: true

Counting Unique Subarrays

The countUniqueSubarrays method counts the number of unique subarrays that sum to a specified target value.

Example:

int[] array = {1, 2, 3, 4};
int count = UniqueSubarrays.countUniqueSubarrays(array, 5);
System.out.println(count); // Output: 2

Finding Longest Palindromic Substring

The findLongestPalindromicSubstring method finds the longest palindromic substring in a given string.

Example:

String input = "babad";
String longestPalindrome = PalindromicSubstring.findLongestPalindromicSubstring(input);
System.out.println(longestPalindrome); // Output: "bab" or "aba"

JUnit: For providing the testing framework used in this project.

Jayskeez
