package com.puzzle.server.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@JsonSerialize
@Getter
@Setter
public class ArtistInfo {

    @JsonView
    private String name;

    @JsonView
    private String photoUrl;

    @JsonView
    private String siteUrl;

    @JsonView
    private String instagramUrl;

    @JsonView
    private String facebookUrl;

    @JsonView
    private String vkUrl;

    @JsonView
    private String youtubeUrl;

}
