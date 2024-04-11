# SignInViaGoogleOAuth

For these scenario user only needs to give permission to read Google Directory data.


## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `clientId`                                                                                                                                              | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | The Client ID of the developer application.                                                                                                             |
| `clientSecret`                                                                                                                                          | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | The Client Secret of the developer application.                                                                                                         |
| `credentialsTitle`                                                                                                                                      | [Optional<? extends com.airbyte.api.models.shared.SourceGoogleDirectoryCredentialsTitle>](../../models/shared/SourceGoogleDirectoryCredentialsTitle.md) | :heavy_minus_sign:                                                                                                                                      | Authentication Scenario                                                                                                                                 |
| `refreshToken`                                                                                                                                          | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | The Token for obtaining a new access token.                                                                                                             |