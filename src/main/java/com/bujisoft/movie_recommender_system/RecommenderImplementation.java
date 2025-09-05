/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation.java
 * Created on: 2025-09-05 12:42
 * Last modified: 2025-09-05 12:42
 *
 */

package com.bujisoft.movie_recommender_system;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CBF")
        private Filter filter;

    // use filter to get recommendations
    public String [] recommendMovies(String movie) {
        System.out.println("Name of filter to use:"  + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

    //public RecommenderImplementation(Filter filter) {
            //super();
           //this.filter = filter;

    }


