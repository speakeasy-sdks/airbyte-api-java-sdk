/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.DateTimeDeserializer;
import com.airbyte.api.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * SourceGithub - The values required to configure the source.
 */

public class SourceGithub {
    /**
     * Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    public String branch;

    public SourceGithub withBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    /**
     * Choose how to authenticate to GitHub
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;

    public SourceGithub withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
     */
    @JsonProperty("repository")
    public String repository;

    public SourceGithub withRepository(String repository) {
        this.repository = repository;
        return this;
    }
    
    /**
     * The GitHub API allows for a maximum of 5000 requests per hour (15000 for Github Enterprise). You can specify a lower value to limit your use of the API quota.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requests_per_hour")
    public Long requestsPerHour;

    public SourceGithub withRequestsPerHour(Long requestsPerHour) {
        this.requestsPerHour = requestsPerHour;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceGithubGithub sourceType;

    public SourceGithub withSourceType(SourceGithubGithub sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceGithub withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceGithub(@JsonProperty("repository") String repository, @JsonProperty("sourceType") SourceGithubGithub sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.repository = repository;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
