# Template

## Overview

### Available Operations

* [getSigningTemplate](#getsigningtemplate) - Retrieve a template
* [listSigningTemplates](#listsigningtemplates) - List all templates

## getSigningTemplate

Retrieve a template

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningTemplate" method="get" path="/signing/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplateRequest;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplateResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningTemplateRequest req = GetSigningTemplateRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningTemplateResponse res = sdk.template().getSigningTemplate()
                .request(req)
                .call();

        if (res.signingTemplate().isPresent()) {
            System.out.println(res.signingTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetSigningTemplateRequest](../../models/operations/GetSigningTemplateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetSigningTemplateResponse](../../models/operations/GetSigningTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningTemplates

List all templates

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningTemplates" method="get" path="/signing/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplatesRequest;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplatesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningTemplatesRequest req = ListSigningTemplatesRequest.builder()
                .connectionId("<id>")
                .build();

        ListSigningTemplatesResponse res = sdk.template().listSigningTemplates()
                .request(req)
                .call();

        if (res.signingTemplates().isPresent()) {
            System.out.println(res.signingTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListSigningTemplatesRequest](../../models/operations/ListSigningTemplatesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListSigningTemplatesResponse](../../models/operations/ListSigningTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |