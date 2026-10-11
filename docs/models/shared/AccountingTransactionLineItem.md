# AccountingTransactionLineItem


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `accountId`                                                    | *Optional\<String>*                                            | :heavy_minus_sign:                                             | (reference to AccountingAccount)                               |
| `categoryIds`                                                  | List\<*String*>                                                | :heavy_minus_sign:                                             | N/A                                                            |
| `description`                                                  | *Optional\<String>*                                            | :heavy_minus_sign:                                             | N/A                                                            |
| `id`                                                           | *Optional\<String>*                                            | :heavy_minus_sign:                                             | N/A                                                            |
| `name`                                                         | *Optional\<String>*                                            | :heavy_minus_sign:                                             | N/A                                                            |
| `objectType`                                                   | *Optional\<String>*                                            | :heavy_minus_sign:                                             | N/A                                                            |
| `taxrateId`                                                    | *Optional\<String>*                                            | :heavy_minus_sign:                                             | ref -> AccountingTaxrate applied to the line                   |
| `totalAmount`                                                  | *Optional\<Double>*                                            | :heavy_minus_sign:                                             | will be a positive value for a debit and negative for a credit |
| `unitAmount`                                                   | *Optional\<Double>*                                            | :heavy_minus_sign:                                             | N/A                                                            |
| `unitQuantity`                                                 | *Optional\<Double>*                                            | :heavy_minus_sign:                                             | N/A                                                            |