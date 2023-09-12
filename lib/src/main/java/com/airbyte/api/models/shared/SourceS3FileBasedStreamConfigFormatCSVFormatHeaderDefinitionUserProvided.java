/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceS3FileBasedStreamConfigFormatCSVFormatHeaderDefinitionUserProvided - How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
 */

public class SourceS3FileBasedStreamConfigFormatCSVFormatHeaderDefinitionUserProvided {
    /**
     * The column names that will be used while emitting the CSV records
     */
    @JsonProperty("column_names")
    public String[] columnNames;

    public SourceS3FileBasedStreamConfigFormatCSVFormatHeaderDefinitionUserProvided withColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("header_definition_type")
    public SourceS3FileBasedStreamConfigFormatCSVFormatHeaderDefinitionUserProvidedHeaderDefinitionType headerDefinitionType;

    public SourceS3FileBasedStreamConfigFormatCSVFormatHeaderDefinitionUserProvided withHeaderDefinitionType(SourceS3FileBasedStreamConfigFormatCSVFormatHeaderDefinitionUserProvidedHeaderDefinitionType headerDefinitionType) {
        this.headerDefinitionType = headerDefinitionType;
        return this;
    }
    
    public SourceS3FileBasedStreamConfigFormatCSVFormatHeaderDefinitionUserProvided(@JsonProperty("column_names") String[] columnNames) {
        this.columnNames = columnNames;
  }
}