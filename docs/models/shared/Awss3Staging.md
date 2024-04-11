# AWSS3Staging

<i>(recommended)</i> Uploads data to S3 and then uses a COPY to insert the data into Redshift. COPY is recommended for production workloads for better speed and scalability. See <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-bucket.html">AWS docs</a> for more details.


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                                                                                                     | Required                                                                                                                                                                                                                                                                                                                                                                 | Description                                                                                                                                                                                                                                                                                                                                                              | Example                                                                                                                                                                                                                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `accessKeyId`                                                                                                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                       | This ID grants access to the above S3 staging bucket. Airbyte requires Read and Write permissions to the given bucket. See <a href="https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys">AWS docs</a> on how to generate an access key ID and secret access key.                                                    |                                                                                                                                                                                                                                                                                                                                                                          |
| `encryption`                                                                                                                                                                                                                                                                                                                                                             | [Optional<? extends com.airbyte.api.models.shared.DestinationRedshiftEncryption>](../../models/shared/DestinationRedshiftEncryption.md)                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                       | How to encrypt the staging data                                                                                                                                                                                                                                                                                                                                          |                                                                                                                                                                                                                                                                                                                                                                          |
| `fileNamePattern`                                                                                                                                                                                                                                                                                                                                                        | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                       | The pattern allows you to set the file-name format for the S3 staging file(s)                                                                                                                                                                                                                                                                                            | {date}                                                                                                                                                                                                                                                                                                                                                                   |
| `method`                                                                                                                                                                                                                                                                                                                                                                 | [com.airbyte.api.models.shared.DestinationRedshiftMethod](../../models/shared/DestinationRedshiftMethod.md)                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                       | N/A                                                                                                                                                                                                                                                                                                                                                                      |                                                                                                                                                                                                                                                                                                                                                                          |
| `purgeStagingData`                                                                                                                                                                                                                                                                                                                                                       | *Optional<? extends Boolean>*                                                                                                                                                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                       | Whether to delete the staging files from S3 after completing the sync. See <a href="https://docs.airbyte.com/integrations/destinations/redshift/#:~:text=the%20root%20directory.-,Purge%20Staging%20Data,-Whether%20to%20delete"> docs</a> for details.                                                                                                                  |                                                                                                                                                                                                                                                                                                                                                                          |
| `s3BucketName`                                                                                                                                                                                                                                                                                                                                                           | *String*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                       | The name of the staging S3 bucket.                                                                                                                                                                                                                                                                                                                                       | airbyte.staging                                                                                                                                                                                                                                                                                                                                                          |
| `s3BucketPath`                                                                                                                                                                                                                                                                                                                                                           | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                       | The directory under the S3 bucket where data will be written. If not provided, then defaults to the root directory. See <a href="https://docs.aws.amazon.com/prescriptive-guidance/latest/defining-bucket-names-data-lakes/faq.html#:~:text=be%20globally%20unique.-,For%20S3%20bucket%20paths,-%2C%20you%20can%20use">path's name recommendations</a> for more details. | data_sync/test                                                                                                                                                                                                                                                                                                                                                           |
| `s3BucketRegion`                                                                                                                                                                                                                                                                                                                                                         | [Optional<? extends com.airbyte.api.models.shared.DestinationRedshiftS3BucketRegion>](../../models/shared/DestinationRedshiftS3BucketRegion.md)                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                       | The region of the S3 staging bucket.                                                                                                                                                                                                                                                                                                                                     |                                                                                                                                                                                                                                                                                                                                                                          |
| `secretAccessKey`                                                                                                                                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                       | The corresponding secret to the above access key id. See <a href="https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys">AWS docs</a> on how to generate an access key ID and secret access key.                                                                                                                      |                                                                                                                                                                                                                                                                                                                                                                          |