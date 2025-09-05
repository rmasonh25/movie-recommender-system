/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: MovieRecommenderSystemApplication.java
 * Created on: 2025-09-05 12:07
 * Last modified: 2025-09-05 12:07
 *
 */

package com.bujisoft.movie_recommender_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		// passing name of filter as constructor argument
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		// call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		// display result
		System.out.println(Arrays.toString(result));


	}

}
