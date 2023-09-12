/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SourceS3FileBasedStreamConfig {
    /**
     * When the state history of the file store is full, syncs will only read files that were last modified in the provided day range.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days_to_sync_if_history_is_full")
    public Long daysToSyncIfHistoryIsFull;

    public SourceS3FileBasedStreamConfig withDaysToSyncIfHistoryIsFull(Long daysToSyncIfHistoryIsFull) {
        this.daysToSyncIfHistoryIsFull = daysToSyncIfHistoryIsFull;
        return this;
    }
    
    /**
     * The data file type that is being extracted for a stream.
     */
    @JsonProperty("file_type")
    public String fileType;

    public SourceS3FileBasedStreamConfig withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    
    /**
     * The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("format")
    public Object format;

    public SourceS3FileBasedStreamConfig withFormat(Object format) {
        this.format = format;
        return this;
    }
    
    /**
     * The pattern used to specify which files should be selected from the file system. For more information on glob pattern matching look &lt;a href="https://en.wikipedia.org/wiki/Glob_(programming)"&gt;here&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("globs")
    public String[] globs;

    public SourceS3FileBasedStreamConfig withGlobs(String[] globs) {
        this.globs = globs;
        return this;
    }
    
    /**
     * The schema that will be used to validate records extracted from the file. This will override the stream schema that is auto-detected from incoming files.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("input_schema")
    public String inputSchema;

    public SourceS3FileBasedStreamConfig withInputSchema(String inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }
    
    /**
     * The path prefix configured in v3 versions of the S3 connector. This option is deprecated in favor of a single glob.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legacy_prefix")
    public String legacyPrefix;

    public SourceS3FileBasedStreamConfig withLegacyPrefix(String legacyPrefix) {
        this.legacyPrefix = legacyPrefix;
        return this;
    }
    
    /**
     * The name of the stream.
     */
    @JsonProperty("name")
    public String name;

    public SourceS3FileBasedStreamConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The column or columns (for a composite key) that serves as the unique identifier of a record.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary_key")
    public String primaryKey;

    public SourceS3FileBasedStreamConfig withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    
    /**
     * When enabled, syncs will not validate or structure records against the stream's schema.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemaless")
    public Boolean schemaless;

    public SourceS3FileBasedStreamConfig withSchemaless(Boolean schemaless) {
        this.schemaless = schemaless;
        return this;
    }
    
    /**
     * The name of the validation policy that dictates sync behavior when a record does not adhere to the stream schema.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validation_policy")
    public SourceS3FileBasedStreamConfigValidationPolicy validationPolicy;

    public SourceS3FileBasedStreamConfig withValidationPolicy(SourceS3FileBasedStreamConfigValidationPolicy validationPolicy) {
        this.validationPolicy = validationPolicy;
        return this;
    }
    
    public SourceS3FileBasedStreamConfig(@JsonProperty("file_type") String fileType, @JsonProperty("name") String name) {
        this.fileType = fileType;
        this.name = name;
  }
}