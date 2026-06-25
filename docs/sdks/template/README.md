# Template

## Overview

### Available Operations

* [getSigningTemplate2](#getsigningtemplate2) - Retrieve a template
* [listSigningTemplates2](#listsigningtemplates2) - List all templates

## getSigningTemplate2

Retrieve a template

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningTemplate2" method="get" path="/signing/{connection_id}/template/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplate2Request;
import to.unified.unified_java_sdk.models.operations.GetSigningTemplate2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningTemplate2Request req = GetSigningTemplate2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningTemplate2Response res = sdk.template().getSigningTemplate2()
                .request(req)
                .call();

        if (res.signingTemplate().isPresent()) {
            System.out.println(res.signingTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSigningTemplate2Request](../../models/operations/GetSigningTemplate2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSigningTemplate2Response](../../models/operations/GetSigningTemplate2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningTemplates2

List all templates

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningTemplates2" method="get" path="/signing/{connection_id}/template" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplates2Request;
import to.unified.unified_java_sdk.models.operations.ListSigningTemplates2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningTemplates2Request req = ListSigningTemplates2Request.builder()
                .connectionId("<id>")
                .build();

        ListSigningTemplates2Response res = sdk.template().listSigningTemplates2()
                .request(req)
                .call();

        if (res.signingTemplates().isPresent()) {
            System.out.println(res.signingTemplates().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSigningTemplates2Request](../../models/operations/ListSigningTemplates2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSigningTemplates2Response](../../models/operations/ListSigningTemplates2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |