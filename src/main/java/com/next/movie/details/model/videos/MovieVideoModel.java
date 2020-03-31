package com.next.movie.details.model.videos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;

/**
 * Date création : 2019-07-17
 *
 * @author kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieVideoModel {

    private int                id;
    private ResultVideoModel[]   results;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get results result video [ ].
     *
     * @return the result video [ ]
     */
    public ResultVideoModel[] getResults() {
        return results;
    }

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults(ResultVideoModel[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "VideoMovieDTO{" +
                "id=" + id +
                ", results=" + Arrays.toString(results) +
                '}';
    }
}
