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
 * SourceSlack - The values required to configure the source.
 */
public class SourceSlack {
    /**
     * A channel name list (without leading '#' char) which limit the channels from which you'd like to sync. Empty list means no filter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel_filter")
    public String[] channelFilter;
    public SourceSlack withChannelFilter(String[] channelFilter) {
        this.channelFilter = channelFilter;
        return this;
    }
    
    /**
     * Choose how to authenticate into Slack
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    public Object credentials;
    public SourceSlack withCredentials(Object credentials) {
        this.credentials = credentials;
        return this;
    }
    
    /**
     * Whether to join all channels or to sync data only from channels the bot is already in.  If false, you'll need to manually add the bot to all the channels from which you'd like to sync messages. 
     */
    @JsonProperty("join_channels")
    public Boolean joinChannels;
    public SourceSlack withJoinChannels(Boolean joinChannels) {
        this.joinChannels = joinChannels;
        return this;
    }
    
    /**
     * How far into the past to look for messages in threads.
     */
    @JsonProperty("lookback_window")
    public Long lookbackWindow;
    public SourceSlack withLookbackWindow(Long lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceSlackSlackEnum sourceType;
    public SourceSlack withSourceType(SourceSlackSlackEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;
    public SourceSlack withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    public SourceSlack(@JsonProperty("join_channels") Boolean joinChannels, @JsonProperty("lookback_window") Long lookbackWindow, @JsonProperty("sourceType") SourceSlackSlackEnum sourceType, @JsonProperty("start_date") OffsetDateTime startDate) {
        this.joinChannels = joinChannels;
        this.lookbackWindow = lookbackWindow;
        this.sourceType = sourceType;
        this.startDate = startDate;
  }
}
