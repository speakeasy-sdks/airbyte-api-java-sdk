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
 * SourceKlarnaRegion - Base url region (For playground eu https://docs.klarna.com/klarna-payments/api/payments-api/#tag/API-URLs). Supported 'eu', 'us', 'oc'
 */
public enum SourceKlarnaRegion {
    EU("eu"),
    US("us"),
    OC("oc");

    @JsonValue
    private final String value;

    private SourceKlarnaRegion(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}