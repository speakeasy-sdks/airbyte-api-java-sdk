/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication {
    @JsonProperty("auth_type")
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthTypeEnum authType;
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication withAuthType(SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * The email of the user which has permissions to access the Google Workspace Admin APIs.
     */
    @JsonProperty("email")
    public String email;
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The JSON key of the service account to use for authorization. Read more &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("service_account_info")
    public String serviceAccountInfo;
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication withServiceAccountInfo(String serviceAccountInfo) {
        this.serviceAccountInfo = serviceAccountInfo;
        return this;
    }
    
    public SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthentication(@JsonProperty("auth_type") SourceGoogleSearchConsoleAuthorizationServiceAccountKeyAuthenticationAuthTypeEnum authType, @JsonProperty("email") String email, @JsonProperty("service_account_info") String serviceAccountInfo) {
        this.authType = authType;
        this.email = email;
        this.serviceAccountInfo = serviceAccountInfo;
  }
}
