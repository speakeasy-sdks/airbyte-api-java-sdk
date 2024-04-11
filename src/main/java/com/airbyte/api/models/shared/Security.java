/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class Security {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=basic")
    private Optional<? extends SchemeBasicAuth> basicAuth;

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    private Optional<? extends String> bearerAuth;

    public Security(
            Optional<? extends SchemeBasicAuth> basicAuth,
            Optional<? extends String> bearerAuth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        Utils.checkNotNull(bearerAuth, "bearerAuth");
        this.basicAuth = basicAuth;
        this.bearerAuth = bearerAuth;
    }

    public Optional<? extends SchemeBasicAuth> basicAuth() {
        return basicAuth;
    }

    public Optional<? extends String> bearerAuth() {
        return bearerAuth;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Security withBasicAuth(SchemeBasicAuth basicAuth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        this.basicAuth = Optional.ofNullable(basicAuth);
        return this;
    }

    public Security withBasicAuth(Optional<? extends SchemeBasicAuth> basicAuth) {
        Utils.checkNotNull(basicAuth, "basicAuth");
        this.basicAuth = basicAuth;
        return this;
    }

    public Security withBearerAuth(String bearerAuth) {
        Utils.checkNotNull(bearerAuth, "bearerAuth");
        this.bearerAuth = Optional.ofNullable(bearerAuth);
        return this;
    }

    public Security withBearerAuth(Optional<? extends String> bearerAuth) {
        Utils.checkNotNull(bearerAuth, "bearerAuth");
        this.bearerAuth = bearerAuth;
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
        Security other = (Security) o;
        return 
            java.util.Objects.deepEquals(this.basicAuth, other.basicAuth) &&
            java.util.Objects.deepEquals(this.bearerAuth, other.bearerAuth);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            basicAuth,
            bearerAuth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Security.class,
                "basicAuth", basicAuth,
                "bearerAuth", bearerAuth);
    }
    
    public final static class Builder {
 
        private Optional<? extends SchemeBasicAuth> basicAuth = Optional.empty();
 
        private Optional<? extends String> bearerAuth = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder basicAuth(SchemeBasicAuth basicAuth) {
            Utils.checkNotNull(basicAuth, "basicAuth");
            this.basicAuth = Optional.ofNullable(basicAuth);
            return this;
        }

        public Builder basicAuth(Optional<? extends SchemeBasicAuth> basicAuth) {
            Utils.checkNotNull(basicAuth, "basicAuth");
            this.basicAuth = basicAuth;
            return this;
        }

        public Builder bearerAuth(String bearerAuth) {
            Utils.checkNotNull(bearerAuth, "bearerAuth");
            this.bearerAuth = Optional.ofNullable(bearerAuth);
            return this;
        }

        public Builder bearerAuth(Optional<? extends String> bearerAuth) {
            Utils.checkNotNull(bearerAuth, "bearerAuth");
            this.bearerAuth = bearerAuth;
            return this;
        }
        
        public Security build() {
            return new Security(
                basicAuth,
                bearerAuth);
        }
    }
}
