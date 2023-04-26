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
 * SourceGoogleSearchConsole - The values required to configure the source.
 */
public class SourceGoogleSearchConsole {
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public SourceGoogleSearchConsole withEndDate(LocalDate endDate) {
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
    
    @JsonProperty("sourceType")
    public SourceGoogleSearchConsoleGoogleSearchConsoleEnum sourceType;
    public SourceGoogleSearchConsole withSourceType(SourceGoogleSearchConsoleGoogleSearchConsoleEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date in the format 2017-01-25. Any data before this date will not be replicated.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceGoogleSearchConsole withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceGoogleSearchConsole(@JsonProperty("authorization") Object authorization, @JsonProperty("site_urls") String[] siteUrls, @JsonProperty("sourceType") SourceGoogleSearchConsoleGoogleSearchConsoleEnum sourceType, @JsonProperty("start_date") LocalDate startDate) {
        this.authorization = authorization;
        this.siteUrls = siteUrls;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
