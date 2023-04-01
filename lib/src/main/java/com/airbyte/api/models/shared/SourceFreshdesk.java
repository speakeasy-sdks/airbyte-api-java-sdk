/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceFreshdesk - The values required to configure the source.
 */
public class SourceFreshdesk {
    @JsonProperty("airbyte-source-name")
    public SourceFreshdeskFreshdeskEnum airbyteSourceName;
    public SourceFreshdesk withAirbyteSourceName(SourceFreshdeskFreshdeskEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Freshdesk API Key. See the &lt;a href="https://docs.airbyte.com/integrations/sources/freshdesk"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceFreshdesk withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Freshdesk domain
     */
    @JsonProperty("domain")
    public String domain;
    public SourceFreshdesk withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    /**
     * The number of requests per minute that this source allowed to use. There is a rate limit of 50 requests per minute per app per account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requests_per_minute")
    public Long requestsPerMinute;
    public SourceFreshdesk withRequestsPerMinute(Long requestsPerMinute) {
        this.requestsPerMinute = requestsPerMinute;
        return this;
    }
    
    /**
     * UTC date and time. Any data created after this date will be replicated. If this parameter is not set, all data will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceFreshdesk withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
}