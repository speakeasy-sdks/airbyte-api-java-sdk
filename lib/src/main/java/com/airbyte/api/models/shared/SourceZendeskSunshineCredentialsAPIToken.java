/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceZendeskSunshineCredentialsAPIToken {
    /**
     * API Token. See the &lt;a href="https://docs.airbyte.io/integrations/sources/zendesk_sunshine"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonProperty("api_token")
    public String apiToken;
    public SourceZendeskSunshineCredentialsAPIToken withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("auth_method")
    public SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum authMethod;
    public SourceZendeskSunshineCredentialsAPIToken withAuthMethod(SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    /**
     * The user email for your Zendesk account
     */
    @JsonProperty("email")
    public String email;
    public SourceZendeskSunshineCredentialsAPIToken withEmail(String email) {
        this.email = email;
        return this;
    }
    
    public SourceZendeskSunshineCredentialsAPIToken(@JsonProperty("api_token") String apiToken, @JsonProperty("auth_method") SourceZendeskSunshineCredentialsAPITokenAuthMethodEnum authMethod, @JsonProperty("email") String email) {
        this.apiToken = apiToken;
        this.authMethod = authMethod;
        this.email = email;
  }
}
