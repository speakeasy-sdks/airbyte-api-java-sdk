/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFreshsales - The values required to configure the source.
 */
public class SourceFreshsales {
    /**
     * Freshsales API Key. See &lt;a href="https://crmsupport.freshworks.com/support/solutions/articles/50000002503-how-to-find-my-api-key-"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceFreshsales withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The Name of your Freshsales domain
     */
    @JsonProperty("domain_name")
    public String domainName;

    public SourceFreshsales withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceFreshsalesFreshsales sourceType;

    public SourceFreshsales withSourceType(SourceFreshsalesFreshsales sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceFreshsales(@JsonProperty("api_key") String apiKey, @JsonProperty("domain_name") String domainName, @JsonProperty("sourceType") SourceFreshsalesFreshsales sourceType) {
        this.apiKey = apiKey;
        this.domainName = domainName;
        this.sourceType = sourceType;
  }
}
