# SourceUsCensus


## Fields

| Field                                                                                                               | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         | Example                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `apiKey`                                                                                                            | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | Your API Key. Get your key <a href="https://api.census.gov/data/key_signup.html">here</a>.                          |                                                                                                                     |
| `queryParams`                                                                                                       | *Optional<? extends String>*                                                                                        | :heavy_minus_sign:                                                                                                  | The query parameters portion of the GET request, without the api key                                                | get=NAME,NAICS2017_LABEL,LFO_LABEL,EMPSZES_LABEL,ESTAB,PAYANN,PAYQTR1,EMP&for=us:*&NAICS2017=72&LFO=001&EMPSZES=001 |
| `queryPath`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | The path portion of the GET request                                                                                 | data/2019/cbp                                                                                                       |
| `sourceType`                                                                                                        | [com.airbyte.api.models.shared.UsCensus](../../models/shared/UsCensus.md)                                           | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |                                                                                                                     |