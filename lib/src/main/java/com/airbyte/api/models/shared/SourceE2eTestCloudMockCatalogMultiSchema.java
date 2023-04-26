/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceE2eTestCloudMockCatalogMultiSchema - A catalog with multiple data streams, each with a different schema.
 */
public class SourceE2eTestCloudMockCatalogMultiSchema {
    /**
     * A Json object specifying multiple data streams and their schemas. Each key in this object is one stream name. Each value is the schema for that stream. The schema should be compatible with &lt;a href="https://json-schema.org/draft-07/json-schema-release-notes.html"&gt;draft-07&lt;/a&gt;. See &lt;a href="https://cswr.github.io/JsonSchema/spec/introduction/"&gt;this doc&lt;/a&gt; for examples.
     */
    @JsonProperty("stream_schemas")
    public String streamSchemas;
    public SourceE2eTestCloudMockCatalogMultiSchema withStreamSchemas(String streamSchemas) {
        this.streamSchemas = streamSchemas;
        return this;
    }
    
    @JsonProperty("type")
    public SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum type;
    public SourceE2eTestCloudMockCatalogMultiSchema withType(SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum type) {
        this.type = type;
        return this;
    }
    
    public SourceE2eTestCloudMockCatalogMultiSchema(@JsonProperty("stream_schemas") String streamSchemas, @JsonProperty("type") SourceE2eTestCloudMockCatalogMultiSchemaTypeEnum type) {
        this.streamSchemas = streamSchemas;
        this.type = type;
  }
}
