/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceSonarCloud - The values required to configure the source.
 */
public class SourceSonarCloud {
    /**
     * Comma-separated list of component keys.
     */
    @JsonProperty("component_keys")
    public Object[] componentKeys;
    public SourceSonarCloud withComponentKeys(Object[] componentKeys) {
        this.componentKeys = componentKeys;
        return this;
    }
    
    /**
     * To retrieve issues created before the given date (inclusive).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourceSonarCloud withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * Organization key. See &lt;a href="https://docs.sonarcloud.io/appendices/project-information/#project-and-organization-keys"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("organization")
    public String organization;
    public SourceSonarCloud withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSonarCloudSonarCloudEnum sourceType;
    public SourceSonarCloud withSourceType(SourceSonarCloudSonarCloudEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * To retrieve issues created after the given date (inclusive).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceSonarCloud withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Your User Token. See &lt;a href="https://docs.sonarcloud.io/advanced-setup/user-accounts/"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    @JsonProperty("user_token")
    public String userToken;
    public SourceSonarCloud withUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
    
    public SourceSonarCloud(@JsonProperty("component_keys") Object[] componentKeys, @JsonProperty("organization") String organization, @JsonProperty("sourceType") SourceSonarCloudSonarCloudEnum sourceType, @JsonProperty("user_token") String userToken) {
        this.componentKeys = componentKeys;
        this.organization = organization;
        this.sourceType = sourceType;
        this.userToken = userToken;
  }
}
