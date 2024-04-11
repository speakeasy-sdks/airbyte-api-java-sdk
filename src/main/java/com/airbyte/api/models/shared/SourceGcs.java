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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * SourceGcs - NOTE: When this Spec is changed, legacy_config_transformer.py must also be
 * modified to uptake the changes because it is responsible for converting
 * legacy GCS configs into file based configs using the File-Based CDK.
 */

public class SourceGcs {

    /**
     * Name of the GCS bucket where the file(s) exist.
     */
    @JsonProperty("bucket")
    private String bucket;

    /**
     * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
     */
    @JsonProperty("service_account")
    private String serviceAccount;

    @JsonProperty("sourceType")
    private SourceGcsGcs sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    /**
     * Each instance of this configuration defines a &lt;a href=https://docs.airbyte.com/cloud/core-concepts#stream&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    @JsonProperty("streams")
    private java.util.List<SourceGCSStreamConfig> streams;

    public SourceGcs(
            @JsonProperty("bucket") String bucket,
            @JsonProperty("service_account") String serviceAccount,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate,
            @JsonProperty("streams") java.util.List<SourceGCSStreamConfig> streams) {
        Utils.checkNotNull(bucket, "bucket");
        Utils.checkNotNull(serviceAccount, "serviceAccount");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(streams, "streams");
        this.bucket = bucket;
        this.serviceAccount = serviceAccount;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.streams = streams;
    }

    /**
     * Name of the GCS bucket where the file(s) exist.
     */
    public String bucket() {
        return bucket;
    }

    /**
     * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
     */
    public String serviceAccount() {
        return serviceAccount;
    }

    public SourceGcsGcs sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    public Optional<? extends OffsetDateTime> startDate() {
        return startDate;
    }

    /**
     * Each instance of this configuration defines a &lt;a href=https://docs.airbyte.com/cloud/core-concepts#stream&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    public java.util.List<SourceGCSStreamConfig> streams() {
        return streams;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the GCS bucket where the file(s) exist.
     */
    public SourceGcs withBucket(String bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = bucket;
        return this;
    }

    /**
     * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
     */
    public SourceGcs withServiceAccount(String serviceAccount) {
        Utils.checkNotNull(serviceAccount, "serviceAccount");
        this.serviceAccount = serviceAccount;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    public SourceGcs withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
     */
    public SourceGcs withStartDate(Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Each instance of this configuration defines a &lt;a href=https://docs.airbyte.com/cloud/core-concepts#stream&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
     */
    public SourceGcs withStreams(java.util.List<SourceGCSStreamConfig> streams) {
        Utils.checkNotNull(streams, "streams");
        this.streams = streams;
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
        SourceGcs other = (SourceGcs) o;
        return 
            java.util.Objects.deepEquals(this.bucket, other.bucket) &&
            java.util.Objects.deepEquals(this.serviceAccount, other.serviceAccount) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.streams, other.streams);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bucket,
            serviceAccount,
            sourceType,
            startDate,
            streams);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGcs.class,
                "bucket", bucket,
                "serviceAccount", serviceAccount,
                "sourceType", sourceType,
                "startDate", startDate,
                "streams", streams);
    }
    
    public final static class Builder {
 
        private String bucket;
 
        private String serviceAccount;
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();
 
        private java.util.List<SourceGCSStreamConfig> streams;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the GCS bucket where the file(s) exist.
         */
        public Builder bucket(String bucket) {
            Utils.checkNotNull(bucket, "bucket");
            this.bucket = bucket;
            return this;
        }

        /**
         * Enter your Google Cloud &lt;a href="https://cloud.google.com/iam/docs/creating-managing-service-account-keys#creating_service_account_keys"&gt;service account key&lt;/a&gt; in JSON format
         */
        public Builder serviceAccount(String serviceAccount) {
            Utils.checkNotNull(serviceAccount, "serviceAccount");
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00.000000Z. Any file modified before this date will not be replicated.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Each instance of this configuration defines a &lt;a href=https://docs.airbyte.com/cloud/core-concepts#stream&gt;stream&lt;/a&gt;. Use this to define which files belong in the stream, their format, and how they should be parsed and validated. When sending data to warehouse destination such as Snowflake or BigQuery, each stream is a separate table.
         */
        public Builder streams(java.util.List<SourceGCSStreamConfig> streams) {
            Utils.checkNotNull(streams, "streams");
            this.streams = streams;
            return this;
        }
        
        public SourceGcs build() {
            return new SourceGcs(
                bucket,
                serviceAccount,
                startDate,
                streams);
        }

        private static final LazySingletonValue<SourceGcsGcs> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"gcs\"",
                        new TypeReference<SourceGcsGcs>() {});
    }
}
