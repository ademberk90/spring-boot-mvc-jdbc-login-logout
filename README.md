# Spring Boot MVC Security JDBC, Login, Logout, Roles

### Description
Spring Boot MVC user login operations with JDBC

### Features

1. Custom Login Page ( styled with Bootstrap )
2. Logout
3. Role Based Access Route ( 3 user -> John: Employee, Mary: Manager, Susan: Admin)
4. Mysql Scripts ( in sql-scripts folder )
5. Bcrypt Passwords

### SQL Scripts

In this repo you can find Sql script that make your test easier. Just copy, paste and execute it. You can find sql script in "sql-scripts" folder. (You dont need a create a database and table manually)

Just you need is add sql connection properties in application.properties file. You can see my test connections configurations.

You dont have to use bcrypt password. You can use plain text also. For that just change the sql scripts when u created users. 

> FROM: ('john','{bcrypt}$2a$12$mcto7IG13e4gbUazaHqsqezTKjnyJfzzaeM/HYOhYZc2E56.eq3kK',1)
>
> TO: ('john','{noop}test123',1)

### BCRYPT PASSWORD

We can create bcrypted text using [Bcrypt Generator](https://bcrypt-generator.com/). I created **test123** password for all user. You can change them what you want.

Also 

### Preview

#### Login Page

![list](https://raw.githubusercontent.com/ademberk90/spring-boot-mvc-jdbc-login-logout/main/images/login.PNG)


#### Employee's Home Page

![list](https://raw.githubusercontent.com/ademberk90/spring-boot-mvc-jdbc-login-logout/main/images/john.PNG)


#### Manager's Home Page

![list](https://raw.githubusercontent.com/ademberk90/spring-boot-mvc-jdbc-login-logout/main/images/mary.PNG)


#### Admin's Home Page

![list](https://raw.githubusercontent.com/ademberk90/spring-boot-mvc-jdbc-login-logout/main/images/susan.PNG)


#### Logout Page

![list](https://raw.githubusercontent.com/ademberk90/spring-boot-mvc-jdbc-login-logout/main/images/logout.PNG)


#### As Example: Employee Route Page

![list](https://raw.githubusercontent.com/ademberk90/spring-boot-mvc-jdbc-login-logout/main/images/employeepage.PNG)



