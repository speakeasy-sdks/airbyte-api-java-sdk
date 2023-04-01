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
 * SourceSalesforce - The values required to configure the source.
 */
public class SourceSalesforce {
    @JsonProperty("airbyte-source-name")
    public SourceSalesforceSalesforceEnum airbyteSourceName;
    public SourceSalesforce withAirbyteSourceName(SourceSalesforceSalesforceEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    public SourceSalesforceAuthTypeEnum authType;
    public SourceSalesforce withAuthType(SourceSalesforceAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client ID&lt;/a&gt;
     */
    @JsonProperty("client_id")
    public String clientId;
    public SourceSalesforce withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Enter your Salesforce developer application's &lt;a href="https://developer.salesforce.com/forums/?id=9062I000000DLgbQAG"&gt;Client secret&lt;/a&gt;
     */
    @JsonProperty("client_secret")
    public String clientSecret;
    public SourceSalesforce withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * Toggle if you're using a &lt;a href="https://help.salesforce.com/s/articleView?id=sf.deploy_sandboxes_parent.htm&amp;type=5"&gt;Salesforce Sandbox&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_sandbox")
    public Boolean isSandbox;
    public SourceSalesforce withIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
        return this;
    }
    
    /**
     * Enter your application's &lt;a href="https://developer.salesforce.com/docs/atlas.en-us.mobile_sdk.meta/mobile_sdk/oauth_refresh_token_flow.htm"&gt;Salesforce Refresh Token&lt;/a&gt; used for Airbyte to access your Salesforce account.
     */
    @JsonProperty("refresh_token")
    public String refreshToken;
    public SourceSalesforce withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    
    /**
     * Enter the date in the YYYY-MM-DD format. Airbyte will replicate the data added on and after this date. If this field is blank, Airbyte will replicate all data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceSalesforce withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    /**
     * Filter streams relevant to you
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streams_criteria")
    public SourceSalesforceStreamsCriteria[] streamsCriteria;
    public SourceSalesforce withStreamsCriteria(SourceSalesforceStreamsCriteria[] streamsCriteria) {
        this.streamsCriteria = streamsCriteria;
        return this;
    }
    
}
