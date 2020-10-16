package com.awslab.lab1;

import com.awslab.lab1.post.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Lab1Application {
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@GetMapping("/post")

	public Post[] getPost() {
		Post[] results = new Post[3];
		results[0] = new Post("Hello");
		results[1] = new Post("world2");

		results[2] = new Post("!");

		return results; }

}
