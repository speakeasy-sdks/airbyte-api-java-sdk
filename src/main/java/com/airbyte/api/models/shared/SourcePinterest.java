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
import org.openapitools.jackson.nullable.JsonNullable;


public class SourcePinterest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends OAuth20> credentials;

    /**
     * A list which contains ad statistics entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns. Click on "add" to fill this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_reports")
    private Optional<? extends java.util.List<ReportConfig>> customReports;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceType")
    private Optional<? extends SourcePinterestPinterest> sourceType;

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (89 days from today).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends LocalDate> startDate;

    /**
     * For the ads, ad_groups, and campaigns streams, specifying a status will filter out records that do not match the specified ones. If a status is not specified, the source will default to records with a status of either ACTIVE or PAUSED.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends java.util.List<Status>> status;

    public SourcePinterest(
            @JsonProperty("credentials") Optional<? extends OAuth20> credentials,
            @JsonProperty("custom_reports") Optional<? extends java.util.List<ReportConfig>> customReports,
            @JsonProperty("start_date") Optional<? extends LocalDate> startDate,
            @JsonProperty("status") JsonNullable<? extends java.util.List<Status>> status) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(customReports, "customReports");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(status, "status");
        this.credentials = credentials;
        this.customReports = customReports;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.status = status;
    }

    public Optional<? extends OAuth20> credentials() {
        return credentials;
    }

    /**
     * A list which contains ad statistics entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns. Click on "add" to fill this field.
     */
    public Optional<? extends java.util.List<ReportConfig>> customReports() {
        return customReports;
    }

    public Optional<? extends SourcePinterestPinterest> sourceType() {
        return sourceType;
    }

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (89 days from today).
     */
    public Optional<? extends LocalDate> startDate() {
        return startDate;
    }

    /**
     * For the ads, ad_groups, and campaigns streams, specifying a status will filter out records that do not match the specified ones. If a status is not specified, the source will default to records with a status of either ACTIVE or PAUSED.
     */
    public JsonNullable<? extends java.util.List<Status>> status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourcePinterest withCredentials(OAuth20 credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public SourcePinterest withCredentials(Optional<? extends OAuth20> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * A list which contains ad statistics entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns. Click on "add" to fill this field.
     */
    public SourcePinterest withCustomReports(java.util.List<ReportConfig> customReports) {
        Utils.checkNotNull(customReports, "customReports");
        this.customReports = Optional.ofNullable(customReports);
        return this;
    }

    /**
     * A list which contains ad statistics entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns. Click on "add" to fill this field.
     */
    public SourcePinterest withCustomReports(Optional<? extends java.util.List<ReportConfig>> customReports) {
        Utils.checkNotNull(customReports, "customReports");
        this.customReports = customReports;
        return this;
    }

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (89 days from today).
     */
    public SourcePinterest withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (89 days from today).
     */
    public SourcePinterest withStartDate(Optional<? extends LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * For the ads, ad_groups, and campaigns streams, specifying a status will filter out records that do not match the specified ones. If a status is not specified, the source will default to records with a status of either ACTIVE or PAUSED.
     */
    public SourcePinterest withStatus(java.util.List<Status> status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * For the ads, ad_groups, and campaigns streams, specifying a status will filter out records that do not match the specified ones. If a status is not specified, the source will default to records with a status of either ACTIVE or PAUSED.
     */
    public SourcePinterest withStatus(JsonNullable<? extends java.util.List<Status>> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        SourcePinterest other = (SourcePinterest) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.customReports, other.customReports) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials,
            customReports,
            sourceType,
            startDate,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePinterest.class,
                "credentials", credentials,
                "customReports", customReports,
                "sourceType", sourceType,
                "startDate", startDate,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends OAuth20> credentials = Optional.empty();
 
        private Optional<? extends java.util.List<ReportConfig>> customReports = Optional.empty();
 
        private Optional<? extends LocalDate> startDate = Optional.empty();
 
        private JsonNullable<? extends java.util.List<Status>> status = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(OAuth20 credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends OAuth20> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * A list which contains ad statistics entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns. Click on "add" to fill this field.
         */
        public Builder customReports(java.util.List<ReportConfig> customReports) {
            Utils.checkNotNull(customReports, "customReports");
            this.customReports = Optional.ofNullable(customReports);
            return this;
        }

        /**
         * A list which contains ad statistics entries, each entry must have a name and can contains fields, breakdowns or action_breakdowns. Click on "add" to fill this field.
         */
        public Builder customReports(Optional<? extends java.util.List<ReportConfig>> customReports) {
            Utils.checkNotNull(customReports, "customReports");
            this.customReports = customReports;
            return this;
        }

        /**
         * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (89 days from today).
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (89 days from today).
         */
        public Builder startDate(Optional<? extends LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * For the ads, ad_groups, and campaigns streams, specifying a status will filter out records that do not match the specified ones. If a status is not specified, the source will default to records with a status of either ACTIVE or PAUSED.
         */
        public Builder status(java.util.List<Status> status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * For the ads, ad_groups, and campaigns streams, specifying a status will filter out records that do not match the specified ones. If a status is not specified, the source will default to records with a status of either ACTIVE or PAUSED.
         */
        public Builder status(JsonNullable<? extends java.util.List<Status>> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public SourcePinterest build() {
            return new SourcePinterest(
                credentials,
                customReports,
                startDate,
                status);
        }

        private static final LazySingletonValue<Optional<? extends SourcePinterestPinterest>> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"pinterest\"",
                        new TypeReference<Optional<? extends SourcePinterestPinterest>>() {});
    }
}
