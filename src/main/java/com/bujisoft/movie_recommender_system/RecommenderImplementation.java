/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation.java
 * Created on: 2025-09-05 12:37
 * Last modified: 2025-09-05 12:37
 *
 */

package com.bujisoft.movie_recommender_system;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
        private Filter contentBasedFilter;

    // use filter to get recommendations
    public String [] recommendMovies(String movie) {
        System.out.println("Name of filter to use:"  + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        return results;
    }

    //public RecommenderImplementation(Filter filter) {
            //super();
           //this.filter = filter;

    }


