# CdpIdentifier


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `encoding`                                                               | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | The encoding of the identifier value (eg. raw, sha256)                   |
| `isPrimary`                                                              | *Optional\<Boolean>*                                                     | :heavy_minus_sign:                                                       | Whether this is the primary identifier for the profile                   |
| `source`                                                                 | *Optional\<String>*                                                      | :heavy_minus_sign:                                                       | The source that provided this identifier                                 |
| `type`                                                                   | [Optional\<CdpIdentifierType>](../../models/shared/CdpIdentifierType.md) | :heavy_minus_sign:                                                       | The type of the identifier (eg. EMAIL, USER_ID, ANONYMOUS_ID)            |
| `value`                                                                  | *String*                                                                 | :heavy_check_mark:                                                       | The identifier value that resolves to the profile                        |