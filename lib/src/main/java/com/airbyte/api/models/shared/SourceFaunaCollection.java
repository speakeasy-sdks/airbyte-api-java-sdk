/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceFaunaCollection - Settings for the Fauna Collection.
 */
public class SourceFaunaCollection {
    /**
     * &lt;b&gt;This only applies to incremental syncs.&lt;/b&gt; &lt;br&gt;
     * Enabling deletion mode informs your destination of deleted documents.&lt;br&gt;
     * Disabled - Leave this feature disabled, and ignore deleted documents.&lt;br&gt;
     * Enabled - Enables this feature. When a document is deleted, the connector exports a record with a "deleted at" column containing the time that the document was deleted.
     */
    @JsonProperty("deletions")
    public Object deletions;
    public SourceFaunaCollection withDeletions(Object deletions) {
        this.deletions = deletions;
        return this;
    }
    
    /**
     * The page size used when reading documents from the database. The larger the page size, the faster the connector processes documents. However, if a page is too large, the connector may fail. &lt;br&gt;
     * Choose your page size based on how large the documents are. &lt;br&gt;
     * See &lt;a href="https://docs.fauna.com/fauna/current/learn/understanding/types#page"&gt;the docs&lt;/a&gt;.
     */
    @JsonProperty("page_size")
    public Long pageSize;
    public SourceFaunaCollection withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    
    public SourceFaunaCollection(@JsonProperty("deletions") Object deletions, @JsonProperty("page_size") Long pageSize) {
        this.deletions = deletions;
        this.pageSize = pageSize;
  }
}
