# UpdateCrmFileResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | HTTP response content type for this operation                                                                            |
| `crmFile`                                                                                                                | [com.unifiedapi.unifiedto.models.shared.CrmFile](../../models/shared/CrmFile.md)                                         | :heavy_minus_sign:                                                                                                       | Successful                                                                                                               |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | HTTP response status code for this operation                                                                             |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | Raw HTTP response; suitable for custom response parsing                                                                  |