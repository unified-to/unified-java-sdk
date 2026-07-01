# Picklist

## Overview

### Available Operations

* [listCrmPicklists2](#listcrmpicklists2) - List all picklists

## listCrmPicklists2

List all picklists

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmPicklists2" method="get" path="/crm/{connection_id}/picklist" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmPicklists2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmPicklists2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmPicklists2Request req = ListCrmPicklists2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmPicklists2Response res = sdk.picklist().listCrmPicklists2()
                .request(req)
                .call();

        if (res.crmPicklists().isPresent()) {
            System.out.println(res.crmPicklists().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmPicklists2Request](../../models/operations/ListCrmPicklists2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmPicklists2Response](../../models/operations/ListCrmPicklists2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |