/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevel - Existing data in the database are synced through an initial snapshot. This parameter controls the isolation level that will be used during the initial snapshotting. If you choose the "Snapshot" level, you must enable the &lt;a href="https://docs.microsoft.com/en-us/dotnet/framework/data/adonet/sql/snapshot-isolation-in-sql-server"&gt;snapshot isolation mode&lt;/a&gt; on the database.
 */
public enum SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevel {
    SNAPSHOT("Snapshot"),
    READ_COMMITTED("Read Committed");

    @JsonValue
    public final String value;

    private SourceMssqlReplicationMethodLogicalReplicationCDCInitialSnapshotIsolationLevel(String value) {
        this.value = value;
    }
}