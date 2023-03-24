/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceMailchimpCredentialsAPIKey {
    /**
     * Mailchimp API Key. See the <a href="https://docs.airbyte.com/integrations/sources/mailchimp">docs</a> for information on how to generate this key.
     */
    @JsonProperty("apikey")public String apikey;
    public SourceMailchimpCredentialsAPIKey withApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }
    
    @JsonProperty("auth_type")public SourceMailchimpCredentialsAPIKeyAuthTypeEnum authType;
    public SourceMailchimpCredentialsAPIKey withAuthType(SourceMailchimpCredentialsAPIKeyAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
}