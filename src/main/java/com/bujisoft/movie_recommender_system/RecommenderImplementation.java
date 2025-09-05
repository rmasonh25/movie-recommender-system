/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation.java
 * Created on: 2025-09-05 11:56
 * Last modified: 2025-09-05 11:56
 *
 */

package com.bujisoft.movie_recommender_system;

public class RecommenderImplementation {
        private Filter filter;

        public RecommenderImplementation(Filter filter) {
            super();
            this.filter = filter;

    }

    // use filter to get recommendations
    public String[] recommendMovies(String movie) {
        System.out.println("Name of filter to use:"  + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
