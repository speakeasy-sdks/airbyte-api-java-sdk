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
 * SourceFacebookMarketingInsightConfig - Config for custom insights
 */
public class SourceFacebookMarketingInsightConfig {
    /**
     * A list of chosen action_breakdowns for action_breakdowns
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_breakdowns")
    public SourceFacebookMarketingInsightConfigValidActionBreakdownsEnum[] actionBreakdowns;
    public SourceFacebookMarketingInsightConfig withActionBreakdowns(SourceFacebookMarketingInsightConfigValidActionBreakdownsEnum[] actionBreakdowns) {
        this.actionBreakdowns = actionBreakdowns;
        return this;
    }
    
    /**
     * A list of chosen breakdowns for breakdowns
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("breakdowns")
    public SourceFacebookMarketingInsightConfigValidBreakdownsEnum[] breakdowns;
    public SourceFacebookMarketingInsightConfig withBreakdowns(SourceFacebookMarketingInsightConfigValidBreakdownsEnum[] breakdowns) {
        this.breakdowns = breakdowns;
        return this;
    }
    
    /**
     * The date until which you'd like to replicate data for this stream, in the format YYYY-MM-DDT00:00:00Z. All data generated between the start date and this date will be replicated. Not setting this option will result in always syncing the latest data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_date")
    public OffsetDateTime endDate;
    public SourceFacebookMarketingInsightConfig withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * A list of chosen fields for fields parameter
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public SourceFacebookMarketingInsightConfigValidEnumsEnum[] fields;
    public SourceFacebookMarketingInsightConfig withFields(SourceFacebookMarketingInsightConfigValidEnumsEnum[] fields) {
        this.fields = fields;
        return this;
    }
    
    /**
     * The attribution window
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("insights_lookback_window")
    public Long insightsLookbackWindow;
    public SourceFacebookMarketingInsightConfig withInsightsLookbackWindow(Long insightsLookbackWindow) {
        this.insightsLookbackWindow = insightsLookbackWindow;
        return this;
    }
    
    /**
     * The name value of insight
     */
    @JsonProperty("name")
    public String name;
    public SourceFacebookMarketingInsightConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for this stream, in the format YYYY-MM-DDT00:00:00Z.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceFacebookMarketingInsightConfig withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Time window in days by which to aggregate statistics. The sync will be chunked into N day intervals, where N is the number of days you specified. For example, if you set this value to 7, then all statistics will be reported as 7-day aggregates by starting from the start_date. If the start and end dates are October 1st and October 30th, then the connector will output 5 records: 01 - 06, 07 - 13, 14 - 20, 21 - 27, and 28 - 30 (3 days only).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_increment")
    public Long timeIncrement;
    public SourceFacebookMarketingInsightConfig withTimeIncrement(Long timeIncrement) {
        this.timeIncrement = timeIncrement;
        return this;
    }
    
}
