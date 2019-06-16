package net.bis5.opengraph.models;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Book {
    private String isbn;
    private ZonedDateTime releaseDate;
    private List<String> tags = new ArrayList<>();
    private List<Profile> authors = new ArrayList<>();
}
