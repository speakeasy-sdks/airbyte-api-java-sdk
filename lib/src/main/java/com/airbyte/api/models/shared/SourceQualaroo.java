/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceQualaroo - The values required to configure the source.
 */
public class SourceQualaroo {
    @JsonProperty("airbyte-source-name")
    public SourceQualarooQualarooEnum airbyteSourceName;
    public SourceQualaroo withAirbyteSourceName(SourceQualarooQualarooEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("key")
    public String key;
    public SourceQualaroo withKey(String key) {
        this.key = key;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourceQualaroo withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * IDs of the surveys from which you'd like to replicate data. If left empty, data from all surveys to which you have access will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("survey_ids")
    public String[] surveyIds;
    public SourceQualaroo withSurveyIds(String[] surveyIds) {
        this.surveyIds = surveyIds;
        return this;
    }
    
    /**
     * A Qualaroo token. See the &lt;a href="https://help.qualaroo.com/hc/en-us/articles/201969438-The-REST-Reporting-API"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("token")
    public String token;
    public SourceQualaroo withToken(String token) {
        this.token = token;
        return this;
    }
    
}
