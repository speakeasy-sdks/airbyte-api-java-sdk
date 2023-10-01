/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourcePostgresReplicationMethodDetectChangesWithXminSystemColumn - &lt;i&gt;Recommended&lt;/i&gt; - Incrementally reads new inserts and updates via Postgres &lt;a href="https://docs.airbyte.com/integrations/sources/postgres/#xmin"&gt;Xmin system column&lt;/a&gt;. Only recommended for tables up to 500GB.
 */

public class SourcePostgresReplicationMethodDetectChangesWithXminSystemColumn {
    @JsonProperty("method")
    public SourcePostgresReplicationMethodDetectChangesWithXminSystemColumnMethod method;

    public SourcePostgresReplicationMethodDetectChangesWithXminSystemColumn withMethod(SourcePostgresReplicationMethodDetectChangesWithXminSystemColumnMethod method) {
        this.method = method;
        return this;
    }
    
    public SourcePostgresReplicationMethodDetectChangesWithXminSystemColumn(@JsonProperty("method") SourcePostgresReplicationMethodDetectChangesWithXminSystemColumnMethod method) {
        this.method = method;
  }
}
