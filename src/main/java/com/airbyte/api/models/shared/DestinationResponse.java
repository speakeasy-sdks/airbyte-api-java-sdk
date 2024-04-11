/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * DestinationResponse - Provides details of a single destination.
 */

public class DestinationResponse {

    /**
     * The values required to configure the destination.
     */
    @JsonProperty("configuration")
    private DestinationConfiguration configuration;

    @JsonProperty("destinationId")
    private String destinationId;

    @JsonProperty("destinationType")
    private String destinationType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("workspaceId")
    private String workspaceId;

    public DestinationResponse(
            @JsonProperty("configuration") DestinationConfiguration configuration,
            @JsonProperty("destinationId") String destinationId,
            @JsonProperty("destinationType") String destinationType,
            @JsonProperty("name") String name,
            @JsonProperty("workspaceId") String workspaceId) {
        Utils.checkNotNull(configuration, "configuration");
        Utils.checkNotNull(destinationId, "destinationId");
        Utils.checkNotNull(destinationType, "destinationType");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.configuration = configuration;
        this.destinationId = destinationId;
        this.destinationType = destinationType;
        this.name = name;
        this.workspaceId = workspaceId;
    }

    /**
     * The values required to configure the destination.
     */
    public DestinationConfiguration configuration() {
        return configuration;
    }

    public String destinationId() {
        return destinationId;
    }

    public String destinationType() {
        return destinationType;
    }

    public String name() {
        return name;
    }

    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The values required to configure the destination.
     */
    public DestinationResponse withConfiguration(DestinationConfiguration configuration) {
        Utils.checkNotNull(configuration, "configuration");
        this.configuration = configuration;
        return this;
    }

    public DestinationResponse withDestinationId(String destinationId) {
        Utils.checkNotNull(destinationId, "destinationId");
        this.destinationId = destinationId;
        return this;
    }

    public DestinationResponse withDestinationType(String destinationType) {
        Utils.checkNotNull(destinationType, "destinationType");
        this.destinationType = destinationType;
        return this;
    }

    public DestinationResponse withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DestinationResponse withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DestinationResponse other = (DestinationResponse) o;
        return 
            java.util.Objects.deepEquals(this.configuration, other.configuration) &&
            java.util.Objects.deepEquals(this.destinationId, other.destinationId) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            configuration,
            destinationId,
            destinationType,
            name,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationResponse.class,
                "configuration", configuration,
                "destinationId", destinationId,
                "destinationType", destinationType,
                "name", name,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private DestinationConfiguration configuration;
 
        private String destinationId;
 
        private String destinationType;
 
        private String name;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The values required to configure the destination.
         */
        public Builder configuration(DestinationConfiguration configuration) {
            Utils.checkNotNull(configuration, "configuration");
            this.configuration = configuration;
            return this;
        }

        public Builder destinationId(String destinationId) {
            Utils.checkNotNull(destinationId, "destinationId");
            this.destinationId = destinationId;
            return this;
        }

        public Builder destinationType(String destinationType) {
            Utils.checkNotNull(destinationType, "destinationType");
            this.destinationType = destinationType;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public DestinationResponse build() {
            return new DestinationResponse(
                configuration,
                destinationId,
                destinationType,
                name,
                workspaceId);
        }
    }
}
