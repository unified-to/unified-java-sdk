# PropertyShippingRateFromAddress

Origin address


## Fields

| Field                                      | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `address1`                                 | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        |
| `address2`                                 | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        |
| `city`                                     | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        |
| `companyName`                              | *Optional\<String>*                        | :heavy_minus_sign:                         | Company name (for commercial addresses)    |
| `country`                                  | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        |
| `countryCode`                              | *Optional\<String>*                        | :heavy_minus_sign:                         | ISO 2-digit country code                   |
| `deliveryInstructions`                     | *Optional\<String>*                        | :heavy_minus_sign:                         | Special delivery notes                     |
| `email`                                    | *Optional\<String>*                        | :heavy_minus_sign:                         | Email address (for delivery notifications) |
| `isResidential`                            | *Optional\<Boolean>*                       | :heavy_minus_sign:                         | Alias for address_type === 'RESIDENTIAL'   |
| `isValidated`                              | *Optional\<Boolean>*                       | :heavy_minus_sign:                         | Whether address has been validated         |
| `name`                                     | *Optional\<String>*                        | :heavy_minus_sign:                         | Recipientsender name                       |
| `postalCode`                               | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        |
| `region`                                   | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        |
| `regionCode`                               | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        |
| `telephone`                                | *Optional\<String>*                        | :heavy_minus_sign:                         | Phone number (required by FedEx, UPS, DHL) |