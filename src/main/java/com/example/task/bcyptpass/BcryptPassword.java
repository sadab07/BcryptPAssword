package com.example.task.bcyptpass;

import org.springframework.boot.SpringApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.task.TaskZeronsecApplication;

public class BcryptPassword {
	public static void main(String[] args) {
		SpringApplication.run(TaskZeronsecApplication.class, args);
	
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "sadabkhan";
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);
		System.out.println();

		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "    isPasswordMatch..?    :- " + isPasswordMatch);

		password = "sadab";
		isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "        isPasswordMatch..?    :- " + isPasswordMatch);
	}

}
