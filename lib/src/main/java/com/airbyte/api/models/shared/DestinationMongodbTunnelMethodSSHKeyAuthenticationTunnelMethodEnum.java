/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum - Connect through a jump server tunnel host using username and ssh key
 */
public enum DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum {
    SSH_KEY_AUTH("SSH_KEY_AUTH");

    @JsonValue
    public final String value;

    private DestinationMongodbTunnelMethodSSHKeyAuthenticationTunnelMethodEnum(String value) {
        this.value = value;
    }
}