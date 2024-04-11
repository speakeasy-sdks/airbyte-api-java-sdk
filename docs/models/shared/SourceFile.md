# SourceFile


## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       | Example                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `datasetName`                                                                                                                     | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | The Name of the final table to replicate this file into (should include letters, numbers dash and underscores only).              |                                                                                                                                   |
| `format`                                                                                                                          | [Optional<? extends com.airbyte.api.models.shared.FileFormat>](../../models/shared/FileFormat.md)                                 | :heavy_minus_sign:                                                                                                                | The Format of the file which should be replicated (Warning: some formats may be experimental, please refer to the docs).          |                                                                                                                                   |
| `provider`                                                                                                                        | [com.airbyte.api.models.shared.StorageProvider](../../models/shared/StorageProvider.md)                                           | :heavy_check_mark:                                                                                                                | The storage Provider or Location of the file(s) which should be replicated.                                                       |                                                                                                                                   |
| `readerOptions`                                                                                                                   | *Optional<? extends String>*                                                                                                      | :heavy_minus_sign:                                                                                                                | This should be a string in JSON format. It depends on the chosen file format to provide additional options and tune its behavior. | {}                                                                                                                                |
| `sourceType`                                                                                                                      | [com.airbyte.api.models.shared.File](../../models/shared/File.md)                                                                 | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |                                                                                                                                   |
| `url`                                                                                                                             | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | The URL path to access the file which should be replicated.                                                                       | https://storage.googleapis.com/covid19-open-data/v2/latest/epidemiology.csv                                                       |