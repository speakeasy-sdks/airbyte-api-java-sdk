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

public class Connections implements
            MethodCallCreateConnection,
            MethodCallDeleteConnection,
            MethodCallGetConnection,
            MethodCallListConnections,
            MethodCallPatchConnection {

    private final SDKConfiguration sdkConfiguration;

    Connections(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public com.airbyte.api.models.operations.CreateConnectionRequestBuilder createConnection() {
        return new com.airbyte.api.models.operations.CreateConnectionRequestBuilder(this);
    }

    /**
     * Create a connection
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.CreateConnectionResponse createConnection(
            com.airbyte.api.models.shared.ConnectionCreateRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                baseUrl,
                "/connections");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.shared.ConnectionCreateRequest>() {});
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
        com.airbyte.api.models.operations.CreateConnectionResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.CreateConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.CreateConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.ConnectionResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.ConnectionResponse>() {});
                res.withConnectionResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
        }

        return res;
    }


    public com.airbyte.api.models.operations.DeleteConnectionRequestBuilder deleteConnection() {
        return new com.airbyte.api.models.operations.DeleteConnectionRequestBuilder(this);
    }

    /**
     * Delete a Connection
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.DeleteConnectionResponse deleteConnection(
            com.airbyte.api.models.operations.DeleteConnectionRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                com.airbyte.api.models.operations.DeleteConnectionRequest.class,
                baseUrl,
                "/connections/{connectionId}",
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
        com.airbyte.api.models.operations.DeleteConnectionResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.DeleteConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.DeleteConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        

        return res;
    }


    public com.airbyte.api.models.operations.GetConnectionRequestBuilder getConnection() {
        return new com.airbyte.api.models.operations.GetConnectionRequestBuilder(this);
    }

    /**
     * Get Connection details
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.GetConnectionResponse getConnection(
            com.airbyte.api.models.operations.GetConnectionRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                com.airbyte.api.models.operations.GetConnectionRequest.class,
                baseUrl,
                "/connections/{connectionId}",
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
        com.airbyte.api.models.operations.GetConnectionResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.GetConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.GetConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.ConnectionResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.ConnectionResponse>() {});
                res.withConnectionResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }


    public com.airbyte.api.models.operations.ListConnectionsRequestBuilder listConnections() {
        return new com.airbyte.api.models.operations.ListConnectionsRequestBuilder(this);
    }

    /**
     * List connections
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.ListConnectionsResponse listConnections(
            com.airbyte.api.models.operations.ListConnectionsRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                baseUrl,
                "/connections");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = com.airbyte.api.utils.Utils.getQueryParams(
                com.airbyte.api.models.operations.ListConnectionsRequest.class, request, null);
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
        com.airbyte.api.models.operations.ListConnectionsResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.ListConnectionsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.ListConnectionsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.ConnectionsResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.ConnectionsResponse>() {});
                res.withConnectionsResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }


    public com.airbyte.api.models.operations.PatchConnectionRequestBuilder patchConnection() {
        return new com.airbyte.api.models.operations.PatchConnectionRequestBuilder(this);
    }

    /**
     * Update Connection details
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.airbyte.api.models.operations.PatchConnectionResponse patchConnection(
            com.airbyte.api.models.operations.PatchConnectionRequest request) throws Exception {

        String baseUrl = this.sdkConfiguration.serverUrl;

        String url = com.airbyte.api.utils.Utils.generateURL(
                com.airbyte.api.models.operations.PatchConnectionRequest.class,
                baseUrl,
                "/connections/{connectionId}",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.airbyte.api.models.operations.PatchConnectionRequest>() {});
        SerializedBody serializedRequestBody = com.airbyte.api.utils.Utils.serializeRequestBody(
                _convertedRequest, "connectionPatchRequest", "json", false);
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
        com.airbyte.api.models.operations.PatchConnectionResponse.Builder resBuilder = 
            com.airbyte.api.models.operations.PatchConnectionResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.airbyte.api.models.operations.PatchConnectionResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.airbyte.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.airbyte.api.models.shared.ConnectionResponse out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.airbyte.api.models.shared.ConnectionResponse>() {});
                res.withConnectionResponse(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

}