# Project Title

Proyecto de mitad de grado de la Licenciatura en Tecnologias 
de la Información impartida por UTEC Universidad Tecnológica del Uruguay.

## Java - Spring Boot
### Aplication properties
```
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp
spring.datasource.url= ``jdbc:oracle:thin:@192.168.56.1:1521:xe``
spring.datasource.username= ``AGROCOL``
spring.datasource.password= ``AGROCOL``
spring.jpa.hibernate.ddl-auto= ``update``
spring.jpa.show-sql= ``true``
spring.jpa.properties.hibernate.format_sql= ``true``
spring.jpa.properties.hibernate.dialect= ``org.hibernate.dialect.Oracle10gDialect``
```

## Dependencias a instalar
 - DevTools
 - JPA
 - Oracle SQL
 - Web
 - Thymeleaf

#### Wildfly
```
  <properties>
        <java.version>11</java.version>
        <deploy.wildfly.host>127.0.0.1</deploy.wildfly.host>
        <deploy.wildfly.port>9990</deploy.wildfly.port>
        <deploy.wildfly.username>wildfly</deploy.wildfly.username>
        <deploy.wildfly.password>w1ldFly!</deploy.wildfly.password>
    </properties>
```
```
   <build>
        <plugins>
            <plugin>
                <groupId>org.wildfly.plugins</groupId>
                <artifactId>wildfly-maven-plugin</artifactId>
                <version>2.0.2.Final</version>
                <executions>
                    <execution>
                        <phase>install</phase>
                        <goals>
                            <goal>deploy</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <filename>${project.build.finalName}.war</filename>
                    <hostname>${deploy.wildfly.host}</hostname>
                    <port>${deploy.wildfly.port}</port>
                    <username>${deploy.wildfly.username}</username>
                    <password>${deploy.wildfly.password}</password>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

### Oracle SQL
```
  <dependency>
            <groupId>com.oracle.database.jdbc</groupId>
            <artifactId>ojdbc8</artifactId>
            <scope>runtime</scope>
  </dependency>
```

## Herramientas a descargar

### Backend
<div style="display: inline_block">
<a href="https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html/"> 
<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" 
alt="logo Java" width="40" height="40"/> 
</a>
<a href="https://maven.apache.org/download.cgi/">
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/apache/apache-original.svg" 
alt="logo Maven" width="40" height="40"/> 
</a>
<a href="https://www.oracle.com/database/sqldeveloper/technologies/download/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/oracle/oracle-original.svg" 
alt="logo oracle" width="40" height="40"/> 
</a>
</div>

### Frontend
<div style="display: inline_block">
<a href="/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original-wordmark.svg" 
alt="logo HTML" width="40" height="40"/> 
</a>

<a href=""> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original-wordmark.svg" 
alt="logo Bootstrap" width="40" height="40"/> 
</a>

<a href="https://getbootstrap.com/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-plain.svg"
alt="logo Bootstrap" width="40" height="40"/> 
</a>
</div>


## IDE
<a href="https://www.jetbrains.com/es-es/idea/"> 
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" 
alt="Maven" width="40" height="40"/> 
</a>

                    
## Tech Stack

**Client:** React, Redux, TailwindCSS

**Server:** Node, Express

