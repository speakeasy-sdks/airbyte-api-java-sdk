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


public class SourceFirebolt {

    /**
     * Firebolt account to login.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<? extends String> account;

    /**
     * The database to connect to.
     */
    @JsonProperty("database")
    private String database;

    /**
     * Engine name or url to connect to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("engine")
    private Optional<? extends String> engine;

    /**
     * The host name of your Firebolt database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("host")
    private Optional<? extends String> host;

    /**
     * Firebolt password.
     */
    @JsonProperty("password")
    private String password;

    @JsonProperty("sourceType")
    private Firebolt sourceType;

    /**
     * Firebolt email address you use to login.
     */
    @JsonProperty("username")
    private String username;

    public SourceFirebolt(
            @JsonProperty("account") Optional<? extends String> account,
            @JsonProperty("database") String database,
            @JsonProperty("engine") Optional<? extends String> engine,
            @JsonProperty("host") Optional<? extends String> host,
            @JsonProperty("password") String password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(engine, "engine");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.account = account;
        this.database = database;
        this.engine = engine;
        this.host = host;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.username = username;
    }

    /**
     * Firebolt account to login.
     */
    public Optional<? extends String> account() {
        return account;
    }

    /**
     * The database to connect to.
     */
    public String database() {
        return database;
    }

    /**
     * Engine name or url to connect to.
     */
    public Optional<? extends String> engine() {
        return engine;
    }

    /**
     * The host name of your Firebolt database.
     */
    public Optional<? extends String> host() {
        return host;
    }

    /**
     * Firebolt password.
     */
    public String password() {
        return password;
    }

    public Firebolt sourceType() {
        return sourceType;
    }

    /**
     * Firebolt email address you use to login.
     */
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Firebolt account to login.
     */
    public SourceFirebolt withAccount(String account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    /**
     * Firebolt account to login.
     */
    public SourceFirebolt withAccount(Optional<? extends String> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    /**
     * The database to connect to.
     */
    public SourceFirebolt withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * Engine name or url to connect to.
     */
    public SourceFirebolt withEngine(String engine) {
        Utils.checkNotNull(engine, "engine");
        this.engine = Optional.ofNullable(engine);
        return this;
    }

    /**
     * Engine name or url to connect to.
     */
    public SourceFirebolt withEngine(Optional<? extends String> engine) {
        Utils.checkNotNull(engine, "engine");
        this.engine = engine;
        return this;
    }

    /**
     * The host name of your Firebolt database.
     */
    public SourceFirebolt withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = Optional.ofNullable(host);
        return this;
    }

    /**
     * The host name of your Firebolt database.
     */
    public SourceFirebolt withHost(Optional<? extends String> host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Firebolt password.
     */
    public SourceFirebolt withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Firebolt email address you use to login.
     */
    public SourceFirebolt withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        SourceFirebolt other = (SourceFirebolt) o;
        return 
            java.util.Objects.deepEquals(this.account, other.account) &&
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.engine, other.engine) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            account,
            database,
            engine,
            host,
            password,
            sourceType,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFirebolt.class,
                "account", account,
                "database", database,
                "engine", engine,
                "host", host,
                "password", password,
                "sourceType", sourceType,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> account = Optional.empty();
 
        private String database;
 
        private Optional<? extends String> engine = Optional.empty();
 
        private Optional<? extends String> host = Optional.empty();
 
        private String password;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Firebolt account to login.
         */
        public Builder account(String account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        /**
         * Firebolt account to login.
         */
        public Builder account(Optional<? extends String> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        /**
         * The database to connect to.
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * Engine name or url to connect to.
         */
        public Builder engine(String engine) {
            Utils.checkNotNull(engine, "engine");
            this.engine = Optional.ofNullable(engine);
            return this;
        }

        /**
         * Engine name or url to connect to.
         */
        public Builder engine(Optional<? extends String> engine) {
            Utils.checkNotNull(engine, "engine");
            this.engine = engine;
            return this;
        }

        /**
         * The host name of your Firebolt database.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = Optional.ofNullable(host);
            return this;
        }

        /**
         * The host name of your Firebolt database.
         */
        public Builder host(Optional<? extends String> host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Firebolt password.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Firebolt email address you use to login.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceFirebolt build() {
            return new SourceFirebolt(
                account,
                database,
                engine,
                host,
                password,
                username);
        }

        private static final LazySingletonValue<Firebolt> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"firebolt\"",
                        new TypeReference<Firebolt>() {});
    }
}

