/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceSlackCredentialsAPIToken - Choose how to authenticate into Slack
 */
public class SourceSlackCredentialsAPIToken {
    /**
     * A Slack bot token. See the <a href="https://docs.airbyte.com/integrations/sources/slack">docs</a> for instructions on how to generate it.
     */
    @JsonProperty("api_token")public String apiToken;
    public SourceSlackCredentialsAPIToken withApiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }
    
    @JsonProperty("option_title")public SourceSlackCredentialsAPITokenOptionTitleEnum optionTitle;
    public SourceSlackCredentialsAPIToken withOptionTitle(SourceSlackCredentialsAPITokenOptionTitleEnum optionTitle) {
        this.optionTitle = optionTitle;
        return this;
    }
    
}