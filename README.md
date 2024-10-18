# DataFrames Joins in Apache Spark using Scala

## Description

This project demonstrates how to create and manipulate **DataFrames** in **Apache Spark** using **Scala** to perform operations such as `left join` and `inner join`. We simulate working with three datasets (`df1`, `df2`, and `df3`) and reproduce the operations represented in the diagram provided.

### Problem Definition

Given the following datasets:

- **df1** with 4000 rows
- **df2** with 1000 rows
- **df3** with 10 rows

We perform the following operations:

1. A **left join** between `df1` and `df2`, resulting in `df4` (4000 rows).
2. A **join** between `df4` and `df3`, resulting in `df5` (10 rows).

The project also explores techniques to optimize this process.

## Prerequisites

To run this project, you will need the following installed:

- **Scala** 
- **Apache Spark** 
- **Java JDK** 
- **Maven** 
- **IntelliJ IDEA** (recommended for development)

## Project Structure

```bash
.
├── src
│   ├── main
│   │   ├── scala
│   │   │   └── com
│   │   │       └── example
│   │   │           └── SparkJoinsApp.scala
│   └── test
│       └── scala
│           └── com
│               └── example
│                   └── SparkJoinsAppTest.scala
├── README.md
├── pom.xml
└── .gitignore
```

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/spark-joins-example.git
   cd spark-joins-example
   ```

2. **Build the project using Maven**:
   ```bash
   mvn clean install
   ```

3. **Open the project in IntelliJ**:
   - Import the project as a Maven project in **IntelliJ IDEA**.

4. **Configure Spark**:
   Ensure that **Apache Spark** is installed locally or accessible in your environment.

## How to Run

1. **Run from IntelliJ**:
   - Open `SparkJoinsApp.scala` in IntelliJ.
   - Right-click on the file and select **Run**.

2. **Run from the command line**:
   ```bash
   spark-submit --class com.example.SparkJoinsApp target/spark-joins-example-1.0-SNAPSHOT.jar
   ```

## License

This project is licensed under the MIT License - see the LICENSE file for details.