# Cohorts


## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `dateRange`                                                                                                     | [com.airbyte.api.models.shared.DateRange](../../models/shared/DateRange.md)                                     | :heavy_check_mark:                                                                                              | N/A                                                                                                             |
| `dimension`                                                                                                     | [com.airbyte.api.models.shared.Dimension](../../models/shared/Dimension.md)                                     | :heavy_check_mark:                                                                                              | Dimension used by the cohort. Required and only supports `firstSessionDate`                                     |
| `name`                                                                                                          | *Optional<? extends String>*                                                                                    | :heavy_minus_sign:                                                                                              | Assigns a name to this cohort. If not set, cohorts are named by their zero based index cohort_0, cohort_1, etc. |