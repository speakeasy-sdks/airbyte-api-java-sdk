/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationMariadbColumnstoreTunnelMethodNoTunnel - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
public class DestinationMariadbColumnstoreTunnelMethodNoTunnel {
    /**
     * No ssh tunnel needed to connect to database
     */
    @JsonProperty("tunnel_method")
    public DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethod tunnelMethod;

    public DestinationMariadbColumnstoreTunnelMethodNoTunnel withTunnelMethod(DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethod tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
        return this;
    }
    
    public DestinationMariadbColumnstoreTunnelMethodNoTunnel(@JsonProperty("tunnel_method") DestinationMariadbColumnstoreTunnelMethodNoTunnelTunnelMethod tunnelMethod) {
        this.tunnelMethod = tunnelMethod;
  }
}
