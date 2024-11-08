# Pension Management System

This is a simple pension management system designed to handle pensioner data stored in a text file. It includes functionality for:

- Storing pensioner data in a file.
- Reading pensioner data from a file.
- Printing a report of all pensioners.

## Table of Contents

1. [Overview](#overview)
2. [File Structure](#file-structure)
3. [Classes and Functionality](#classes-and-functionality)
4. [Usage](#usage)
5. [Example](#example)
6. [Requirements](#requirements)

---

## Overview

The system provides the ability to manage pensioner records, which include the following attributes for each pensioner:

- ID Number
- Surname
- Monthly Pension Amount
- Pension Code (for categorizing pension types)

The application uses file I/O operations to persist the data, allowing users to read and write pension records from/to a text file. It also provides functionality to generate a simple text-based report of all stored pensioners.

---

## File Structure

The following files and directories are part of the project:

```
/src
    /PensionFileHandler.java     - Handles reading and writing pensioner data to a file
    /MainApp.java                - The main entry point to the application
    /PensionReport.java          - Handles the generation of pension reports
    /Pensioner.java              - Represents a single pensioner's data
    /pensioner.txt               - The text file storing the pensioner data
```

---

## Classes and Functionality

### 1. **Pensioner.java**
   - Represents a pensioner.
   - Contains the following attributes:
     - `id`: The pensioner's ID number.
     - `surname`: The pensioner's surname.
     - `pensionAmount`: The monthly pension amount.
     - `pensionCode`: A character code representing the type of pension.
   - Provides getters for all attributes.
   - Implements a custom `toString()` method for displaying pensioner details.

### 2. **PensionFileHandler.java**
   - Handles reading from and writing to the pension data file (`pensioner.txt`).
   - **`initializeFile(List<Pensioner> samplePensioners)`**: Writes a list of sample pensioners to the file, overwriting any existing data.
   - **`readPensioners()`**: Reads pensioner records from the file and returns them as a list of `Pensioner` objects.

### 3. **PensionReport.java**
   - Generates and prints a report of all stored pensioners.
   - **`printPensionersReport()`**: Prints a table of pensioners, displaying their ID, surname, and monthly pension amount.

### 4. **MainApp.java**
   - The main class that runs the application.
   - Initializes the `PensionFileHandler` with the filename (`pensioner.txt`).
   - Creates a list of sample pensioners, writes it to the file, then reads the data back from the file and generates a report.

---

## Usage

### 1. **Running the Application**

To run the application, execute the `MainApp.java` class. It will:

- Create sample pensioner data.
- Overwrite the `pensioner.txt` file with this sample data.
- Read the pensioner data back from the file.
- Print a report of all the pensioners.

```bash
javac src/*.java
java src.MainApp
```

### 2. **File Format**

The data for each pensioner is stored in the `pensioner.txt` file in a CSV-like format:

```
1234,Nkosi,503.99,g
1444,Patel,527.99,g
2341,Botha,595.66,p
```

Each line contains:
- The pensioner's ID number.
- The surname.
- The monthly pension amount.
- The pension code.

---

## Example

Here is an example output after running the application:

```
ID NUMBER  NAME        MONTHLY AMOUNT (R)
1234       Nkosi       R503.99
1444       Patel       R527.99
2341       Botha       R595.66
```

This report is generated by the `PensionReport` class, which formats the pensioner details into a table for easy reading.

---

## Requirements

- Java 8 or higher.
- A basic text editor or IDE for viewing and editing the code.
- Command-line or terminal to compile and run the program.

---

## Notes

- The file `pensioner.txt` is overwritten each time the application is run.

---
