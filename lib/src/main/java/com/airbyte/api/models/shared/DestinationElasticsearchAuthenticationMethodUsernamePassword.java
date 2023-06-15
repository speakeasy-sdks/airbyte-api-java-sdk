/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationElasticsearchAuthenticationMethodUsernamePassword - Basic auth header with a username and password
 */

public class DestinationElasticsearchAuthenticationMethodUsernamePassword {
    @JsonProperty("method")
    public DestinationElasticsearchAuthenticationMethodUsernamePasswordMethod method;

    public DestinationElasticsearchAuthenticationMethodUsernamePassword withMethod(DestinationElasticsearchAuthenticationMethodUsernamePasswordMethod method) {
        this.method = method;
        return this;
    }
    
    /**
     * Basic auth password to access a secure Elasticsearch server
     */
    @JsonProperty("password")
    public String password;

    public DestinationElasticsearchAuthenticationMethodUsernamePassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Basic auth username to access a secure Elasticsearch server
     */
    @JsonProperty("username")
    public String username;

    public DestinationElasticsearchAuthenticationMethodUsernamePassword withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public DestinationElasticsearchAuthenticationMethodUsernamePassword(@JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("method") DestinationElasticsearchAuthenticationMethodUsernamePasswordMethod method) {
        this.username = username;
        this.password = password;
        this.method = method;
  }
}
