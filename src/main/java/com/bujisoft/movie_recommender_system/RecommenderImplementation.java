/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation.java
 * Created on: 2025-09-05 15:15
 * Last modified: 2025-09-05 15:15
 *
 */

package com.bujisoft.movie_recommender_system;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("RecommenderImplementation2 constructor");

    }

    public String[] recommendMovies(String movie) {
        // Use the injected filter to get recommendations
        return filter.getRecommendations(movie);

    }
}

