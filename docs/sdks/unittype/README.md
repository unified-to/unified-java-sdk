# Unittype

## Overview

### Available Operations

* [getPropertyUnittype](#getpropertyunittype) - Retrieve an unittype
* [listPropertyUnittypes](#listpropertyunittypes) - List all unittypes

## getPropertyUnittype

Retrieves a single PropertyUnittype by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyUnittype" method="get" path="/property/{connection_id}/unittype/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyUnittypeRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyUnittypeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyUnittypeRequest req = GetPropertyUnittypeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyUnittypeResponse res = sdk.unittype().getPropertyUnittype()
                .request(req)
                .call();

        if (res.propertyUnittype().isPresent()) {
            System.out.println(res.propertyUnittype().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetPropertyUnittypeRequest](../../models/operations/GetPropertyUnittypeRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetPropertyUnittypeResponse](../../models/operations/GetPropertyUnittypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyUnittypes

Returns a list of PropertyUnittypes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyUnittypes" method="get" path="/property/{connection_id}/unittype" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyUnittypesRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyUnittypesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyUnittypesRequest req = ListPropertyUnittypesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyUnittypesResponse res = sdk.unittype().listPropertyUnittypes()
                .request(req)
                .call();

        if (res.propertyUnittypes().isPresent()) {
            System.out.println(res.propertyUnittypes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListPropertyUnittypesRequest](../../models/operations/ListPropertyUnittypesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListPropertyUnittypesResponse](../../models/operations/ListPropertyUnittypesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |