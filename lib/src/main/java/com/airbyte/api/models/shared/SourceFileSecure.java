/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFileSecure - The values required to configure the source.
 */
public class SourceFileSecure {
    /**
     * The Name of the final table to replicate this file into (should include letters, numbers dash and underscores only).
     */
    @JsonProperty("dataset_name")
    public String datasetName;

    public SourceFileSecure withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    
    /**
     * The Format of the file which should be replicated (Warning: some formats may be experimental, please refer to the docs).
     */
    @JsonProperty("format")
    public SourceFileSecureFileFormat format;

    public SourceFileSecure withFormat(SourceFileSecureFileFormat format) {
        this.format = format;
        return this;
    }
    
    /**
     * The storage Provider or Location of the file(s) which should be replicated.
     */
    @JsonProperty("provider")
    public Object provider;

    public SourceFileSecure withProvider(Object provider) {
        this.provider = provider;
        return this;
    }
    
    /**
     * This should be a string in JSON format. It depends on the chosen file format to provide additional options and tune its behavior.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reader_options")
    public String readerOptions;

    public SourceFileSecure withReaderOptions(String readerOptions) {
        this.readerOptions = readerOptions;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceFileSecureFileSecure sourceType;

    public SourceFileSecure withSourceType(SourceFileSecureFileSecure sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The URL path to access the file which should be replicated.
     */
    @JsonProperty("url")
    public String url;

    public SourceFileSecure withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public SourceFileSecure(@JsonProperty("dataset_name") String datasetName, @JsonProperty("format") SourceFileSecureFileFormat format, @JsonProperty("provider") Object provider, @JsonProperty("sourceType") SourceFileSecureFileSecure sourceType, @JsonProperty("url") String url) {
        this.datasetName = datasetName;
        this.format = format;
        this.provider = provider;
        this.sourceType = sourceType;
        this.url = url;
  }
}
