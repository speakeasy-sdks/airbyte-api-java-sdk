/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModeRequire - Require SSL mode.
 */
public class DestinationPostgresSslModeRequire {
    @JsonProperty("mode")
    public DestinationPostgresSslModeRequireMode mode;

    public DestinationPostgresSslModeRequire withMode(DestinationPostgresSslModeRequireMode mode) {
        this.mode = mode;
        return this;
    }
    
    public DestinationPostgresSslModeRequire(@JsonProperty("mode") DestinationPostgresSslModeRequireMode mode) {
        this.mode = mode;
  }
}
