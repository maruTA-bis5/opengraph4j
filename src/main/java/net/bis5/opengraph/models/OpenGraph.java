package net.bis5.opengraph.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class OpenGraph {
    private String type;
    private String url;
    private String title;
    private String description;
    private String determiner;
    private String siteName;
    private String locale;
    private String[] localesAlternate;
    private List<Image> images = new ArrayList<>();
    private List<Audio> audios = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();
    private Article article;
    private Book book;
    private Profile profile;   

    boolean isArticle() {
        return "article".equals(type);
    }
    boolean isBook() {
        return "book".equals(type);
    }
    boolean isProfile() {
        return "profile".equals(type);
    }
}
