# ListUnifiedSecretsmanagerSecretsRequest


## Fields

| Field                                    | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `limit`                                  | *Optional\<Double>*                      | :heavy_minus_sign:                       | Maximum number of secrets to return      |
| `offset`                                 | *Optional\<Double>*                      | :heavy_minus_sign:                       | Number of secrets to skip                |
| `query`                                  | *Optional\<String>*                      | :heavy_minus_sign:                       | Filter secrets by name                   |
| `secretsmanagerId`                       | *String*                                 | :heavy_check_mark:                       | The secrets manager to list secrets from |