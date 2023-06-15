/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationScylla - The values required to configure the destination.
 */

public class DestinationScylla {
    /**
     * Address to connect to.
     */
    @JsonProperty("address")
    public String address;

    public DestinationScylla withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationScyllaScylla destinationType;

    public DestinationScylla withDestinationType(DestinationScyllaScylla destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Default Scylla keyspace to create data in.
     */
    @JsonProperty("keyspace")
    public String keyspace;

    public DestinationScylla withKeyspace(String keyspace) {
        this.keyspace = keyspace;
        return this;
    }
    
    /**
     * Password associated with Scylla.
     */
    @JsonProperty("password")
    public String password;

    public DestinationScylla withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of Scylla.
     */
    @JsonProperty("port")
    public Long port;

    public DestinationScylla withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Indicates to how many nodes the data should be replicated to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication")
    public Long replication;

    public DestinationScylla withReplication(Long replication) {
        this.replication = replication;
        return this;
    }
    
    /**
     * Username to use to access Scylla.
     */
    @JsonProperty("username")
    public String username;

    public DestinationScylla withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public DestinationScylla(@JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("address") String address, @JsonProperty("destinationType") DestinationScyllaScylla destinationType, @JsonProperty("keyspace") String keyspace, @JsonProperty("port") Long port) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.destinationType = destinationType;
        this.keyspace = keyspace;
        this.port = port;
  }
}
