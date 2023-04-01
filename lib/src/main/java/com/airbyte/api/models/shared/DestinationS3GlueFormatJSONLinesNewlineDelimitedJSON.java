/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON - Format of the data output. See &lt;a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema"&gt;here&lt;/a&gt; for more details
 */
public class DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON {
    /**
     * Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression")
    public Object compression;
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON withCompression(Object compression) {
        this.compression = compression;
        return this;
    }
    
    /**
     * If true data will be flattened and won't be nested in the _airbyte_data field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flatten_data")
    public Boolean flattenData;
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON withFlattenData(Boolean flattenData) {
        this.flattenData = flattenData;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType;
    public DestinationS3GlueFormatJSONLinesNewlineDelimitedJSON withFormatType(DestinationS3GlueFormatJSONLinesNewlineDelimitedJSONFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
}
