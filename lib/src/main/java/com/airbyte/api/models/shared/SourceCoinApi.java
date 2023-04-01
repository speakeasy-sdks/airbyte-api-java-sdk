/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceCoinApi - The values required to configure the source.
 */
public class SourceCoinApi {
    @JsonProperty("airbyte-source-name")
    public SourceCoinApiCoinApiEnum airbyteSourceName;
    public SourceCoinApi withAirbyteSourceName(SourceCoinApiCoinApiEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * API Key
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceCoinApi withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * The end date in ISO 8601 format. If not supplied, data will be returned
     * from the start date to the current time, or when the count of result
     * elements reaches its limit.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceCoinApi withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * The environment to use. Either sandbox or production.
     * 
     */
    @JsonProperty("environment")
    public SourceCoinApiEnvironmentEnum environment;
    public SourceCoinApi withEnvironment(SourceCoinApiEnvironmentEnum environment) {
        this.environment = environment;
        return this;
    }
    
    /**
     * The maximum number of elements to return. If not supplied, the default
     * is 100. For numbers larger than 100, each 100 items is counted as one
     * request for pricing purposes. Maximum value is 100000.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public SourceCoinApi withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * The period to use. See the documentation for a list. https://docs.coinapi.io/#list-all-periods-get
     */
    @JsonProperty("period")
    public String period;
    public SourceCoinApi withPeriod(String period) {
        this.period = period;
        return this;
    }
    
    /**
     * The start date in ISO 8601 format.
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourceCoinApi withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * The symbol ID to use. See the documentation for a list.
     * https://docs.coinapi.io/#list-all-symbols-get
     * 
     */
    @JsonProperty("symbol_id")
    public String symbolId;
    public SourceCoinApi withSymbolId(String symbolId) {
        this.symbolId = symbolId;
        return this;
    }
    
}
