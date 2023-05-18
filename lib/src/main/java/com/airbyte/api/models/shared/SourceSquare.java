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
 * SourceSquare - The values required to configure the source.
 */
public class SourceSquare {
    /**
     * Choose how to authenticate to Square.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public SourceSquare withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * In some streams there is an option to include deleted objects (Items, Categories, Discounts, Taxes)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_deleted_objects")
    public Boolean includeDeletedObjects;

    public SourceSquare withIncludeDeletedObjects(Boolean includeDeletedObjects) {
        this.includeDeletedObjects = includeDeletedObjects;
        return this;
    }
    
    /**
     * Determines whether to use the sandbox or production environment.
     */
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;

    public SourceSquare withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSquareSquare sourceType;

    public SourceSquare withSourceType(SourceSquareSquare sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. If not set, all data will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;

    public SourceSquare withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceSquare(@JsonProperty("is_sandbox") Boolean isSandbox, @JsonProperty("sourceType") SourceSquareSquare sourceType) {
        this.isSandbox = isSandbox;
        this.sourceType = sourceType;
  }
}
