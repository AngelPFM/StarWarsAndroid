package rest;

import models.FilmResults;
import models.PeopleResults;
import models.PlanetResults;
import models.SpecieResults;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by User on 27/10/2016.
 */
public interface APIPlug
{
    @GET("films")
    Call<FilmResults> searchFilms(@Query("search") String search);

    @GET("people")
    Call<PeopleResults> searchPeople(@Query("search") String search);

    @GET("planets")
    Call<PlanetResults> searchPlanets(@Query("search") String search);

    @GET("species")
    Call<SpecieResults> searchSpecies(@Query("search") String search);







}

