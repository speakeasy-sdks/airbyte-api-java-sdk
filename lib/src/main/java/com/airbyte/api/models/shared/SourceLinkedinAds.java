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
 * SourceLinkedinAds - The values required to configure the source.
 */
public class SourceLinkedinAds {
    /**
     * Specify the account IDs separated by a space, to pull the data from. Leave empty, if you want to pull the data from all associated accounts. See the &lt;a href="https://www.linkedin.com/help/linkedin/answer/a424270/find-linkedin-ads-account-details?lang=en"&gt;LinkedIn Ads docs&lt;/a&gt; for more info.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_ids")
    public Long[] accountIds;
    public SourceLinkedinAds withAccountIds(Long[] accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceLinkedinAds withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceLinkedinAdsLinkedinAdsEnum sourceType;
    public SourceLinkedinAds withSourceType(SourceLinkedinAdsLinkedinAdsEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date in the format 2020-09-17. Any data before this date will not be replicated.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceLinkedinAds withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceLinkedinAds(@JsonProperty("sourceType") SourceLinkedinAdsLinkedinAdsEnum sourceType, @JsonProperty("start_date") LocalDate startDate) {
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
