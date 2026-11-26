# DmsAppointmentService

A service requested on an appointment


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `complaint`                                          | *Optional\<String>*                                  | :heavy_minus_sign:                                   | Customer's own words                                 |
| `estimateAmount`                                     | *Optional\<Double>*                                  | :heavy_minus_sign:                                   | Estimated price                                      |
| `estimatedHours`                                     | *Optional\<Double>*                                  | :heavy_minus_sign:                                   | N/A                                                  |
| `id`                                                 | *Optional\<String>*                                  | :heavy_minus_sign:                                   | Line identifier                                      |
| `name`                                               | *Optional\<String>*                                  | :heavy_minus_sign:                                   | Service or operation description                     |
| `opcodeId`                                           | *Optional\<String>*                                  | :heavy_minus_sign:                                   | The DmsOpcode ID                                     |
| `payType`                                            | [Optional\<PayType>](../../models/shared/PayType.md) | :heavy_minus_sign:                                   | N/A                                                  |
| `technicianUserIds`                                  | List\<*String*>                                      | :heavy_minus_sign:                                   | Pre-assigned technicians, as HR Employees            |