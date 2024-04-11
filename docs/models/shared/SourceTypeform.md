# SourceTypeform


## Fields

| Field                                                                                                                                                                                                                                                                                                                            | Type                                                                                                                                                                                                                                                                                                                             | Required                                                                                                                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                                                                                                                      | Example                                                                                                                                                                                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `credentials`                                                                                                                                                                                                                                                                                                                    | [com.airbyte.api.models.shared.SourceTypeformAuthorizationMethod](../../models/shared/SourceTypeformAuthorizationMethod.md)                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                                                                                                                              |                                                                                                                                                                                                                                                                                                                                  |
| `formIds`                                                                                                                                                                                                                                                                                                                        | List<*String*>                                                                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                               | When this parameter is set, the connector will replicate data only from the input forms. Otherwise, all forms in your Typeform account will be replicated. You can find form IDs in your form URLs. For example, in the URL "https://mysite.typeform.com/to/u6nXL7" the form_id is u6nXL7. You can find form URLs on Share panel |                                                                                                                                                                                                                                                                                                                                  |
| `sourceType`                                                                                                                                                                                                                                                                                                                     | [com.airbyte.api.models.shared.SourceTypeformTypeform](../../models/shared/SourceTypeformTypeform.md)                                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                                                                                                                              |                                                                                                                                                                                                                                                                                                                                  |
| `startDate`                                                                                                                                                                                                                                                                                                                      | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                               | The date from which you'd like to replicate data for Typeform API, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.                                                                                                                                                                    | 2021-03-01T00:00:00Z                                                                                                                                                                                                                                                                                                             |