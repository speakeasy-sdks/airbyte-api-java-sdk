/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceEmailoctopus - The values required to configure the source.
 */
public class SourceEmailoctopus {
    /**
     * EmailOctopus API Key. See the &lt;a href="https://help.emailoctopus.com/article/165-how-to-create-and-delete-api-keys"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceEmailoctopus withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceEmailoctopusEmailoctopusEnum sourceType;
    public SourceEmailoctopus withSourceType(SourceEmailoctopusEmailoctopusEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceEmailoctopus(@JsonProperty("api_key") String apiKey, @JsonProperty("sourceType") SourceEmailoctopusEmailoctopusEnum sourceType) {
        this.apiKey = apiKey;
        this.sourceType = sourceType;
  }
}
