/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation.java
 * Created on: 2025-09-05 02:56
 * Last modified: 2025-09-05 02:56
 *
 */

package com.bujisoft.movie_recommender_system;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie) {
        // use content based filter to find movies
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations(movie);
        //return the results
        return results;
       // return new String[] {"M1", "M2", "M3"};
    }
}
