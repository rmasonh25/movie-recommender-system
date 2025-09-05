/*
 *
 *
 * Copyright (c) 2025 Bujisoft
 * Author: Robert Hendricks
 * File: Filter.java
 * Created on: 2025-09-05 11:56
 * Last modified: 2025-09-05 11:56
 *
 */

package com.bujisoft.movie_recommender_system;

public interface Filter {
    public String[] getRecommendations(String movie);
}
