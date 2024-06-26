/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * FileType - The file type you want to sync. Currently only 'csv' and 'json' files are supported.
 */
public enum FileType {
    CSV("csv"),
    JSON("json");

    @JsonValue
    private final String value;

    private FileType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
