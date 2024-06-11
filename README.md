# Author: Asandile Nkala

Project Name: User Project

*********Description********
This Project is A Back-End project designed using Java, Spring Boot Framework, MySQL CRUD and it was tested by Postman.
This Project takes the details of a user and stores them in the database named user_data.

Tools used for this project:
        > Java
        > Spring Boot Framework
        > MySQL
        > Postman (for testing)

The project contains 6 java files (which are found inside their respective packages):
         1.UserApplication.java:
            > This java class is responsible for execution and contains the main method to run the Spring Boot Framework.

         2. UserController.java:
            > This java class serves as a REST Controller annotation  which is used to create RESTful web services using Spring MVC.
            > This class also takes care of mapping request data to the defined request handler method.

         3. UserService.java:
            > This java class serves as a Service/Logic layer which is the connector between the database and the application, defining the rules and restrictions of how the database data is used.

         4. User.java:
            > This java class serves as a model of the database, it contains the attributes , contructors and getters & setters for the database table.

         5. UserRepository.java:
            > A repository is an interface used to manage data persistence and retrieval in a database.
            > It also provides an abstraction layer over the database and simplifies the process of interacting with it.

         6. UserConfiguration.java:
            > Configuration is another modern way to configure our Spring Application, that utilises a specific Java class annotated with @Configuration indication that this class contains the configuration beans, and dependencies that are to be injected upon the launch of the Spring boot application.


application.properties:
    > Application Properties file is used to write the application-related property into that file.
    >This file contains the different configuration which is required to run the application in a different environment, and each environment will have a different property defined by it.

pom.xml:
    > "Project Object Model" is an xml representation of a Maven project held in a file.
    > This file contains all the dependency required for this project.
