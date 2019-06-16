package net.bis5.opengraph.models;

import lombok.Data;

@Data
public class Image {
    private String url;
    private String secureUrl;
    private String type;
    private long width;
    private long height;
}
