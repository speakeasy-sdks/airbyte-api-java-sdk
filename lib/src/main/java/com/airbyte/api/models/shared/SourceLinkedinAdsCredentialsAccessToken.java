/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceLinkedinAdsCredentialsAccessToken {
    /**
     * The token value generated using the authentication code. See the &lt;a href="https://docs.airbyte.com/integrations/sources/linkedin-ads#authentication"&gt;docs&lt;/a&gt; to obtain yours.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceLinkedinAdsCredentialsAccessToken withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_method")
    public SourceLinkedinAdsCredentialsAccessTokenAuthMethod authMethod;

    public SourceLinkedinAdsCredentialsAccessToken withAuthMethod(SourceLinkedinAdsCredentialsAccessTokenAuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }
    
    public SourceLinkedinAdsCredentialsAccessToken(@JsonProperty("access_token") String accessToken) {
        this.accessToken = accessToken;
  }
}
