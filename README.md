# E-school
E-School is a project on spring and angular for controlling students. 

## Table of Contents

- [Install Prerequisites](#1-install-prerequisites)
- [Getting Started](#2-getting-started)
- [About E-School](#3-about-e-school)

## 1. Install Prerequisites

### 1.1. Ensure you have this installed before use:

- Java 11
- Maven 3.6.0
- Node
- npm
- Angular-cli

### 1.2. Java

To check java and jdk version run the following commands on cmd (to open cmd `Win + R` and type `cmd`)

```bash
java -version
javac -version
```
Verify that it shows current versions else you can install it by this link: https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html

### 1.3. Maven

To check maven version run the following commands on cmd (to open cmd `Win + R` and type `cmd`)

```bash
mvn -version
```
Verify that it shows current versions else you can install it by this link: https://www.baeldung.com/install-maven-on-windows-linux-mac

### 1.4. Node

To check node and npm version run the following commands on cmd (to open cmd `Win + R` and type `cmd`)

```bash
node --version
npm --version
```
Verify that it shows current versions else you can install it by this link: https://nodejs.org/en/download/

### 1.5. Angular CLI

To check Angular version run the following commands on cmd (to open cmd `Win + R` and type `cmd`)

```bash
ng --version
```
Verify that it shows current versions else you can install it by running this command:

```bash
npm install -g @angular/cli
```

## 2. Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/Miouy/e-school.git
```
This will get a copy of the project installed locally. To install all of its dependencies and start each app, follow the instructions below.

```bash
cd e-school/src/main/angular/eSchool  # Navigate to angular project
npm install             # Install javascript package requirements
ng serve --open         # Run the Angular Frontend   
mvn spring-boot:run     # Build and run Spring Boot Backend
```
## 3. About E-School

### 3.1. Login

You can navigate to login page by link `localhost:4200/login` and if you not logged in you will automatically redirected to login page. Use `username: username, password: password` to sign in.

### 3.2. Student List page

You can navigate to this page by link `localhost:4200  or  localhost:4200/students`. In this page you will see a table with students. Last column of table its button for deleting student. From above table you can see button for add student which open dialog with form for adding student.

### 3.3. Logout

You can logout from system by pressing logout button on header. If you logged out you will automatically redirected to login page and also you can't go to student list page
