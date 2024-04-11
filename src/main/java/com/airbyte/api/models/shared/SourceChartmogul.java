/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;


public class SourceChartmogul {

    /**
     * Your Chartmogul API key. See &lt;a href="https://help.chartmogul.com/hc/en-us/articles/4407796325906-Creating-and-Managing-API-keys#creating-an-api-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Chartmogul sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. When feasible, any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    public SourceChartmogul(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Your Chartmogul API key. See &lt;a href="https://help.chartmogul.com/hc/en-us/articles/4407796325906-Creating-and-Managing-API-keys#creating-an-api-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    public String apiKey() {
        return apiKey;
    }

    public Chartmogul sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. When feasible, any data before this date will not be replicated.
     */
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your Chartmogul API key. See &lt;a href="https://help.chartmogul.com/hc/en-us/articles/4407796325906-Creating-and-Managing-API-keys#creating-an-api-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
     */
    public SourceChartmogul withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. When feasible, any data before this date will not be replicated.
     */
    public SourceChartmogul withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceChartmogul other = (SourceChartmogul) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceChartmogul.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your Chartmogul API key. See &lt;a href="https://help.chartmogul.com/hc/en-us/articles/4407796325906-Creating-and-Managing-API-keys#creating-an-api-key"&gt; the docs &lt;/a&gt; for info on how to obtain this.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. When feasible, any data before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceChartmogul build() {
            return new SourceChartmogul(
                apiKey,
                startDate);
        }

        private static final LazySingletonValue<Chartmogul> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"chartmogul\"",
                        new TypeReference<Chartmogul>() {});
    }
}
