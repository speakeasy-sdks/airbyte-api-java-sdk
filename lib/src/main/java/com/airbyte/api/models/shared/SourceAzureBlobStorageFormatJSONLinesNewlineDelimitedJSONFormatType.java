/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType {
    JSONL("JSONL");

    @JsonValue
    public final String value;

    private SourceAzureBlobStorageFormatJSONLinesNewlineDelimitedJSONFormatType(String value) {
        this.value = value;
    }
}
