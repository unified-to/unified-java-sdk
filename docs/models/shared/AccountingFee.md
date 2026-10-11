# AccountingFee


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `amount`                                                                 | *double*                                                                 | :heavy_check_mark:                                                       | N/A                                                                      |
| `currency`                                                               | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | ISO 4217 currency code, e.g. USD                                         |
| `originalType`                                                           | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | The provider's original fee label, e.g. "VAT" or a shipping carrier name |
| `type`                                                                   | [AccountingFeeType](../../models/shared/AccountingFeeType.md)            | :heavy_check_mark:                                                       | Unified fee category                                                     |