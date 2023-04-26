/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class ListWorkspacesRequest {
    /**
     * Include deleted workspaces in the returned results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeDeleted")
    public Boolean includeDeleted;
    public ListWorkspacesRequest withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    
    /**
     * Set the limit on the number of workspaces returned. The default is 20.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;
    public ListWorkspacesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Set the offset to start at when returning workspaces. The default is 0
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Integer offset;
    public ListWorkspacesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * The UUIDs of the workspaces you wish to fetch. Empty list will retrieve all allowed workspaces.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=workspaceIds")
    public String[] workspaceIds;
    public ListWorkspacesRequest withWorkspaceIds(String[] workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    
    public ListWorkspacesRequest(){}
}
