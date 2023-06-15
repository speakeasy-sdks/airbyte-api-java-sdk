/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceKustomerSinger - The values required to configure the source.
 */

public class SourceKustomerSinger {
    /**
     * Kustomer API Token. See the &lt;a href="https://developer.kustomer.com/kustomer-api-docs/reference/authentication"&gt;docs&lt;/a&gt; on how to obtain this
     */
    @JsonProperty("api_token")
    public String apiToken;

    public SourceKustomerSinger withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceKustomerSingerKustomerSinger sourceType;

    public SourceKustomerSinger withSourceType(SourceKustomerSingerKustomerSinger sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate the data
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceKustomerSinger withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceKustomerSinger(@JsonProperty("api_token") String apiToken, @JsonProperty("sourceType") SourceKustomerSingerKustomerSinger sourceType, @JsonProperty("start_date") String startDate) {
        this.apiToken = apiToken;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
