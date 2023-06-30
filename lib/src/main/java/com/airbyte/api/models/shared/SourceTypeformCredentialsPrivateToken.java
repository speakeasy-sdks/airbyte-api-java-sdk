/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceTypeformCredentialsPrivateToken {
    /**
     * Log into your Typeform account and then generate a personal Access Token.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceTypeformCredentialsPrivateToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceTypeformCredentialsPrivateTokenAuthType authType;

    public SourceTypeformCredentialsPrivateToken withAuthType(SourceTypeformCredentialsPrivateTokenAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    public SourceTypeformCredentialsPrivateToken(@JsonProperty("access_token") String accessToken) {
        this.accessToken = accessToken;
  }
}