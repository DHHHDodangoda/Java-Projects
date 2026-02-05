# Java Projects

A curated collection of Java projects — small utilities, learning exercises, and example applications. Each project is self-contained and includes build and run instructions in its own directory.

## Table of contents

- [Repository structure](#repository-structure)
- [Prerequisites](#prerequisites)
- [Building and running](#building-and-running)
- [Testing](#testing)
- [Contributing](#contributing)
- [Contact](#contact)

## Repository structure

Each project is organized in its own directory at the repository root:

- project-name/
  - src/            - Java source files
  - test/           - Unit tests
  - build-tool files (pom.xml or build.gradle)
  - README.md       - Project-specific instructions

There may also be:
- common/           - shared utilities or examples
- docs/             - additional documentation

Adapt the structure above per project as needed.

## Prerequisites

- Java Development Kit (JDK) 11 or later (or the version specified by individual projects)
- Maven or Gradle installed if the project uses one of these build tools

Verify Java is available:
```bash
java -version
```

## Building and running

Most projects include either Maven or Gradle build files. Common commands:

Maven:
```bash
cd project-name
mvn clean package
java -jar target/<artifact>.jar
```

Gradle:
```bash
cd project-name
./gradlew build
java -jar build/libs/<artifact>.jar
```

If a project is plain source without a build tool:
```bash
javac -d out src/**/*.java
java -cp out com.example.Main
```

Refer to each project's README.md for project-specific instructions and required parameters.

## Testing

Run tests with the build tool used by the project.

Maven:
```bash
mvn test
```

Gradle:
```bash
./gradlew test
```

## Contributing

Contributions are welcome. Suggested workflow:

1. Fork the repository.
2. Create a feature branch: `git checkout -b feature/your-feature`.
3. Add or update code and tests.
4. Run tests and linters locally.
5. Open a pull request describing the changes and rationale.

Please include tests for new features and follow consistent code style across projects.

## Contact

For questions or requests regarding this repository, create an issue or contact the repository owner.
