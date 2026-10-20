# AdsPromoted

Promoted entity (e.g. page, app, product, tweet) for ads create


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `id`                                                      | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `metadata`                                                | List\<[AdsMetadata](../../models/shared/AdsMetadata.md)>  | :heavy_minus_sign:                                        | N/A                                                       |
| `name`                                                    | *Optional\<String>*                                       | :heavy_minus_sign:                                        | N/A                                                       |
| `raw`                                                     | Map\<String, *Object*>                                    | :heavy_minus_sign:                                        | N/A                                                       |
| `type`                                                    | [AdsPromotedType](../../models/shared/AdsPromotedType.md) | :heavy_check_mark:                                        | Promoted entity types for ads_promoted list endpoint      |