/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SourceGoogleDirectoryGoogleDirectoryEnum {
    GOOGLE_DIRECTORY("google-directory");

    @JsonValue
    public final String value;

    private SourceGoogleDirectoryGoogleDirectoryEnum(String value) {
        this.value = value;
    }
}