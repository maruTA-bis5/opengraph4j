package net.bis5.opengraph.models;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Article {
    private ZonedDateTime publishedTime;
    private ZonedDateTime modifiedTime;
    private ZonedDateTime expirationTime;
    private String section;
    private List<String> tags = new ArrayList<>();
    private List<Profile> authors = new ArrayList<>();
}
