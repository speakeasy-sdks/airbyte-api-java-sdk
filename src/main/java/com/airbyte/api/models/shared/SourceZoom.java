/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class SourceZoom {

    /**
     * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonProperty("account_id")
    private String accountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorization_endpoint")
    private Optional<? extends String> authorizationEndpoint;

    /**
     * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("sourceType")
    private Zoom sourceType;

    public SourceZoom(
            @JsonProperty("account_id") String accountId,
            @JsonProperty("authorization_endpoint") Optional<? extends String> authorizationEndpoint,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.accountId = accountId;
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public String accountId() {
        return accountId;
    }

    public Optional<? extends String> authorizationEndpoint() {
        return authorizationEndpoint;
    }

    /**
     * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public String clientId() {
        return clientId;
    }

    /**
     * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public String clientSecret() {
        return clientSecret;
    }

    public Zoom sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public SourceZoom withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    public SourceZoom withAuthorizationEndpoint(String authorizationEndpoint) {
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        this.authorizationEndpoint = Optional.ofNullable(authorizationEndpoint);
        return this;
    }

    public SourceZoom withAuthorizationEndpoint(Optional<? extends String> authorizationEndpoint) {
        Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public SourceZoom withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
     */
    public SourceZoom withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
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
        SourceZoom other = (SourceZoom) o;
        return 
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.authorizationEndpoint, other.authorizationEndpoint) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountId,
            authorizationEndpoint,
            clientId,
            clientSecret,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZoom.class,
                "accountId", accountId,
                "authorizationEndpoint", authorizationEndpoint,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private Optional<? extends String> authorizationEndpoint;
 
        private String clientId;
 
        private String clientSecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account ID for your Zoom account. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
            this.authorizationEndpoint = Optional.ofNullable(authorizationEndpoint);
            return this;
        }

        public Builder authorizationEndpoint(Optional<? extends String> authorizationEndpoint) {
            Utils.checkNotNull(authorizationEndpoint, "authorizationEndpoint");
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }

        /**
         * The client ID for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * The client secret for your Zoom app. You can find this in the Zoom Marketplace under the "Manage" tab for your app.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SourceZoom build() {
            if (authorizationEndpoint == null) {
                authorizationEndpoint = _SINGLETON_VALUE_AuthorizationEndpoint.value();
            }
            return new SourceZoom(
                accountId,
                authorizationEndpoint,
                clientId,
                clientSecret);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_AuthorizationEndpoint =
                new LazySingletonValue<>(
                        "authorization_endpoint",
                        "\"https://zoom.us/oauth/token\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Zoom> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zoom\"",
                        new TypeReference<Zoom>() {});
    }
}
