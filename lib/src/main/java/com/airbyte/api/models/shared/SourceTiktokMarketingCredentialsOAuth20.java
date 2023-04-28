/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTiktokMarketingCredentialsOAuth20 - Authentication method
 */
public class SourceTiktokMarketingCredentialsOAuth20 {
    /**
     * Long-term Authorized Access Token.
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceTiktokMarketingCredentialsOAuth20 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * The Advertiser ID to filter reports and streams. Let this empty to retrieve all.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("advertiser_id")
    public String advertiserId;
    public SourceTiktokMarketingCredentialsOAuth20 withAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
        return this;
    }
    
    /**
     * The Developer Application App ID.
     */
    @JsonProperty("app_id")
    public String appId;
    public SourceTiktokMarketingCredentialsOAuth20 withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceTiktokMarketingCredentialsOAuth20AuthTypeEnum authType;
    public SourceTiktokMarketingCredentialsOAuth20 withAuthType(SourceTiktokMarketingCredentialsOAuth20AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The Developer Application Secret.
     */
    @JsonProperty("secret")
    public String secret;
    public SourceTiktokMarketingCredentialsOAuth20 withSecret(String secret) {
        this.secret = secret;
        return this;
    }
    
    public SourceTiktokMarketingCredentialsOAuth20(@JsonProperty("access_token") String accessToken, @JsonProperty("app_id") String appId, @JsonProperty("secret") String secret) {
        this.accessToken = accessToken;
        this.appId = appId;
        this.secret = secret;
  }
}
