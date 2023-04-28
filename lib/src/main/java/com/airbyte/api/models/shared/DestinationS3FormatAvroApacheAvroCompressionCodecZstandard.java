/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecZstandard - The compression algorithm used to compress data. Default to no compression.
 */
public class DestinationS3FormatAvroApacheAvroCompressionCodecZstandard {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodecEnum codec;
    public DestinationS3FormatAvroApacheAvroCompressionCodecZstandard withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodecEnum codec) {
        this.codec = codec;
        return this;
    }
    
    /**
     * Negative levels are 'fast' modes akin to lz4 or snappy, levels above 9 are generally for archival purposes, and levels above 18 use a lot of memory.
     */
    @JsonProperty("compression_level")
    public Long compressionLevel;
    public DestinationS3FormatAvroApacheAvroCompressionCodecZstandard withCompressionLevel(Long compressionLevel) {
        this.compressionLevel = compressionLevel;
        return this;
    }
    
    /**
     * If true, include a checksum with each data block.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_checksum")
    public Boolean includeChecksum;
    public DestinationS3FormatAvroApacheAvroCompressionCodecZstandard withIncludeChecksum(Boolean includeChecksum) {
        this.includeChecksum = includeChecksum;
        return this;
    }
    
    public DestinationS3FormatAvroApacheAvroCompressionCodecZstandard(@JsonProperty("codec") DestinationS3FormatAvroApacheAvroCompressionCodecZstandardCodecEnum codec, @JsonProperty("compression_level") Long compressionLevel) {
        this.codec = codec;
        this.compressionLevel = compressionLevel;
  }
}
