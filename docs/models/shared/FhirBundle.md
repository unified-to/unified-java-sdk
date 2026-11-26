# FhirBundle


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `entry`                                                                 | List\<[FhirBundleEntry](../../models/shared/FhirBundleEntry.md)>        | :heavy_minus_sign:                                                      | Entry in the bundle - will have a resource or information               |
| `link`                                                                  | List\<[FhirBundleLink](../../models/shared/FhirBundleLink.md)>          | :heavy_minus_sign:                                                      | Links related to this Bundle (self, next)                               |
| `resourceType`                                                          | [FhirBundleResourceType](../../models/shared/FhirBundleResourceType.md) | :heavy_check_mark:                                                      | Always Bundle                                                           |
| `total`                                                                 | *Optional\<Double>*                                                     | :heavy_minus_sign:                                                      | Total number of matches, when the integration reports it                |
| `type`                                                                  | [FhirBundleType](../../models/shared/FhirBundleType.md)                 | :heavy_check_mark:                                                      | searchset                                                               |