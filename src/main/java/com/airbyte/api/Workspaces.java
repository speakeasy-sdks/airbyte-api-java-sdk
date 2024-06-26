/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api;

import com.airbyte.api.models.errors.SDKError;
import com.airbyte.api.models.operations.SDKMethodInterfaces.*;
import com.airbyte.api.utils.HTTPClient;
import com.airbyte.api.utils.HTTPRequest;
import com.airbyte.api.utils.JSON;
import com.airbyte.api.utils.SerializedBody;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

public class Workspaces implements
            MethodCallCreateOrUpdateWorkspaceOAuthCredentials,
            MethodCallCreateWorkspace,
            MethodCallDeleteWorkspace,
            MethodCallGetWorkspace,
            MethodCallListWorkspaces,
            MethodCallUpdateWorkspace {

    private final SDKConfiguration sdkConfiguration;

    Workspaces(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequestBuilder createOrUpdateWorkspaceOAuthCredentials() {
        return new com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequestBuilder(this);
    }

    /**
     * Create OAuth override credentials for a workspace and source type.
     * Create/update a set of OAuth credentials to override the Airbyte-provided OAuth credentials used for source/destination OAuth.
     * In order to determine what the credential configuration needs to be, please see the connector specification of the relevant  source/destination.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse createOrUpdateWorkspaceOAuthCredentials(
            com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest.class,
                baseUrl,
                "/workspaces/{workspaceId}/oauthCredentials",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest>() {});
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(
                _convertedRequest, "workspaceOAuthCredentialsRequest", "json", false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.airbyte.api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        

        return res;
    }


    public com.airbyte.api.models.operations.CreateWorkspaceRequestBuilder createWorkspace() {
        return new com.airbyte.api.models.operations.CreateWorkspaceRequestBuilder(this);
    }

    /**
     * Create a workspace
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.CreateWorkspaceResponse createWorkspace(
            com.airbyte.api.models.shared.WorkspaceCreateRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                baseUrl,
                "/workspaces");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.shared.WorkspaceCreateRequest>() {});
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.airbyte.api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.CreateWorkspaceResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.CreateWorkspaceResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.CreateWorkspaceResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.WorkspaceResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspaceResponse>() {});
                res.withWorkspaceResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
        }

        return res;
    }


    public com.airbyte.api.models.operations.DeleteWorkspaceRequestBuilder deleteWorkspace() {
        return new com.airbyte.api.models.operations.DeleteWorkspaceRequestBuilder(this);
    }

    /**
     * Delete a Workspace
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.DeleteWorkspaceResponse deleteWorkspace(
            com.airbyte.api.models.operations.DeleteWorkspaceRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                com.airbyte.api.models.operations.DeleteWorkspaceRequest.class,
                baseUrl,
                "/workspaces/{workspaceId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.airbyte.api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.DeleteWorkspaceResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.DeleteWorkspaceResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.DeleteWorkspaceResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        

        return res;
    }


    public com.airbyte.api.models.operations.GetWorkspaceRequestBuilder getWorkspace() {
        return new com.airbyte.api.models.operations.GetWorkspaceRequestBuilder(this);
    }

    /**
     * Get Workspace details
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.GetWorkspaceResponse getWorkspace(
            com.airbyte.api.models.operations.GetWorkspaceRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                com.airbyte.api.models.operations.GetWorkspaceRequest.class,
                baseUrl,
                "/workspaces/{workspaceId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.airbyte.api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.GetWorkspaceResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.GetWorkspaceResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.GetWorkspaceResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.WorkspaceResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspaceResponse>() {});
                res.withWorkspaceResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }


    public com.airbyte.api.models.operations.ListWorkspacesRequestBuilder listWorkspaces() {
        return new com.airbyte.api.models.operations.ListWorkspacesRequestBuilder(this);
    }

    /**
     * List workspaces
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.ListWorkspacesResponse listWorkspaces(
            com.airbyte.api.models.operations.ListWorkspacesRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                baseUrl,
                "/workspaces");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = com.airbyte.api.utils.Utils.getQueryParams(
                com.airbyte.api.models.operations.ListWorkspacesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

        HTTPClient client = com.airbyte.api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.ListWorkspacesResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.ListWorkspacesResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.ListWorkspacesResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.WorkspacesResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspacesResponse>() {});
                res.withWorkspacesResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }


    public com.airbyte.api.models.operations.UpdateWorkspaceRequestBuilder updateWorkspace() {
        return new com.airbyte.api.models.operations.UpdateWorkspaceRequestBuilder(this);
    }

    /**
     * Update a workspace
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.UpdateWorkspaceResponse updateWorkspace(
            com.airbyte.api.models.operations.UpdateWorkspaceRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                com.airbyte.api.models.operations.UpdateWorkspaceRequest.class,
                baseUrl,
                "/workspaces/{workspaceId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.operations.UpdateWorkspaceRequest>() {});
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(
                _convertedRequest, "workspaceUpdateRequest", "json", false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = com.airbyte.api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.airbyte.api.models.operations.UpdateWorkspaceResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.UpdateWorkspaceResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.UpdateWorkspaceResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.WorkspaceResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.WorkspaceResponse>() {});
                res.withWorkspaceResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
        }

        return res;
    }

}
