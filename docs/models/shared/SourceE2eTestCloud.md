# SourceE2eTestCloud

The values required to configure the source.


## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `maxMessages`                                                                                        | *Long*                                                                                               | :heavy_check_mark:                                                                                   | Number of records to emit per stream. Min 1. Max 100 billion.                                        |                                                                                                      |
| `messageIntervalMs`                                                                                  | *Long*                                                                                               | :heavy_minus_sign:                                                                                   | Interval between messages in ms. Min 0 ms. Max 60000 ms (1 minute).                                  |                                                                                                      |
| `mockCatalog`                                                                                        | *Object*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |                                                                                                      |
| `seed`                                                                                               | *Long*                                                                                               | :heavy_minus_sign:                                                                                   | When the seed is unspecified, the current time millis will be used as the seed. Range: [0, 1000000]. | 42                                                                                                   |
| `sourceType`                                                                                         | [SourceE2eTestCloudE2eTestCloud](../../models/shared/SourceE2eTestCloudE2eTestCloud.md)              | :heavy_check_mark:                                                                                   | N/A                                                                                                  |                                                                                                      |
| `type`                                                                                               | [SourceE2eTestCloudType](../../models/shared/SourceE2eTestCloudType.md)                              | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |                                                                                                      |