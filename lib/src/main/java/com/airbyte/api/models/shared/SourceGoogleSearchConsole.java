/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGoogleSearchConsole - The values required to configure the source.
 */
public class SourceGoogleSearchConsole {
    @JsonProperty("airbyte-source-name")
    public SourceGoogleSearchConsoleGoogleSearchConsoleEnum airbyteSourceName;
    public SourceGoogleSearchConsole withAirbyteSourceName(SourceGoogleSearchConsoleGoogleSearchConsoleEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonProperty("authorization")
    public Object authorization;
    public SourceGoogleSearchConsole withAuthorization(Object authorization) {
        this.authorization = authorization;
        return this;
    }
    
    /**
     * A JSON array describing the custom reports you want to sync from Google Search Console. See &lt;a href="https://docs.airbyte.com/integrations/sources/google-search-console#step-2-set-up-the-google-search-console-connector-in-airbyte"&gt;the docs&lt;/a&gt; for more information about the exact format you can use to fill out this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports")
    public String customReports;
    public SourceGoogleSearchConsole withCustomReports(String customReports) {
        this.customReports = customReports;
        return this;
    }
    
    /**
     * UTC date in the format 2017-01-25. Any data after this date will not be replicated. Must be greater or equal to the start date field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    public String endDate;
    public SourceGoogleSearchConsole withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * The URLs of the website property attached to your GSC account. Read more &lt;a href="https://support.google.com/webmasters/answer/34592?hl=en"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("site_urls")
    public String[] siteUrls;
    public SourceGoogleSearchConsole withSiteUrls(String[] siteUrls) {
        this.siteUrls = siteUrls;
        return this;
    }
    
    /**
     * UTC date in the format 2017-01-25. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    public String startDate;
    public SourceGoogleSearchConsole withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
