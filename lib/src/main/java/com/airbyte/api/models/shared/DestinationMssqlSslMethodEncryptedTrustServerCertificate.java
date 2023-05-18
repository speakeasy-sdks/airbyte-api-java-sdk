/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMssqlSslMethodEncryptedTrustServerCertificate - Use the certificate provided by the server without verification. (For testing purposes only!)
 */
public class DestinationMssqlSslMethodEncryptedTrustServerCertificate {
    @JsonProperty("ssl_method")
    public DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod sslMethod;

    public DestinationMssqlSslMethodEncryptedTrustServerCertificate withSslMethod(DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod sslMethod) {
        this.sslMethod = sslMethod;
        return this;
    }
    
    public DestinationMssqlSslMethodEncryptedTrustServerCertificate(@JsonProperty("ssl_method") DestinationMssqlSslMethodEncryptedTrustServerCertificateSslMethod sslMethod) {
        this.sslMethod = sslMethod;
  }
}
