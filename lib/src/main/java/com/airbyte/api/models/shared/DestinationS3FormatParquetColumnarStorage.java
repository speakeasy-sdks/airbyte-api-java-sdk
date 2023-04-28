/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationS3FormatParquetColumnarStorage - Format of the data output. See &lt;a href="https://docs.airbyte.com/integrations/destinations/s3/#supported-output-schema"&gt;here&lt;/a&gt; for more details
 */
public class DestinationS3FormatParquetColumnarStorage {
    /**
     * This is the size of a row group being buffered in memory. It limits the memory usage when writing. Larger values will improve the IO when reading, but consume more memory when writing. Default: 128 MB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("block_size_mb")
    public Long blockSizeMb;
    public DestinationS3FormatParquetColumnarStorage withBlockSizeMb(Long blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
        return this;
    }
    
    /**
     * The compression algorithm used to compress data pages.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compression_codec")
    public DestinationS3FormatParquetColumnarStorageCompressionCodecEnum compressionCodec;
    public DestinationS3FormatParquetColumnarStorage withCompressionCodec(DestinationS3FormatParquetColumnarStorageCompressionCodecEnum compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }
    
    /**
     * Default: true.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_encoding")
    public Boolean dictionaryEncoding;
    public DestinationS3FormatParquetColumnarStorage withDictionaryEncoding(Boolean dictionaryEncoding) {
        this.dictionaryEncoding = dictionaryEncoding;
        return this;
    }
    
    /**
     * There is one dictionary page per column per row group when dictionary encoding is used. The dictionary page size works like the page size but for dictionary. Default: 1024 KB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dictionary_page_size_kb")
    public Long dictionaryPageSizeKb;
    public DestinationS3FormatParquetColumnarStorage withDictionaryPageSizeKb(Long dictionaryPageSizeKb) {
        this.dictionaryPageSizeKb = dictionaryPageSizeKb;
        return this;
    }
    
    @JsonProperty("format_type")
    public DestinationS3FormatParquetColumnarStorageFormatTypeEnum formatType;
    public DestinationS3FormatParquetColumnarStorage withFormatType(DestinationS3FormatParquetColumnarStorageFormatTypeEnum formatType) {
        this.formatType = formatType;
        return this;
    }
    
    /**
     * Maximum size allowed as padding to align row groups. This is also the minimum size of a row group. Default: 8 MB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_padding_size_mb")
    public Long maxPaddingSizeMb;
    public DestinationS3FormatParquetColumnarStorage withMaxPaddingSizeMb(Long maxPaddingSizeMb) {
        this.maxPaddingSizeMb = maxPaddingSizeMb;
        return this;
    }
    
    /**
     * The page size is for compression. A block is composed of pages. A page is the smallest unit that must be read fully to access a single record. If this value is too small, the compression will deteriorate. Default: 1024 KB.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size_kb")
    public Long pageSizeKb;
    public DestinationS3FormatParquetColumnarStorage withPageSizeKb(Long pageSizeKb) {
        this.pageSizeKb = pageSizeKb;
        return this;
    }
    
    public DestinationS3FormatParquetColumnarStorage(@JsonProperty("format_type") DestinationS3FormatParquetColumnarStorageFormatTypeEnum formatType) {
        this.formatType = formatType;
  }
}
