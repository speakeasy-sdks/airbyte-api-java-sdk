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
 * SourceLinnworks - The values required to configure the source.
 */
public class SourceLinnworks {
    /**
     * Linnworks Application ID
     */
    @JsonProperty("application_id")
    public String applicationId;
    public SourceLinnworks withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    
    /**
     * Linnworks Application Secret
     */
    @JsonProperty("application_secret")
    public String applicationSecret;
    public SourceLinnworks withApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceLinnworksLinnworksEnum sourceType;
    public SourceLinnworks withSourceType(SourceLinnworksLinnworksEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceLinnworks withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonProperty("token")
    public String token;
    public SourceLinnworks withToken(String token) {
        this.token = token;
        return this;
    }
    
    public SourceLinnworks(@JsonProperty("application_id") String applicationId, @JsonProperty("application_secret") String applicationSecret, @JsonProperty("sourceType") SourceLinnworksLinnworksEnum sourceType, @JsonProperty("start_date") OffsetDateTime startDate, @JsonProperty("token") String token) {
        this.applicationId = applicationId;
        this.applicationSecret = applicationSecret;
        this.sourceType = sourceType;
        this.startDate = startDate;
        this.token = token;
  }
}
