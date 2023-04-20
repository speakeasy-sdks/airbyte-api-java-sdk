/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompression - Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".csv.gz").
 */
public class DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompression {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_type")
    public DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum compressionType;
    public DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompression withCompressionType(DestinationS3FormatCSVCommaSeparatedValuesCompressionNoCompressionCompressionTypeEnum compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    
}