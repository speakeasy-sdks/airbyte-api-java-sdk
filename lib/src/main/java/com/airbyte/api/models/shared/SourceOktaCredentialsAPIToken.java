/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceOktaCredentialsAPIToken {
    /**
     * An Okta token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/okta"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("api_token")
    public String apiToken;
    public SourceOktaCredentialsAPIToken withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceOktaCredentialsAPITokenAuthTypeEnum authType;
    public SourceOktaCredentialsAPIToken withAuthType(SourceOktaCredentialsAPITokenAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}
