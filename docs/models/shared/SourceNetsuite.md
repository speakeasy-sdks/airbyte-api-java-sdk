# SourceNetsuite


## Fields

| Field                                                                                                                                                                                  | Type                                                                                                                                                                                   | Required                                                                                                                                                                               | Description                                                                                                                                                                            | Example                                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `consumerKey`                                                                                                                                                                          | *String*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | Consumer key associated with your integration                                                                                                                                          |                                                                                                                                                                                        |
| `consumerSecret`                                                                                                                                                                       | *String*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | Consumer secret associated with your integration                                                                                                                                       |                                                                                                                                                                                        |
| `objectTypes`                                                                                                                                                                          | List<*String*>                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                     | The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite. | customer                                                                                                                                                                               |
| `realm`                                                                                                                                                                                | *String*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | Netsuite realm e.g. 2344535, as for `production` or 2344535_SB1, as for the `sandbox`                                                                                                  |                                                                                                                                                                                        |
| `sourceType`                                                                                                                                                                           | [com.airbyte.api.models.shared.Netsuite](../../models/shared/Netsuite.md)                                                                                                              | :heavy_check_mark:                                                                                                                                                                     | N/A                                                                                                                                                                                    |                                                                                                                                                                                        |
| `startDatetime`                                                                                                                                                                        | *String*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | Starting point for your data replication, in format of "YYYY-MM-DDTHH:mm:ssZ"                                                                                                          | 2017-01-25T00:00:00Z                                                                                                                                                                   |
| `tokenKey`                                                                                                                                                                             | *String*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | Access token key                                                                                                                                                                       |                                                                                                                                                                                        |
| `tokenSecret`                                                                                                                                                                          | *String*                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                     | Access token secret                                                                                                                                                                    |                                                                                                                                                                                        |
| `windowInDays`                                                                                                                                                                         | *Optional<? extends Long>*                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                     | The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.                                                                               |                                                                                                                                                                                        |