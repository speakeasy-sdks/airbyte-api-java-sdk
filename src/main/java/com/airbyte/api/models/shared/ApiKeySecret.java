/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ApiKeySecret - Use a api key and secret combination to authenticate
 */

public class ApiKeySecret {

    /**
     * The Key ID to used when accessing an enterprise Elasticsearch instance.
     */
    @JsonProperty("apiKeyId")
    private String apiKeyId;

    /**
     * The secret associated with the API Key ID.
     */
    @JsonProperty("apiKeySecret")
    private String apiKeySecret;

    @JsonProperty("method")
    private DestinationElasticsearchMethod method;

    public ApiKeySecret(
            @JsonProperty("apiKeyId") String apiKeyId,
            @JsonProperty("apiKeySecret") String apiKeySecret) {
        Utils.checkNotNull(apiKeyId, "apiKeyId");
        Utils.checkNotNull(apiKeySecret, "apiKeySecret");
        this.apiKeyId = apiKeyId;
        this.apiKeySecret = apiKeySecret;
        this.method = Builder._SINGLETON_VALUE_Method.value();
    }

    /**
     * The Key ID to used when accessing an enterprise Elasticsearch instance.
     */
    public String apiKeyId() {
        return apiKeyId;
    }

    /**
     * The secret associated with the API Key ID.
     */
    public String apiKeySecret() {
        return apiKeySecret;
    }

    public DestinationElasticsearchMethod method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Key ID to used when accessing an enterprise Elasticsearch instance.
     */
    public ApiKeySecret withApiKeyId(String apiKeyId) {
        Utils.checkNotNull(apiKeyId, "apiKeyId");
        this.apiKeyId = apiKeyId;
        return this;
    }

    /**
     * The secret associated with the API Key ID.
     */
    public ApiKeySecret withApiKeySecret(String apiKeySecret) {
        Utils.checkNotNull(apiKeySecret, "apiKeySecret");
        this.apiKeySecret = apiKeySecret;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiKeySecret other = (ApiKeySecret) o;
        return 
            java.util.Objects.deepEquals(this.apiKeyId, other.apiKeyId) &&
            java.util.Objects.deepEquals(this.apiKeySecret, other.apiKeySecret) &&
            java.util.Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKeyId,
            apiKeySecret,
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiKeySecret.class,
                "apiKeyId", apiKeyId,
                "apiKeySecret", apiKeySecret,
                "method", method);
    }
    
    public final static class Builder {
 
        private String apiKeyId;
 
        private String apiKeySecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Key ID to used when accessing an enterprise Elasticsearch instance.
         */
        public Builder apiKeyId(String apiKeyId) {
            Utils.checkNotNull(apiKeyId, "apiKeyId");
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * The secret associated with the API Key ID.
         */
        public Builder apiKeySecret(String apiKeySecret) {
            Utils.checkNotNull(apiKeySecret, "apiKeySecret");
            this.apiKeySecret = apiKeySecret;
            return this;
        }
        
        public ApiKeySecret build() {
            return new ApiKeySecret(
                apiKeyId,
                apiKeySecret);
        }

        private static final LazySingletonValue<DestinationElasticsearchMethod> _SINGLETON_VALUE_Method =
                new LazySingletonValue<>(
                        "method",
                        "\"secret\"",
                        new TypeReference<DestinationElasticsearchMethod>() {});
    }
}
