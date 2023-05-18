/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAuth0 - The values required to configure the source.
 */
public class SourceAuth0 {
    /**
     * The Authentication API is served over HTTPS. All URLs referenced in the documentation have the following base `https://YOUR_DOMAIN`
     */
    @JsonProperty("base_url")
    public String baseUrl;

    public SourceAuth0 withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    
    @JsonProperty("credentials")
    public Object credentials;

    public SourceAuth0 withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceAuth0Auth0 sourceType;

    public SourceAuth0 withSourceType(SourceAuth0Auth0 sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceAuth0(@JsonProperty("base_url") String baseUrl, @JsonProperty("credentials") Object credentials, @JsonProperty("sourceType") SourceAuth0Auth0 sourceType) {
        this.baseUrl = baseUrl;
        this.credentials = credentials;
        this.sourceType = sourceType;
  }
}
