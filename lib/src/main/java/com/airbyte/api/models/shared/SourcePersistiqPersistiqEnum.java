/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourcePersistiqPersistiqEnum {
    PERSISTIQ("persistiq");

    @JsonValue
    public final String value;

    private SourcePersistiqPersistiqEnum(String value) {
        this.value = value;
    }
}