/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceZendeskTalk - The values required to configure the source.
 */
public class SourceZendeskTalk {
    @JsonProperty("airbyte-source-name")
    public SourceZendeskTalkZendeskTalkEnum airbyteSourceName;
    public SourceZendeskTalk withAirbyteSourceName(SourceZendeskTalkZendeskTalkEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceZendeskTalk withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for Zendesk Talk API, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourceZendeskTalk withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * This is your Zendesk subdomain that can be found in your account URL. For example, in https://{MY_SUBDOMAIN}.zendesk.com/, where MY_SUBDOMAIN is the value of your subdomain.
     */
    @JsonProperty("subdomain")
    public String subdomain;
    public SourceZendeskTalk withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }
    
}
