/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatAvroApacheAvroCompressionCodecBzip2 - The compression algorithm used to compress data. Default to no compression.
 */
public class DestinationS3FormatAvroApacheAvroCompressionCodecBzip2 {
    @JsonProperty("codec")
    public DestinationS3FormatAvroApacheAvroCompressionCodecBzip2Codec codec;

    public DestinationS3FormatAvroApacheAvroCompressionCodecBzip2 withCodec(DestinationS3FormatAvroApacheAvroCompressionCodecBzip2Codec codec) {
        this.codec = codec;
        return this;
    }
    
    public DestinationS3FormatAvroApacheAvroCompressionCodecBzip2(@JsonProperty("codec") DestinationS3FormatAvroApacheAvroCompressionCodecBzip2Codec codec) {
        this.codec = codec;
  }
}
