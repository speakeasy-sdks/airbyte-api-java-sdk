/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceQuickbooksQuickbooks {
    QUICKBOOKS("quickbooks");

    @JsonValue
    public final String value;

    private SourceQuickbooksQuickbooks(String value) {
        this.value = value;
    }
}