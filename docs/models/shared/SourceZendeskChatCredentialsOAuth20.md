# SourceZendeskChatCredentialsOAuth20


## Fields

| Field                                                                                                                   | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `accessToken`                                                                                                           | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | Access Token for making authenticated requests.                                                                         |
| `clientId`                                                                                                              | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | The Client ID of your OAuth application                                                                                 |
| `clientSecret`                                                                                                          | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | The Client Secret of your OAuth application.                                                                            |
| `credentials`                                                                                                           | [SourceZendeskChatCredentialsOAuth20Credentials](../../models/shared/SourceZendeskChatCredentialsOAuth20Credentials.md) | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `refreshToken`                                                                                                          | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | Refresh Token to obtain new Access Token, when it's expired.                                                            |