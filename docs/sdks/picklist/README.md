# Picklist

## Overview

### Available Operations

* [listCrmPicklists](#listcrmpicklists) - List all picklists

## listCrmPicklists

List all picklists

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmPicklists" method="get" path="/crm/{connection_id}/picklist" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmPicklistsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmPicklistsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmPicklistsRequest req = ListCrmPicklistsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmPicklistsResponse res = sdk.picklist().listCrmPicklists()
                .request(req)
                .call();

        if (res.crmPicklists().isPresent()) {
            System.out.println(res.crmPicklists().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmPicklistsRequest](../../models/operations/ListCrmPicklistsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmPicklistsResponse](../../models/operations/ListCrmPicklistsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |