/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceLinkedinPagesCredentialsAccessToken {
    /**
     * The token value generated using the LinkedIn Developers OAuth Token Tools. See the &lt;a href="https://docs.airbyte.com/integrations/sources/linkedin-pages/"&gt;docs&lt;/a&gt; to obtain yours.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceLinkedinPagesCredentialsAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceLinkedinPagesCredentialsAccessTokenAuthMethod authMethod;

    public SourceLinkedinPagesCredentialsAccessToken withAuthMethod(SourceLinkedinPagesCredentialsAccessTokenAuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    public SourceLinkedinPagesCredentialsAccessToken(@JsonProperty("access_token") String accessToken) {
        this.accessToken = accessToken;
  }
}
