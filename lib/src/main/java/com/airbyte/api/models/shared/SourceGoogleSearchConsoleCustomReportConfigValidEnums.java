/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceGoogleSearchConsoleCustomReportConfigValidEnums - An enumeration of dimensions.
 */
public enum SourceGoogleSearchConsoleCustomReportConfigValidEnums {
    COUNTRY("country"),
    DATE("date"),
    DEVICE("device"),
    PAGE("page"),
    QUERY("query");

    @JsonValue
    public final String value;

    private SourceGoogleSearchConsoleCustomReportConfigValidEnums(String value) {
        this.value = value;
    }
}