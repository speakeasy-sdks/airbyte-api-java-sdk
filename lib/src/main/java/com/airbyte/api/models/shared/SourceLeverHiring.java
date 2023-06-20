/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceLeverHiring - The values required to configure the source.
 */

public class SourceLeverHiring {
    /**
     * Choose how to authenticate to Lever Hiring.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public SourceLeverHiring withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("environment")
    public SourceLeverHiringEnvironment environment;

    public SourceLeverHiring withEnvironment(SourceLeverHiringEnvironment environment) {
        this.environment = environment;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceLeverHiringLeverHiring sourceType;

    public SourceLeverHiring withSourceType(SourceLeverHiringLeverHiring sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. Note that it will be used only in the following incremental streams: comments, commits, and issues.
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceLeverHiring withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceLeverHiring(@JsonProperty("sourceType") SourceLeverHiringLeverHiring sourceType, @JsonProperty("start_date") String startDate) {
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}