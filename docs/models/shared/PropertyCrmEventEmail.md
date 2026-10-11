# PropertyCrmEventEmail

The email object, when type = email


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `attachmentFileIds`                                                | List\<*String*>                                                    | :heavy_minus_sign:                                                 | N/A                                                                |
| `body`                                                             | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | The event email's body                                             |
| `cc`                                                               | List\<*String*>                                                    | :heavy_minus_sign:                                                 | The event email's cc name & email (name <test@test.com>)           |
| `from`                                                             | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | The event email's from name & email address (name <test@test.com>) |
| `subject`                                                          | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | The event email's subject                                          |
| `to`                                                               | List\<*String*>                                                    | :heavy_minus_sign:                                                 | The event email's "to" name & email (name <test@test.com>)         |