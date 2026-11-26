# FhirDosage


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `doseAndRate`                                                                        | List\<[FhirDoseAndRate](../../models/shared/FhirDoseAndRate.md)>                     | :heavy_minus_sign:                                                                   | Amount of medication administered                                                    |
| `route`                                                                              | [Optional\<PropertyFhirDosageRoute>](../../models/shared/PropertyFhirDosageRoute.md) | :heavy_minus_sign:                                                                   | How drug should enter body                                                           |
| `text`                                                                               | *Optional\<String>*                                                                  | :heavy_minus_sign:                                                                   | Free text dosage instructions e.g. SIG                                               |