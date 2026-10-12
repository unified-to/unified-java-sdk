# Usage

## Overview

### Available Operations

* [listComputeUsages](#listcomputeusages) - List all usages

## listComputeUsages

List all usages

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeUsages" method="get" path="/compute/{connection_id}/usage" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeUsagesRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeUsagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeUsagesRequest req = ListComputeUsagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeUsagesResponse res = sdk.usage().listComputeUsages()
                .request(req)
                .call();

        if (res.computeUsages().isPresent()) {
            System.out.println(res.computeUsages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListComputeUsagesRequest](../../models/operations/ListComputeUsagesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListComputeUsagesResponse](../../models/operations/ListComputeUsagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |