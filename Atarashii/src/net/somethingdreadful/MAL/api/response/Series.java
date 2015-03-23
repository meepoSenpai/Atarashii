package net.somethingdreadful.MAL.api.response;

import com.google.gson.annotations.SerializedName;

import net.somethingdreadful.MAL.api.MALApi;

import lombok.Getter;
import lombok.Setter;

public class Series {
    @Setter @Getter private boolean adult;
    @Setter @Getter @SerializedName("airing_status") private String airingStatus;
    @Setter @Getter @SerializedName("average_score") private float averageScore;
    @Setter @Getter private int id;
    @Setter @Getter @SerializedName("image_url_lge") private String imageUrlLge;
    @Setter @Getter @SerializedName("image_url_med") private String imageUrlMed;
    @Setter @Getter @SerializedName("image_url_sml") private String imageUrlSml;
    @Setter @Getter @SerializedName("publishing_status") private String publishingStatus;
    @Setter @Getter @SerializedName("series_type") private String seriesType;
    @Setter @Getter @SerializedName("title_english") private String titleEnglish;
    @Setter @Getter @SerializedName("title_japanese") private String titleJapanese;
    @Setter @Getter @SerializedName("title_romaji") private String titleRomaji;
    @Setter @Getter @SerializedName("total_chapters") private int totalChapters;
    @Setter @Getter @SerializedName("total_episodes") private int totalEpisodes;
    @Setter @Getter @SerializedName("total_volumes") private int totalVolumes;
    @Setter @Getter private String type;
}
