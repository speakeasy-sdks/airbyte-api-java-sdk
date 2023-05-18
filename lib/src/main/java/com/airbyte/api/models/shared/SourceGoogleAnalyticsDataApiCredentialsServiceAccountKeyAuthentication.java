/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication - Credentials for the service
 */
public class SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthType authType;

    public SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication withAuthType(SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthenticationAuthType authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The JSON key of the service account to use for authorization
     */
    @JsonProperty("credentials_json")
    public String credentialsJson;

    public SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication withCredentialsJson(String credentialsJson) {
        this.credentialsJson = credentialsJson;
        return this;
    }
    
    public SourceGoogleAnalyticsDataApiCredentialsServiceAccountKeyAuthentication(@JsonProperty("credentials_json") String credentialsJson) {
        this.credentialsJson = credentialsJson;
  }
}
