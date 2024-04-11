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


public class SourceOutbrainAmplify {

    /**
     * Credentials for making authenticated requests requires either username/password or access_token.
     */
    @JsonProperty("credentials")
    private SourceOutbrainAmplifyAuthenticationMethod credentials;

    /**
     * Date in the format YYYY-MM-DD.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<? extends String> endDate;

    /**
     * The granularity used for geo location data in reports.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("geo_location_breakdown")
    private Optional<? extends GranularityForGeoLocationRegion> geoLocationBreakdown;

    /**
     * The granularity used for periodic data in reports. See &lt;a href="https://amplifyv01.docs.apiary.io/#reference/performance-reporting/periodic/retrieve-performance-statistics-for-all-marketer-campaigns-by-periodic-breakdown"&gt;the docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_granularity")
    private Optional<? extends GranularityForPeriodicReports> reportGranularity;

    @JsonProperty("sourceType")
    private OutbrainAmplify sourceType;

    /**
     * Date in the format YYYY-MM-DD eg. 2017-01-25. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private String startDate;

    public SourceOutbrainAmplify(
            @JsonProperty("credentials") SourceOutbrainAmplifyAuthenticationMethod credentials,
            @JsonProperty("end_date") Optional<? extends String> endDate,
            @JsonProperty("geo_location_breakdown") Optional<? extends GranularityForGeoLocationRegion> geoLocationBreakdown,
            @JsonProperty("report_granularity") Optional<? extends GranularityForPeriodicReports> reportGranularity,
            @JsonProperty("start_date") String startDate) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(geoLocationBreakdown, "geoLocationBreakdown");
        Utils.checkNotNull(reportGranularity, "reportGranularity");
        Utils.checkNotNull(startDate, "startDate");
        this.credentials = credentials;
        this.endDate = endDate;
        this.geoLocationBreakdown = geoLocationBreakdown;
        this.reportGranularity = reportGranularity;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Credentials for making authenticated requests requires either username/password or access_token.
     */
    public SourceOutbrainAmplifyAuthenticationMethod credentials() {
        return credentials;
    }

    /**
     * Date in the format YYYY-MM-DD.
     */
    public Optional<? extends String> endDate() {
        return endDate;
    }

    /**
     * The granularity used for geo location data in reports.
     */
    public Optional<? extends GranularityForGeoLocationRegion> geoLocationBreakdown() {
        return geoLocationBreakdown;
    }

    /**
     * The granularity used for periodic data in reports. See &lt;a href="https://amplifyv01.docs.apiary.io/#reference/performance-reporting/periodic/retrieve-performance-statistics-for-all-marketer-campaigns-by-periodic-breakdown"&gt;the docs&lt;/a&gt;.
     */
    public Optional<? extends GranularityForPeriodicReports> reportGranularity() {
        return reportGranularity;
    }

    public OutbrainAmplify sourceType() {
        return sourceType;
    }

