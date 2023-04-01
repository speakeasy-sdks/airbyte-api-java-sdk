/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLemlist - The values required to configure the source.
 */
public class SourceLemlist {
    @JsonProperty("airbyte-source-name")
    public SourceLemlistLemlistEnum airbyteSourceName;
    public SourceLemlist withAirbyteSourceName(SourceLemlistLemlistEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Lemlist API key.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceLemlist withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
}
