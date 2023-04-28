/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceUsCensus - The values required to configure the source.
 */
public class SourceUsCensus {
    /**
     * Your API Key. Get your key &lt;a href="https://api.census.gov/data/key_signup.html"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceUsCensus withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The query parameters portion of the GET request, without the api key
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_params")
    public String queryParams;
    public SourceUsCensus withQueryParams(String queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    /**
     * The path portion of the GET request
     */
    @JsonProperty("query_path")
    public String queryPath;
    public SourceUsCensus withQueryPath(String queryPath) {
        this.queryPath = queryPath;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceUsCensusUsCensusEnum sourceType;
    public SourceUsCensus withSourceType(SourceUsCensusUsCensusEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceUsCensus(@JsonProperty("api_key") String apiKey, @JsonProperty("query_path") String queryPath, @JsonProperty("sourceType") SourceUsCensusUsCensusEnum sourceType) {
        this.apiKey = apiKey;
        this.queryPath = queryPath;
        this.sourceType = sourceType;
  }
}
