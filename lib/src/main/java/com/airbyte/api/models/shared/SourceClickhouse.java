/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceClickhouse - The values required to configure the source.
 */
public class SourceClickhouse {
    @JsonProperty("airbyte-source-name")
    public SourceClickhouseClickhouseEnum airbyteSourceName;
    public SourceClickhouse withAirbyteSourceName(SourceClickhouseClickhouseEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * The name of the database.
     */
    @JsonProperty("database")
    public String database;
    public SourceClickhouse withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * The host endpoint of the Clickhouse cluster.
     */
    @JsonProperty("host")
    public String host;
    public SourceClickhouse withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * The password associated with this username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public SourceClickhouse withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * The port of the database.
     */
    @JsonProperty("port")
    public Long port;
    public SourceClickhouse withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;
    public SourceClickhouse withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * The username which is used to access the database.
     */
    @JsonProperty("username")
    public String username;
    public SourceClickhouse withUsername(String username) {
        this.username = username;
        return this;
    }
    
}