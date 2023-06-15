/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JobResponse - Provides details of a single job.
 */

public class JobResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bytesSynced")
    public Long bytesSynced;

    public JobResponse withBytesSynced(Long bytesSynced) {
        this.bytesSynced = bytesSynced;
        return this;
    }
    
    /**
     * Duration of a sync in ISO_8601 format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public String duration;

    public JobResponse withDuration(String duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonProperty("jobId")
    public Long jobId;

    public JobResponse withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    
    /**
     * Enum that describes the different types of jobs that the platform runs.
     */
    @JsonProperty("jobType")
    public JobTypeEnum jobType;

    public JobResponse withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastUpdatedAt")
    public String lastUpdatedAt;

    public JobResponse withLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rowsSynced")
    public Long rowsSynced;

    public JobResponse withRowsSynced(Long rowsSynced) {
        this.rowsSynced = rowsSynced;
        return this;
    }
    
    @JsonProperty("startTime")
    public String startTime;

    public JobResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    
    @JsonProperty("status")
    public JobStatusEnum status;

    public JobResponse withStatus(JobStatusEnum status) {
        this.status = status;
        return this;
    }
    
    public JobResponse(@JsonProperty("jobId") Long jobId, @JsonProperty("jobType") JobTypeEnum jobType, @JsonProperty("startTime") String startTime, @JsonProperty("status") JobStatusEnum status) {
        this.jobId = jobId;
        this.jobType = jobType;
        this.startTime = startTime;
        this.status = status;
  }
}
