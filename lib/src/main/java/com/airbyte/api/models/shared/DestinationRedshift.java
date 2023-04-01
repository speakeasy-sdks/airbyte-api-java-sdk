/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedshift - The values required to configure the destination.
 */
public class DestinationRedshift {
    @JsonProperty("airbyte-destination-name")
    public DestinationRedshiftRedshiftEnum airbyteDestinationName;
    public DestinationRedshift withAirbyteDestinationName(DestinationRedshiftRedshiftEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * Name of the database.
     */
    @JsonProperty("database")
    public String database;
    public DestinationRedshift withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Host Endpoint of the Redshift Cluster (must include the cluster-id, region and end with .redshift.amazonaws.com)
     */
    @JsonProperty("host")
    public String host;
    public DestinationRedshift withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    public String jdbcUrlParams;
    public DestinationRedshift withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Password associated with the username.
     */
    @JsonProperty("password")
    public String password;
    public DestinationRedshift withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of the database.
     */
    @JsonProperty("port")
    public Long port;
    public DestinationRedshift withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
     */
    @JsonProperty("schema")
    public String schema;
    public DestinationRedshift withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * The method how the data will be uploaded to the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uploading_method")
    public Object uploadingMethod;
    public DestinationRedshift withUploadingMethod(Object uploadingMethod) {
        this.uploadingMethod = uploadingMethod;
        return this;
    }
    
    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    public String username;
    public DestinationRedshift withUsername(String username) {
        this.username = username;
        return this;
    }
    
}
