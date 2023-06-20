# SourceSftpCredentialsSSHKeyAuthentication

The server authentication method


## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `authMethod`                                                                                                                      | [SourceSftpCredentialsSSHKeyAuthenticationAuthMethod](../../models/shared/SourceSftpCredentialsSSHKeyAuthenticationAuthMethod.md) | :heavy_check_mark:                                                                                                                | Connect through ssh key                                                                                                           |
| `authSshKey`                                                                                                                      | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | OS-level user account ssh key credentials in RSA PEM format ( created with ssh-keygen -t rsa -m PEM -f myuser_rsa )               |