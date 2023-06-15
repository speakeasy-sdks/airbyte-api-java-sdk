/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListJobsRequest {
    /**
     * Filter the Jobs by connectionId.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=connectionId")
    public String connectionId;

    public ListJobsRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * Filter the Jobs by jobType.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=jobType")
    public com.airbyte.api.models.shared.JobTypeEnum jobType;

    public ListJobsRequest withJobType(com.airbyte.api.models.shared.JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }
    
    /**
     * Set the limit on the number of Jobs returned. The default is 20 Jobs.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;

    public ListJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Set the offset to start at when returning Jobs. The default is 0.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Integer offset;

    public ListJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    
    public ListJobsRequest(@JsonProperty("connectionId") String connectionId) {
        this.connectionId = connectionId;
  }
}
