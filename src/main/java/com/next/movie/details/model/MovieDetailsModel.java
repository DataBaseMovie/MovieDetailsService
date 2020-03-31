package com.next.movie.details.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.next.movie.details.utils.Months;

import javax.validation.constraints.NotNull;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Date création : 2019-07-03
 *
 * @author kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieDetailsModel {

    private int id;
    private boolean adult;
    private GenreMovieDetailsModel[] genres;
    private String overview;
    private double popularity;
    private String poster_path;
    private String release_date;
    private int runtime;
    private String title;
    private boolean video;
    private float vote_average;
    private int vote_count;

    /**
     * Instantiates a new Movie api.
     */
    public MovieDetailsModel() {
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
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
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
     * Sets adult.
     *
     * @param adult the adult
     */
    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    /**
     * Get genres genre movie [ ].
     *
     * @return the genre movie [ ]
     */
    public GenreMovieDetailsModel[] getGenres() {
        return genres;
    }

    /**
     * Sets genres.
     *
     * @param genres the genres
     */
    public void setGenres(GenreMovieDetailsModel[] genres) {
        this.genres = genres;
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
     * Sets overview.
     *
     * @param overview the overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
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
     * Sets popularity.
     *
     * @param popularity the popularity
     */
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    /**
     * Gets poster path.
     *
     * @return the poster path
     */
    public String getPoster_path() {
        return poster_path;
    }

    /**
     * Sets poster path.
     *
     * @param poster_path the poster path
     */
    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    /**
     * Gets release date.
     *
     * @return the release date
     */
    public String getRelease_date() {

        String[] date = release_date.split("-");
        int cYear = Integer.parseInt(date[0]);
        int cMonth = Integer.parseInt(date[1]) - 1;
        int cDayOfMonth = Integer.parseInt(date[2]);
        release_date = cDayOfMonth + " " + Months.values()[cMonth] + " " + cYear;

        return release_date;
    }

    /**
     * Sets release date.
     *
     * @param release_date the release date
     */
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    /**
     * Gets runtime.
     *
     * @return the runtime
     */
    public String getRuntime() {
        return (heureMinute(runtime));
    }

    /**
     * Sets runtime.
     *
     * @param runtime the runtime
     */
    public void setRuntime(int runtime) {
        this.runtime = runtime;
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
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
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
     * Sets video.
     *
     * @param video the video
     */
    public void setVideo(boolean video) {
        this.video = video;
    }

    /**
     * Gets vote average.
     *
     * @return the vote average
     */
    public float getVote_average() {
        return vote_average;
    }

    /**
     * Sets vote average.
     *
     * @param vote_average the vote average
     */
    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
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
     * Sets vote count.
     *
     * @param vote_count the vote count
     */
    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    /**
     * Heure minute string.
     *
     * @param minutes the minutes
     * @return the string
     */
    @NotNull
    private String heureMinute(int minutes) {
        DecimalFormat dfMinute = new DecimalFormat("00");
        DecimalFormat dfHeure = new DecimalFormat("0");

        return dfHeure.format((Math.floor(minutes / 60))) + "h " + dfMinute.format(new Double(minutes % 60)) + "m";
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id=" + id +
                ", adult=" + adult +
                ", genre=" + Arrays.toString(genres) +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", poster='" + poster_path + '\'' +
                ", release_date='" + release_date + '\'' +
                ", runtime=" + runtime +
                ", title='" + title + '\'' +
                ", videos=" + video +
                ", vote_average=" + vote_average +
                ", vote_count=" + vote_count +
                '}';
    }
}