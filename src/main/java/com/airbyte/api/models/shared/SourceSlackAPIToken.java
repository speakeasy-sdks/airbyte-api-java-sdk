/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceSlackAPIToken {

    /**
     * A Slack bot token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("api_token")
    private String apiToken;

    @JsonProperty("option_title")
    private SourceSlackSchemasOptionTitle optionTitle;

    public SourceSlackAPIToken(
            @JsonProperty("api_token") String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        this.optionTitle = Builder._SINGLETON_VALUE_OptionTitle.value();
    }

    /**
     * A Slack bot token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    public String apiToken() {
        return apiToken;
    }

    public SourceSlackSchemasOptionTitle optionTitle() {
        return optionTitle;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A Slack bot token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    public SourceSlackAPIToken withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceSlackAPIToken other = (SourceSlackAPIToken) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.optionTitle, other.optionTitle);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            optionTitle);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSlackAPIToken.class,
                "apiToken", apiToken,
                "optionTitle", optionTitle);
    }
    
    public final static class Builder {
 
        private String apiToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A Slack bot token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/slack"&gt;docs&lt;/a&gt; for instructions on how to generate it.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }
        
        public SourceSlackAPIToken build() {
            return new SourceSlackAPIToken(
                apiToken);
        }

        private static final LazySingletonValue<SourceSlackSchemasOptionTitle> _SINGLETON_VALUE_OptionTitle =
                new LazySingletonValue<>(
                        "option_title",
                        "\"API Token Credentials\"",
                        new TypeReference<SourceSlackSchemasOptionTitle>() {});
    }
}
