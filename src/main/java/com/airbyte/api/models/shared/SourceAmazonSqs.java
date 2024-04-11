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
import java.util.Optional;


public class SourceAmazonSqs {

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key")
    private Optional<? extends String> accessKey;

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributes_to_return")
    private Optional<? extends String> attributesToReturn;

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delete_messages")
    private Optional<? extends Boolean> deleteMessages;

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_batch_size")
    private Optional<? extends Long> maxBatchSize;

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_wait_time")
    private Optional<? extends Long> maxWaitTime;

    /**
     * URL of the SQS Queue
     */
    @JsonProperty("queue_url")
    private String queueUrl;

    /**
     * AWS Region of the SQS Queue
     */
    @JsonProperty("region")
    private SourceAmazonSqsAWSRegion region;

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_key")
    private Optional<? extends String> secretKey;

    @JsonProperty("sourceType")
    private AmazonSqs sourceType;

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("visibility_timeout")
    private Optional<? extends Long> visibilityTimeout;

    public SourceAmazonSqs(
            @JsonProperty("access_key") Optional<? extends String> accessKey,
            @JsonProperty("attributes_to_return") Optional<? extends String> attributesToReturn,
            @JsonProperty("delete_messages") Optional<? extends Boolean> deleteMessages,
            @JsonProperty("max_batch_size") Optional<? extends Long> maxBatchSize,
            @JsonProperty("max_wait_time") Optional<? extends Long> maxWaitTime,
            @JsonProperty("queue_url") String queueUrl,
            @JsonProperty("region") SourceAmazonSqsAWSRegion region,
            @JsonProperty("secret_key") Optional<? extends String> secretKey,
            @JsonProperty("visibility_timeout") Optional<? extends Long> visibilityTimeout) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(attributesToReturn, "attributesToReturn");
        Utils.checkNotNull(deleteMessages, "deleteMessages");
        Utils.checkNotNull(maxBatchSize, "maxBatchSize");
        Utils.checkNotNull(maxWaitTime, "maxWaitTime");
        Utils.checkNotNull(queueUrl, "queueUrl");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(secretKey, "secretKey");
        Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
        this.accessKey = accessKey;
        this.attributesToReturn = attributesToReturn;
        this.deleteMessages = deleteMessages;
        this.maxBatchSize = maxBatchSize;
        this.maxWaitTime = maxWaitTime;
        this.queueUrl = queueUrl;
        this.region = region;
        this.secretKey = secretKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    public Optional<? extends String> accessKey() {
        return accessKey;
    }

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    public Optional<? extends String> attributesToReturn() {
        return attributesToReturn;
    }

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    public Optional<? extends Boolean> deleteMessages() {
        return deleteMessages;
    }

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    public Optional<? extends Long> maxBatchSize() {
        return maxBatchSize;
    }

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    public Optional<? extends Long> maxWaitTime() {
        return maxWaitTime;
    }

    /**
     * URL of the SQS Queue
     */
    public String queueUrl() {
        return queueUrl;
    }

    /**
     * AWS Region of the SQS Queue
     */
    public SourceAmazonSqsAWSRegion region() {
        return region;
    }

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    public Optional<? extends String> secretKey() {
        return secretKey;
    }

