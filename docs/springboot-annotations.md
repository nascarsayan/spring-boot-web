## Spring Boot - Annotations

Spring Boot is a framework that makes it easy to create stand-alone, production-grade Spring-based Applications. It is a project built on the top of the Spring Framework. It provides a simpler and faster way to set up, configure, and run both simple and web-based applications.

In spring boot, there are several utility annotations to make the code more readable and maintainable. Here are some of the annotations that are commonly used in Spring Boot:
- `@RestController`: This annotation is used to create RESTful web services. It is a convenience annotation that combines `@Controller` and `@ResponseBody` annotations. Let's take an example code.
    ```java
    @RestController
    public class HelloWorldController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello World!";
        }
    }
    ```
    In the above code, `@RestController` is used to create a RESTful web service. The `@RequestMapping` annotation is used to map the URL `/hello` to the method `hello()`. The method returns a string `Hello World!`.

    What essentially happens taht, when spring boot starts up, it reads all the classes which are annotated with `@RestController` and creates a mapping for the URL. So, when you hit the URL `http://localhost:8081/hello`, it will return the string `Hello World!`.

- `@RequestMapping`: This annotation is used to add a common prefix for the URL path. It is used to map web requests to specific handler classes and/or handler methods. Let's take an example code.
    ```java
    @RestController
    @RequestMapping("/api")
    public class HelloWorldController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello World!";
        }
    }
    ```
    In the above code, `@RequestMapping("/api")` is used to add a common prefix for the URL path. So, when you hit the URL `http://localhost:8081/api/hello`, it will return the string `Hello World!`.

- The HTTP Method Handlers: Spring Boot provides annotations for different HTTP methods like `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, etc. These annotations are used to map the HTTP methods to the methods in the controller. Let's take an example code.
    ```java
    @RestController
    @RequestMapping("/api")
    public class HelloWorldController {
        @GetMapping("/hello")
        public String hello() {
            return "Hello World!";
        }
    }
    ```
    In the above code, `@GetMapping("/hello")` is used to map the HTTP GET method to the method `hello()`. So, when you hit the URL `http://localhost:8081/api/hello`, it will return the string `Hello World!`.

You can check a simple example of [a Spring Boot application here](../hunger/). You can run the application, and go to `http://localhost:8081/restaurants/hello`
