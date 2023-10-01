/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationPostgresSslModeVerifyCa - Verify-ca SSL mode.
 */

public class DestinationPostgresSslModeVerifyCa {
    /**
     * CA certificate
     */
    @JsonProperty("ca_certificate")
    public String caCertificate;

    public DestinationPostgresSslModeVerifyCa withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    
    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    public String clientKeyPassword;

    public DestinationPostgresSslModeVerifyCa withClientKeyPassword(String clientKeyPassword) {
        this.clientKeyPassword = clientKeyPassword;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    public DestinationPostgresSslModeVerifyCaMode mode;

    public DestinationPostgresSslModeVerifyCa withMode(DestinationPostgresSslModeVerifyCaMode mode) {
        this.mode = mode;
        return this;
    }
    
    public DestinationPostgresSslModeVerifyCa(@JsonProperty("ca_certificate") String caCertificate) {
        this.caCertificate = caCertificate;
  }
}
