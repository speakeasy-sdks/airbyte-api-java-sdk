/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON - Output data format
 */
public class DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON {
    @JsonProperty("format_type")
    public DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType;
    public DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON withFormatType(DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
    public DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSON(@JsonProperty("format_type") DestinationAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
  }
}
