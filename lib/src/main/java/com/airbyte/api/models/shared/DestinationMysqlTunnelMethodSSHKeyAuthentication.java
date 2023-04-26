/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMysqlTunnelMethodSSHKeyAuthentication - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
public class DestinationMysqlTunnelMethodSSHKeyAuthentication {
    /**
     * OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )
     */
    @JsonProperty("ssh_key")
    public String sshKey;
    public DestinationMysqlTunnelMethodSSHKeyAuthentication withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }
    
    /**
     * Hostname of the jump server host that allows inbound ssh tunnel.
     */
    @JsonProperty("tunnel_host")
    public String tunnelHost;
    public DestinationMysqlTunnelMethodSSHKeyAuthentication withTunnelHost(String tunnelHost) {
        this.tunnelHost = tunnelHost;
        return this;
    }
    
    /**
     * Connect through a jump server tunnel host using username and ssh key
     */
    @JsonProperty("tunnel_method")
    public DestinationMysqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum tunnelMethod;
    public DestinationMysqlTunnelMethodSSHKeyAuthentication withTunnelMethod(DestinationMysqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    /**
     * Port on the proxy/jump server that accepts inbound ssh connections.
     */
    @JsonProperty("tunnel_port")
    public Long tunnelPort;
    public DestinationMysqlTunnelMethodSSHKeyAuthentication withTunnelPort(Long tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }
    
    /**
     * OS-level username for logging into the jump server host.
     */
    @JsonProperty("tunnel_user")
    public String tunnelUser;
    public DestinationMysqlTunnelMethodSSHKeyAuthentication withTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
        return this;
    }
    
    public DestinationMysqlTunnelMethodSSHKeyAuthentication(@JsonProperty("ssh_key") String sshKey, @JsonProperty("tunnel_host") String tunnelHost, @JsonProperty("tunnel_method") DestinationMysqlTunnelMethodSSHKeyAuthenticationTunnelMethodEnum tunnelMethod, @JsonProperty("tunnel_port") Long tunnelPort, @JsonProperty("tunnel_user") String tunnelUser) {
        this.sshKey = sshKey;
        this.tunnelHost = tunnelHost;
        this.tunnelMethod = tunnelMethod;
        this.tunnelPort = tunnelPort;
        this.tunnelUser = tunnelUser;
  }
}
