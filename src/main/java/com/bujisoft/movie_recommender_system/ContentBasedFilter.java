/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: ContentBasedFilter.java
 * Created on: 2025-09-05 12:42
 * Last modified: 2025-09-05 12:42
 *
 */

package com.bujisoft.movie_recommender_system;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
public class ContentBasedFilter implements Filter{
    @Override
    public String[] getRecommendations(String movie) {
        return new String[0];
    }
    //public String[] getRecommendations(String movie) {
        // logic of content based filter
        //return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

