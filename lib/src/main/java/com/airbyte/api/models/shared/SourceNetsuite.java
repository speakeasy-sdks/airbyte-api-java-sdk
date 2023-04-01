/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceNetsuite - The values required to configure the source.
 */
public class SourceNetsuite {
    @JsonProperty("airbyte-source-name")
    public SourceNetsuiteNetsuiteEnum airbyteSourceName;
    public SourceNetsuite withAirbyteSourceName(SourceNetsuiteNetsuiteEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Consumer key associated with your integration
     */
    @JsonProperty("consumer_key")
    public String consumerKey;
    public SourceNetsuite withConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }
    
    /**
     * Consumer secret associated with your integration
     */
    @JsonProperty("consumer_secret")
    public String consumerSecret;
    public SourceNetsuite withConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
        return this;
    }
    
    /**
     * The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_types")
    public String[] objectTypes;
    public SourceNetsuite withObjectTypes(String[] objectTypes) {
        this.objectTypes = objectTypes;
        return this;
    }
    
    /**
     * Netsuite realm e.g. 2344535, as for `production` or 2344535_SB1, as for the `sandbox`
     */
    @JsonProperty("realm")
    public String realm;
    public SourceNetsuite withRealm(String realm) {
        this.realm = realm;
        return this;
    }
    
    /**
     * Starting point for your data replication, in format of "YYYY-MM-DDTHH:mm:ssZ"
     */
    @JsonProperty("start_datetime")
    public String startDatetime;
    public SourceNetsuite withStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
        return this;
    }
    
    /**
     * Access token key
     */
    @JsonProperty("token_key")
    public String tokenKey;
    public SourceNetsuite withTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
        return this;
    }
    
    /**
     * Access token secret
     */
    @JsonProperty("token_secret")
    public String tokenSecret;
    public SourceNetsuite withTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
        return this;
    }
    
    /**
     * The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("window_in_days")
    public Long windowInDays;
    public SourceNetsuite withWindowInDays(Long windowInDays) {
        this.windowInDays = windowInDays;
        return this;
    }
    
}
