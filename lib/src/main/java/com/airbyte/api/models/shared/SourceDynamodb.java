/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceDynamodb - The values required to configure the source.
 */
public class SourceDynamodb {
    /**
     * The access key id to access Dynamodb. Airbyte requires read permissions to the database
     */
    @JsonProperty("access_key_id")
    public String accessKeyId;
    public SourceDynamodb withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    
    @JsonProperty("airbyte-source-name")
    public SourceDynamodbDynamodbEnum airbyteSourceName;
    public SourceDynamodb withAirbyteSourceName(SourceDynamodbDynamodbEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * the URL of the Dynamodb database
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    public String endpoint;
    public SourceDynamodb withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    /**
     * The region of the Dynamodb database
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    public SourceDynamodbDynamodbRegionEnum region;
    public SourceDynamodb withRegion(SourceDynamodbDynamodbRegionEnum region) {
        this.region = region;
        return this;
    }
    
    /**
     * Comma separated reserved attribute names present in your tables
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reserved_attribute_names")
    public String reservedAttributeNames;
    public SourceDynamodb withReservedAttributeNames(String reservedAttributeNames) {
        this.reservedAttributeNames = reservedAttributeNames;
        return this;
    }
    
    /**
     * The corresponding secret to the access key id.
     */
    @JsonProperty("secret_access_key")
    public String secretAccessKey;
    public SourceDynamodb withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }
    
}
