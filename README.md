# Login with Registration Form using Spring-MVC, PostgreSQL and JSP pages


###Acknowledgements:

***Backend***

* PostgreSQL
* Spring MVC
* Spring Security
* Spring Data JPA
* Maven

***Frontend***

* JSP

***SQL Queries***

* Create a database with **registerform**

* `CREATE TABLE role (
id bigserial NOT NULL PRIMARY KEY,
    name varchar(45) DEFAULT NULL
  );`

* `CREATE TABLE users_role (
  users_id bigserial NOT NULL,
  role_id bigserial NOT NULL,
  CONSTRAINT users_role_pkey PRIMARY KEY (users_id,role_id),
  CONSTRAINT fk_usersid FOREIGN KEY (users_id)
      REFERENCES public.users (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_roleid FOREIGN KEY (role_id)
      REFERENCES public.role (id) MATCH SIMPLE
      ON DELETE CASCADE ON UPDATE CASCADE
  );`


* `CREATE TABLE users (
  id bigserial NOT NULL PRIMARY KEY,
  userName varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL
  );`



***Run***

You can run the application by downloading and running it in mvn jetty:run 

For Output try http://localhost:8080/Login_Register/login on the browser 
