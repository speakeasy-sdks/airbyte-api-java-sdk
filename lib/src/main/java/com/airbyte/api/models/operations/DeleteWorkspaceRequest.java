/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class DeleteWorkspaceRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    public String workspaceId;
    public DeleteWorkspaceRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
}