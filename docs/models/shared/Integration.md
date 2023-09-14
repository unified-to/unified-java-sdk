# Integration

Informational object for supported integrations.


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `apiDocsUrl`                                                                                | *String*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `beta`                                                                                      | *Boolean*                                                                                   | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `categories`                                                                                | List<[PropertyIntegrationCategories](../../models/shared/PropertyIntegrationCategories.md)> | :heavy_check_mark:                                                                          | The categories of support solutions that this integration has                               |
| `color`                                                                                     | *String*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `createdAt`                                                                                 | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)   | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `faIcon`                                                                                    | *String*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `inProgress`                                                                                | *Boolean*                                                                                   | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `isActive`                                                                                  | *Boolean*                                                                                   | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `logoUrl`                                                                                   | *String*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `name`                                                                                      | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `rateLimitDescription`                                                                      | *String*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `support`                                                                                   | Map<String, [IntegrationSupport](../../models/shared/IntegrationSupport.md)>                | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `testedAt`                                                                                  | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)   | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `textColor`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `tokenInstructions`                                                                         | List<*String*>                                                                              | :heavy_minus_sign:                                                                          | instructions for the user on how to find the token/key                                      |
| `tokenNames`                                                                                | List<*String*>                                                                              | :heavy_minus_sign:                                                                          | if auth_types = 'token'                                                                     |
| `type`                                                                                      | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         |
| `updatedAt`                                                                                 | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)   | :heavy_minus_sign:                                                                          | N/A                                                                                         |
| `webUrl`                                                                                    | *String*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |