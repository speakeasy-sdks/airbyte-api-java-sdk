/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationCassandra - The values required to configure the destination.
 */
public class DestinationCassandra {
    /**
     * Address to connect to.
     */
    @JsonProperty("address")
    public String address;

    public DestinationCassandra withAddress(String address) {
        this.address = address;
        return this;
    }
    
    /**
     * Datacenter of the cassandra cluster.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("datacenter")
    public String datacenter;

    public DestinationCassandra withDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationCassandraCassandra destinationType;

    public DestinationCassandra withDestinationType(DestinationCassandraCassandra destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Default Cassandra keyspace to create data in.
     */
    @JsonProperty("keyspace")
    public String keyspace;

    public DestinationCassandra withKeyspace(String keyspace) {
        this.keyspace = keyspace;
        return this;
    }
    
    /**
     * Password associated with Cassandra.
     */
    @JsonProperty("password")
    public String password;

    public DestinationCassandra withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Port of Cassandra.
     */
    @JsonProperty("port")
    public Long port;

    public DestinationCassandra withPort(Long port) {
        this.port = port;
        return this;
    }
    
    /**
     * Indicates to how many nodes the data should be replicated to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("replication")
    public Long replication;

    public DestinationCassandra withReplication(Long replication) {
        this.replication = replication;
        return this;
    }
    
    /**
     * Username to use to access Cassandra.
     */
    @JsonProperty("username")
    public String username;

    public DestinationCassandra withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public DestinationCassandra(@JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("address") String address, @JsonProperty("destinationType") DestinationCassandraCassandra destinationType, @JsonProperty("keyspace") String keyspace, @JsonProperty("port") Long port) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.destinationType = destinationType;
        this.keyspace = keyspace;
        this.port = port;
  }
}
