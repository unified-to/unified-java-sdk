# Availability

## Overview

### Available Operations

* [listCommerceAvailabilities2](#listcommerceavailabilities2) - List all availabilities

## listCommerceAvailabilities2

List all availabilities

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceAvailabilities2" method="get" path="/commerce/{connection_id}/availability" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceAvailabilities2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceAvailabilities2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceAvailabilities2Request req = ListCommerceAvailabilities2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceAvailabilities2Response res = sdk.availability().listCommerceAvailabilities2()
                .request(req)
                .call();

        if (res.commerceAvailabilities().isPresent()) {
            System.out.println(res.commerceAvailabilities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListCommerceAvailabilities2Request](../../models/operations/ListCommerceAvailabilities2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListCommerceAvailabilities2Response](../../models/operations/ListCommerceAvailabilities2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |