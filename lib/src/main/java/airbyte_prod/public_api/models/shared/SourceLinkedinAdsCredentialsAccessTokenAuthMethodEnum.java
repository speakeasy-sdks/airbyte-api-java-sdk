/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceLinkedinAdsCredentialsAccessTokenAuthMethodEnum {
    ACCESS_TOKEN("access_token");

    @JsonValue
    public final String value;

    private SourceLinkedinAdsCredentialsAccessTokenAuthMethodEnum(String value) {
        this.value = value;
    }
}