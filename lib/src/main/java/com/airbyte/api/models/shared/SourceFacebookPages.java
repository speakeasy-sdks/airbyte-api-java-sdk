/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFacebookPages - The values required to configure the source.
 */
public class SourceFacebookPages {
    /**
     * Facebook Page Access Token
     */
    @JsonProperty("access_token")
    public String accessToken;
    public SourceFacebookPages withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    /**
     * Page ID
     */
    @JsonProperty("page_id")
    public String pageId;
    public SourceFacebookPages withPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceFacebookPagesFacebookPagesEnum sourceType;
    public SourceFacebookPages withSourceType(SourceFacebookPagesFacebookPagesEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
}