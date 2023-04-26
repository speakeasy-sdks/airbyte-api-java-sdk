/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceXeroAuthenticateViaXeroOAuth {
    /**
     * Enter your Xero application's access token
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceXeroAuthenticateViaXeroOAuth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * Enter your Xero application's Client ID
     */
    @JsonProperty("client_id")
    public String clientId;
    public SourceXeroAuthenticateViaXeroOAuth withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Enter your Xero application's Client Secret
     */
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceXeroAuthenticateViaXeroOAuth withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Enter your Xero application's refresh token
     */
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceXeroAuthenticateViaXeroOAuth withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    /**
     * The date-time when the access token should be refreshed
     */
    @JsonProperty("token_expiry_date")
    public String tokenExpiryDate;
    public SourceXeroAuthenticateViaXeroOAuth withTokenExpiryDate(String tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
        return this;
    }
    
    public SourceXeroAuthenticateViaXeroOAuth(@JsonProperty("access_token") String accessToken, @JsonProperty("client_id") String clientId, @JsonProperty("client_secret") String clientSecret, @JsonProperty("refresh_token") String refreshToken, @JsonProperty("token_expiry_date") String tokenExpiryDate) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.tokenExpiryDate = tokenExpiryDate;
  }
}
