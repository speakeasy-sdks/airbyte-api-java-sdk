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


public class SourceGoogleDriveCSVFormat {

    /**
     * The character delimiting individual cells in the CSV data. This may only be a 1-character string. For tab-delimited data enter '\t'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delimiter")
    private Optional<? extends String> delimiter;

    /**
     * Whether two quotes in a quoted CSV value denote a single quote in the data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("double_quote")
    private Optional<? extends Boolean> doubleQuote;

    /**
     * The character encoding of the CSV data. Leave blank to default to &lt;strong&gt;UTF8&lt;/strong&gt;. See &lt;a href="https://docs.python.org/3/library/codecs.html#standard-encodings" target="_blank"&gt;list of python encodings&lt;/a&gt; for allowable options.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("encoding")
    private Optional<? extends String> encoding;

    /**
     * The character used for escaping special characters. To disallow escaping, leave this field blank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("escape_char")
    private Optional<? extends String> escapeChar;

    /**
     * A set of case-sensitive strings that should be interpreted as false values.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("false_values")
    private Optional<? extends java.util.List<String>> falseValues;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filetype")
    private Optional<? extends SourceGoogleDriveSchemasFiletype> filetype;

    /**
     * How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("header_definition")
    private Optional<? extends SourceGoogleDriveCSVHeaderDefinition> headerDefinition;

    /**
     * A set of case-sensitive strings that should be interpreted as null values. For example, if the value 'NA' should be interpreted as null, enter 'NA' in this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("null_values")
    private Optional<? extends java.util.List<String>> nullValues;

    /**
     * The character used for quoting CSV values. To disallow quoting, make this field blank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quote_char")
    private Optional<? extends String> quoteChar;

    /**
     * The number of rows to skip after the header row.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skip_rows_after_header")
    private Optional<? extends Long> skipRowsAfterHeader;

    /**
     * The number of rows to skip before the header row. For example, if the header row is on the 3rd row, enter 2 in this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skip_rows_before_header")
    private Optional<? extends Long> skipRowsBeforeHeader;

    /**
     * Whether strings can be interpreted as null values. If true, strings that match the null_values set will be interpreted as null. If false, strings that match the null_values set will be interpreted as the string itself.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("strings_can_be_null")
    private Optional<? extends Boolean> stringsCanBeNull;

    /**
     * A set of case-sensitive strings that should be interpreted as true values.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("true_values")
    private Optional<? extends java.util.List<String>> trueValues;

    public SourceGoogleDriveCSVFormat(
            @JsonProperty("delimiter") Optional<? extends String> delimiter,
            @JsonProperty("double_quote") Optional<? extends Boolean> doubleQuote,
            @JsonProperty("encoding") Optional<? extends String> encoding,
            @JsonProperty("escape_char") Optional<? extends String> escapeChar,
            @JsonProperty("false_values") Optional<? extends java.util.List<String>> falseValues,
            @JsonProperty("header_definition") Optional<? extends SourceGoogleDriveCSVHeaderDefinition> headerDefinition,
            @JsonProperty("null_values") Optional<? extends java.util.List<String>> nullValues,
            @JsonProperty("quote_char") Optional<? extends String> quoteChar,
            @JsonProperty("skip_rows_after_header") Optional<? extends Long> skipRowsAfterHeader,
            @JsonProperty("skip_rows_before_header") Optional<? extends Long> skipRowsBeforeHeader,
            @JsonProperty("strings_can_be_null") Optional<? extends Boolean> stringsCanBeNull,
            @JsonProperty("true_values") Optional<? extends java.util.List<String>> trueValues) {
        Utils.checkNotNull(delimiter, "delimiter");
        Utils.checkNotNull(doubleQuote, "doubleQuote");
        Utils.checkNotNull(encoding, "encoding");
        Utils.checkNotNull(escapeChar, "escapeChar");
        Utils.checkNotNull(falseValues, "falseValues");
        Utils.checkNotNull(headerDefinition, "headerDefinition");
        Utils.checkNotNull(nullValues, "nullValues");
        Utils.checkNotNull(quoteChar, "quoteChar");
        Utils.checkNotNull(skipRowsAfterHeader, "skipRowsAfterHeader");
        Utils.checkNotNull(skipRowsBeforeHeader, "skipRowsBeforeHeader");
        Utils.checkNotNull(stringsCanBeNull, "stringsCanBeNull");
        Utils.checkNotNull(trueValues, "trueValues");
        this.delimiter = delimiter;
        this.doubleQuote = doubleQuote;
        this.encoding = encoding;
        this.escapeChar = escapeChar;
        this.falseValues = falseValues;
        this.filetype = Builder._SINGLETON_VALUE_Filetype.value();
        this.headerDefinition = headerDefinition;
        this.nullValues = nullValues;
        this.quoteChar = quoteChar;
        this.skipRowsAfterHeader = skipRowsAfterHeader;
        this.skipRowsBeforeHeader = skipRowsBeforeHeader;
        this.stringsCanBeNull = stringsCanBeNull;
        this.trueValues = trueValues;
    }

    /**
     * The character delimiting individual cells in the CSV data. This may only be a 1-character string. For tab-delimited data enter '\t'.
     */
    public Optional<? extends String> delimiter() {
        return delimiter;
    }

