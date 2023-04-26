/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMailchimpCredentialsAPIKey {
    /**
     * Mailchimp API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/mailchimp"&gt;docs&lt;/a&gt; for information on how to generate this key.
     */
    @JsonProperty("apikey")
    public String apikey;
    public SourceMailchimpCredentialsAPIKey withApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }
    
    @JsonProperty("auth_type")
    public SourceMailchimpCredentialsAPIKeyAuthTypeEnum authType;
    public SourceMailchimpCredentialsAPIKey withAuthType(SourceMailchimpCredentialsAPIKeyAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    public SourceMailchimpCredentialsAPIKey(@JsonProperty("apikey") String apikey, @JsonProperty("auth_type") SourceMailchimpCredentialsAPIKeyAuthTypeEnum authType) {
        this.apikey = apikey;
        this.authType = authType;
  }
}
