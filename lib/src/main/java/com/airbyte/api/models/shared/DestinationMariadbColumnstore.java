/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMariadbColumnstore - The values required to configure the destination.
 */
public class DestinationMariadbColumnstore {
    @JsonProperty("airbyte-destination-name")
    public DestinationMariadbColumnstoreMariadbColumnstoreEnum airbyteDestinationName;
    public DestinationMariadbColumnstore withAirbyteDestinationName(DestinationMariadbColumnstoreMariadbColumnstoreEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * Name of the database.
     */
    @JsonProperty("database")
    public String database;
    public DestinationMariadbColumnstore withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * The Hostname of the database.
     */
    @JsonProperty("host")
    public String host;
    public DestinationMariadbColumnstore withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public DestinationMariadbColumnstore withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * The Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    public String password;
    public DestinationMariadbColumnstore withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * The Port of the database.
     */
    @JsonProperty("port")
    public Long port;
    public DestinationMariadbColumnstore withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    public Object tunnelMethod;
    public DestinationMariadbColumnstore withTunnelMethod(Object tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * The Username which is used to access the database.
     */
    @JsonProperty("username")
    public String username;
    public DestinationMariadbColumnstore withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
