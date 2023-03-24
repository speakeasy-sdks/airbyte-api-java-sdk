/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationSnowflakeCredentialsUsernameAndPassword {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")public DestinationSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum authType;
    public DestinationSnowflakeCredentialsUsernameAndPassword withAuthType(DestinationSnowflakeCredentialsUsernameAndPasswordAuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }
    
    /**
     * Enter the password associated with the username.
     */
    @JsonProperty("password")public String password;
    public DestinationSnowflakeCredentialsUsernameAndPassword withPassword(String password) {
        this.password = password;
        return this;
    }
    
}