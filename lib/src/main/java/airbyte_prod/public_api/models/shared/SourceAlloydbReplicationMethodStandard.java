/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAlloydbReplicationMethodStandard - Standard replication requires no setup on the DB side but will not be able to represent deletions incrementally.
 */
public class SourceAlloydbReplicationMethodStandard {
    @JsonProperty("method")public SourceAlloydbReplicationMethodStandardMethodEnum method;
    public SourceAlloydbReplicationMethodStandard withMethod(SourceAlloydbReplicationMethodStandardMethodEnum method) {
        this.method = method;
        return this;
    }
    
}