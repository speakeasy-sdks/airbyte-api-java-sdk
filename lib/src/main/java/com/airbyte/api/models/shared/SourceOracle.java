/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceOracle - The values required to configure the source.
 */
public class SourceOracle {
    @JsonProperty("airbyte-source-name")
    public SourceOracleOracleEnum airbyteSourceName;
    public SourceOracle withAirbyteSourceName(SourceOracleOracleEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Connect data that will be used for DB connection
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connection_data")
    public Object connectionData;
    public SourceOracle withConnectionData(Object connectionData) {
        this.connectionData = connectionData;
        return this;
    }
    
    /**
     * The encryption method with is used when communicating with the database.
     */
    @JsonProperty("encryption")
    public Object encryption;
    public SourceOracle withEncryption(Object encryption) {
        this.encryption = encryption;
        return this;
    }
    
    /**
     * Hostname of the database.
     */
    @JsonProperty("host")
    public String host;
    public SourceOracle withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public SourceOracle withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * The password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceOracle withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     * Oracle Corporations recommends the following port numbers:
     * 1521 - Default listening port for client connections to the listener. 
     * 2484 - Recommended and officially registered listening port for client connections to the listener using TCP/IP with SSL
     */
    @JsonProperty("port")
    public Long port;
    public SourceOracle withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * The list of schemas to sync from. Defaults to user. Case sensitive.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemas")
    public String[] schemas;
    public SourceOracle withSchemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;
    public SourceOracle withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * The username which is used to access the database.
     */
    @JsonProperty("username")
    public String username;
    public SourceOracle withUsername(String username) {
        this.username = username;
        return this;
    }
    
}