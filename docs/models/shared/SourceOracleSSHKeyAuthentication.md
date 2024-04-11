# SourceOracleSSHKeyAuthentication


## Fields

| Field                                                                                                                   | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `sshKey`                                                                                                                | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )     |                                                                                                                         |
| `tunnelHost`                                                                                                            | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | Hostname of the jump server host that allows inbound ssh tunnel.                                                        |                                                                                                                         |
| `tunnelMethod`                                                                                                          | [com.airbyte.api.models.shared.SourceOracleSchemasTunnelMethod](../../models/shared/SourceOracleSchemasTunnelMethod.md) | :heavy_check_mark:                                                                                                      | Connect through a jump server tunnel host using username and ssh key                                                    |                                                                                                                         |
| `tunnelPort`                                                                                                            | *Optional<? extends Long>*                                                                                              | :heavy_minus_sign:                                                                                                      | Port on the proxy/jump server that accepts inbound ssh connections.                                                     | 22                                                                                                                      |
| `tunnelUser`                                                                                                            | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | OS-level username for logging into the jump server host.                                                                |                                                                                                                         |