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


public class DestinationMysql {

    /**
     * Name of the database.
     */
    @JsonProperty("database")
    private String database;

    @JsonProperty("destinationType")
    private Mysql destinationType;

    /**
     * Hostname of the database.
     */
    @JsonProperty("host")
    private String host;

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("jdbc_url_params")
    private Optional<? extends String> jdbcUrlParams;

    /**
     * Password associated with the username.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * Port of the database.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("port")
    private Optional<? extends Long> port;

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_method")
    private Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod;

    /**
     * Username to use to access the database.
     */
    @JsonProperty("username")
    private String username;

    public DestinationMysql(
            @JsonProperty("database") String database,
            @JsonProperty("host") String host,
            @JsonProperty("jdbc_url_params") Optional<? extends String> jdbcUrlParams,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("port") Optional<? extends Long> port,
            @JsonProperty("tunnel_method") Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        Utils.checkNotNull(username, "username");
        this.database = database;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.host = host;
        this.jdbcUrlParams = jdbcUrlParams;
        this.password = password;
        this.port = port;
        this.tunnelMethod = tunnelMethod;
        this.username = username;
    }

    /**
     * Name of the database.
     */
    public String database() {
        return database;
    }

    public Mysql destinationType() {
        return destinationType;
    }

    /**
     * Hostname of the database.
     */
    public String host() {
        return host;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public Optional<? extends String> jdbcUrlParams() {
        return jdbcUrlParams;
    }

    /**
     * Password associated with the username.
     */
    public Optional<? extends String> password() {
        return password;
    }

    /**
     * Port of the database.
     */
    public Optional<? extends Long> port() {
        return port;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod() {
        return tunnelMethod;
    }

    /**
     * Username to use to access the database.
     */
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the database.
     */
    public DestinationMysql withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    /**
     * Hostname of the database.
     */
    public DestinationMysql withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationMysql withJdbcUrlParams(String jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
        return this;
    }

    /**
     * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
     */
    public DestinationMysql withJdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
        Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
        this.jdbcUrlParams = jdbcUrlParams;
        return this;
    }

    /**
     * Password associated with the username.
     */
    public DestinationMysql withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Password associated with the username.
     */
    public DestinationMysql withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Port of the database.
     */
    public DestinationMysql withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = Optional.ofNullable(port);
        return this;
    }

    /**
     * Port of the database.
     */
    public DestinationMysql withPort(Optional<? extends Long> port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationMysql withTunnelMethod(DestinationMysqlSSHTunnelMethod tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = Optional.ofNullable(tunnelMethod);
        return this;
    }

    /**
     * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
     */
    public DestinationMysql withTunnelMethod(Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod) {
        Utils.checkNotNull(tunnelMethod, "tunnelMethod");
        this.tunnelMethod = tunnelMethod;
        return this;
    }

    /**
     * Username to use to access the database.
     */
    public DestinationMysql withUsername(String username) {
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
        DestinationMysql other = (DestinationMysql) o;
        return 
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.jdbcUrlParams, other.jdbcUrlParams) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.tunnelMethod, other.tunnelMethod) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            database,
            destinationType,
            host,
            jdbcUrlParams,
            password,
            port,
            tunnelMethod,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMysql.class,
                "database", database,
                "destinationType", destinationType,
                "host", host,
                "jdbcUrlParams", jdbcUrlParams,
                "password", password,
                "port", port,
                "tunnelMethod", tunnelMethod,
                "username", username);
    }
    
    public final static class Builder {
 
        private String database;
 
        private String host;
 
        private Optional<? extends String> jdbcUrlParams = Optional.empty();
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Long> port;
 
        private Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the database.
         */
        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        /**
         * Hostname of the database.
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
         */
        public Builder jdbcUrlParams(String jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = Optional.ofNullable(jdbcUrlParams);
            return this;
        }

        /**
         * Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&amp;'. (example: key1=value1&amp;key2=value2&amp;key3=value3).
         */
        public Builder jdbcUrlParams(Optional<? extends String> jdbcUrlParams) {
            Utils.checkNotNull(jdbcUrlParams, "jdbcUrlParams");
            this.jdbcUrlParams = jdbcUrlParams;
            return this;
        }

        /**
         * Password associated with the username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Password associated with the username.
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Port of the database.
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = Optional.ofNullable(port);
            return this;
        }

        /**
         * Port of the database.
         */
        public Builder port(Optional<? extends Long> port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(DestinationMysqlSSHTunnelMethod tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = Optional.ofNullable(tunnelMethod);
            return this;
        }

        /**
         * Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
         */
        public Builder tunnelMethod(Optional<? extends DestinationMysqlSSHTunnelMethod> tunnelMethod) {
            Utils.checkNotNull(tunnelMethod, "tunnelMethod");
            this.tunnelMethod = tunnelMethod;
            return this;
        }

        /**
         * Username to use to access the database.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public DestinationMysql build() {
            if (port == null) {
                port = _SINGLETON_VALUE_Port.value();
            }
            return new DestinationMysql(
                database,
                host,
                jdbcUrlParams,
                password,
                port,
                tunnelMethod,
                username);
        }

        private static final LazySingletonValue<Mysql> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"mysql\"",
                        new TypeReference<Mysql>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Port =
                new LazySingletonValue<>(
                        "port",
                        "3306",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

