Spring Boot Flyway
----------------------------------------

You might know the benefits of using a version of control in software development such as [Git](https://git-scm.com/) or [Subversion](https://subversion.apache.org/). This project will show you [Flyway](https://flywaydb.org/) to manage version control for your database so that you can track schema's evolution across all your environments with ease using [Gradle](https://gradle.org/) and Spring Boot.

#### To run the project

```bash
gradle bootRun -Dflyway.user=${username} -Dflyway.password=${pawword}
```

where:
- `${username}` is the database username
- `${password}` is the database password

#### Read this as reference:

* http://josdem.io/techtalk/spring/spring_boot_flyway/
