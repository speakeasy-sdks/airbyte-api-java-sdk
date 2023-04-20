/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationS3GlueSerializationLibraryEnum - The library that your query engine will use for reading and writing data in your lake.
 */
public enum DestinationS3GlueSerializationLibraryEnum {
    ORG_OPENX_DATA_JSONSERDE_JSON_SER_DE("org.openx.data.jsonserde.JsonSerDe"),
    ORG_APACHE_HIVE_HCATALOG_DATA_JSON_SER_DE("org.apache.hive.hcatalog.data.JsonSerDe");

    @JsonValue
    public final String value;

    private DestinationS3GlueSerializationLibraryEnum(String value) {
        this.value = value;
    }
}