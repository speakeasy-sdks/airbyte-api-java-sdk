# SourceDynamodb


## Fields

| Field                                                                                                                                 | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           | Example                                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `accessKeyId`                                                                                                                         | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | The access key id to access Dynamodb. Airbyte requires read permissions to the database                                               | A012345678910EXAMPLE                                                                                                                  |
| `endpoint`                                                                                                                            | *Optional<? extends String>*                                                                                                          | :heavy_minus_sign:                                                                                                                    | the URL of the Dynamodb database                                                                                                      | https://{aws_dynamo_db_url}.com                                                                                                       |
| `region`                                                                                                                              | [Optional<? extends com.airbyte.api.models.shared.SourceDynamodbDynamodbRegion>](../../models/shared/SourceDynamodbDynamodbRegion.md) | :heavy_minus_sign:                                                                                                                    | The region of the Dynamodb database                                                                                                   |                                                                                                                                       |
| `reservedAttributeNames`                                                                                                              | *Optional<? extends String>*                                                                                                          | :heavy_minus_sign:                                                                                                                    | Comma separated reserved attribute names present in your tables                                                                       | name, field_name, field-name                                                                                                          |
| `secretAccessKey`                                                                                                                     | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | The corresponding secret to the access key id.                                                                                        | a012345678910ABCDEFGH/AbCdEfGhEXAMPLEKEY                                                                                              |
| `sourceType`                                                                                                                          | [com.airbyte.api.models.shared.SourceDynamodbDynamodb](../../models/shared/SourceDynamodbDynamodb.md)                                 | :heavy_check_mark:                                                                                                                    | N/A                                                                                                                                   |                                                                                                                                       |