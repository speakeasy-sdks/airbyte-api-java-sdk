/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRedshiftTunnelMethodPasswordAuthentication - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */

public class DestinationRedshiftTunnelMethodPasswordAuthentication {
    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonProperty("tunnel_host")
    public String tunnelHost;

    public DestinationRedshiftTunnelMethodPasswordAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    /**
     * Connect through a jump server tunnel host using username and password authentication
     */
    @JsonProperty("tunnel_method")
    public DestinationRedshiftTunnelMethodPasswordAuthenticationTunnelMethod tunnelMethod;

    public DestinationRedshiftTunnelMethodPasswordAuthentication withTunnelMethod(DestinationRedshiftTunnelMethodPasswordAuthenticationTunnelMethod tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tunnel_port")
    public Long tunnelPort;

    public DestinationRedshiftTunnelMethodPasswordAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    /**
     * OS-level username for logging into the jump server host
     */
    @JsonProperty("tunnel_user")
    public String tunnelUser;

    public DestinationRedshiftTunnelMethodPasswordAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
    /**
     * OS-level password for logging into the jump server host
     */
    @JsonProperty("tunnel_user_password")
    public String tunnelUserPassword;

    public DestinationRedshiftTunnelMethodPasswordAuthentication withTunnelUserPassword(String tunnelUserPassword) {
        this.tunnelUserPassword = tunnelUserPassword;
        return this;
    }
    
    public DestinationRedshiftTunnelMethodPasswordAuthentication(@JsonProperty("tunnel_user") String tunnelUser, @JsonProperty("tunnel_user_password") String tunnelUserPassword, @JsonProperty("tunnel_host") String tunnelHost, @JsonProperty("tunnel_method") DestinationRedshiftTunnelMethodPasswordAuthenticationTunnelMethod tunnelMethod) {
        this.tunnelUser = tunnelUser;
        this.tunnelUserPassword = tunnelUserPassword;
        this.tunnelHost = tunnelHost;
        this.tunnelMethod = tunnelMethod;
  }
}
