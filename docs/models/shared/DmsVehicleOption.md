# DmsVehicleOption

An installed vehicle option or package


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `code`                                                                         | *Optional\<String>*                                                            | :heavy_minus_sign:                                                             | Option or RPO code                                                             |
| `costAmount`                                                                   | *Optional\<Double>*                                                            | :heavy_minus_sign:                                                             | Dealer cost                                                                    |
| `description`                                                                  | *Optional\<String>*                                                            | :heavy_minus_sign:                                                             | N/A                                                                            |
| `priceAmount`                                                                  | *Optional\<Double>*                                                            | :heavy_minus_sign:                                                             | Retail price                                                                   |
| `type`                                                                         | [Optional\<DmsVehicleOptionType>](../../models/shared/DmsVehicleOptionType.md) | :heavy_minus_sign:                                                             | Factory-fitted or dealer-added                                                 |