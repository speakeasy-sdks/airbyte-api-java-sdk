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
 * SourceFacebookMarketing - The values required to configure the source.
 */

public class SourceFacebookMarketing {
    /**
     * The value of the generated access token. From your App’s Dashboard, click on "Marketing API" then "Tools". Select permissions &lt;b&gt;ads_management, ads_read, read_insights, business_management&lt;/b&gt;. Then click on "Get token". See the &lt;a href="https://docs.airbyte.com/integrations/sources/facebook-marketing"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    public String accessToken;

    public SourceFacebookMarketing withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * The Facebook Ad account ID to use when pulling data from the Facebook Marketing API. Open your Meta Ads Manager. The Ad account ID number is in the account dropdown menu or in your browser's address bar. See the &lt;a href="https://www.facebook.com/business/help/1492627900875762"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("account_id")
    public String accountId;

    public SourceFacebookMarketing withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    /**
     * Allows action_breakdowns to be an empty list
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action_breakdowns_allow_empty")
    public Boolean actionBreakdownsAllowEmpty;

    public SourceFacebookMarketing withActionBreakdownsAllowEmpty(Boolean actionBreakdownsAllowEmpty) {
        this.actionBreakdownsAllowEmpty = actionBreakdownsAllowEmpty;
        return this;
    }
    
    /**
     * A list which contains ad statistics entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns. Click on "add" to fill this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_insights")
    public SourceFacebookMarketingInsightConfig[] customInsights;

    public SourceFacebookMarketing withCustomInsights(SourceFacebookMarketingInsightConfig[] customInsights) {
        this.customInsights = customInsights;
        return this;
    }
    
    /**
     * The date until which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated between the start date and this end date will be replicated. Not setting this option will result in always syncing the latest data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_date")
    public OffsetDateTime endDate;

    public SourceFacebookMarketing withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
    
    /**
     * Set to active if you want to fetch the thumbnail_url and store the result in thumbnail_data_url for each Ad Creative.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fetch_thumbnail_images")
    public Boolean fetchThumbnailImages;

    public SourceFacebookMarketing withFetchThumbnailImages(Boolean fetchThumbnailImages) {
        this.fetchThumbnailImages = fetchThumbnailImages;
        return this;
    }
    
    /**
     * Set to active if you want to include data from deleted Campaigns, Ads, and AdSets.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_deleted")
    public Boolean includeDeleted;

    public SourceFacebookMarketing withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    
    /**
     * The attribution window. Facebook freezes insight data 28 days after it was generated, which means that all data from the past 28 days may have changed since we last emitted it, so you can retrieve refreshed insights from the past by setting this parameter. If you set a custom lookback window value in Facebook account, please provide the same value here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("insights_lookback_window")
    public Long insightsLookbackWindow;

    public SourceFacebookMarketing withInsightsLookbackWindow(Long insightsLookbackWindow) {
        this.insightsLookbackWindow = insightsLookbackWindow;
        return this;
    }
    
    /**
     * Maximum batch size used when sending batch requests to Facebook API. Most users do not need to set this field unless they specifically need to tune the connector to address specific issues or use cases.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_batch_size")
    public Long maxBatchSize;

    public SourceFacebookMarketing withMaxBatchSize(Long maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
        return this;
    }
    
    /**
     * Page size used when sending requests to Facebook API to specify number of records per page when response has pagination. Most users do not need to set this field unless they specifically need to tune the connector to address specific issues or use cases.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size")
    public Long pageSize;

    public SourceFacebookMarketing withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceFacebookMarketingFacebookMarketing sourceType;

    public SourceFacebookMarketing withSourceType(SourceFacebookMarketingFacebookMarketing sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date from which you'd like to replicate data for all incremental streams, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public SourceFacebookMarketing withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceFacebookMarketing(@JsonProperty("access_token") String accessToken, @JsonProperty("account_id") String accountId, @JsonProperty("sourceType") SourceFacebookMarketingFacebookMarketing sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.accessToken = accessToken;
        this.accountId = accountId;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
