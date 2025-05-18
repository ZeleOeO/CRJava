# CRJava
This is a basic command-line application written in **Core Java**. It simulates a School Course Registration System which allows users to create a course, delete a course, register a course etc.

## Technologies
![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)

## Prerequisites
- Java 17+
- **Optional** - An IDE such as IntelliJ, VSCode, Netbeans

## Installation (Will work on both powershell and bash/zsh terminals)
1. Clone the repository:
   ```bash
   git clone https://github.com/ZeleOeO/CRJava.git
   ```
2. Navigate to the project directory:
   ```bash
   cd CRJava
   ```

## Usage
- Run the project on command line
   ```bash
    javac src/Main.java
    java src/Main
    ```

## File Structure
```powershell
CRJava/
├───.idea
└───src
    │   Main.java
    ├───datafiles
    │       students.txt
    ├───exceptions
    │       CourseAlreadyCreatedException.java
    │       CourseRegistrationException.java
    │       FileNotFound.java
    ├───models
    │       Admin.java
    │       Course.java
    │       Student.java
    │       Teacher.java
    │       User.java
    └───README.md
```

## Running Tests
Unfortunately didn't create tests for this project

## Steps to Contribute
1. Open an issue first so I can like keep track, but if that's too much stress that's fine too
2. Fork the Repository
3. Clone your fork
4. Create a new branch
   ```bash
   git checkout -b your-branch-name
   ```
5. Make your change
6. Commit your change, please use [Conventional Commits](https://gist.github.com/qoomon/5dfcdf8eec66a051ecd85625518cfd13) if you can, I didn't really use it here tbh
7. Push your change
8. Make a pull request and reference your issue <br>
   Please stick to conventional methods of programming java and springboot applications, don't mess up my already spaghetti code

## License
[MIT](https://choosealicense.com/licenses/mit/)
