/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaker - The values required to configure the source.
 */
public class SourceFaker {
    @JsonProperty("airbyte-source-name")
    public SourceFakerFakerEnum airbyteSourceName;
    public SourceFaker withAirbyteSourceName(SourceFakerFakerEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * How many users should be generated in total.  This setting does not apply to the purchases or products stream.
     */
    @JsonProperty("count")
    public Long count;
    public SourceFaker withCount(Long count) {
        this.count = count;
        return this;
    }
    
    /**
     * How many parallel workers should we use to generate fake data?  Choose a value equal to the number of CPUs you will allocate to this source.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parallelism")
    public Long parallelism;
    public SourceFaker withParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    
    /**
     * How many fake records will be in each page (stream slice), before a state message is emitted?
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("records_per_slice")
    public Long recordsPerSlice;
    public SourceFaker withRecordsPerSlice(Long recordsPerSlice) {
        this.recordsPerSlice = recordsPerSlice;
        return this;
    }
    
    /**
     * How many fake records will be returned for each sync, for each stream?  By default, it will take 2 syncs to create the requested 1000 records.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("records_per_sync")
    public Long recordsPerSync;
    public SourceFaker withRecordsPerSync(Long recordsPerSync) {
        this.recordsPerSync = recordsPerSync;
        return this;
    }
    
    /**
     * Manually control the faker random seed to return the same values on subsequent runs (leave -1 for random)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("seed")
    public Long seed;
    public SourceFaker withSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    
}
