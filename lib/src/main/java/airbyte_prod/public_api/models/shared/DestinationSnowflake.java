/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationSnowflake - The values required to configure the destination.
 */
public class DestinationSnowflake {
    @JsonProperty("airbyte-destination-name")public DestinationSnowflakeSnowflakeEnum airbyteDestinationName;
    public DestinationSnowflake withAirbyteDestinationName(DestinationSnowflakeSnowflakeEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")public Object credentials;
    public DestinationSnowflake withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Enter the name of the <a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl">database</a> you want to sync data into
     */
    @JsonProperty("database")public String database;
    public DestinationSnowflake withDatabase(String database) {
        this.database = database;
        return this;
    }
    
    /**
     * Enter your Snowflake account's <a href="https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#using-an-account-locator-as-an-identifier">locator</a> (in the format <account_locator>.<region>.<cloud>.snowflakecomputing.com)
     */
    @JsonProperty("host")public String host;
    public DestinationSnowflake withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * Enter the additional properties to pass to the JDBC URL string when connecting to the database (formatted as key=value pairs separated by the symbol &). Example: key1=value1&key2=value2&key3=value3
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")public String jdbcUrlParams;
    public DestinationSnowflake withJdbcUrlParams(String jdbcUrlParams) {
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }
    
    /**
     * Select a data staging method
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("loading_method")public Object loadingMethod;
    public DestinationSnowflake withLoadingMethod(Object loadingMethod) {
        this.loadingMethod = loadingMethod;
        return this;
    }
    
    /**
     * Enter the <a href="https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#roles">role</a> that you want to use to access Snowflake
     */
    @JsonProperty("role")public String role;
    public DestinationSnowflake withRole(String role) {
        this.role = role;
        return this;
    }
    
    /**
     * Enter the name of the default <a href="https://docs.snowflake.com/en/sql-reference/ddl-database.html#database-schema-share-ddl">schema</a>
     */
    @JsonProperty("schema")public String schema;
    public DestinationSnowflake withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
    /**
     * Enter the name of the user you want to use to access the database
     */
    @JsonProperty("username")public String username;
    public DestinationSnowflake withUsername(String username) {
        this.username = username;
        return this;
    }
    
    /**
     * Enter the name of the <a href="https://docs.snowflake.com/en/user-guide/warehouses-overview.html#overview-of-warehouses">warehouse</a> that you want to sync data into
     */
    @JsonProperty("warehouse")public String warehouse;
    public DestinationSnowflake withWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }
    
}