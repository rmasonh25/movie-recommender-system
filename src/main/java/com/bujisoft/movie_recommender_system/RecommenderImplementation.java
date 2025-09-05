/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation.java
 * Created on: 2025-09-05 11:40
 * Last modified: 2025-09-05 11:40
 *
 */

package com.bujisoft.movie_recommender_system;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie) {
        // use content based filter to find movies
        // change filter to collaborative filter to find movies
        /// ContentBasedFilter filter = new ContentBasedFilter();
        CollaborativeFilter filter = new CollaborativeFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        //return the results
        return results;
       // return new String[] {"M1", "M2", "M3"};
    }
}
