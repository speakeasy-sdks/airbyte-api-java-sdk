/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON - Input data format
 */
public class SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON {
    @JsonProperty("format_type")
    public SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType;
    public SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON withFormatType(SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON(@JsonProperty("format_type") SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
  }
}
