# Condition

## Overview

### Available Operations

* [getHealthcareCondition](#gethealthcarecondition) - Retrieve a condition
* [listHealthcareConditions](#listhealthcareconditions) - List all conditions

## getHealthcareCondition

Retrieves a single HealthcareCondition by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareCondition" method="get" path="/healthcare/{connection_id}/condition/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareConditionRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareConditionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareConditionRequest req = GetHealthcareConditionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareConditionResponse res = sdk.condition().getHealthcareCondition()
                .request(req)
                .call();

        if (res.healthcareCondition().isPresent()) {
            System.out.println(res.healthcareCondition().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetHealthcareConditionRequest](../../models/operations/GetHealthcareConditionRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetHealthcareConditionResponse](../../models/operations/GetHealthcareConditionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareConditions

Returns a list of HealthcareConditions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareConditions" method="get" path="/healthcare/{connection_id}/condition" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareConditionsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareConditionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareConditionsRequest req = ListHealthcareConditionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareConditionsResponse res = sdk.condition().listHealthcareConditions()
                .request(req)
                .call();

        if (res.healthcareConditions().isPresent()) {
            System.out.println(res.healthcareConditions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListHealthcareConditionsRequest](../../models/operations/ListHealthcareConditionsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListHealthcareConditionsResponse](../../models/operations/ListHealthcareConditionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |