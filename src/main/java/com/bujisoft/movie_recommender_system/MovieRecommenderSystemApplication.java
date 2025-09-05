/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: MovieRecommenderSystemApplication.java
 * Created on: 2025-09-05 11:26
 * Last modified: 2025-09-05 11:26
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

		RecommenderImplementation impl = new RecommenderImplementation();
		String[] result = impl.recommendMovies("The Shawshank Redemption");
		System.out.println(Arrays.toString(result));
	}

}
