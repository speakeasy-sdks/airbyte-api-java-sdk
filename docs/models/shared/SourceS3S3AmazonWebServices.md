# SourceS3S3AmazonWebServices

Use this to load files from S3 or S3-compatible services


## Fields

| Field                                                                                                                                                                                                                                                  | Type                                                                                                                                                                                                                                                   | Required                                                                                                                                                                                                                                               | Description                                                                                                                                                                                                                                            | Example                                                                                                                                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `awsAccessKeyId`                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                     | In order to access private Buckets stored on AWS S3, this connector requires credentials with the proper permissions. If accessing publicly available data, this field is not necessary.                                                               |                                                                                                                                                                                                                                                        |
| `awsSecretAccessKey`                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                     | In order to access private Buckets stored on AWS S3, this connector requires credentials with the proper permissions. If accessing publicly available data, this field is not necessary.                                                               |                                                                                                                                                                                                                                                        |
| `bucket`                                                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                                                     | Name of the S3 bucket where the file(s) exist.                                                                                                                                                                                                         |                                                                                                                                                                                                                                                        |
| `endpoint`                                                                                                                                                                                                                                             | *String*                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                     | Endpoint to an S3 compatible service. Leave empty to use AWS.                                                                                                                                                                                          |                                                                                                                                                                                                                                                        |
| `pathPrefix`                                                                                                                                                                                                                                           | *String*                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                     | By providing a path-like prefix (e.g. myFolder/thisTable/) under which all the relevant files sit, we can optimize finding these in S3. This is optional but recommended if your bucket contains many folders/files which you don't need to replicate. |                                                                                                                                                                                                                                                        |
| `startDate`                                                                                                                                                                                                                                            | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                     | UTC date and time in the format 2017-01-25T00:00:00Z. Any file modified before this date will not be replicated.                                                                                                                                       | 2021-01-01T00:00:00Z                                                                                                                                                                                                                                   |