# PropertyFhirEncounterDiagnosisCondition

The diagnosis or procedure relevant to the encounter (Condition reference)


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `display`                                                               | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | Text alternative for the resource                                       |
| `extension`                                                             | List\<[FhirExtension](../../models/shared/FhirExtension.md)>            | :heavy_minus_sign:                                                      | Extensions, eg. data-absent-reason when a required reference is unknown |
| `reference`                                                             | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | Relative reference, eg. Patient/123                                     |