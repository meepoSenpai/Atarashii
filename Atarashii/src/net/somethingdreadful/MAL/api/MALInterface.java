package net.somethingdreadful.MAL.api;

import net.somethingdreadful.MAL.api.response.Anime;
import net.somethingdreadful.MAL.api.response.AnimeList;
import net.somethingdreadful.MAL.api.response.ForumMain;
import net.somethingdreadful.MAL.api.response.Manga;
import net.somethingdreadful.MAL.api.response.MangaList;
import net.somethingdreadful.MAL.api.response.Profile;
import net.somethingdreadful.MAL.api.response.User;

import java.util.ArrayList;
import java.util.Map;

import retrofit.client.Response;
import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;

public interface MALInterface {
    @GET("/account/verify_credentials")
    Response verifyAuthentication();

    @GET("/anime/{anime_id}?mine=1")
    Anime getAnime(@Path("anime_id") int anime_id);

    @GET("/anime/search")
    ArrayList<Anime> searchAnime(@Query("q") String query, @Query("page") int page);

    @GET("/anime/popular")
    ArrayList<Anime> getPopularAnime(@Query("page") int page);

    @GET("/anime/top")
    ArrayList<Anime> getTopRatedAnime(@Query("page") int page);

    @GET("/anime/upcoming")
    ArrayList<Anime> getUpcomingAnime(@Query("page") int page);

    @GET("/anime/just_added")
    ArrayList<Anime> getJustAddedAnime(@Query("page") int page);

    @GET("/animelist/{username}")
    AnimeList getAnimeList(@Path("username") String username);

    @DELETE("/animelist/anime/{anime_id}")
    Response deleteAnime(@Path("anime_id") int anime_id);

    @FormUrlEncoded
    @POST("/animelist/anime")
    Response addAnime(@Field("anime_id") int id, @Field("status") String status, @Field("episodes") int episodes,
                      @Field("score") float score);

    @FormUrlEncoded
    @PUT("/animelist/anime/{anime_id}")
    Response updateAnime(@Path("anime_id") int id, @FieldMap Map<String, String> params);

    @GET("/manga/{manga_id}?mine=1")
    Manga getManga(@Path("manga_id") int manga_id);

    @GET("/manga/search")
    ArrayList<Manga> searchManga(@Query("q") String query, @Query("page") int page);

    @GET("/manga/popular")
    ArrayList<Manga> getPopularManga(@Query("page") int page);

    @GET("/manga/top")
    ArrayList<Manga> getTopRatedManga(@Query("page") int page);

    @GET("/manga/upcoming")
    ArrayList<Manga> getUpcomingManga(@Query("page") int page);

    @GET("/manga/just_added")
    ArrayList<Manga> getJustAddedManga(@Query("page") int page);

    @GET("/mangalist/{username}")
    MangaList getMangaList(@Path("username") String username);

    @DELETE("/mangalist/manga/{manga_id}")
    Response deleteManga(@Path("manga_id") int manga_id);

    @FormUrlEncoded
    @POST("/mangalist/manga")
    Response addManga(@Field("manga_id") int id, @Field("status") String status, @Field("chapters") int chapters,
                      @Field("volumes") int volumes, @Field("score") float score);

    @FormUrlEncoded
    @PUT("/mangalist/manga/{manga_id}")
    Response updateManga(@Path("manga_id") int id, @FieldMap Map<String, String> params);

    @GET("/profile/{username}")
    Profile getProfile(@Path("username") String username);

    @GET("/friends/{username}")
    ArrayList<User> getFriends(@Path("username") String username);

    @GET("/forum")
    ForumMain getForum();

    @GET("/forum/{id}")
    ForumMain getTopics(@Path("id") int id, @Query("page") int page);

    @GET("/forum/anime/{id}")
    ForumMain getAnime(@Path("id") int id, @Query("page") int page);

    @GET("/forum/manga/{id}")
    ForumMain getManga(@Path("id") int id, @Query("page") int page);

    @GET("/forum/topic/{id}")
    ForumMain getPosts(@Path("id") int id, @Query("page") int page);

    @GET("/forum/board/{id}")
    ForumMain getSubBoards(@Path("id") int id, @Query("page") int page);

    @GET("/forum/search")
    ForumMain search(@Query("query") String query);

    @FormUrlEncoded
    @POST("/forum/topic/{id}")
    Response addComment(@Path("id") int id, @Field("message") String message);

    @FormUrlEncoded
    @PUT("/forum/topic/{id}")
    Response updateComment(@Path("id") int id, @Field("message") String message);

    @FormUrlEncoded
    @POST("/forum/{id}")
    Response addTopic(@Path("id") int id, @Field("title") String title, @Field("message") String message);
}
