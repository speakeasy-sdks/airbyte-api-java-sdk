/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthType {
    CLIENT("Client");

    @JsonValue
    public final String value;

    private SourceGoogleAnalyticsDataApiCredentialsAuthenticateViaGoogleOauthAuthType(String value) {
        this.value = value;
    }
}