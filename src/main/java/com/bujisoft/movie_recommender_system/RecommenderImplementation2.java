/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation2.java
 * Created on: 2025-09-05 15:21
 * Last modified: 2025-09-05 15:21
 *
 */

package com.bujisoft.movie_recommender_system;/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: RecommenderImplementation2.java
 * Created on: 2025-09-05 15:13
 * Last modified: 2025-09-05 15:13
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

    private Filter filter;

    @Autowired
    public RecommenderImplementation2(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
    }

    // Add this method to fix the error
    public String[] recommendMovies(String movie) {
        // Use the injected filter to get recommendations
        return filter.getRecommendations(movie);
    }
}
