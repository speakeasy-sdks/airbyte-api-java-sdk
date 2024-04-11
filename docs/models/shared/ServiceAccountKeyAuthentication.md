# ServiceAccountKeyAuthentication


## Fields

| Field                                                                                                                                                                                                                            | Type                                                                                                                                                                                                                             | Required                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                      | Example                                                                                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `authType`                                                                                                                                                                                                                       | [Optional<? extends com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasAuthType>](../../models/shared/SourceGoogleAnalyticsDataApiSchemasAuthType.md)                                                              | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              |                                                                                                                                                                                                                                  |
| `credentialsJson`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                               | The JSON key linked to the service account used for authorization. For steps on obtaining this key, refer to <a href="https://docs.airbyte.com/integrations/sources/google-analytics-data-api/#setup-guide">the setup guide</a>. | { "type": "service_account", "project_id": YOUR_PROJECT_ID, "private_key_id": YOUR_PRIVATE_KEY, ... }                                                                                                                            |