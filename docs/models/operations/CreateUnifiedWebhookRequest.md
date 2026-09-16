# CreateUnifiedWebhookRequest


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `webhook`                                                                     | [Webhook](../../models/shared/Webhook.md)                                     | :heavy_check_mark:                                                            | A webhook is used to POST new/updated information to your server.             |
| `includeAll`                                                                  | *Optional\<Boolean>*                                                          | :heavy_minus_sign:                                                            | When true, send existing/historic data. When false, no historic data is sent. |