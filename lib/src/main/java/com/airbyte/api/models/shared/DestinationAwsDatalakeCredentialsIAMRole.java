/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAwsDatalakeCredentialsIAMRole - Choose How to Authenticate to AWS.
 */
public class DestinationAwsDatalakeCredentialsIAMRole {
    /**
     * Name of the credentials
     */
    @JsonProperty("credentials_title")
    public DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitleEnum credentialsTitle;
    public DestinationAwsDatalakeCredentialsIAMRole withCredentialsTitle(DestinationAwsDatalakeCredentialsIAMRoleCredentialsTitleEnum credentialsTitle) {
        this.credentialsTitle = credentialsTitle;
        return this;
    }
    
    /**
     * Will assume this role to write data to s3
     */
    @JsonProperty("role_arn")
    public String roleArn;
    public DestinationAwsDatalakeCredentialsIAMRole withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    
}