    public AmazonSqs sourceType() {
        return sourceType;
    }

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    public Optional<? extends Long> visibilityTimeout() {
        return visibilityTimeout;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = Optional.ofNullable(accessKey);
        return this;
    }

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withAccessKey(Optional<? extends String> accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    public SourceAmazonSqs withAttributesToReturn(String attributesToReturn) {
        Utils.checkNotNull(attributesToReturn, "attributesToReturn");
        this.attributesToReturn = Optional.ofNullable(attributesToReturn);
        return this;
    }

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    public SourceAmazonSqs withAttributesToReturn(Optional<? extends String> attributesToReturn) {
        Utils.checkNotNull(attributesToReturn, "attributesToReturn");
        this.attributesToReturn = attributesToReturn;
        return this;
    }

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    public SourceAmazonSqs withDeleteMessages(boolean deleteMessages) {
        Utils.checkNotNull(deleteMessages, "deleteMessages");
        this.deleteMessages = Optional.ofNullable(deleteMessages);
        return this;
    }

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    public SourceAmazonSqs withDeleteMessages(Optional<? extends Boolean> deleteMessages) {
        Utils.checkNotNull(deleteMessages, "deleteMessages");
        this.deleteMessages = deleteMessages;
        return this;
    }

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    public SourceAmazonSqs withMaxBatchSize(long maxBatchSize) {
        Utils.checkNotNull(maxBatchSize, "maxBatchSize");
        this.maxBatchSize = Optional.ofNullable(maxBatchSize);
        return this;
    }

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    public SourceAmazonSqs withMaxBatchSize(Optional<? extends Long> maxBatchSize) {
        Utils.checkNotNull(maxBatchSize, "maxBatchSize");
        this.maxBatchSize = maxBatchSize;
        return this;
    }

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    public SourceAmazonSqs withMaxWaitTime(long maxWaitTime) {
        Utils.checkNotNull(maxWaitTime, "maxWaitTime");
        this.maxWaitTime = Optional.ofNullable(maxWaitTime);
        return this;
    }

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    public SourceAmazonSqs withMaxWaitTime(Optional<? extends Long> maxWaitTime) {
        Utils.checkNotNull(maxWaitTime, "maxWaitTime");
        this.maxWaitTime = maxWaitTime;
        return this;
    }

    /**
     * URL of the SQS Queue
     */
    public SourceAmazonSqs withQueueUrl(String queueUrl) {
        Utils.checkNotNull(queueUrl, "queueUrl");
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * AWS Region of the SQS Queue
     */
    public SourceAmazonSqs withRegion(SourceAmazonSqsAWSRegion region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withSecretKey(String secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = Optional.ofNullable(secretKey);
        return this;
    }

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withSecretKey(Optional<? extends String> secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    public SourceAmazonSqs withVisibilityTimeout(long visibilityTimeout) {
        Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
        this.visibilityTimeout = Optional.ofNullable(visibilityTimeout);
        return this;
    }

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    public SourceAmazonSqs withVisibilityTimeout(Optional<? extends Long> visibilityTimeout) {
        Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
        this.visibilityTimeout = visibilityTimeout;
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
        SourceAmazonSqs other = (SourceAmazonSqs) o;
        return 
            java.util.Objects.deepEquals(this.accessKey, other.accessKey) &&
            java.util.Objects.deepEquals(this.attributesToReturn, other.attributesToReturn) &&
            java.util.Objects.deepEquals(this.deleteMessages, other.deleteMessages) &&
            java.util.Objects.deepEquals(this.maxBatchSize, other.maxBatchSize) &&
            java.util.Objects.deepEquals(this.maxWaitTime, other.maxWaitTime) &&
            java.util.Objects.deepEquals(this.queueUrl, other.queueUrl) &&
            java.util.Objects.deepEquals(this.region, other.region) &&
            java.util.Objects.deepEquals(this.secretKey, other.secretKey) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.visibilityTimeout, other.visibilityTimeout);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessKey,
            attributesToReturn,
            deleteMessages,
            maxBatchSize,
            maxWaitTime,
            queueUrl,
            region,
            secretKey,
            sourceType,
            visibilityTimeout);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAmazonSqs.class,
                "accessKey", accessKey,
                "attributesToReturn", attributesToReturn,
                "deleteMessages", deleteMessages,
                "maxBatchSize", maxBatchSize,
                "maxWaitTime", maxWaitTime,
                "queueUrl", queueUrl,
                "region", region,
                "secretKey", secretKey,
                "sourceType", sourceType,
                "visibilityTimeout", visibilityTimeout);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> accessKey = Optional.empty();
 
        private Optional<? extends String> attributesToReturn = Optional.empty();
 
        private Optional<? extends Boolean> deleteMessages;
 
        private Optional<? extends Long> maxBatchSize = Optional.empty();
 
        private Optional<? extends Long> maxWaitTime = Optional.empty();
 
        private String queueUrl;
 
        private SourceAmazonSqsAWSRegion region;
 
        private Optional<? extends String> secretKey = Optional.empty();
 
        private Optional<? extends Long> visibilityTimeout = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Access Key ID of the AWS IAM Role to use for pulling messages
         */
        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = Optional.ofNullable(accessKey);
            return this;
        }

        /**
         * The Access Key ID of the AWS IAM Role to use for pulling messages
         */
        public Builder accessKey(Optional<? extends String> accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Comma separated list of Mesage Attribute names to return
         */
        public Builder attributesToReturn(String attributesToReturn) {
            Utils.checkNotNull(attributesToReturn, "attributesToReturn");
            this.attributesToReturn = Optional.ofNullable(attributesToReturn);
            return this;
        }

        /**
         * Comma separated list of Mesage Attribute names to return
         */
        public Builder attributesToReturn(Optional<? extends String> attributesToReturn) {
            Utils.checkNotNull(attributesToReturn, "attributesToReturn");
            this.attributesToReturn = attributesToReturn;
            return this;
        }

        /**
         * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
         */
        public Builder deleteMessages(boolean deleteMessages) {
            Utils.checkNotNull(deleteMessages, "deleteMessages");
            this.deleteMessages = Optional.ofNullable(deleteMessages);
            return this;
        }

        /**
         * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
         */
        public Builder deleteMessages(Optional<? extends Boolean> deleteMessages) {
            Utils.checkNotNull(deleteMessages, "deleteMessages");
            this.deleteMessages = deleteMessages;
            return this;
        }

        /**
         * Max amount of messages to get in one batch (10 max)
         */
        public Builder maxBatchSize(long maxBatchSize) {
            Utils.checkNotNull(maxBatchSize, "maxBatchSize");
            this.maxBatchSize = Optional.ofNullable(maxBatchSize);
            return this;
        }

        /**
         * Max amount of messages to get in one batch (10 max)
         */
        public Builder maxBatchSize(Optional<? extends Long> maxBatchSize) {
            Utils.checkNotNull(maxBatchSize, "maxBatchSize");
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        /**
         * Max amount of time in seconds to wait for messages in a single poll (20 max)
         */
        public Builder maxWaitTime(long maxWaitTime) {
            Utils.checkNotNull(maxWaitTime, "maxWaitTime");
            this.maxWaitTime = Optional.ofNullable(maxWaitTime);
            return this;
        }

        /**
         * Max amount of time in seconds to wait for messages in a single poll (20 max)
         */
        public Builder maxWaitTime(Optional<? extends Long> maxWaitTime) {
            Utils.checkNotNull(maxWaitTime, "maxWaitTime");
            this.maxWaitTime = maxWaitTime;
            return this;
        }

        /**
         * URL of the SQS Queue
         */
        public Builder queueUrl(String queueUrl) {
            Utils.checkNotNull(queueUrl, "queueUrl");
            this.queueUrl = queueUrl;
            return this;
        }

        /**
         * AWS Region of the SQS Queue
         */
        public Builder region(SourceAmazonSqsAWSRegion region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * The Secret Key of the AWS IAM Role to use for pulling messages
         */
        public Builder secretKey(String secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = Optional.ofNullable(secretKey);
            return this;
        }

        /**
         * The Secret Key of the AWS IAM Role to use for pulling messages
         */
        public Builder secretKey(Optional<? extends String> secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
         */
        public Builder visibilityTimeout(long visibilityTimeout) {
            Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
            this.visibilityTimeout = Optional.ofNullable(visibilityTimeout);
            return this;
        }

        /**
         * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
         */
        public Builder visibilityTimeout(Optional<? extends Long> visibilityTimeout) {
            Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }
        
        public SourceAmazonSqs build() {
            if (deleteMessages == null) {
                deleteMessages = _SINGLETON_VALUE_DeleteMessages.value();
            }
            return new SourceAmazonSqs(
                accessKey,
                attributesToReturn,
                deleteMessages,
                maxBatchSize,
                maxWaitTime,
                queueUrl,
                region,
                secretKey,
                visibilityTimeout);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DeleteMessages =
                new LazySingletonValue<>(
                        "delete_messages",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<AmazonSqs> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"amazon-sqs\"",
                        new TypeReference<AmazonSqs>() {});
    }
}
