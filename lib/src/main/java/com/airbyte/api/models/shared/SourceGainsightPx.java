/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGainsightPx - The values required to configure the source.
 */

public class SourceGainsightPx {
    /**
     * The Aptrinsic API Key which is recieved from the dashboard settings (ref - https://app.aptrinsic.com/settings/api-keys)
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceGainsightPx withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGainsightPxGainsightPx sourceType;

    public SourceGainsightPx withSourceType(SourceGainsightPxGainsightPx sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceGainsightPx(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceGainsightPxGainsightPx sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}