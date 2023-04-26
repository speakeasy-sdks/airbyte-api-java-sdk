/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceK6Cloud - The values required to configure the source.
 */
public class SourceK6Cloud {
    /**
     * Your API Token. See &lt;a href="https://k6.io/docs/cloud/integrations/token/"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("api_token")
    public String apiToken;
    public SourceK6Cloud withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceK6CloudK6CloudEnum sourceType;
    public SourceK6Cloud withSourceType(SourceK6CloudK6CloudEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceK6Cloud(@JsonProperty("api_token") String apiToken, @JsonProperty("sourceType") SourceK6CloudK6CloudEnum sourceType) {
        this.apiToken = apiToken;
        this.sourceType = sourceType;
  }
}
