# Change

## Overview

### Available Operations

* [getTaskChange2](#gettaskchange2) - Retrieve a change
* [listTaskChanges2](#listtaskchanges2) - List all changes

## getTaskChange2

Retrieve a change

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskChange2" method="get" path="/task/{connection_id}/change/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskChange2Request;
import to.unified.unified_java_sdk.models.operations.GetTaskChange2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskChange2Request req = GetTaskChange2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskChange2Response res = sdk.change().getTaskChange2()
                .request(req)
                .call();

        if (res.taskChange().isPresent()) {
            System.out.println(res.taskChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTaskChange2Request](../../models/operations/GetTaskChange2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTaskChange2Response](../../models/operations/GetTaskChange2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskChanges2

List all changes

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskChanges2" method="get" path="/task/{connection_id}/change" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskChanges2Request;
import to.unified.unified_java_sdk.models.operations.ListTaskChanges2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskChanges2Request req = ListTaskChanges2Request.builder()
                .connectionId("<id>")
                .build();

        ListTaskChanges2Response res = sdk.change().listTaskChanges2()
                .request(req)
                .call();

        if (res.taskChanges().isPresent()) {
            System.out.println(res.taskChanges().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTaskChanges2Request](../../models/operations/ListTaskChanges2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTaskChanges2Response](../../models/operations/ListTaskChanges2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |