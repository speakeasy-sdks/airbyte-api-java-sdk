/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceDixaDixa {
    DIXA("dixa");

    @JsonValue
    public final String value;

    private SourceDixaDixa(String value) {
        this.value = value;
    }
}