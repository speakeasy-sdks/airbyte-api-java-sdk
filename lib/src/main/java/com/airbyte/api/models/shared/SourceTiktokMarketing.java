/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceTiktokMarketing - The values required to configure the source.
 */
public class SourceTiktokMarketing {
    @JsonProperty("airbyte-source-name")
    public SourceTiktokMarketingTiktokMarketingEnum airbyteSourceName;
    public SourceTiktokMarketing withAirbyteSourceName(SourceTiktokMarketingTiktokMarketingEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Authentication method
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceTiktokMarketing withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DD. All data generated between start_date and this date will be replicated. Not setting this option will result in always syncing the data till the current date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceTiktokMarketing withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * The granularity used for aggregating performance data in reports. See &lt;a href="https://docs.airbyte.com/integrations/sources/tiktok-marketing/#report-aggregation"&gt;the docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_granularity")
    public SourceTiktokMarketingReportAggregationGranularityEnum reportGranularity;
    public SourceTiktokMarketing withReportGranularity(SourceTiktokMarketingReportAggregationGranularityEnum reportGranularity) {
        this.reportGranularity = reportGranularity;
        return this;
    }
    
    /**
     * The Start Date in format: YYYY-MM-DD. Any data before this date will not be replicated. If this parameter is not set, all data will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    public String startDate;
    public SourceTiktokMarketing withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
