# FhirAddress


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `city`                                            | *Optional\<String>*                               | :heavy_minus_sign:                                | Name of city, town etc.                           |
| `country`                                         | *Optional\<String>*                               | :heavy_minus_sign:                                | Country (e.g. can be ISO 3166 2 or 3 letter code) |
| `line`                                            | List\<*String*>                                   | :heavy_minus_sign:                                | Street name, number, direction and P.O. Box etc.  |
| `postalCode`                                      | *Optional\<String>*                               | :heavy_minus_sign:                                | Postal code for area                              |
| `state`                                           | *Optional\<String>*                               | :heavy_minus_sign:                                | Sub-unit of country (abbreviations ok)            |
| `type`                                            | *Optional\<String>*                               | :heavy_minus_sign:                                | postal \| physical \| both                        |
| `use`                                             | *Optional\<String>*                               | :heavy_minus_sign:                                | home \| work \| temp \| old \| billing            |