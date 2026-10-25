# Procedure

## Overview

### Available Operations

* [getHealthcareProcedure](#gethealthcareprocedure) - Retrieve a procedure
* [listHealthcareProcedures](#listhealthcareprocedures) - List all procedures

## getHealthcareProcedure

Retrieves a single HealthcareProcedure by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareProcedure" method="get" path="/healthcare/{connection_id}/procedure/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareProcedureRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareProcedureResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareProcedureRequest req = GetHealthcareProcedureRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareProcedureResponse res = sdk.procedure().getHealthcareProcedure()
                .request(req)
                .call();

        if (res.healthcareProcedure().isPresent()) {
            System.out.println(res.healthcareProcedure().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetHealthcareProcedureRequest](../../models/operations/GetHealthcareProcedureRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetHealthcareProcedureResponse](../../models/operations/GetHealthcareProcedureResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareProcedures

Returns a list of HealthcareProcedures. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareProcedures" method="get" path="/healthcare/{connection_id}/procedure" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareProceduresRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareProceduresResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareProceduresRequest req = ListHealthcareProceduresRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareProceduresResponse res = sdk.procedure().listHealthcareProcedures()
                .request(req)
                .call();

        if (res.healthcareProcedures().isPresent()) {
            System.out.println(res.healthcareProcedures().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListHealthcareProceduresRequest](../../models/operations/ListHealthcareProceduresRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListHealthcareProceduresResponse](../../models/operations/ListHealthcareProceduresResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |