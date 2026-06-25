# Query

## Overview

### Available Operations

* [createDatastoreQuery2](#createdatastorequery2) - Create a query

## createDatastoreQuery2

Create a query

### Example Usage

<!-- UsageSnippet language="java" operationID="createDatastoreQuery2" method="post" path="/datastore/{connection_id}/query" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQuery2Request;
import to.unified.unified_java_sdk.models.operations.CreateDatastoreQuery2Response;
import to.unified.unified_java_sdk.models.shared.DatastoreQuery;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateDatastoreQuery2Request req = CreateDatastoreQuery2Request.builder()
                .datastoreQuery(DatastoreQuery.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateDatastoreQuery2Response res = sdk.query().createDatastoreQuery2()
                .request(req)
                .call();

        if (res.datastoreQuery().isPresent()) {
            System.out.println(res.datastoreQuery().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateDatastoreQuery2Request](../../models/operations/CreateDatastoreQuery2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateDatastoreQuery2Response](../../models/operations/CreateDatastoreQuery2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |