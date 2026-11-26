# PropertyFhirIdentifierType

Description of the identifier (v2-0203 code, eg. MR, NPI)


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `coding`                                                              | List\<[FhirCoding](../../models/shared/FhirCoding.md)>                | :heavy_minus_sign:                                                    | Codes defined by a terminology system                                 |
| `extension`                                                           | List\<[FhirExtension](../../models/shared/FhirExtension.md)>          | :heavy_minus_sign:                                                    | Extensions, eg. data-absent-reason when a required concept is unknown |
| `text`                                                                | *Optional\<String>*                                                   | :heavy_minus_sign:                                                    | Plain text representation of the concept                              |