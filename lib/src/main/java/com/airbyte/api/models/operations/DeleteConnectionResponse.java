/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import java.net.http.HttpResponse;

public class DeleteConnectionResponse {
    
    public String contentType;
    public DeleteConnectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public DeleteConnectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteConnectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}