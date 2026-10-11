# GenaiQuestion


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `id`                                                                          | *String*                                                                      | :heavy_check_mark:                                                            | A caller-chosen key; the matching answer is returned with the same id.        |
| `instructions`                                                                | *String*                                                                      | :heavy_check_mark:                                                            | The question to evaluate.                                                     |
| `options`                                                                     | List\<*String*>                                                               | :heavy_minus_sign:                                                            | CHOICE: the options to select from; SCORE: the ordered levels (lowest first). |
| `type`                                                                        | [GenaiQuestionType](../../models/shared/GenaiQuestionType.md)                 | :heavy_check_mark:                                                            | N/A                                                                           |