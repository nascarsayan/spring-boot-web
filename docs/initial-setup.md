## Spring Boot - Initial Setup

1. Install Intellij Idea Community or Enterprise Edition

2. Go to https://start.spring.io and create a new project. Update Project to :
    - use Maven (instead of Gradle)
    - add the dependency `Spring Web`.
    - update Project Metadata description and artifact according to your application. **Keep artifact name in smallcase**

    ![SpringInitializr.jpeg](./screenshots/SpringInitializr.jpeg)


3. Download the project and unzip it.
    ![ExtractFile.jpeg](./screenshots/ExtractFile.jpeg)

4. Go to the extracted folder. Open the folder which contains the src and other files in Intellij Idea. You can use file explorer to enter the folder and right click -> Open with Intellij Idea. If you don't get this option, open Intellij Idea and open the folder from there. **Trust the project**
    ![OpenInIdea.jpeg](./screenshots/OpenInIdea.jpeg)

5. Once the project is opened in Intellij Idea, you can see the project structure on the left side. You can see the `src`, `pom.xml`, and other related files and folders.
    - The [`pom.xml`](./hunger/pom.xml) contains the project configuration and dependencies.
        + The dependency `Spring Web` that we selected earlier is added [in the `pom.xml` file here](./hunger/pom.xml#L22).
    - As our application becomes more advanced, we will add more dependencies in the `pom.xml` file.

6. You can update the server port in the [`application.properties`](./hunger/src/main/resources/application.properties#L2) file. By default, the server port is 8080. You can change it to any other port number if 8080 is already in use. Here, I set it to 8081 since 8080 was already in use.

7. Follow any other prompts and suggestions that Intellij Idea gives you for initial setup. This might include setting up the JDK, adding the dependencies, etc.

8. Once everything is set up, you will get a green play button on the Application class. Click on the play button to start the application. After running, the run configuration will be added to the top of the Intellij Idea window also.
    ![RunSpringBoot.jpeg](./screenshots/RunSpringBoot.jpeg)

9. Open a browser and go to `http://localhost:8081/`. You should see a message `Whitelabel Error Page`. This is because we have not added any controller or mapping yet. We will add that in the next steps.
