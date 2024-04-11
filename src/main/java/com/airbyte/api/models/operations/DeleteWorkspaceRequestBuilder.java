/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.models.errors.SDKError;
import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class DeleteWorkspaceRequestBuilder {

    private DeleteWorkspaceRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteWorkspace sdk;

    public DeleteWorkspaceRequestBuilder(SDKMethodInterfaces.MethodCallDeleteWorkspace sdk) {
        this.sdk = sdk;
    }

    public DeleteWorkspaceRequestBuilder request(DeleteWorkspaceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteWorkspaceResponse call() throws Exception {

        return sdk.deleteWorkspace(
            request);
    }
}