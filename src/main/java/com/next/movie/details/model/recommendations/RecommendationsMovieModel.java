package com.next.movie.details.model.recommendations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;

/**
 * Date création : 2019-08-09
 *
 * @author kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationsMovieModel {

    private int                             page;
    private ResultRecommendationsMovieModel[] results;
    private int                             total_pages;
    private int                             total_results;

    /**
     * Gets page.
     *
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * Get results result recommendations movie dto [ ].
     *
     * @return the result recommendations movie dto [ ]
     */
    public ResultRecommendationsMovieModel[] getResults() {
        return results;
    }

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public int getTotal_pages() {
        return total_pages;
    }

    /**
     * Gets total results.
     *
     * @return the total results
     */
    public int getTotal_results() {
        return total_results;
    }

    @Override
    public String toString() {
        return "RecommendationsMovieDTO{" +
                "page=" + page +
                ", results=" + Arrays.toString(results) +
                ", total_pages=" + total_pages +
                ", total_results=" + total_results +
                '}';
    }
}

