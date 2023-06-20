# WorkspaceOAuthCredentialsRequest

POST body for creating/updating workspace level OAuth credentials


## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `actorType`                                                                                             | [ActorTypeEnum](../../models/shared/ActorTypeEnum.md)                                                   | :heavy_check_mark:                                                                                      | Whether you're setting this override for a source or destination                                        |
| `configuration`                                                                                         | [OAuthCredentialsConfiguration](../../models/shared/OAuthCredentialsConfiguration.md)                   | :heavy_check_mark:                                                                                      | The configuration for this source/destination based on the OAuth section of the relevant specification. |
| `name`                                                                                                  | *String*                                                                                                | :heavy_check_mark:                                                                                      | The name of the source i.e. google-ads                                                                  |