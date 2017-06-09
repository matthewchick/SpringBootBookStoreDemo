package com.matthew.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://getbootstrap.com/getting-started/#download - download bootstrap and copy them to /resources/static
//https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku
//https://devcenter.heroku.com/articles/renaming-apps
//1. heroku login
//2. heroku create
//3. git push heroku master
//4. heroku apps:rename matthewbookstore
//5. heroku git:remote -a matthewbookstore
//6. heroku open
//7. https://matthewbookstore.herokuapp.com/

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication   //equivalent to using the above 3 annotations in spring
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}
