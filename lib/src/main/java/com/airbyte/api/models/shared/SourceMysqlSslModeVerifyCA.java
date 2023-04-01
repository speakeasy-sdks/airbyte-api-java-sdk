/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceMysqlSslModeVerifyCA - Always connect with SSL. Verifies CA, but allows connection even if Hostname does not match.
 */
public class SourceMysqlSslModeVerifyCA {
    /**
     * CA certificate
     */
    @JsonProperty("ca_certificate")
    public String caCertificate;
    public SourceMysqlSslModeVerifyCA withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }
    
    /**
     * Client certificate (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client key&lt;/b&gt; as well)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_certificate")
    public String clientCertificate;
    public SourceMysqlSslModeVerifyCA withClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }
    
    /**
     * Client key (this is not a required field, but if you want to use it, you will need to add the &lt;b&gt;Client certificate&lt;/b&gt; as well)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key")
    public String clientKey;
    public SourceMysqlSslModeVerifyCA withClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    
    /**
     * Password for keystorage. This field is optional. If you do not add it - the password will be generated automatically.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_key_password")
    public String clientKeyPassword;
    public SourceMysqlSslModeVerifyCA withClientKeyPassword(String clientKeyPassword) {
        this.clientKeyPassword = clientKeyPassword;
        return this;
    }
    
    @JsonProperty("mode")
    public SourceMysqlSslModeVerifyCAModeEnum mode;
    public SourceMysqlSslModeVerifyCA withMode(SourceMysqlSslModeVerifyCAModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
}
