# QmsAffectedItem

A part, lot or serial affected by a quality record


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `documentId`                                                      | *Optional\<String>*                                               | :heavy_minus_sign:                                                | The PlmDocument ID, when the same vendor also provides PLM        |
| `lotNumber`                                                       | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               |
| `partId`                                                          | *Optional\<String>*                                               | :heavy_minus_sign:                                                | The PlmPart (revision) ID, when the same vendor also provides PLM |
| `partNumber`                                                      | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               |
| `quantity`                                                        | *Optional\<Double>*                                               | :heavy_minus_sign:                                                | Quantity affected                                                 |
| `revision`                                                        | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               |
| `serialNumber`                                                    | *Optional\<String>*                                               | :heavy_minus_sign:                                                | N/A                                                               |