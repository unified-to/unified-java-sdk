# Issue


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `createdAt`                                       | *Optional\<String>*                               | :heavy_minus_sign:                                | (ISO-8601 / YYYY-MM-DDTHH:MM:SSZ format)          |
| `customerNote`                                    | *Optional\<String>*                               | :heavy_minus_sign:                                | N/A                                               |
| `id`                                              | *Optional\<String>*                               | :heavy_minus_sign:                                | N/A                                               |
| `importance`                                      | *Optional\<Double>*                               | :heavy_minus_sign:                                | 1-5, 1 is lowest                                  |
| `resolutionTime`                                  | *Optional\<Double>*                               | :heavy_minus_sign:                                | N/A                                               |
| `size`                                            | *Optional\<Double>*                               | :heavy_minus_sign:                                | 1-5, 1 is lowest                                  |
| `status`                                          | [IssueStatus](../../models/shared/IssueStatus.md) | :heavy_check_mark:                                | N/A                                               |
| `ticketRef`                                       | *String*                                          | :heavy_check_mark:                                | N/A                                               |
| `title`                                           | *String*                                          | :heavy_check_mark:                                | N/A                                               |
| `type`                                            | List\<*String*>                                   | :heavy_minus_sign:                                | N/A                                               |
| `updatedAt`                                       | *Optional\<String>*                               | :heavy_minus_sign:                                | (ISO-8601 / YYYY-MM-DDTHH:MM:SSZ format)          |
| `url`                                             | *Optional\<String>*                               | :heavy_minus_sign:                                | N/A                                               |
| `workspaceId`                                     | *String*                                          | :heavy_check_mark:                                | (reference to KmsSpace)                           |