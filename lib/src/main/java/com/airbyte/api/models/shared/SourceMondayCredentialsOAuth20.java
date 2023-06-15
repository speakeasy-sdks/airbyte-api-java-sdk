/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceMondayCredentialsOAuth20 {
    /**
     * Access Token for making authenticated requests.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceMondayCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceMondayCredentialsOAuth20AuthType authType;

    public SourceMondayCredentialsOAuth20 withAuthType(SourceMondayCredentialsOAuth20AuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Client ID of your OAuth application.
     */
    @JsonProperty("client_id")
    public String clientId;

    public SourceMondayCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * The Client Secret of your OAuth application.
     */
    @JsonProperty("client_secret")
    public String clientSecret;

    public SourceMondayCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Slug/subdomain of the account, or the first part of the URL that comes before .monday.com
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdomain")
    public String subdomain;

    public SourceMondayCredentialsOAuth20 withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
    public SourceMondayCredentialsOAuth20(@JsonProperty("access_token") String accessToken, @JsonProperty("auth_type") SourceMondayCredentialsOAuth20AuthType authType, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret) {
        this.accessToken = accessToken;
        this.authType = authType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
  }
}