    /**
     * Date in the format YYYY-MM-DD eg. 2017-01-25. Any data before this date will not be replicated.
     */
    public String startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Credentials for making authenticated requests requires either username/password or access_token.
     */
    public SourceOutbrainAmplify withCredentials(SourceOutbrainAmplifyAuthenticationMethod credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Date in the format YYYY-MM-DD.
     */
    public SourceOutbrainAmplify withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * Date in the format YYYY-MM-DD.
     */
    public SourceOutbrainAmplify withEndDate(Optional<? extends String> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * The granularity used for geo location data in reports.
     */
    public SourceOutbrainAmplify withGeoLocationBreakdown(GranularityForGeoLocationRegion geoLocationBreakdown) {
        Utils.checkNotNull(geoLocationBreakdown, "geoLocationBreakdown");
        this.geoLocationBreakdown = Optional.ofNullable(geoLocationBreakdown);
        return this;
    }

    /**
     * The granularity used for geo location data in reports.
     */
    public SourceOutbrainAmplify withGeoLocationBreakdown(Optional<? extends GranularityForGeoLocationRegion> geoLocationBreakdown) {
        Utils.checkNotNull(geoLocationBreakdown, "geoLocationBreakdown");
        this.geoLocationBreakdown = geoLocationBreakdown;
        return this;
    }

    /**
     * The granularity used for periodic data in reports. See &lt;a href="https://amplifyv01.docs.apiary.io/#reference/performance-reporting/periodic/retrieve-performance-statistics-for-all-marketer-campaigns-by-periodic-breakdown"&gt;the docs&lt;/a&gt;.
     */
    public SourceOutbrainAmplify withReportGranularity(GranularityForPeriodicReports reportGranularity) {
        Utils.checkNotNull(reportGranularity, "reportGranularity");
        this.reportGranularity = Optional.ofNullable(reportGranularity);
        return this;
    }

    /**
     * The granularity used for periodic data in reports. See &lt;a href="https://amplifyv01.docs.apiary.io/#reference/performance-reporting/periodic/retrieve-performance-statistics-for-all-marketer-campaigns-by-periodic-breakdown"&gt;the docs&lt;/a&gt;.
     */
    public SourceOutbrainAmplify withReportGranularity(Optional<? extends GranularityForPeriodicReports> reportGranularity) {
        Utils.checkNotNull(reportGranularity, "reportGranularity");
        this.reportGranularity = reportGranularity;
        return this;
    }

    /**
     * Date in the format YYYY-MM-DD eg. 2017-01-25. Any data before this date will not be replicated.
     */
    public SourceOutbrainAmplify withStartDate(String startDate) {
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
        SourceOutbrainAmplify other = (SourceOutbrainAmplify) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.endDate, other.endDate) &&
            java.util.Objects.deepEquals(this.geoLocationBreakdown, other.geoLocationBreakdown) &&
            java.util.Objects.deepEquals(this.reportGranularity, other.reportGranularity) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            endDate,
            geoLocationBreakdown,
            reportGranularity,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOutbrainAmplify.class,
                "credentials", credentials,
                "endDate", endDate,
                "geoLocationBreakdown", geoLocationBreakdown,
                "reportGranularity", reportGranularity,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private SourceOutbrainAmplifyAuthenticationMethod credentials;
 
        private Optional<? extends String> endDate = Optional.empty();
 
        private Optional<? extends GranularityForGeoLocationRegion> geoLocationBreakdown = Optional.empty();
 
        private Optional<? extends GranularityForPeriodicReports> reportGranularity = Optional.empty();
 
        private String startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Credentials for making authenticated requests requires either username/password or access_token.
         */
        public Builder credentials(SourceOutbrainAmplifyAuthenticationMethod credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Date in the format YYYY-MM-DD.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * Date in the format YYYY-MM-DD.
         */
        public Builder endDate(Optional<? extends String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * The granularity used for geo location data in reports.
         */
        public Builder geoLocationBreakdown(GranularityForGeoLocationRegion geoLocationBreakdown) {
            Utils.checkNotNull(geoLocationBreakdown, "geoLocationBreakdown");
            this.geoLocationBreakdown = Optional.ofNullable(geoLocationBreakdown);
            return this;
        }

        /**
         * The granularity used for geo location data in reports.
         */
        public Builder geoLocationBreakdown(Optional<? extends GranularityForGeoLocationRegion> geoLocationBreakdown) {
            Utils.checkNotNull(geoLocationBreakdown, "geoLocationBreakdown");
            this.geoLocationBreakdown = geoLocationBreakdown;
            return this;
        }

        /**
         * The granularity used for periodic data in reports. See &lt;a href="https://amplifyv01.docs.apiary.io/#reference/performance-reporting/periodic/retrieve-performance-statistics-for-all-marketer-campaigns-by-periodic-breakdown"&gt;the docs&lt;/a&gt;.
         */
        public Builder reportGranularity(GranularityForPeriodicReports reportGranularity) {
            Utils.checkNotNull(reportGranularity, "reportGranularity");
            this.reportGranularity = Optional.ofNullable(reportGranularity);
            return this;
        }

        /**
         * The granularity used for periodic data in reports. See &lt;a href="https://amplifyv01.docs.apiary.io/#reference/performance-reporting/periodic/retrieve-performance-statistics-for-all-marketer-campaigns-by-periodic-breakdown"&gt;the docs&lt;/a&gt;.
         */
        public Builder reportGranularity(Optional<? extends GranularityForPeriodicReports> reportGranularity) {
            Utils.checkNotNull(reportGranularity, "reportGranularity");
            this.reportGranularity = reportGranularity;
            return this;
        }

        /**
         * Date in the format YYYY-MM-DD eg. 2017-01-25. Any data before this date will not be replicated.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceOutbrainAmplify build() {
            return new SourceOutbrainAmplify(
                credentials,
                endDate,
                geoLocationBreakdown,
                reportGranularity,
                startDate);
        }

        private static final LazySingletonValue<OutbrainAmplify> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"outbrain-amplify\"",
                        new TypeReference<OutbrainAmplify>() {});
    }
}
