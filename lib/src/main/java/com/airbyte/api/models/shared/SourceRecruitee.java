/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceRecruitee - The values required to configure the source.
 */
public class SourceRecruitee {
    /**
     * Recruitee API Key. See &lt;a href="https://docs.recruitee.com/reference/getting-started#generate-api-token"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    public String apiKey;

    public SourceRecruitee withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * Recruitee Company ID. You can also find this ID on the &lt;a href="https://app.recruitee.com/#/settings/api_tokens"&gt;Recruitee API tokens page&lt;/a&gt;.
     */
    @JsonProperty("company_id")
    public Long companyId;

    public SourceRecruitee withCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceRecruiteeRecruitee sourceType;

    public SourceRecruitee withSourceType(SourceRecruiteeRecruitee sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    public SourceRecruitee(@JsonProperty("api_key") String apiKey, @JsonProperty("company_id") Long companyId, @JsonProperty("sourceType") SourceRecruiteeRecruitee sourceType) {
        this.apiKey = apiKey;
        this.companyId = companyId;
        this.sourceType = sourceType;
  }
}
