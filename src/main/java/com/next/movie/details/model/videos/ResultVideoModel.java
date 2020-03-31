package com.next.movie.details.model.videos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Date création : 2019-07-19
 *
 * @author kmvelia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVideoModel {

    private String      id;
    private String      iso_639_1;
    private String      iso_3166_1;
    private String      key;
    private String      name;
    private String      site;
    private int         size;
    private String      type;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets iso 639 1.
     *
     * @return the iso 639 1
     */
    public String getIso_639_1() {
        return iso_639_1;
    }

    /**
     * Sets iso 639 1.
     *
     * @param iso_639_1 the iso 639 1
     */
    public void setIso_639_1(String iso_639_1) {
        this.iso_639_1 = iso_639_1;
    }

    /**
     * Gets iso 3166 1.
     *
     * @return the iso 3166 1
     */
    public String getIso_3166_1() {
        return iso_3166_1;
    }

    /**
     * Sets iso 3166 1.
     *
     * @param iso_3166_1 the iso 3166 1
     */
    public void setIso_3166_1(String iso_3166_1) {
        this.iso_3166_1 = iso_3166_1;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     *
     * @param key the key
     */
    public void setKey(String key) {
        this.key = key;
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
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets site.
     *
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets site.
     *
     * @param site the site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ResultVideoDTO{" +
                "id=" + id +
                ", iso_639_1='" + iso_639_1 + '\'' +
                ", iso_3166_1='" + iso_3166_1 + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}
