package com.next.movie.details.model.recommendations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.lang.Nullable;

import java.util.ArrayList;

/**
 * Date création : 2019-08-10
 *
 * @author kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class ResultRecommendationsMovieModel {

    @Nullable
    private String              poster_path;
    private boolean             adult;
    private String              overview;
    private String              release_date;
    private ArrayList<Integer>  genre_ids;
    private int                 id;
    private String              original_title;
    private String              original_language;
    private String              title;
    @Nullable
    private String              backdrop_path;
    private double              popularity;
    private int                 vote_count;
    private boolean             video;
    private float               vote_average;

    /**
     * Gets poster path.
     *
     * @return the poster path
     */
    @Nullable
    public String getPoster_path() {
        return poster_path;
    }

    /**
     * Is adult boolean.
     *
     * @return the boolean
     */
    public boolean isAdult() {
        return adult;
    }

    /**
     * Gets overview.
     *
     * @return the overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     * Gets release date.
     *
     * @return the release date
     */
    public String getRelease_date() {
        return release_date;
    }

    /**
     * Gets genre ids.
     *
     * @return the genre ids
     */
    public ArrayList<Integer> getGenre_ids() {
        return genre_ids;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets original title.
     *
     * @return the original title
     */
    public String getOriginal_title() {
        return original_title;
    }

    /**
     * Gets original language.
     *
     * @return the original language
     */
    public String getOriginal_language() {
        return original_language;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets backdrop path.
     *
     * @return the backdrop path
     */
    @Nullable
    public String getBackdrop_path() {
        return backdrop_path;
    }

    /**
     * Gets popularity.
     *
     * @return the popularity
     */
    public double getPopularity() {
        return popularity;
    }

    /**
     * Gets vote count.
     *
     * @return the vote count
     */
    public int getVote_count() {
        return vote_count;
    }

    /**
     * Is video boolean.
     *
     * @return the boolean
     */
    public boolean isVideo() {
        return video;
    }

    /**
     * Gets vote average.
     *
     * @return the vote average
     */
    public float getVote_average() {
        return vote_average;
    }

    @Override
    public String toString() {
        return "ResultRecommendationsMovieDTO{" +
                "poster_path='" + poster_path + '\'' +
                ", adult=" + adult +
                ", overview='" + overview + '\'' +
                ", release_date='" + release_date + '\'' +
                ", genre_ids=" + genre_ids +
                ", id=" + id +
                ", original_title='" + original_title + '\'' +
                ", original_language='" + original_language + '\'' +
                ", title='" + title + '\'' +
                ", backdrop_path='" + backdrop_path + '\'' +
                ", popularity=" + popularity +
                ", vote_count=" + vote_count +
                ", video=" + video +
                ", vote_average=" + vote_average +
                '}';
    }
}
