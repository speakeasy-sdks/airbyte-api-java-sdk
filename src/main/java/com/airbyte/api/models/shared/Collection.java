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

/**
 * Collection - Settings for the Fauna Collection.
 */

public class Collection {

    /**
     * &lt;b&gt;This only applies to incremental syncs.&lt;/b&gt; &lt;br&gt;
     * Enabling deletion mode informs your destination of deleted documents.&lt;br&gt;
     * Disabled - Leave this feature disabled, and ignore deleted documents.&lt;br&gt;
     * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
     */
    @JsonProperty("deletions")
    private DeletionMode deletions;

    /**
     * The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. &lt;br&gt;
     * Choose your page size based on how large the documents are. &lt;br&gt;
     * See &lt;a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page"&gt;the docs&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_size")
    private Optional<? extends Long> pageSize;

    public Collection(
            @JsonProperty("deletions") DeletionMode deletions,
            @JsonProperty("page_size") Optional<? extends Long> pageSize) {
        Utils.checkNotNull(deletions, "deletions");
        Utils.checkNotNull(pageSize, "pageSize");
        this.deletions = deletions;
        this.pageSize = pageSize;
    }

    /**
     * &lt;b&gt;This only applies to incremental syncs.&lt;/b&gt; &lt;br&gt;
     * Enabling deletion mode informs your destination of deleted documents.&lt;br&gt;
     * Disabled - Leave this feature disabled, and ignore deleted documents.&lt;br&gt;
     * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
     */
    public DeletionMode deletions() {
        return deletions;
    }

    /**
     * The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. &lt;br&gt;
     * Choose your page size based on how large the documents are. &lt;br&gt;
     * See &lt;a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page"&gt;the docs&lt;/a&gt;.
     */
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * &lt;b&gt;This only applies to incremental syncs.&lt;/b&gt; &lt;br&gt;
     * Enabling deletion mode informs your destination of deleted documents.&lt;br&gt;
     * Disabled - Leave this feature disabled, and ignore deleted documents.&lt;br&gt;
     * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
     */
    public Collection withDeletions(DeletionMode deletions) {
        Utils.checkNotNull(deletions, "deletions");
        this.deletions = deletions;
        return this;
    }

    /**
     * The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. &lt;br&gt;
     * Choose your page size based on how large the documents are. &lt;br&gt;
     * See &lt;a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page"&gt;the docs&lt;/a&gt;.
     */
    public Collection withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. &lt;br&gt;
     * Choose your page size based on how large the documents are. &lt;br&gt;
     * See &lt;a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page"&gt;the docs&lt;/a&gt;.
     */
    public Collection withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
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
        Collection other = (Collection) o;
        return 
            java.util.Objects.deepEquals(this.deletions, other.deletions) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            deletions,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Collection.class,
                "deletions", deletions,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private DeletionMode deletions;
 
        private Optional<? extends Long> pageSize;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * &lt;b&gt;This only applies to incremental syncs.&lt;/b&gt; &lt;br&gt;
         * Enabling deletion mode informs your destination of deleted documents.&lt;br&gt;
         * Disabled - Leave this feature disabled, and ignore deleted documents.&lt;br&gt;
         * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
         */
        public Builder deletions(DeletionMode deletions) {
            Utils.checkNotNull(deletions, "deletions");
            this.deletions = deletions;
            return this;
        }

        /**
         * The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. &lt;br&gt;
         * Choose your page size based on how large the documents are. &lt;br&gt;
         * See &lt;a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page"&gt;the docs&lt;/a&gt;.
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. &lt;br&gt;
         * Choose your page size based on how large the documents are. &lt;br&gt;
         * See &lt;a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page"&gt;the docs&lt;/a&gt;.
         */
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }
        
        public Collection build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new Collection(
                deletions,
                pageSize);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "page_size",
                        "64",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}
