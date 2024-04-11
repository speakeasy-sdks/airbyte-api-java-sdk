# AuthenticateViaMicrosoftOAuth20


## Fields

| Field                                                                                                                                                                                                                                                                                                                                 | Type                                                                                                                                                                                                                                                                                                                                  | Required                                                                                                                                                                                                                                                                                                                              | Description                                                                                                                                                                                                                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `authType`                                                                                                                                                                                                                                                                                                                            | [Optional<? extends com.airbyte.api.models.shared.SourceMicrosoftTeamsAuthType>](../../models/shared/SourceMicrosoftTeamsAuthType.md)                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                    | N/A                                                                                                                                                                                                                                                                                                                                   |
| `clientId`                                                                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                    | The Client ID of your Microsoft Teams developer application.                                                                                                                                                                                                                                                                          |
| `clientSecret`                                                                                                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                    | The Client Secret of your Microsoft Teams developer application.                                                                                                                                                                                                                                                                      |
| `refreshToken`                                                                                                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                    | A Refresh Token to renew the expired Access Token.                                                                                                                                                                                                                                                                                    |
| `tenantId`                                                                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                    | A globally unique identifier (GUID) that is different than your organization name or domain. Follow these steps to obtain: open one of the Teams where you belong inside the Teams Application -> Click on the … next to the Team title -> Click on Get link to team -> Copy the link to the team and grab the tenant ID form the URL |