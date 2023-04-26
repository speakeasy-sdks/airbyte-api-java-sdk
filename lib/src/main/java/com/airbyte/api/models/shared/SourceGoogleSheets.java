/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleSheets - The values required to configure the source.
 */
public class SourceGoogleSheets {
    /**
     * Credentials for connecting to the Google Sheets API
     */
    @JsonProperty("credentials")
    public Object credentials;
    public SourceGoogleSheets withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Number of rows fetched when making a Google Sheet API call. Defaults to 200.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_batch_size")
    public Long rowBatchSize;
    public SourceGoogleSheets withRowBatchSize(Long rowBatchSize) {
        this.rowBatchSize = rowBatchSize;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGoogleSheetsGoogleSheetsEnum sourceType;
    public SourceGoogleSheets withSourceType(SourceGoogleSheetsGoogleSheetsEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Enter the link to the Google spreadsheet you want to sync
     */
    @JsonProperty("spreadsheet_id")
    public String spreadsheetId;
    public SourceGoogleSheets withSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
        return this;
    }
    
    public SourceGoogleSheets(@JsonProperty("credentials") Object credentials, @JsonProperty("sourceType") SourceGoogleSheetsGoogleSheetsEnum sourceType, @JsonProperty("spreadsheet_id") String spreadsheetId) {
        this.credentials = credentials;
        this.sourceType = sourceType;
        this.spreadsheetId = spreadsheetId;
  }
}
