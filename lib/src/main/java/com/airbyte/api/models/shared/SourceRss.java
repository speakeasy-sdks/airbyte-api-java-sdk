/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRss - The values required to configure the source.
 */

public class SourceRss {
    @JsonProperty("sourceType")
    public SourceRssRss sourceType;

    public SourceRss withSourceType(SourceRssRss sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * RSS Feed URL
     */
    @JsonProperty("url")
    public String url;

    public SourceRss withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public SourceRss(@JsonProperty("sourceType") SourceRssRss sourceType, @JsonProperty("url") String url) {
        this.sourceType = sourceType;
        this.url = url;
  }
}
