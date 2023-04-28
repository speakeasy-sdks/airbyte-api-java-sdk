/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationElasticsearchAuthenticationMethodApiKeySecret - Use a api key and secret combination to authenticate
 */
public class DestinationElasticsearchAuthenticationMethodApiKeySecret {
    /**
     * The Key ID to used when accessing an enterprise Elasticsearch instance.
     */
    @JsonProperty("apiKeyId")
    public String apiKeyId;
    public DestinationElasticsearchAuthenticationMethodApiKeySecret withApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    
    /**
     * The secret associated with the API Key ID.
     */
    @JsonProperty("apiKeySecret")
    public String apiKeySecret;
    public DestinationElasticsearchAuthenticationMethodApiKeySecret withApiKeySecret(String apiKeySecret) {
        this.apiKeySecret = apiKeySecret;
        return this;
    }
    
    @JsonProperty("method")
    public DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum method;
    public DestinationElasticsearchAuthenticationMethodApiKeySecret withMethod(DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum method) {
        this.method = method;
        return this;
    }
    
    public DestinationElasticsearchAuthenticationMethodApiKeySecret(@JsonProperty("apiKeyId") String apiKeyId, @JsonProperty("apiKeySecret") String apiKeySecret, @JsonProperty("method") DestinationElasticsearchAuthenticationMethodApiKeySecretMethodEnum method) {
        this.apiKeyId = apiKeyId;
        this.apiKeySecret = apiKeySecret;
        this.method = method;
  }
}
