# Laboratory Work No. 1 Report

## 1. Topic and Variant

**Topic:** Java Project Deployment and Basic Data Processing  
**Variant:** 20 — Gym  
**Operating System:** Windows 11

## 2. Objective

The objective of this laboratory work was to create a cross-platform Java console application using Maven, Git, GitHub, automated testing, static analysis, and GitHub Actions.

## 3. Task

Input record format:

client:String; plan:String; months:int; visits:int; price:double

## The application calculates:

Number of valid records
Average number of visits
Total revenue
Longest membership duration
## 4. Program Structure

The application reads records from a CSV file, validates each record, converts numeric fields, calculates statistics, and generates a report.

Main files:

src/main/java/ua/lpnu/kzp/Main.java
src/test/java/ua/lpnu/kzp/MainTest.java
data/input.csv
pom.xml
.github/workflows/ci.yml
## 5. Infrastructure

The project uses:

Java 21
Maven
Maven Wrapper
JUnit 5
SpotBugs
Maven Shade Plugin
GitHub Actions

The Maven lifecycle commands used were:

mvnw.cmd test
mvnw.cmd verify
mvnw.cmd package
## 6. GitHub Issues and Pull Requests

GitHub Issues and feature branches were used to organize the work.

Main Pull Requests included:

Project and Maven configuration
Gym report implementation and tests
Cross-platform GitHub Actions configuration
Maven Wrapper fix
Documentation
## 7. Example

Input:

Іван Петренко;Standard;3;24;1500.00
Марія Коваль;Premium;12;110;6500.00
Олег Бондар;Basic;1;8;700.00
Анна Мельник;Premium;-3;20;1800.00
Тарас Іванчук;Standard;6;abc;2800.00

Output:

Line 4 skipped: invalid numeric value
Line 5 skipped: invalid number format
Valid records: 3
Average visits: 47.33
Total revenue: 8700.00
Longest membership: 12 months
## 8. Testing

JUnit 5 tests verify:

correct calculation of gym statistics;
skipping invalid records.

## Result:

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

SpotBugs verification completed successfully.

GitHub Actions successfully verifies the project on:

Ubuntu
Windows
macOS
## 9. Documentation

README.md contains:

project description;
input format;
build instructions;
run commands;
testing information.

Public and non-trivial program elements are documented where required.

## 10. Academic Integrity

ChatGPT was used as an AI assistant during the development of this laboratory work.

## AI contribution:

clarification of laboratory requirements;
Maven and GitHub Actions configuration recommendations;
Git workflow guidance;
assistance with debugging Maven Wrapper and SpotBugs issues;
recommendations for tests and documentation.

## My contribution:

project creation and configuration;
implementation and verification of the Java program;
review and correction of generated recommendations;
Git and GitHub workflow execution;
testing and debugging.

All submitted code and configuration were reviewed and understood before being included in the project.

## 11. Control Questions

To be completed with answers in my own words.

## 12. Conclusion

A Java console application for processing gym membership records was created. The application validates CSV data, calculates required statistics, generates a report, and supports command-line arguments.

The project uses Maven, JUnit 5, SpotBugs, GitHub Issues, Pull Requests, and GitHub Actions. CI successfully verifies the application on Windows, Ubuntu, and macOS.
