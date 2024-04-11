# SourceOkta


## Fields

| Field                                                                                                                                   | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             | Example                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `credentials`                                                                                                                           | [Optional<? extends com.airbyte.api.models.shared.SourceOktaAuthorizationMethod>](../../models/shared/SourceOktaAuthorizationMethod.md) | :heavy_minus_sign:                                                                                                                      | N/A                                                                                                                                     |                                                                                                                                         |
| `domain`                                                                                                                                | *Optional<? extends String>*                                                                                                            | :heavy_minus_sign:                                                                                                                      | The Okta domain. See the <a href="https://docs.airbyte.com/integrations/sources/okta">docs</a> for instructions on how to find it.      |                                                                                                                                         |
| `sourceType`                                                                                                                            | [com.airbyte.api.models.shared.Okta](../../models/shared/Okta.md)                                                                       | :heavy_check_mark:                                                                                                                      | N/A                                                                                                                                     |                                                                                                                                         |
| `startDate`                                                                                                                             | *Optional<? extends String>*                                                                                                            | :heavy_minus_sign:                                                                                                                      | UTC date and time in the format YYYY-MM-DDTHH:MM:SSZ. Any data before this date will not be replicated.                                 | 2022-07-22T00:00:00Z                                                                                                                    |