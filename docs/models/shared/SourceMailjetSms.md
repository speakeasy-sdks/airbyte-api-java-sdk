# SourceMailjetSms

The values required to configure the source.


## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `endDate`                                                                                                | *Long*                                                                                                   | :heavy_minus_sign:                                                                                       | Retrieve SMS messages created before the specified timestamp. Required format - Unix timestamp.          | 1666281656                                                                                               |
| `sourceType`                                                                                             | [SourceMailjetSmsMailjetSms](../../models/shared/SourceMailjetSmsMailjetSms.md)                          | :heavy_check_mark:                                                                                       | N/A                                                                                                      |                                                                                                          |
| `startDate`                                                                                              | *Long*                                                                                                   | :heavy_minus_sign:                                                                                       | Retrieve SMS messages created after the specified timestamp. Required format - Unix timestamp.           | 1666261656                                                                                               |
| `token`                                                                                                  | *String*                                                                                                 | :heavy_check_mark:                                                                                       | Your access token. See <a href="https://dev.mailjet.com/sms/reference/overview/authentication">here</a>. |                                                                                                          |