/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceKlaviyo - The values required to configure the source.
 */
public class SourceKlaviyo {
    @JsonProperty("airbyte-source-name")
    public SourceKlaviyoKlaviyoEnum airbyteSourceName;
    public SourceKlaviyo withAirbyteSourceName(SourceKlaviyoKlaviyoEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Klaviyo API Key. See our &lt;a href="https://docs.airbyte.com/integrations/sources/klaviyo"&gt;docs&lt;/a&gt; if you need help finding this key.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceKlaviyo withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceKlaviyo withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
