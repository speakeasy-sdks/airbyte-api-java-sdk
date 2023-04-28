/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationAmazonSqs - The values required to configure the destination.
 */
public class DestinationAmazonSqs {
    /**
     * The Access Key ID of the AWS IAM Role to use for sending  messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key")
    public String accessKey;
    public DestinationAmazonSqs withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    @JsonProperty("destinationType")
    public DestinationAmazonSqsAmazonSqsEnum destinationType;
    public DestinationAmazonSqs withDestinationType(DestinationAmazonSqsAmazonSqsEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    
    /**
     * Use this property to extract the contents of the named key in the input record to use as the SQS message body. If not set, the entire content of the input record data is used as the message body.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_body_key")
    public String messageBodyKey;
    public DestinationAmazonSqs withMessageBodyKey(String messageBodyKey) {
        this.messageBodyKey = messageBodyKey;
        return this;
    }
    
    /**
     * Modify the Message Delay of the individual message from the Queue's default (seconds).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_delay")
    public Long messageDelay;
    public DestinationAmazonSqs withMessageDelay(Long messageDelay) {
        this.messageDelay = messageDelay;
        return this;
    }
    
    /**
     * The tag that specifies that a message belongs to a specific message group. This parameter applies only to, and is REQUIRED by, FIFO queues.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message_group_id")
    public String messageGroupId;
    public DestinationAmazonSqs withMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
        return this;
    }
    
    /**
     * URL of the SQS Queue
     */
    @JsonProperty("queue_url")
    public String queueUrl;
    public DestinationAmazonSqs withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    /**
     * AWS Region of the SQS Queue
     */
    @JsonProperty("region")
    public DestinationAmazonSqsAWSRegionEnum region;
    public DestinationAmazonSqs withRegion(DestinationAmazonSqsAWSRegionEnum region) {
        this.region = region;
        return this;
    }
    
    /**
     * The Secret Key of the AWS IAM Role to use for sending messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_key")
    public String secretKey;
    public DestinationAmazonSqs withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    
    public DestinationAmazonSqs(@JsonProperty("destinationType") DestinationAmazonSqsAmazonSqsEnum destinationType, @JsonProperty("queue_url") String queueUrl, @JsonProperty("region") DestinationAmazonSqsAWSRegionEnum region) {
        this.destinationType = destinationType;
        this.queueUrl = queueUrl;
        this.region = region;
  }
}
