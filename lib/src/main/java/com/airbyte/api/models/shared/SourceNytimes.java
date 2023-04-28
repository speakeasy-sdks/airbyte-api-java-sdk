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
 * SourceNytimes - The values required to configure the source.
 */
public class SourceNytimes {
    /**
     * API Key
     */
    @JsonProperty("api_key")
    public String apiKey;
    public SourceNytimes withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * End date to stop the article retrieval (format YYYY-MM)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourceNytimes withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * Period of time (in days)
     */
    @JsonProperty("period")
    public SourceNytimesPeriodUsedForMostPopularStreamsEnum period;
    public SourceNytimes withPeriod(SourceNytimesPeriodUsedForMostPopularStreamsEnum period) {
        this.period = period;
        return this;
    }
    
    /**
     * Share Type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("share_type")
    public SourceNytimesShareTypeUsedForMostPopularSharedStreamEnum shareType;
    public SourceNytimes withShareType(SourceNytimesShareTypeUsedForMostPopularSharedStreamEnum shareType) {
        this.shareType = shareType;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceNytimesNytimesEnum sourceType;
    public SourceNytimes withSourceType(SourceNytimesNytimesEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Start date to begin the article retrieval (format YYYY-MM)
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceNytimes withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceNytimes(@JsonProperty("api_key") String apiKey, @JsonProperty("period") SourceNytimesPeriodUsedForMostPopularStreamsEnum period, @JsonProperty("sourceType") SourceNytimesNytimesEnum sourceType, @JsonProperty("start_date") LocalDate startDate) {
        this.apiKey = apiKey;
        this.period = period;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
