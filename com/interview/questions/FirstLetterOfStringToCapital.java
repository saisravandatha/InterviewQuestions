package com.interview.questions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstLetterOfStringToCapital {

	public static void main(String[] args) throws IOException {
		String name = "sravan datha";
		System.out.println(name.substring(0,1).toUpperCase().concat(name.substring(1)));
		for( int i = name.length()-1; i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		List<String> questions = Arrays.asList("What is Spring Boot?",
"What are the advantages of using Spring Boot?",
"How does Spring Boot simplify the development process?",
"Explain the concept of convention over configuration in Spring Boot?",
"How do you create a new Spring Boot project?",
"What is the difference between Spring Boot and the Spring framework?",
"What are the different ways to configure Spring Boot applications?",
"What is the significance of the @SpringBootApplication annotation?",
"What is the role of the SpringApplication class in Spring Boot?",
"How does Spring Boot handle dependency management?",
"Explain the concept of starters in Spring Boot?",
"What is the purpose of the application.properties (or application.yml) file in Spring Boot?",
"How can you externalize configuration properties in Spring Boot?",
"How do you create RESTful web services in Spring Boot?",
"What is the purpose of the @RestController annotation?",
"How do you handle exceptions in Spring Boot?",
"Explain the concept of auto-configuration in Spring Boot?",
"How can you override the default auto-configuration in Spring Boot?",
"What is the difference between @Component, @Repository, @Service, and @Controller annotations in Spring Boot?",
"How do you create a custom starter in Spring Boot?",
"Explain the concept of Spring Boot Actuator?",
"How can you monitor and manage Spring Boot applications using Actuator?",
"What are the different types of endpoints provided by Spring Boot Actuator?",
"How do you secure a Spring Boot application?",
"What is the purpose of the @EnableAutoConfiguration annotation?",
"How do you implement caching in Spring Boot?",
"Explain the concept of Spring Boot profiles?",
"How do you deploy a Spring Boot application to a production environment?",
"What is the role of Spring Boot CLI (Command Line Interface)?",
"How do you perform unit testing in Spring Boot?",
"What is the purpose of the @MockBean annotation in Spring Boot testing?",
"How do you integrate Spring Boot with a database?",
"Explain the role of Spring Data JPA in Spring Boot?",
"How do you handle transactions in Spring Boot?",
"What is the purpose of the @Transactional annotation?",
"How do you implement pagination in Spring Boot?",
"What is the purpose of the @Autowired annotation?",
"Explain the concept of dependency injection in Spring Boot?",
"How do you manage logging in Spring Boot?",
"What is the purpose of the Spring Boot Actuator health endpoint?",
"How can you customize the JSON serialization in Spring Boot?",
"Explain the concept of Spring Boot's devtools?",
"How do you handle file uploads in Spring Boot?",
"What is the purpose of the @Valid annotation in Spring Boot validation?",
"How do you handle internationalization (i18n) in Spring Boot?",
"Explain the concept of Spring Boot's embedded servlet container?",
"How do you configure and use the Spring Boot banner?",
"What is the purpose of the @EnableWebMvc annotation?",
"How do you implement asynchronous processing in Spring Boot?",
"Explain the concept of Spring Boot's Actuator endpoints?",
"How do you schedule tasks in Spring Boot?",
"What is the purpose of the @Scheduled annotation?",
"How do you configure error handling in Spring Boot?",
"Explain the concept of Spring Boot's fat or uber JARs?",
"How do you implement security in Spring Boot using Spring Security?",
"What is the purpose of the @EnableCaching annotation?",
"Explain the concept of Spring Boot's auto-restart feature?",
"How do you handle form validation in Spring Boot?",
"What is the purpose of the @Conditional annotation in Spring Boot?",
"How do you handle cross-origin resource sharing (CORS) in Spring Boot?",
"Explain the concept of Spring Boot's application context hierarchy?",
"How do you implement WebSocket communication in Spring Boot?",
"What is the purpose of the @EnableScheduling annotation?",
"How do you configure logging levels in Spring Boot?",
"Explain the concept of Spring Boot's Actuator security?",
"How do you implement batch processing in Spring Boot?",
"What is the purpose of the @EnableTransactionManagement annotation?",
"How do you configure caching in Spring Boot using Ehcache?",
"Explain the concept of Spring Boot's actuator auditing?",
"How do you handle data validation in Spring Boot?",
"What is the purpose of the @EnableJpaRepositories annotation?",
"How do you implement email sending in Spring Boot?",
"Explain the concept of Spring Boot's Spring Cloud integration",
"How do you configure and use the Spring Boot logback encoder?",
"What is the purpose of the @EnableAsync annotation in Spring Boot?",
"How do you implement token-based authentication in Spring Boot?",
"Explain the concept of Spring Boot's Acutator metrics",
"How do you configure request logging in Spring Boot?",
"What is the purpose of the @EnableConfigurationProperties annotation?",
"How do you implement content negotiation in Spring Boot?",
"Explain the concept of Spring Boot's conditional beans?",
"How do you configure exception handling in Spring Boot?",
"What is the purpose of the @EnableFeignClients annotation?",
"How do you implement message queuing in Spring Boot using RabbitMQ?",
"Explain the concept of Spring Boot's Actuator tracing?",
"How do you configure database connection pooling in Spring Boot?",
"What is the purpose of the @EnableRetry annotation in Spring Boot?",
"How do you implement authentication using JSON Web Tokens (JWT) in Spring Boot?",
"Explain the concept of Spring Boot's Actuator info?",
"How do you configure and use the Spring Boot logback appender?",
"What is the purpose of the @EnableCircuitBreaker annotation in Spring Boot?",
"How do you implement distributed caching in Spring Boot using Redis?",
"Explain the concept of Spring Boot's Actuator logging",
"How do you configure asynchronous execution in Spring Boot?",
"What is the purpose of the @EnableJms annotation in Spring Boot?",
"How do you implement request/response logging in Spring Boot?",
"Explain the concept of Spring Boot's Actuator environment",
"How do you configure rate limiting in Spring Boot?",
"What is the purpose of the @EnableZuulProxy annotation in Spring Boot?",
"What is Spring Boot?",
"What are the advantages of using Spring Boot?",
"How does Spring Boot simplify the development of Java applications?",
"Explain the key features of Spring Boot",
"How is Spring Boot different from the Spring Framework?",
"What is the purpose of the `@SpringBootApplication` annotation?",
"Explain the concept of auto-configuration in Spring Boot",
"How can you override the default auto-configuration in Spring Boot?",
"What is the role of the Spring Boot Starter dependencies?",
"How do you create a new Spring Boot project using Maven?",
"What is the purpose of the `application.properties` file in Spring Boot?",
"How can you externalize configuration properties in Spring Boot?",
"How does Spring Boot support different database technologies?",
"Explain the role of Spring Data JPA in Spring Boot",
"How can you implement caching in Spring Boot?",
"What is Spring Boot, and how is it different from Spring Framework?",
"What are the main features of Spring Boot?",
"What is Spring Boot Autoconfiguration?",
"How does Spring Boot simplify the configuration of Spring applications?",
"What is the role of Spring Boot Starter in a Spring Boot project?",
"How does Spring Boot integrate with different types of databases?",
"How does Spring Boot support different types of web applications?",
"What is the purpose of the @SpringBootApplication annotation?",
"What is the difference between a Spring Boot application and a traditional Spring application?",
"What is the purpose of the Spring Boot Actuator module?",
"What is the difference between @Controller and @RestController in Spring MVC?",
"How does Spring Boot handle external configuration properties?",
"What is the role of the Spring Boot CLI?",
"What is the difference between the @Autowired and @Resource annotations in Spring?",
"How does Spring Boot support testing of Spring applications?",
"What is Spring Boot DevTools, and how can it be useful during development?",
"What is the purpose of the @EnableAutoConfiguration annotation?",
"What is the purpose of the SpringApplication class in Spring Boot?",
"What is the difference between @Component, @Service, and @Repository annotations in Spring?",
"How can you configure logging in a Spring Boot application?",
"What is the role of the Spring Boot Maven plugin?",
"How does Spring Boot support integration with messaging systems?",
"What is the role of the Spring Boot banner.txt file?",
"How does Spring Boot support microservices architecture?",
"What is the difference between the @PathVariable and @RequestParam annotations in Spring MVC?",
"What is the role of the @RequestMapping annotation in Spring MVC?",
"How can you configure multiple data sources in a Spring Boot application?",
"What is the difference between an embedded and an external Tomcat server in a Spring Boot application?",
"What is the role of the Spring Boot Starter Parent in a Maven project?",
"How can you secure a Spring Boot application using Spring Security?",
"What is the purpose of the @Transactional annotation in Spring?",
"How does Spring Boot handle exceptions in a web application?",
"What is the difference between an in-memory and a persistent database in a Spring Boot application?",
"What is the role of the Spring Boot Test module?",
"How can you configure a custom error page in a Spring Boot application?",
"What is the difference between a JAR and a WAR file in a Spring Boot application?",
"What is the role of the Spring Boot Gradle plugin?",
"How can you configure caching in a Spring Boot application?",
"What is the difference between a bean and a component in Spring?",
"What is the role of the Spring Boot Actuator endpoints?",
"What is the difference between a DTO and an entity in a Spring Boot application?",
"How does Spring Boot integrate with different types of security protocols?",
"How can you configure an HTTPS connection in a Spring Boot application?",
"What is the difference between a filter and an interceptor in Spring MVC?",
"What is the role of the Spring Boot Admin module?",
"How does Spring Boot handle internationalization in a web application?",
"What is the purpose of the @Configuration annotation in Spring?",
"How can you use Spring Boot to schedule tasks in a web application?",
"What is the difference between a dependency and a plugin in Maven?",
"How can you use Spring Boot to consume RESTful web services?",
"What is the purpose of the @Conditional annotation in Spring Boot?",
"What is Spring Boot, and how does it differ from the Spring Framework?",
"How does Spring Boot simplify the development of Spring applications?",
"Explain the concept of auto-configuration in Spring Boot",
"What are the advantages of using Spring Boot?",
"How can you create a simple RESTful API using Spring Boot?",
"What is the purpose of the @SpringBootApplication annotation in a Spring Boot application?",
"How does Spring Boot handle database transactions?",
"Explain the role of Spring Boot Starters and provide some examples",
"How can you configure logging in a Spring Boot application?",
"How does Spring Boot handle dependency management?",
"What is Spring Boot Actuator, and what are its benefits?",
"How can you configure different profiles in a Spring Boot application?",
"Explain the concept of externalized configuration in Spring Boot",
"How can you secure a Spring Boot application using Spring Security?",
"What is the purpose of the application.properties (or application.yml) file in Spring Boot?",
"How does Spring Boot support caching?",
"What is the role of Spring Boot DevTools?",
"How can you deploy a Spring Boot application to a servlet container or an application server?",
"Explain the concept of Spring Boot Actuator endpoints and their significance",
"How can you handle exceptions and errors in a Spring Boot application?");
		Map<String, Long> map = questions.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		FileWriter writer = new FileWriter("");
		writer.write(map.toString());
		writer.close();
	}
}