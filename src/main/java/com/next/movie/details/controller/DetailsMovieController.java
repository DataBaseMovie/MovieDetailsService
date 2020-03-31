package com.next.movie.details.controller;

import com.google.gson.Gson;
import com.next.movie.details.model.MovieDetailsModel;
import com.next.movie.details.model.credits.MovieCreditsModel;
import com.next.movie.details.model.recommendations.RecommendationsMovieModel;
import com.next.movie.details.model.videos.MovieVideoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
@Configuration
@PropertySource("classpath:application.properties")
@RequestMapping(value = "/data", method = RequestMethod.GET, headers = "Accept=application/json")
public class DetailsMovieController {

    @Value("${my.resource.api.base-url-image}")
    private String BASE_URL_IMAGE;
    @Value("${my.resource.api.base-url}")
    private String BASE_URL;
    @Value("${my.resource.api-key}")
    private String API_KEY;

    /**
     * Rest template instance.
     *
     * @return the rest template
     */
    @Autowired
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value="/film/details/{movie_id}", method = RequestMethod.GET)
    @ResponseBody
    public String GetDetailsData(@PathVariable String movie_id) {

        MovieDetailsModel movieDetailsModel = restTemplate().getForObject(BASE_URL + movie_id +"?api_key="+ API_KEY
                + "&language=fr-FR", MovieDetailsModel.class);
        MovieVideoModel movieVideoModel = restTemplate().getForObject(BASE_URL + movie_id
                +"/videos?api_key="+ API_KEY
                + "&language=fr-FR", MovieVideoModel.class);
        MovieCreditsModel movieCreditsModel = restTemplate().getForObject(BASE_URL + movie_id
                + "/credits?api_key=" + API_KEY
                + "&language=fr-FR", MovieCreditsModel.class);
        RecommendationsMovieModel recommendationsMovieModel = restTemplate().getForObject(BASE_URL + movie_id
                + "/recommendations?api_key="+ API_KEY
                + "&language=fr-FR", RecommendationsMovieModel.class);
        List<Object> ArrayOfDetails = new ArrayList<>();

        ArrayOfDetails.add(movieDetailsModel);
        ArrayOfDetails.add(movieCreditsModel);
        ArrayOfDetails.add(recommendationsMovieModel);
        ArrayOfDetails.add(movieVideoModel);

        return new Gson().toJson(ArrayOfDetails);

    }

}
