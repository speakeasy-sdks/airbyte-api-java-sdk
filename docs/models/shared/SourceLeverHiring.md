# SourceLeverHiring


## Fields

| Field                                                                                                                                                                                                       | Type                                                                                                                                                                                                        | Required                                                                                                                                                                                                    | Description                                                                                                                                                                                                 | Example                                                                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `credentials`                                                                                                                                                                                               | [Optional<? extends com.airbyte.api.models.shared.SourceLeverHiringAuthenticationMechanism>](../../models/shared/SourceLeverHiringAuthenticationMechanism.md)                                               | :heavy_minus_sign:                                                                                                                                                                                          | Choose how to authenticate to Lever Hiring.                                                                                                                                                                 |                                                                                                                                                                                                             |
| `environment`                                                                                                                                                                                               | [Optional<? extends com.airbyte.api.models.shared.SourceLeverHiringEnvironment>](../../models/shared/SourceLeverHiringEnvironment.md)                                                                       | :heavy_minus_sign:                                                                                                                                                                                          | The environment in which you'd like to replicate data for Lever. This is used to determine which Lever API endpoint to use.                                                                                 |                                                                                                                                                                                                             |
| `sourceType`                                                                                                                                                                                                | [com.airbyte.api.models.shared.SourceLeverHiringLeverHiring](../../models/shared/SourceLeverHiringLeverHiring.md)                                                                                           | :heavy_check_mark:                                                                                                                                                                                          | N/A                                                                                                                                                                                                         |                                                                                                                                                                                                             |
| `startDate`                                                                                                                                                                                                 | *String*                                                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                                          | UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated. Note that it will be used only in the following incremental streams: comments, commits, and issues. | 2021-03-01T00:00:00Z                                                                                                                                                                                        |