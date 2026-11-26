# PrintingShippingoption

A shipping method available for a quote, with its price


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `amount`                                                    | *Optional\<Double>*                                         | :heavy_minus_sign:                                          | Shipping price                                              |
| `code`                                                      | *Optional\<String>*                                         | :heavy_minus_sign:                                          | Shipping method code, used as `shipping_method` on an order |
| `currency`                                                  | *Optional\<String>*                                         | :heavy_minus_sign:                                          | ISO 4217 currency code                                      |
| `maxDeliveryDays`                                           | *Optional\<Double>*                                         | :heavy_minus_sign:                                          | Estimated maximum number of days to delivery                |
| `minDeliveryDays`                                           | *Optional\<Double>*                                         | :heavy_minus_sign:                                          | Estimated minimum number of days to delivery                |
| `name`                                                      | *Optional\<String>*                                         | :heavy_minus_sign:                                          | Display name                                                |