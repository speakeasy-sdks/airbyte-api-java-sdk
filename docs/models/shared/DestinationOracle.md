# DestinationOracle


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                        | Type                                                                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                  | Example                                                                                                                                                                                                                                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `destinationType`                                                                                                                                                                                                                                                                                                                                            | [com.airbyte.api.models.shared.Oracle](../../models/shared/Oracle.md)                                                                                                                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                                                                                                                                                          |                                                                                                                                                                                                                                                                                                                                                              |
| `host`                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                           | The hostname of the database.                                                                                                                                                                                                                                                                                                                                |                                                                                                                                                                                                                                                                                                                                                              |
| `jdbcUrlParams`                                                                                                                                                                                                                                                                                                                                              | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                           | Additional properties to pass to the JDBC URL string when connecting to the database formatted as 'key=value' pairs separated by the symbol '&'. (example: key1=value1&key2=value2&key3=value3).                                                                                                                                                             |                                                                                                                                                                                                                                                                                                                                                              |
| `password`                                                                                                                                                                                                                                                                                                                                                   | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                           | The password associated with the username.                                                                                                                                                                                                                                                                                                                   |                                                                                                                                                                                                                                                                                                                                                              |
| `port`                                                                                                                                                                                                                                                                                                                                                       | *Optional<? extends Long>*                                                                                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                           | The port of the database.                                                                                                                                                                                                                                                                                                                                    | 1521                                                                                                                                                                                                                                                                                                                                                         |
| `schema`                                                                                                                                                                                                                                                                                                                                                     | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                           | The default schema is used as the target schema for all statements issued from the connection that do not explicitly specify a schema name. The usual value for this field is "airbyte".  In Oracle, schemas and users are the same thing, so the "user" parameter is used as the login credentials and this is used for the default Airbyte message schema. | airbyte                                                                                                                                                                                                                                                                                                                                                      |
| `sid`                                                                                                                                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                           | The System Identifier uniquely distinguishes the instance from any other instance on the same computer.                                                                                                                                                                                                                                                      |                                                                                                                                                                                                                                                                                                                                                              |
| `tunnelMethod`                                                                                                                                                                                                                                                                                                                                               | [Optional<? extends com.airbyte.api.models.shared.DestinationOracleSSHTunnelMethod>](../../models/shared/DestinationOracleSSHTunnelMethod.md)                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                           | Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.                                                                                                                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                              |
| `username`                                                                                                                                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                           | The username to access the database. This user must have CREATE USER privileges in the database.                                                                                                                                                                                                                                                             |                                                                                                                                                                                                                                                                                                                                                              |