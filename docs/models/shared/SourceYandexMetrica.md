# SourceYandexMetrica


## Fields

| Field                                                                                                                 | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           | Example                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `authToken`                                                                                                           | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | Your Yandex Metrica API access token                                                                                  |                                                                                                                       |
| `counterId`                                                                                                           | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | Counter ID                                                                                                            |                                                                                                                       |
| `endDate`                                                                                                             | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                       | :heavy_minus_sign:                                                                                                    | Starting point for your data replication, in format of "YYYY-MM-DD". If not provided will sync till most recent date. | 2022-01-01                                                                                                            |
| `sourceType`                                                                                                          | [com.airbyte.api.models.shared.YandexMetrica](../../models/shared/YandexMetrica.md)                                   | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |                                                                                                                       |
| `startDate`                                                                                                           | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                       | :heavy_check_mark:                                                                                                    | Starting point for your data replication, in format of "YYYY-MM-DD".                                                  | 2022-01-01                                                                                                            |