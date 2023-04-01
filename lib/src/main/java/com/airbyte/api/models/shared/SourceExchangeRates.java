/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceExchangeRates - The values required to configure the source.
 */
public class SourceExchangeRates {
    /**
     * Your API Key. See &lt;a href="https://apilayer.com/marketplace/exchangerates_data-api"&gt;here&lt;/a&gt;. The key is case sensitive.
     */
    @JsonProperty("access_key")
    public String accessKey;
    public SourceExchangeRates withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceExchangeRatesExchangeRatesEnum airbyteSourceName;
    public SourceExchangeRates withAirbyteSourceName(SourceExchangeRatesExchangeRatesEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * ISO reference currency. See &lt;a href="https://www.ecb.europa.eu/stats/policy_and_exchange_rates/euro_reference_exchange_rates/html/index.en.html"&gt;here&lt;/a&gt;. Free plan doesn't support Source Currency Switching, default base currency is EUR
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base")
    public String base;
    public SourceExchangeRates withBase(String base) {
        this.base = base;
        return this;
    }
    
    /**
     * Ignore weekends? (Exchanges don't run on weekends)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ignore_weekends")
    public Boolean ignoreWeekends;
    public SourceExchangeRates withIgnoreWeekends(Boolean ignoreWeekends) {
        this.ignoreWeekends = ignoreWeekends;
        return this;
    }
    
    /**
     * Start getting data from that date.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceExchangeRates withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
