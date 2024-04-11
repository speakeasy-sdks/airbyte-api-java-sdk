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


public class DestinationPineconeProcessingConfigModel {

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("chunk_overlap")
    private Optional<? extends Long> chunkOverlap;

    /**
     * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
     */
    @JsonProperty("chunk_size")
    private long chunkSize;

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("field_name_mappings")
    private Optional<? extends java.util.List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings;

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata_fields")
    private Optional<? extends java.util.List<String>> metadataFields;

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_fields")
    private Optional<? extends java.util.List<String>> textFields;

    /**
     * Split text fields into chunks based on the specified method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text_splitter")
    private Optional<? extends DestinationPineconeTextSplitter> textSplitter;

    public DestinationPineconeProcessingConfigModel(
            @JsonProperty("chunk_overlap") Optional<? extends Long> chunkOverlap,
            @JsonProperty("chunk_size") long chunkSize,
            @JsonProperty("field_name_mappings") Optional<? extends java.util.List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings,
            @JsonProperty("metadata_fields") Optional<? extends java.util.List<String>> metadataFields,
            @JsonProperty("text_fields") Optional<? extends java.util.List<String>> textFields,
            @JsonProperty("text_splitter") Optional<? extends DestinationPineconeTextSplitter> textSplitter) {
        Utils.checkNotNull(chunkOverlap, "chunkOverlap");
        Utils.checkNotNull(chunkSize, "chunkSize");
        Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
        Utils.checkNotNull(metadataFields, "metadataFields");
        Utils.checkNotNull(textFields, "textFields");
        Utils.checkNotNull(textSplitter, "textSplitter");
        this.chunkOverlap = chunkOverlap;
        this.chunkSize = chunkSize;
        this.fieldNameMappings = fieldNameMappings;
        this.metadataFields = metadataFields;
        this.textFields = textFields;
        this.textSplitter = textSplitter;
    }

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    public Optional<? extends Long> chunkOverlap() {
        return chunkOverlap;
    }

    /**
     * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
     */
    public long chunkSize() {
        return chunkSize;
    }

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    public Optional<? extends java.util.List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings() {
        return fieldNameMappings;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    public Optional<? extends java.util.List<String>> metadataFields() {
        return metadataFields;
    }

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public Optional<? extends java.util.List<String>> textFields() {
        return textFields;
    }

    /**
     * Split text fields into chunks based on the specified method.
     */
    public Optional<? extends DestinationPineconeTextSplitter> textSplitter() {
        return textSplitter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    public DestinationPineconeProcessingConfigModel withChunkOverlap(long chunkOverlap) {
        Utils.checkNotNull(chunkOverlap, "chunkOverlap");
        this.chunkOverlap = Optional.ofNullable(chunkOverlap);
        return this;
    }

    /**
     * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
     */
    public DestinationPineconeProcessingConfigModel withChunkOverlap(Optional<? extends Long> chunkOverlap) {
        Utils.checkNotNull(chunkOverlap, "chunkOverlap");
        this.chunkOverlap = chunkOverlap;
        return this;
    }

    /**
     * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
     */
    public DestinationPineconeProcessingConfigModel withChunkSize(long chunkSize) {
        Utils.checkNotNull(chunkSize, "chunkSize");
        this.chunkSize = chunkSize;
        return this;
    }

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    public DestinationPineconeProcessingConfigModel withFieldNameMappings(java.util.List<DestinationPineconeFieldNameMappingConfigModel> fieldNameMappings) {
        Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
        this.fieldNameMappings = Optional.ofNullable(fieldNameMappings);
        return this;
    }

    /**
     * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
     */
    public DestinationPineconeProcessingConfigModel withFieldNameMappings(Optional<? extends java.util.List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings) {
        Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
        this.fieldNameMappings = fieldNameMappings;
        return this;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    public DestinationPineconeProcessingConfigModel withMetadataFields(java.util.List<String> metadataFields) {
        Utils.checkNotNull(metadataFields, "metadataFields");
        this.metadataFields = Optional.ofNullable(metadataFields);
        return this;
    }

    /**
     * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
     */
    public DestinationPineconeProcessingConfigModel withMetadataFields(Optional<? extends java.util.List<String>> metadataFields) {
        Utils.checkNotNull(metadataFields, "metadataFields");
        this.metadataFields = metadataFields;
        return this;
    }

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationPineconeProcessingConfigModel withTextFields(java.util.List<String> textFields) {
        Utils.checkNotNull(textFields, "textFields");
        this.textFields = Optional.ofNullable(textFields);
        return this;
    }

    /**
     * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
     */
    public DestinationPineconeProcessingConfigModel withTextFields(Optional<? extends java.util.List<String>> textFields) {
        Utils.checkNotNull(textFields, "textFields");
        this.textFields = textFields;
        return this;
    }

    /**
     * Split text fields into chunks based on the specified method.
     */
    public DestinationPineconeProcessingConfigModel withTextSplitter(DestinationPineconeTextSplitter textSplitter) {
        Utils.checkNotNull(textSplitter, "textSplitter");
        this.textSplitter = Optional.ofNullable(textSplitter);
        return this;
    }

    /**
     * Split text fields into chunks based on the specified method.
     */
    public DestinationPineconeProcessingConfigModel withTextSplitter(Optional<? extends DestinationPineconeTextSplitter> textSplitter) {
        Utils.checkNotNull(textSplitter, "textSplitter");
        this.textSplitter = textSplitter;
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
        DestinationPineconeProcessingConfigModel other = (DestinationPineconeProcessingConfigModel) o;
        return 
            java.util.Objects.deepEquals(this.chunkOverlap, other.chunkOverlap) &&
            java.util.Objects.deepEquals(this.chunkSize, other.chunkSize) &&
            java.util.Objects.deepEquals(this.fieldNameMappings, other.fieldNameMappings) &&
            java.util.Objects.deepEquals(this.metadataFields, other.metadataFields) &&
            java.util.Objects.deepEquals(this.textFields, other.textFields) &&
            java.util.Objects.deepEquals(this.textSplitter, other.textSplitter);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            chunkOverlap,
            chunkSize,
            fieldNameMappings,
            metadataFields,
            textFields,
            textSplitter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPineconeProcessingConfigModel.class,
                "chunkOverlap", chunkOverlap,
                "chunkSize", chunkSize,
                "fieldNameMappings", fieldNameMappings,
                "metadataFields", metadataFields,
                "textFields", textFields,
                "textSplitter", textSplitter);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> chunkOverlap;
 
        private Long chunkSize;
 
        private Optional<? extends java.util.List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings = Optional.empty();
 
        private Optional<? extends java.util.List<String>> metadataFields = Optional.empty();
 
        private Optional<? extends java.util.List<String>> textFields = Optional.empty();
 
        private Optional<? extends DestinationPineconeTextSplitter> textSplitter = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
         */
        public Builder chunkOverlap(long chunkOverlap) {
            Utils.checkNotNull(chunkOverlap, "chunkOverlap");
            this.chunkOverlap = Optional.ofNullable(chunkOverlap);
            return this;
        }

        /**
         * Size of overlap between chunks in tokens to store in vector store to better capture relevant context
         */
        public Builder chunkOverlap(Optional<? extends Long> chunkOverlap) {
            Utils.checkNotNull(chunkOverlap, "chunkOverlap");
            this.chunkOverlap = chunkOverlap;
            return this;
        }

        /**
         * Size of chunks in tokens to store in vector store (make sure it is not too big for the context if your LLM)
         */
        public Builder chunkSize(long chunkSize) {
            Utils.checkNotNull(chunkSize, "chunkSize");
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
         */
        public Builder fieldNameMappings(java.util.List<DestinationPineconeFieldNameMappingConfigModel> fieldNameMappings) {
            Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
            this.fieldNameMappings = Optional.ofNullable(fieldNameMappings);
            return this;
        }

        /**
         * List of fields to rename. Not applicable for nested fields, but can be used to rename fields already flattened via dot notation.
         */
        public Builder fieldNameMappings(Optional<? extends java.util.List<DestinationPineconeFieldNameMappingConfigModel>> fieldNameMappings) {
            Utils.checkNotNull(fieldNameMappings, "fieldNameMappings");
            this.fieldNameMappings = fieldNameMappings;
            return this;
        }

        /**
         * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
         */
        public Builder metadataFields(java.util.List<String> metadataFields) {
            Utils.checkNotNull(metadataFields, "metadataFields");
            this.metadataFields = Optional.ofNullable(metadataFields);
            return this;
        }

        /**
         * List of fields in the record that should be stored as metadata. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered metadata fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array. When specifying nested paths, all matching values are flattened into an array set to a field named by the path.
         */
        public Builder metadataFields(Optional<? extends java.util.List<String>> metadataFields) {
            Utils.checkNotNull(metadataFields, "metadataFields");
            this.metadataFields = metadataFields;
            return this;
        }

        /**
         * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder textFields(java.util.List<String> textFields) {
            Utils.checkNotNull(textFields, "textFields");
            this.textFields = Optional.ofNullable(textFields);
            return this;
        }

        /**
         * List of fields in the record that should be used to calculate the embedding. The field list is applied to all streams in the same way and non-existing fields are ignored. If none are defined, all fields are considered text fields. When specifying text fields, you can access nested fields in the record by using dot notation, e.g. `user.name` will access the `name` field in the `user` object. It's also possible to use wildcards to access all fields in an object, e.g. `users.*.name` will access all `names` fields in all entries of the `users` array.
         */
        public Builder textFields(Optional<? extends java.util.List<String>> textFields) {
            Utils.checkNotNull(textFields, "textFields");
            this.textFields = textFields;
            return this;
        }

        /**
         * Split text fields into chunks based on the specified method.
         */
        public Builder textSplitter(DestinationPineconeTextSplitter textSplitter) {
            Utils.checkNotNull(textSplitter, "textSplitter");
            this.textSplitter = Optional.ofNullable(textSplitter);
            return this;
        }

        /**
         * Split text fields into chunks based on the specified method.
         */
        public Builder textSplitter(Optional<? extends DestinationPineconeTextSplitter> textSplitter) {
            Utils.checkNotNull(textSplitter, "textSplitter");
            this.textSplitter = textSplitter;
            return this;
        }
        
        public DestinationPineconeProcessingConfigModel build() {
            if (chunkOverlap == null) {
                chunkOverlap = _SINGLETON_VALUE_ChunkOverlap.value();
            }
            return new DestinationPineconeProcessingConfigModel(
                chunkOverlap,
                chunkSize,
                fieldNameMappings,
                metadataFields,
                textFields,
                textSplitter);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_ChunkOverlap =
                new LazySingletonValue<>(
                        "chunk_overlap",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}
