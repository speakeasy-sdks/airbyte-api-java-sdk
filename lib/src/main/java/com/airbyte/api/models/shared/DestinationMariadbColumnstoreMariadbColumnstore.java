/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationMariadbColumnstoreMariadbColumnstore {
    MARIADB_COLUMNSTORE("mariadb-columnstore");

    @JsonValue
    public final String value;

    private DestinationMariadbColumnstoreMariadbColumnstore(String value) {
        this.value = value;
    }
}