/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.airbyte.api.utils.TypedObject;
import com.airbyte.api.utils.Utils.JsonShape;

/**
 * DestinationRedisSSLModes - SSL connection modes. 
 *   &lt;li&gt;&lt;b&gt;verify-full&lt;/b&gt; - This is the most secure mode. Always require encryption and verifies the identity of the source database server
 */

@JsonDeserialize(using = DestinationRedisSSLModes._Deserializer.class)
public class DestinationRedisSSLModes {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DestinationRedisSSLModes(TypedObject value) {
        this.value = value;
    }

    public static DestinationRedisSSLModes of(DestinationRedisDisable value) {
        Utils.checkNotNull(value, "value");
        return new DestinationRedisSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationRedisDisable>(){}));
    }

    public static DestinationRedisSSLModes of(DestinationRedisVerifyFull value) {
        Utils.checkNotNull(value, "value");
        return new DestinationRedisSSLModes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationRedisVerifyFull>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code DestinationRedisDisable}</li>
     * <li>{@code DestinationRedisVerifyFull}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DestinationRedisSSLModes other = (DestinationRedisSSLModes) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationRedisSSLModes> {

        public _Deserializer() {
            super(DestinationRedisSSLModes.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationRedisDisable>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationRedisVerifyFull>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationRedisSSLModes.class,
                "value", value);
    }
 
}