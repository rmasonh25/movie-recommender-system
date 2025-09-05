/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: CollaborativeFilter.java
 * Created on: 2025-09-05 12:29
 * Last modified: 2025-09-05 12:29
 *
 */

package com.bujisoft.movie_recommender_system;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter{
    @Override
    public String[] getRecommendations(String movie) {
        return new String[0];
    }
    //public String[] getRecommendations(String movie) {
        // logic of collaborative filter
        //return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
