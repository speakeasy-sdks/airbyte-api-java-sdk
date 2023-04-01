/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationFirebolt - The values required to configure the destination.
 */
public class DestinationFirebolt {
    /**
     * Firebolt account to login.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    public String account;
    public DestinationFirebolt withAccount(String account) {
        this.account = account;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationFireboltFireboltEnum airbyteDestinationName;
    public DestinationFirebolt withAirbyteDestinationName(DestinationFireboltFireboltEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * The database to connect to.
     */
    @JsonProperty("database")
    public String database;
    public DestinationFirebolt withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Engine name or url to connect to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("engine")
    public String engine;
    public DestinationFirebolt withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    /**
     * The host name of your Firebolt database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("host")
    public String host;
    public DestinationFirebolt withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Loading method used to select the way data will be uploaded to Firebolt
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")
    public Object loadingMethod;
    public DestinationFirebolt withLoadingMethod(Object loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    /**
     * Firebolt password.
     */
    @JsonProperty("password")
    public String password;
    public DestinationFirebolt withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Firebolt email address you use to login.
     */
    @JsonProperty("username")
    public String username;
    public DestinationFirebolt withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
