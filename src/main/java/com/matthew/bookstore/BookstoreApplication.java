package com.matthew.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://getbootstrap.com/getting-started/#download - download bootstrap and copy them to /resources/static

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication   //equivalent to using the above 3 annotations in spring
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}
