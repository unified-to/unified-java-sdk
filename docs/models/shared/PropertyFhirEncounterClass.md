# PropertyFhirEncounterClass

Classification of patient encounter


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `code`                                                       | *Optional\<String>*                                          | :heavy_minus_sign:                                           | Classification of patient encounter, eg. AMB, EMER, IMP, VR  |
| `extension`                                                  | List\<[FhirExtension](../../models/shared/FhirExtension.md)> | :heavy_minus_sign:                                           | data-absent-reason when the encounter class is unknown       |
| `system`                                                     | *Optional\<String>*                                          | :heavy_minus_sign:                                           | Identity of the terminology system (v3-ActCode)              |