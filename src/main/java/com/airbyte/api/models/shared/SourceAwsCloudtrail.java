/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;


public class SourceAwsCloudtrail {

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("aws_key_id")
    private String awsKeyId;

    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    @JsonProperty("aws_region_name")
    private String awsRegionName;

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("aws_secret_key")
    private String awsSecretKey;

    @JsonProperty("sourceType")
    private AwsCloudtrail sourceType;

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends LocalDate> startDate;

    public SourceAwsCloudtrail(
            @JsonProperty("aws_key_id") String awsKeyId,
            @JsonProperty("aws_region_name") String awsRegionName,
            @JsonProperty("aws_secret_key") String awsSecretKey,
            @JsonProperty("start_date") Optional<? extends LocalDate> startDate) {
        Utils.checkNotNull(awsKeyId, "awsKeyId");
        Utils.checkNotNull(awsRegionName, "awsRegionName");
        Utils.checkNotNull(awsSecretKey, "awsSecretKey");
        Utils.checkNotNull(startDate, "startDate");
        this.awsKeyId = awsKeyId;
        this.awsRegionName = awsRegionName;
        this.awsSecretKey = awsSecretKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public String awsKeyId() {
        return awsKeyId;
    }

    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    public String awsRegionName() {
        return awsRegionName;
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public String awsSecretKey() {
        return awsSecretKey;
    }

    public AwsCloudtrail sourceType() {
        return sourceType;
    }

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    public Optional<? extends LocalDate> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceAwsCloudtrail withAwsKeyId(String awsKeyId) {
        Utils.checkNotNull(awsKeyId, "awsKeyId");
        this.awsKeyId = awsKeyId;
        return this;
    }

    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    public SourceAwsCloudtrail withAwsRegionName(String awsRegionName) {
        Utils.checkNotNull(awsRegionName, "awsRegionName");
        this.awsRegionName = awsRegionName;
        return this;
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceAwsCloudtrail withAwsSecretKey(String awsSecretKey) {
        Utils.checkNotNull(awsSecretKey, "awsSecretKey");
        this.awsSecretKey = awsSecretKey;
        return this;
    }

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    public SourceAwsCloudtrail withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    public SourceAwsCloudtrail withStartDate(Optional<? extends LocalDate> startDate) {
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
        SourceAwsCloudtrail other = (SourceAwsCloudtrail) o;
        return 
            java.util.Objects.deepEquals(this.awsKeyId, other.awsKeyId) &&
            java.util.Objects.deepEquals(this.awsRegionName, other.awsRegionName) &&
            java.util.Objects.deepEquals(this.awsSecretKey, other.awsSecretKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            awsKeyId,
            awsRegionName,
            awsSecretKey,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAwsCloudtrail.class,
                "awsKeyId", awsKeyId,
                "awsRegionName", awsRegionName,
                "awsSecretKey", awsSecretKey,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String awsKeyId;
 
        private String awsRegionName;
 
        private String awsSecretKey;
 
        private Optional<? extends LocalDate> startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder awsKeyId(String awsKeyId) {
            Utils.checkNotNull(awsKeyId, "awsKeyId");
            this.awsKeyId = awsKeyId;
            return this;
        }

        /**
         * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
         */
        public Builder awsRegionName(String awsRegionName) {
            Utils.checkNotNull(awsRegionName, "awsRegionName");
            this.awsRegionName = awsRegionName;
            return this;
        }

        /**
         * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder awsSecretKey(String awsSecretKey) {
            Utils.checkNotNull(awsSecretKey, "awsSecretKey");
            this.awsSecretKey = awsSecretKey;
            return this;
        }

        /**
         * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
         */
        public Builder startDate(Optional<? extends LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceAwsCloudtrail build() {
            if (startDate == null) {
                startDate = _SINGLETON_VALUE_StartDate.value();
            }
            return new SourceAwsCloudtrail(
                awsKeyId,
                awsRegionName,
                awsSecretKey,
                startDate);
        }

        private static final LazySingletonValue<AwsCloudtrail> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"aws-cloudtrail\"",
                        new TypeReference<AwsCloudtrail>() {});

        private static final LazySingletonValue<Optional<? extends LocalDate>> _SINGLETON_VALUE_StartDate =
                new LazySingletonValue<>(
                        "start_date",
                        "\"1970-01-01\"",
                        new TypeReference<Optional<? extends LocalDate>>() {});
    }
}
