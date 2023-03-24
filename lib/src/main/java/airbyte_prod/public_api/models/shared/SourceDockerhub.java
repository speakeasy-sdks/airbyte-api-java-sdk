/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package airbyte_prod.public_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceDockerhub - The values required to configure the source.
 */
public class SourceDockerhub {
    @JsonProperty("airbyte-source-name")public SourceDockerhubDockerhubEnum airbyteSourceName;
    public SourceDockerhub withAirbyteSourceName(SourceDockerhubDockerhubEnum airbyteSourceName) {
        this.airbyteSourceName = airbyteSourceName;
        return this;
    }
    
    /**
     * Username of DockerHub person or organization (for https://hub.docker.com/v2/repositories/USERNAME/ API call)
     */
    @JsonProperty("docker_username")public String dockerUsername;
    public SourceDockerhub withDockerUsername(String dockerUsername) {
        this.dockerUsername = dockerUsername;
        return this;
    }
    
}