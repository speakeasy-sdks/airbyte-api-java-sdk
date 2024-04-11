/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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


public class AmazonSellerPartner {

    /**
     * Your Login with Amazon Client ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lwa_app_id")
    private Optional<? extends String> lwaAppId;

    /**
     * Your Login with Amazon Client Secret.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lwa_client_secret")
    private Optional<? extends String> lwaClientSecret;

    public AmazonSellerPartner(
            @JsonProperty("lwa_app_id") Optional<? extends String> lwaAppId,
            @JsonProperty("lwa_client_secret") Optional<? extends String> lwaClientSecret) {
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        this.lwaAppId = lwaAppId;
        this.lwaClientSecret = lwaClientSecret;
    }

    /**
     * Your Login with Amazon Client ID.
     */
    public Optional<? extends String> lwaAppId() {
        return lwaAppId;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    public Optional<? extends String> lwaClientSecret() {
        return lwaClientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your Login with Amazon Client ID.
     */
    public AmazonSellerPartner withLwaAppId(String lwaAppId) {
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        this.lwaAppId = Optional.ofNullable(lwaAppId);
        return this;
    }

    /**
     * Your Login with Amazon Client ID.
     */
    public AmazonSellerPartner withLwaAppId(Optional<? extends String> lwaAppId) {
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        this.lwaAppId = lwaAppId;
        return this;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    public AmazonSellerPartner withLwaClientSecret(String lwaClientSecret) {
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        this.lwaClientSecret = Optional.ofNullable(lwaClientSecret);
        return this;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    public AmazonSellerPartner withLwaClientSecret(Optional<? extends String> lwaClientSecret) {
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        this.lwaClientSecret = lwaClientSecret;
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
        AmazonSellerPartner other = (AmazonSellerPartner) o;
        return 
            java.util.Objects.deepEquals(this.lwaAppId, other.lwaAppId) &&
            java.util.Objects.deepEquals(this.lwaClientSecret, other.lwaClientSecret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            lwaAppId,
            lwaClientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AmazonSellerPartner.class,
                "lwaAppId", lwaAppId,
                "lwaClientSecret", lwaClientSecret);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> lwaAppId = Optional.empty();
 
        private Optional<? extends String> lwaClientSecret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your Login with Amazon Client ID.
         */
        public Builder lwaAppId(String lwaAppId) {
            Utils.checkNotNull(lwaAppId, "lwaAppId");
            this.lwaAppId = Optional.ofNullable(lwaAppId);
            return this;
        }

        /**
         * Your Login with Amazon Client ID.
         */
        public Builder lwaAppId(Optional<? extends String> lwaAppId) {
            Utils.checkNotNull(lwaAppId, "lwaAppId");
            this.lwaAppId = lwaAppId;
            return this;
        }

        /**
         * Your Login with Amazon Client Secret.
         */
        public Builder lwaClientSecret(String lwaClientSecret) {
            Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
            this.lwaClientSecret = Optional.ofNullable(lwaClientSecret);
            return this;
        }

        /**
         * Your Login with Amazon Client Secret.
         */
        public Builder lwaClientSecret(Optional<? extends String> lwaClientSecret) {
            Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
            this.lwaClientSecret = lwaClientSecret;
            return this;
        }
        
        public AmazonSellerPartner build() {
            return new AmazonSellerPartner(
                lwaAppId,
                lwaClientSecret);
        }
    }
}