    /**
     * Whether two quotes in a quoted CSV value denote a single quote in the data.
     */
    public Optional<? extends Boolean> doubleQuote() {
        return doubleQuote;
    }

    /**
     * The character encoding of the CSV data. Leave blank to default to &lt;strong&gt;UTF8&lt;/strong&gt;. See &lt;a href="https://docs.python.org/3/library/codecs.html#standard-encodings" target="_blank"&gt;list of python encodings&lt;/a&gt; for allowable options.
     */
    public Optional<? extends String> encoding() {
        return encoding;
    }

    /**
     * The character used for escaping special characters. To disallow escaping, leave this field blank.
     */
    public Optional<? extends String> escapeChar() {
        return escapeChar;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as false values.
     */
    public Optional<? extends java.util.List<String>> falseValues() {
        return falseValues;
    }

    public Optional<? extends SourceGoogleDriveSchemasFiletype> filetype() {
        return filetype;
    }

    /**
     * How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
     */
    public Optional<? extends SourceGoogleDriveCSVHeaderDefinition> headerDefinition() {
        return headerDefinition;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as null values. For example, if the value 'NA' should be interpreted as null, enter 'NA' in this field.
     */
    public Optional<? extends java.util.List<String>> nullValues() {
        return nullValues;
    }

    /**
     * The character used for quoting CSV values. To disallow quoting, make this field blank.
     */
    public Optional<? extends String> quoteChar() {
        return quoteChar;
    }

    /**
     * The number of rows to skip after the header row.
     */
    public Optional<? extends Long> skipRowsAfterHeader() {
        return skipRowsAfterHeader;
    }

    /**
     * The number of rows to skip before the header row. For example, if the header row is on the 3rd row, enter 2 in this field.
     */
    public Optional<? extends Long> skipRowsBeforeHeader() {
        return skipRowsBeforeHeader;
    }

    /**
     * Whether strings can be interpreted as null values. If true, strings that match the null_values set will be interpreted as null. If false, strings that match the null_values set will be interpreted as the string itself.
     */
    public Optional<? extends Boolean> stringsCanBeNull() {
        return stringsCanBeNull;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as true values.
     */
    public Optional<? extends java.util.List<String>> trueValues() {
        return trueValues;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The character delimiting individual cells in the CSV data. This may only be a 1-character string. For tab-delimited data enter '\t'.
     */
    public SourceGoogleDriveCSVFormat withDelimiter(String delimiter) {
        Utils.checkNotNull(delimiter, "delimiter");
        this.delimiter = Optional.ofNullable(delimiter);
        return this;
    }

    /**
     * The character delimiting individual cells in the CSV data. This may only be a 1-character string. For tab-delimited data enter '\t'.
     */
    public SourceGoogleDriveCSVFormat withDelimiter(Optional<? extends String> delimiter) {
        Utils.checkNotNull(delimiter, "delimiter");
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Whether two quotes in a quoted CSV value denote a single quote in the data.
     */
    public SourceGoogleDriveCSVFormat withDoubleQuote(boolean doubleQuote) {
        Utils.checkNotNull(doubleQuote, "doubleQuote");
        this.doubleQuote = Optional.ofNullable(doubleQuote);
        return this;
    }

    /**
     * Whether two quotes in a quoted CSV value denote a single quote in the data.
     */
    public SourceGoogleDriveCSVFormat withDoubleQuote(Optional<? extends Boolean> doubleQuote) {
        Utils.checkNotNull(doubleQuote, "doubleQuote");
        this.doubleQuote = doubleQuote;
        return this;
    }

    /**
     * The character encoding of the CSV data. Leave blank to default to &lt;strong&gt;UTF8&lt;/strong&gt;. See &lt;a href="https://docs.python.org/3/library/codecs.html#standard-encodings" target="_blank"&gt;list of python encodings&lt;/a&gt; for allowable options.
     */
    public SourceGoogleDriveCSVFormat withEncoding(String encoding) {
        Utils.checkNotNull(encoding, "encoding");
        this.encoding = Optional.ofNullable(encoding);
        return this;
    }

    /**
     * The character encoding of the CSV data. Leave blank to default to &lt;strong&gt;UTF8&lt;/strong&gt;. See &lt;a href="https://docs.python.org/3/library/codecs.html#standard-encodings" target="_blank"&gt;list of python encodings&lt;/a&gt; for allowable options.
     */
    public SourceGoogleDriveCSVFormat withEncoding(Optional<? extends String> encoding) {
        Utils.checkNotNull(encoding, "encoding");
        this.encoding = encoding;
        return this;
    }

    /**
     * The character used for escaping special characters. To disallow escaping, leave this field blank.
     */
    public SourceGoogleDriveCSVFormat withEscapeChar(String escapeChar) {
        Utils.checkNotNull(escapeChar, "escapeChar");
        this.escapeChar = Optional.ofNullable(escapeChar);
        return this;
    }

    /**
     * The character used for escaping special characters. To disallow escaping, leave this field blank.
     */
    public SourceGoogleDriveCSVFormat withEscapeChar(Optional<? extends String> escapeChar) {
        Utils.checkNotNull(escapeChar, "escapeChar");
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as false values.
     */
    public SourceGoogleDriveCSVFormat withFalseValues(java.util.List<String> falseValues) {
        Utils.checkNotNull(falseValues, "falseValues");
        this.falseValues = Optional.ofNullable(falseValues);
        return this;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as false values.
     */
    public SourceGoogleDriveCSVFormat withFalseValues(Optional<? extends java.util.List<String>> falseValues) {
        Utils.checkNotNull(falseValues, "falseValues");
        this.falseValues = falseValues;
        return this;
    }

    /**
     * How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
     */
    public SourceGoogleDriveCSVFormat withHeaderDefinition(SourceGoogleDriveCSVHeaderDefinition headerDefinition) {
        Utils.checkNotNull(headerDefinition, "headerDefinition");
        this.headerDefinition = Optional.ofNullable(headerDefinition);
        return this;
    }

    /**
     * How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
     */
    public SourceGoogleDriveCSVFormat withHeaderDefinition(Optional<? extends SourceGoogleDriveCSVHeaderDefinition> headerDefinition) {
        Utils.checkNotNull(headerDefinition, "headerDefinition");
        this.headerDefinition = headerDefinition;
        return this;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as null values. For example, if the value 'NA' should be interpreted as null, enter 'NA' in this field.
     */
    public SourceGoogleDriveCSVFormat withNullValues(java.util.List<String> nullValues) {
        Utils.checkNotNull(nullValues, "nullValues");
        this.nullValues = Optional.ofNullable(nullValues);
        return this;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as null values. For example, if the value 'NA' should be interpreted as null, enter 'NA' in this field.
     */
    public SourceGoogleDriveCSVFormat withNullValues(Optional<? extends java.util.List<String>> nullValues) {
        Utils.checkNotNull(nullValues, "nullValues");
        this.nullValues = nullValues;
        return this;
    }

    /**
     * The character used for quoting CSV values. To disallow quoting, make this field blank.
     */
    public SourceGoogleDriveCSVFormat withQuoteChar(String quoteChar) {
        Utils.checkNotNull(quoteChar, "quoteChar");
        this.quoteChar = Optional.ofNullable(quoteChar);
        return this;
    }

    /**
     * The character used for quoting CSV values. To disallow quoting, make this field blank.
     */
    public SourceGoogleDriveCSVFormat withQuoteChar(Optional<? extends String> quoteChar) {
        Utils.checkNotNull(quoteChar, "quoteChar");
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * The number of rows to skip after the header row.
     */
    public SourceGoogleDriveCSVFormat withSkipRowsAfterHeader(long skipRowsAfterHeader) {
        Utils.checkNotNull(skipRowsAfterHeader, "skipRowsAfterHeader");
        this.skipRowsAfterHeader = Optional.ofNullable(skipRowsAfterHeader);
        return this;
    }

    /**
     * The number of rows to skip after the header row.
     */
    public SourceGoogleDriveCSVFormat withSkipRowsAfterHeader(Optional<? extends Long> skipRowsAfterHeader) {
        Utils.checkNotNull(skipRowsAfterHeader, "skipRowsAfterHeader");
        this.skipRowsAfterHeader = skipRowsAfterHeader;
        return this;
    }

    /**
     * The number of rows to skip before the header row. For example, if the header row is on the 3rd row, enter 2 in this field.
     */
    public SourceGoogleDriveCSVFormat withSkipRowsBeforeHeader(long skipRowsBeforeHeader) {
        Utils.checkNotNull(skipRowsBeforeHeader, "skipRowsBeforeHeader");
        this.skipRowsBeforeHeader = Optional.ofNullable(skipRowsBeforeHeader);
        return this;
    }

    /**
     * The number of rows to skip before the header row. For example, if the header row is on the 3rd row, enter 2 in this field.
     */
    public SourceGoogleDriveCSVFormat withSkipRowsBeforeHeader(Optional<? extends Long> skipRowsBeforeHeader) {
        Utils.checkNotNull(skipRowsBeforeHeader, "skipRowsBeforeHeader");
        this.skipRowsBeforeHeader = skipRowsBeforeHeader;
        return this;
    }

    /**
     * Whether strings can be interpreted as null values. If true, strings that match the null_values set will be interpreted as null. If false, strings that match the null_values set will be interpreted as the string itself.
     */
    public SourceGoogleDriveCSVFormat withStringsCanBeNull(boolean stringsCanBeNull) {
        Utils.checkNotNull(stringsCanBeNull, "stringsCanBeNull");
        this.stringsCanBeNull = Optional.ofNullable(stringsCanBeNull);
        return this;
    }

    /**
     * Whether strings can be interpreted as null values. If true, strings that match the null_values set will be interpreted as null. If false, strings that match the null_values set will be interpreted as the string itself.
     */
    public SourceGoogleDriveCSVFormat withStringsCanBeNull(Optional<? extends Boolean> stringsCanBeNull) {
        Utils.checkNotNull(stringsCanBeNull, "stringsCanBeNull");
        this.stringsCanBeNull = stringsCanBeNull;
        return this;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as true values.
     */
    public SourceGoogleDriveCSVFormat withTrueValues(java.util.List<String> trueValues) {
        Utils.checkNotNull(trueValues, "trueValues");
        this.trueValues = Optional.ofNullable(trueValues);
        return this;
    }

    /**
     * A set of case-sensitive strings that should be interpreted as true values.
     */
    public SourceGoogleDriveCSVFormat withTrueValues(Optional<? extends java.util.List<String>> trueValues) {
        Utils.checkNotNull(trueValues, "trueValues");
        this.trueValues = trueValues;
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
        SourceGoogleDriveCSVFormat other = (SourceGoogleDriveCSVFormat) o;
        return 
            java.util.Objects.deepEquals(this.delimiter, other.delimiter) &&
            java.util.Objects.deepEquals(this.doubleQuote, other.doubleQuote) &&
            java.util.Objects.deepEquals(this.encoding, other.encoding) &&
            java.util.Objects.deepEquals(this.escapeChar, other.escapeChar) &&
            java.util.Objects.deepEquals(this.falseValues, other.falseValues) &&
            java.util.Objects.deepEquals(this.filetype, other.filetype) &&
            java.util.Objects.deepEquals(this.headerDefinition, other.headerDefinition) &&
            java.util.Objects.deepEquals(this.nullValues, other.nullValues) &&
            java.util.Objects.deepEquals(this.quoteChar, other.quoteChar) &&
            java.util.Objects.deepEquals(this.skipRowsAfterHeader, other.skipRowsAfterHeader) &&
            java.util.Objects.deepEquals(this.skipRowsBeforeHeader, other.skipRowsBeforeHeader) &&
            java.util.Objects.deepEquals(this.stringsCanBeNull, other.stringsCanBeNull) &&
            java.util.Objects.deepEquals(this.trueValues, other.trueValues);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            delimiter,
            doubleQuote,
            encoding,
            escapeChar,
            falseValues,
            filetype,
            headerDefinition,
            nullValues,
            quoteChar,
            skipRowsAfterHeader,
            skipRowsBeforeHeader,
            stringsCanBeNull,
            trueValues);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleDriveCSVFormat.class,
                "delimiter", delimiter,
                "doubleQuote", doubleQuote,
                "encoding", encoding,
                "escapeChar", escapeChar,
                "falseValues", falseValues,
                "filetype", filetype,
                "headerDefinition", headerDefinition,
                "nullValues", nullValues,
                "quoteChar", quoteChar,
                "skipRowsAfterHeader", skipRowsAfterHeader,
                "skipRowsBeforeHeader", skipRowsBeforeHeader,
                "stringsCanBeNull", stringsCanBeNull,
                "trueValues", trueValues);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> delimiter;
 
        private Optional<? extends Boolean> doubleQuote;
 
        private Optional<? extends String> encoding;
 
        private Optional<? extends String> escapeChar = Optional.empty();
 
        private Optional<? extends java.util.List<String>> falseValues = Optional.empty();
 
        private Optional<? extends SourceGoogleDriveCSVHeaderDefinition> headerDefinition = Optional.empty();
 
        private Optional<? extends java.util.List<String>> nullValues = Optional.empty();
 
        private Optional<? extends String> quoteChar;
 
        private Optional<? extends Long> skipRowsAfterHeader;
 
        private Optional<? extends Long> skipRowsBeforeHeader;
 
        private Optional<? extends Boolean> stringsCanBeNull;
 
        private Optional<? extends java.util.List<String>> trueValues = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The character delimiting individual cells in the CSV data. This may only be a 1-character string. For tab-delimited data enter '\t'.
         */
        public Builder delimiter(String delimiter) {
            Utils.checkNotNull(delimiter, "delimiter");
            this.delimiter = Optional.ofNullable(delimiter);
            return this;
        }

        /**
         * The character delimiting individual cells in the CSV data. This may only be a 1-character string. For tab-delimited data enter '\t'.
         */
        public Builder delimiter(Optional<? extends String> delimiter) {
            Utils.checkNotNull(delimiter, "delimiter");
            this.delimiter = delimiter;
            return this;
        }

        /**
         * Whether two quotes in a quoted CSV value denote a single quote in the data.
         */
        public Builder doubleQuote(boolean doubleQuote) {
            Utils.checkNotNull(doubleQuote, "doubleQuote");
            this.doubleQuote = Optional.ofNullable(doubleQuote);
            return this;
        }

        /**
         * Whether two quotes in a quoted CSV value denote a single quote in the data.
         */
        public Builder doubleQuote(Optional<? extends Boolean> doubleQuote) {
            Utils.checkNotNull(doubleQuote, "doubleQuote");
            this.doubleQuote = doubleQuote;
            return this;
        }

        /**
         * The character encoding of the CSV data. Leave blank to default to &lt;strong&gt;UTF8&lt;/strong&gt;. See &lt;a href="https://docs.python.org/3/library/codecs.html#standard-encodings" target="_blank"&gt;list of python encodings&lt;/a&gt; for allowable options.
         */
        public Builder encoding(String encoding) {
            Utils.checkNotNull(encoding, "encoding");
            this.encoding = Optional.ofNullable(encoding);
            return this;
        }

        /**
         * The character encoding of the CSV data. Leave blank to default to &lt;strong&gt;UTF8&lt;/strong&gt;. See &lt;a href="https://docs.python.org/3/library/codecs.html#standard-encodings" target="_blank"&gt;list of python encodings&lt;/a&gt; for allowable options.
         */
        public Builder encoding(Optional<? extends String> encoding) {
            Utils.checkNotNull(encoding, "encoding");
            this.encoding = encoding;
            return this;
        }

        /**
         * The character used for escaping special characters. To disallow escaping, leave this field blank.
         */
        public Builder escapeChar(String escapeChar) {
            Utils.checkNotNull(escapeChar, "escapeChar");
            this.escapeChar = Optional.ofNullable(escapeChar);
            return this;
        }

        /**
         * The character used for escaping special characters. To disallow escaping, leave this field blank.
         */
        public Builder escapeChar(Optional<? extends String> escapeChar) {
            Utils.checkNotNull(escapeChar, "escapeChar");
            this.escapeChar = escapeChar;
            return this;
        }

        /**
         * A set of case-sensitive strings that should be interpreted as false values.
         */
        public Builder falseValues(java.util.List<String> falseValues) {
            Utils.checkNotNull(falseValues, "falseValues");
            this.falseValues = Optional.ofNullable(falseValues);
            return this;
        }

        /**
         * A set of case-sensitive strings that should be interpreted as false values.
         */
        public Builder falseValues(Optional<? extends java.util.List<String>> falseValues) {
            Utils.checkNotNull(falseValues, "falseValues");
            this.falseValues = falseValues;
            return this;
        }

        /**
         * How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
         */
        public Builder headerDefinition(SourceGoogleDriveCSVHeaderDefinition headerDefinition) {
            Utils.checkNotNull(headerDefinition, "headerDefinition");
            this.headerDefinition = Optional.ofNullable(headerDefinition);
            return this;
        }

        /**
         * How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
         */
        public Builder headerDefinition(Optional<? extends SourceGoogleDriveCSVHeaderDefinition> headerDefinition) {
            Utils.checkNotNull(headerDefinition, "headerDefinition");
            this.headerDefinition = headerDefinition;
            return this;
        }

        /**
         * A set of case-sensitive strings that should be interpreted as null values. For example, if the value 'NA' should be interpreted as null, enter 'NA' in this field.
         */
        public Builder nullValues(java.util.List<String> nullValues) {
            Utils.checkNotNull(nullValues, "nullValues");
            this.nullValues = Optional.ofNullable(nullValues);
            return this;
        }

        /**
         * A set of case-sensitive strings that should be interpreted as null values. For example, if the value 'NA' should be interpreted as null, enter 'NA' in this field.
         */
        public Builder nullValues(Optional<? extends java.util.List<String>> nullValues) {
            Utils.checkNotNull(nullValues, "nullValues");
            this.nullValues = nullValues;
            return this;
        }

        /**
         * The character used for quoting CSV values. To disallow quoting, make this field blank.
         */
        public Builder quoteChar(String quoteChar) {
            Utils.checkNotNull(quoteChar, "quoteChar");
            this.quoteChar = Optional.ofNullable(quoteChar);
            return this;
        }

        /**
         * The character used for quoting CSV values. To disallow quoting, make this field blank.
         */
        public Builder quoteChar(Optional<? extends String> quoteChar) {
            Utils.checkNotNull(quoteChar, "quoteChar");
            this.quoteChar = quoteChar;
            return this;
        }

        /**
         * The number of rows to skip after the header row.
         */
        public Builder skipRowsAfterHeader(long skipRowsAfterHeader) {
            Utils.checkNotNull(skipRowsAfterHeader, "skipRowsAfterHeader");
            this.skipRowsAfterHeader = Optional.ofNullable(skipRowsAfterHeader);
            return this;
        }

        /**
         * The number of rows to skip after the header row.
         */
        public Builder skipRowsAfterHeader(Optional<? extends Long> skipRowsAfterHeader) {
            Utils.checkNotNull(skipRowsAfterHeader, "skipRowsAfterHeader");
            this.skipRowsAfterHeader = skipRowsAfterHeader;
            return this;
        }

        /**
         * The number of rows to skip before the header row. For example, if the header row is on the 3rd row, enter 2 in this field.
         */
        public Builder skipRowsBeforeHeader(long skipRowsBeforeHeader) {
            Utils.checkNotNull(skipRowsBeforeHeader, "skipRowsBeforeHeader");
            this.skipRowsBeforeHeader = Optional.ofNullable(skipRowsBeforeHeader);
            return this;
        }

        /**
         * The number of rows to skip before the header row. For example, if the header row is on the 3rd row, enter 2 in this field.
         */
        public Builder skipRowsBeforeHeader(Optional<? extends Long> skipRowsBeforeHeader) {
            Utils.checkNotNull(skipRowsBeforeHeader, "skipRowsBeforeHeader");
            this.skipRowsBeforeHeader = skipRowsBeforeHeader;
            return this;
        }

        /**
         * Whether strings can be interpreted as null values. If true, strings that match the null_values set will be interpreted as null. If false, strings that match the null_values set will be interpreted as the string itself.
         */
        public Builder stringsCanBeNull(boolean stringsCanBeNull) {
            Utils.checkNotNull(stringsCanBeNull, "stringsCanBeNull");
            this.stringsCanBeNull = Optional.ofNullable(stringsCanBeNull);
            return this;
        }

        /**
         * Whether strings can be interpreted as null values. If true, strings that match the null_values set will be interpreted as null. If false, strings that match the null_values set will be interpreted as the string itself.
         */
        public Builder stringsCanBeNull(Optional<? extends Boolean> stringsCanBeNull) {
            Utils.checkNotNull(stringsCanBeNull, "stringsCanBeNull");
            this.stringsCanBeNull = stringsCanBeNull;
            return this;
        }

        /**
         * A set of case-sensitive strings that should be interpreted as true values.
         */
        public Builder trueValues(java.util.List<String> trueValues) {
            Utils.checkNotNull(trueValues, "trueValues");
            this.trueValues = Optional.ofNullable(trueValues);
            return this;
        }

        /**
         * A set of case-sensitive strings that should be interpreted as true values.
         */
        public Builder trueValues(Optional<? extends java.util.List<String>> trueValues) {
            Utils.checkNotNull(trueValues, "trueValues");
            this.trueValues = trueValues;
            return this;
        }
        
        public SourceGoogleDriveCSVFormat build() {
            if (delimiter == null) {
                delimiter = _SINGLETON_VALUE_Delimiter.value();
            }
            if (doubleQuote == null) {
                doubleQuote = _SINGLETON_VALUE_DoubleQuote.value();
            }
            if (encoding == null) {
                encoding = _SINGLETON_VALUE_Encoding.value();
            }
            if (quoteChar == null) {
                quoteChar = _SINGLETON_VALUE_QuoteChar.value();
            }
            if (skipRowsAfterHeader == null) {
                skipRowsAfterHeader = _SINGLETON_VALUE_SkipRowsAfterHeader.value();
            }
            if (skipRowsBeforeHeader == null) {
                skipRowsBeforeHeader = _SINGLETON_VALUE_SkipRowsBeforeHeader.value();
            }
            if (stringsCanBeNull == null) {
                stringsCanBeNull = _SINGLETON_VALUE_StringsCanBeNull.value();
            }
            return new SourceGoogleDriveCSVFormat(
                delimiter,
                doubleQuote,
                encoding,
                escapeChar,
                falseValues,
                headerDefinition,
                nullValues,
                quoteChar,
                skipRowsAfterHeader,
                skipRowsBeforeHeader,
                stringsCanBeNull,
                trueValues);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Delimiter =
                new LazySingletonValue<>(
                        "delimiter",
                        "\",\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_DoubleQuote =
                new LazySingletonValue<>(
                        "double_quote",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Encoding =
                new LazySingletonValue<>(
                        "encoding",
                        "\"utf8\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends SourceGoogleDriveSchemasFiletype>> _SINGLETON_VALUE_Filetype =
                new LazySingletonValue<>(
                        "filetype",
                        "\"csv\"",
                        new TypeReference<Optional<? extends SourceGoogleDriveSchemasFiletype>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_QuoteChar =
                new LazySingletonValue<>(
                        "quote_char",
                        "\"\\\"\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_SkipRowsAfterHeader =
                new LazySingletonValue<>(
                        "skip_rows_after_header",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_SkipRowsBeforeHeader =
                new LazySingletonValue<>(
                        "skip_rows_before_header",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_StringsCanBeNull =
                new LazySingletonValue<>(
                        "strings_can_be_null",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}
