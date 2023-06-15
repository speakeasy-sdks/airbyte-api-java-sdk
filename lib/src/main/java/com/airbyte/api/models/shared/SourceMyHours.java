/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMyHours - The values required to configure the source.
 */

public class SourceMyHours {
    /**
     * Your My Hours username
     */
    @JsonProperty("email")
    public String email;

    public SourceMyHours withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * Pagination size used for retrieving logs in days
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logs_batch_size")
    public Long logsBatchSize;

    public SourceMyHours withLogsBatchSize(Long logsBatchSize) {
        this.logsBatchSize = logsBatchSize;
        return this;
    }
    
    /**
     * The password associated to the username
     */
    @JsonProperty("password")
    public String password;

    public SourceMyHours withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceMyHoursMyHours sourceType;

    public SourceMyHours withSourceType(SourceMyHoursMyHours sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Start date for collecting time logs
     */
    @JsonProperty("start_date")
    public String startDate;

    public SourceMyHours withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceMyHours(@JsonProperty("email") String email, @JsonProperty("password") String password, @JsonProperty("sourceType") SourceMyHoursMyHours sourceType, @JsonProperty("start_date") String startDate) {
        this.email = email;
        this.password = password;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
