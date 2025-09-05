/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: MovieRecommenderSystemApplication.java
 * Created on: 2025-09-05 15:18
 * Last modified: 2025-09-05 15:18
 *
 */

package com.bujisoft.movie_recommender_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext =SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//Recommends Implementation injects dependecy using constructor
		System.out.println("Constructor injection in RecommenderImplementation class");
		// passing name of filter as constructor argument
		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
		// call method to get recommendations
		String[] result = recommender2.recommendMovies("Finding Dory");
		// display result
		System.out.println(Arrays.toString(result));


	}

}
