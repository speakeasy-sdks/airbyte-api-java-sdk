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
 * ZohoCRMEdition - Choose your Edition of Zoho CRM to determine API Concurrency Limits
 */
public enum ZohoCRMEdition {
    FREE("Free"),
    STANDARD("Standard"),
    PROFESSIONAL("Professional"),
    ENTERPRISE("Enterprise"),
    ULTIMATE("Ultimate");

    @JsonValue
    private final String value;

    private ZohoCRMEdition(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}