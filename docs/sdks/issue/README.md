# Issue
(*issue()*)

## Overview

### Available Operations

* [listUnifiedIssues](#listunifiedissues) - List support issues

## listUnifiedIssues

List support issues

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unifiedto.UnifiedTo;
import to.unified.unifiedto.models.operations.ListUnifiedIssuesRequest;
import to.unified.unifiedto.models.operations.ListUnifiedIssuesResponse;
import to.unified.unifiedto.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedIssuesRequest req = ListUnifiedIssuesRequest.builder()
                .build();

        ListUnifiedIssuesResponse res = sdk.issue().listUnifiedIssues()
                .request(req)
                .call();

        if (res.issues().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListUnifiedIssuesRequest](../../models/operations/ListUnifiedIssuesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListUnifiedIssuesResponse](../../models/operations/ListUnifiedIssuesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |