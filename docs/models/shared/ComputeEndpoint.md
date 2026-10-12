# ComputeEndpoint


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `isAuthRequired`                                       | *Optional\<Boolean>*                                   | :heavy_minus_sign:                                     | Whether the URL requires a vendor access token         |
| `port`                                                 | *Optional\<Double>*                                    | :heavy_minus_sign:                                     | The port inside the instance                           |
| `protocol`                                             | [Optional\<Protocol>](../../models/shared/Protocol.md) | :heavy_minus_sign:                                     | The protocol served on this port                       |
| `url`                                                  | *Optional\<String>*                                    | :heavy_minus_sign:                                     | Public or proxied URL for this port                    |