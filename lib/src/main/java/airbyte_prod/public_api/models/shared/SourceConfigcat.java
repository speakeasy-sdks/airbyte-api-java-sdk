/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceConfigcat - The values required to configure the source.
 */
public class SourceConfigcat {
    @JsonProperty("airbyte-source-name")public SourceConfigcatConfigcatEnum airbyteSourceName;
    public SourceConfigcat withAirbyteSourceName(SourceConfigcatConfigcatEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Basic auth password. See <a href="https://api.configcat.com/docs/#section/Authentication">here</a>.
     */
    @JsonProperty("password")public String password;
    public SourceConfigcat withPassword(String password) {
        this.password = password;
        return this;
    }
    
    /**
     * Basic auth user name. See <a href="https://api.configcat.com/docs/#section/Authentication">here</a>.
     */
    @JsonProperty("username")public String username;
    public SourceConfigcat withUsername(String username) {
        this.username = username;
        return this;
    }
    
}