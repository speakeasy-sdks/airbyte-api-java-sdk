/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationMeilisearchMeilisearch {
    MEILISEARCH("meilisearch");

    @JsonValue
    public final String value;

    private DestinationMeilisearchMeilisearch(String value) {
        this.value = value;
    }
}