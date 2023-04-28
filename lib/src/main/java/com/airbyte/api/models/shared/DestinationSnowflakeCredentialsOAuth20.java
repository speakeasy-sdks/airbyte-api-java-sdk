/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationSnowflakeCredentialsOAuth20 {
    /**
     * Enter you application's Access Token
     */
    @JsonProperty("access_token")
    public String accessToken;
    public DestinationSnowflakeCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public DestinationSnowflakeCredentialsOAuth20AuthTypeEnum authType;
    public DestinationSnowflakeCredentialsOAuth20 withAuthType(DestinationSnowflakeCredentialsOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Enter your application's Client ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    public String clientId;
    public DestinationSnowflakeCredentialsOAuth20 withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Enter your application's Client secret
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    public String clientSecret;
    public DestinationSnowflakeCredentialsOAuth20 withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Enter your application's Refresh Token
     */
    @JsonProperty("refresh_token")
    public String refreshToken;
    public DestinationSnowflakeCredentialsOAuth20 withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    public DestinationSnowflakeCredentialsOAuth20(@JsonProperty("access_token") String accessToken, @JsonProperty("refresh_token") String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
  }
}
