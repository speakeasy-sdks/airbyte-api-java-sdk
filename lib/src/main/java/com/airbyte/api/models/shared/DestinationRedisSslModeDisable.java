/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedisSslModeDisable - Disable SSL.
 */
public class DestinationRedisSslModeDisable {
    @JsonProperty("mode")
    public DestinationRedisSslModeDisableMode mode;

    public DestinationRedisSslModeDisable withMode(DestinationRedisSslModeDisableMode mode) {
        this.mode = mode;
        return this;
    }
    
    public DestinationRedisSslModeDisable(@JsonProperty("mode") DestinationRedisSslModeDisableMode mode) {
        this.mode = mode;
  }
}
