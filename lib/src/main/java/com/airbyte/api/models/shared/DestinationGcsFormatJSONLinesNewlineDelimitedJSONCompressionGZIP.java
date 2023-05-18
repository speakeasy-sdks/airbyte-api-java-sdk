/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP - Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
 */
public class DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType compressionType;

    public DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP withCompressionType(DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIPCompressionType compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
    public DestinationGcsFormatJSONLinesNewlineDelimitedJSONCompressionGZIP(){}
}
