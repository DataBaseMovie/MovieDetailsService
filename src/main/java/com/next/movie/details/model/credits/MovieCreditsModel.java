package com.next.movie.details.model.credits;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;

/**
 * Date création : 2019-08-07
 *
 * @author kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieCreditsModel {

    private int             id;
    private MovieCastModel[]  cast ;
    private MovieCrewModel[]  crew ;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Get cast movie cast [ ].
     *
     * @return the movie cast [ ]
     */
    public MovieCastModel[] getCast() {
        return cast;
    }

    /**
     * Get crew movie crew [ ].
     *
     * @return the movie crew [ ]
     */
    public MovieCrewModel[] getCrew() {
        return crew;
    }

    @Override
    public String toString() {
        return "MovieCreditsDTO{" +
                "id=" + id +
                ", cast=" + Arrays.toString(cast) +
                ", crew=" + Arrays.toString(crew) +
                '}';
    }
}

