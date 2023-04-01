/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationDatabricks - The values required to configure the destination.
 */
public class DestinationDatabricks {
    /**
     * You must agree to the Databricks JDBC Driver &lt;a href="https://databricks.com/jdbc-odbc-driver-license"&gt;Terms &amp; Conditions&lt;/a&gt; to use this connector.
     */
    @JsonProperty("accept_terms")
    public Boolean acceptTerms;
    public DestinationDatabricks withAcceptTerms(Boolean acceptTerms) {
        this.acceptTerms = acceptTerms;
        return this;
    }
    
    @JsonProperty("airbyte-destination-name")
    public DestinationDatabricksDatabricksEnum airbyteDestinationName;
    public DestinationDatabricks withAirbyteDestinationName(DestinationDatabricksDatabricksEnum airbyteDestinationName) {
        this.airbyteDestinationName = airbyteDestinationName;
        return this;
    }
    
    /**
     * Storage on which the delta lake is built.
     */
    @JsonProperty("data_source")
    public Object dataSource;
    public DestinationDatabricks withDataSource(Object dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    
    /**
     * The default schema tables are written to if the source does not specify a namespace. Unless specifically configured, the usual value for this field is "public".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("database_schema")
    public String databaseSchema;
    public DestinationDatabricks withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    
    /**
     * Databricks Cluster HTTP Path.
     */
    @JsonProperty("databricks_http_path")
    public String databricksHttpPath;
    public DestinationDatabricks withDatabricksHttpPath(String databricksHttpPath) {
        this.databricksHttpPath = databricksHttpPath;
        return this;
    }
    
    /**
     * Databricks Personal Access Token for making authenticated requests.
     */
    @JsonProperty("databricks_personal_access_token")
    public String databricksPersonalAccessToken;
    public DestinationDatabricks withDatabricksPersonalAccessToken(String databricksPersonalAccessToken) {
        this.databricksPersonalAccessToken = databricksPersonalAccessToken;
        return this;
    }
    
    /**
     * Databricks Cluster Port.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("databricks_port")
    public String databricksPort;
    public DestinationDatabricks withDatabricksPort(String databricksPort) {
        this.databricksPort = databricksPort;
        return this;
    }
    
    /**
     * Databricks Cluster Server Hostname.
     */
    @JsonProperty("databricks_server_hostname")
    public String databricksServerHostname;
    public DestinationDatabricks withDatabricksServerHostname(String databricksServerHostname) {
        this.databricksServerHostname = databricksServerHostname;
        return this;
    }
    
    /**
     * Default to 'true'. Switch it to 'false' for debugging purpose.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purge_staging_data")
    public Boolean purgeStagingData;
    public DestinationDatabricks withPurgeStagingData(Boolean purgeStagingData) {
        this.purgeStagingData = purgeStagingData;
        return this;
    }
    
}
