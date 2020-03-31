package com.next.movie.details.model.credits;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.lang.Nullable;

/**
 * Date création : 2019-08-07
 *
 * @author kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class MovieCastModel {

    private int     cast_id;
    private String  character;
    private String  credit_id;
    @Nullable
    private int     gender;
    private int     id;
    private String  name;
    private int     order;
    @Nullable
    private String  profile_path;

    /**
     * Gets cast id.
     *
     * @return the cast id
     */
    public int getCast_id() {
        return cast_id;
    }

    /**
     * Gets character.
     *
     * @return the character
     */
    public String getCharacter() {
        return character;
    }

    /**
     * Gets credit id.
     *
     * @return the credit id
     */
    public String getCredit_id() {
        return credit_id;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public int getGender() {
        return gender;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets order.
     *
     * @return the order
     */
    public int getOrder() {
        return order;
    }

    /**
     * Gets profile path.
     *
     * @return the profile path
     */
    @Nullable
    public String getProfile_path() {
        return profile_path;
    }

    @Override
    public String toString() {
        return "MovieCastDTO{" +
                "cast_id=" + cast_id +
                ", character='" + character + '\'' +
                ", credit_id='" + credit_id + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", profile_path='" + profile_path + '\'' +
                '}';
    }
}
