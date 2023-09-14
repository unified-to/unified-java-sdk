# CrmDeal

A deal represents an opportunity with companies and/or contacts


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `amount`                                                                                  | *Double*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `closedAt`                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `createdAt`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `currency`                                                                                | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `id`                                                                                      | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `lostReason`                                                                              | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `name`                                                                                    | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `pipeline`                                                                                | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `probability`                                                                             | *Double*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `raw`                                                                                     | [PropertyCrmDealRaw](../../models/shared/PropertyCrmDealRaw.md)                           | :heavy_minus_sign:                                                                        | The raw data returned by the integration for this deal                                    |
| `source`                                                                                  | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `stage`                                                                                   | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `tags`                                                                                    | List<*String*>                                                                            | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `updatedAt`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `wonReason`                                                                               | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |