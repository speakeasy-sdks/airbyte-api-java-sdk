/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * OpenAI - Use the OpenAI API to embed text. This option is using the text-embedding-ada-002 model with 1536 embedding dimensions.
 */

public class OpenAI {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mode")
    private Optional<? extends DestinationAstraSchemasEmbeddingEmbedding1Mode> mode;

    @JsonProperty("openai_key")
    private String openaiKey;

    public OpenAI(
            @JsonProperty("openai_key") String openaiKey) {
        Utils.checkNotNull(openaiKey, "openaiKey");
        this.mode = Builder._SINGLETON_VALUE_Mode.value();
        this.openaiKey = openaiKey;
    }

    public Optional<? extends DestinationAstraSchemasEmbeddingEmbedding1Mode> mode() {
        return mode;
    }

    public String openaiKey() {
        return openaiKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OpenAI withOpenaiKey(String openaiKey) {
        Utils.checkNotNull(openaiKey, "openaiKey");
        this.openaiKey = openaiKey;
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
        OpenAI other = (OpenAI) o;
        return 
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.openaiKey, other.openaiKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            mode,
            openaiKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OpenAI.class,
                "mode", mode,
                "openaiKey", openaiKey);
    }
    
    public final static class Builder {
 
        private String openaiKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder openaiKey(String openaiKey) {
            Utils.checkNotNull(openaiKey, "openaiKey");
            this.openaiKey = openaiKey;
            return this;
        }
        
        public OpenAI build() {
            return new OpenAI(
                openaiKey);
        }

        private static final LazySingletonValue<Optional<? extends DestinationAstraSchemasEmbeddingEmbedding1Mode>> _SINGLETON_VALUE_Mode =
                new LazySingletonValue<>(
                        "mode",
                        "\"openai\"",
                        new TypeReference<Optional<? extends DestinationAstraSchemasEmbeddingEmbedding1Mode>>() {});
    }
}
