/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationLangchainEmbeddingFakeMode {
    FAKE("fake");

    @JsonValue
    public final String value;

    private DestinationLangchainEmbeddingFakeMode(String value) {
        this.value = value;
    }
}