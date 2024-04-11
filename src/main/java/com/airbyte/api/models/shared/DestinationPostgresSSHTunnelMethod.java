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
 * DestinationPostgresSSHTunnelMethod - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */

@JsonDeserialize(using = DestinationPostgresSSHTunnelMethod._Deserializer.class)
public class DestinationPostgresSSHTunnelMethod {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DestinationPostgresSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationPostgresSSHTunnelMethod of(DestinationPostgresNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPostgresSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPostgresNoTunnel>(){}));
    }

    public static DestinationPostgresSSHTunnelMethod of(DestinationPostgresSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPostgresSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPostgresSSHKeyAuthentication>(){}));
    }

    public static DestinationPostgresSSHTunnelMethod of(DestinationPostgresPasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPostgresSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPostgresPasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code DestinationPostgresNoTunnel}</li>
     * <li>{@code DestinationPostgresSSHKeyAuthentication}</li>
     * <li>{@code DestinationPostgresPasswordAuthentication}</li>
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
        DestinationPostgresSSHTunnelMethod other = (DestinationPostgresSSHTunnelMethod) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationPostgresSSHTunnelMethod> {

        public _Deserializer() {
            super(DestinationPostgresSSHTunnelMethod.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPostgresNoTunnel>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPostgresSSHKeyAuthentication>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPostgresPasswordAuthentication>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPostgresSSHTunnelMethod.class,
                "value", value);
    }
 
}