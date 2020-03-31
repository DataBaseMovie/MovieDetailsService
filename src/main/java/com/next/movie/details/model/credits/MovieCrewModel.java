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
class MovieCrewModel {

    private String  credit_id;
    private String  department;
    @Nullable
    private int     gender;
    private String  job;
    private String  name;
    @Nullable
    private String  profile_path;

    /**
     * Gets credit id.
     *
     * @return the credit id
     */
    public String getCredit_id() {
        return credit_id;
    }

    /**
     * Gets department.
     *
     * @return the department
     */
    public String getDepartment() {
        return department;
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
     * Gets job.
     *
     * @return the job
     */
    public String getJob() {
        return job;
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
        return "MovieCrewDTO{" +
                "credit_id='" + credit_id + '\'' +
                ", department='" + department + '\'' +
                ", gender=" + gender +
                ", job='" + job + '\'' +
                ", name='" + name + '\'' +
                ", profile_path='" + profile_path + '\'' +
                '}';
    }
}
