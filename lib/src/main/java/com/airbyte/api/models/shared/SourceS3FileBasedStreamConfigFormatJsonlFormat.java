/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3FileBasedStreamConfigFormatJsonlFormat - The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
 */

public class SourceS3FileBasedStreamConfigFormatJsonlFormat {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    public SourceS3FileBasedStreamConfigFormatJsonlFormatFiletype filetype;

    public SourceS3FileBasedStreamConfigFormatJsonlFormat withFiletype(SourceS3FileBasedStreamConfigFormatJsonlFormatFiletype filetype) {
        this.filetype = filetype;
        return this;
    }
    
    public SourceS3FileBasedStreamConfigFormatJsonlFormat(){}
}