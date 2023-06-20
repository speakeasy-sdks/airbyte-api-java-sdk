# SourcePinterest

The values required to configure the source.


## Fields

| Field                                                                                                                                  | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            | Example                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `credentials`                                                                                                                          | *Object*                                                                                                                               | :heavy_minus_sign:                                                                                                                     | N/A                                                                                                                                    |                                                                                                                                        |
| `sourceType`                                                                                                                           | [SourcePinterestPinterest](../../models/shared/SourcePinterestPinterest.md)                                                            | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |                                                                                                                                        |
| `startDate`                                                                                                                            | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                        | :heavy_check_mark:                                                                                                                     | A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by api (89 days from today). | 2022-07-28                                                                                                                             |
| `status`                                                                                                                               | List<[SourcePinterestStatus](../../models/shared/SourcePinterestStatus.md)>                                                            | :heavy_minus_sign:                                                                                                                     | Entity statuses based off of campaigns, ad_groups, and ads. If you do not have a status set, it will be ignored completely.            |                                                                                                                                        |