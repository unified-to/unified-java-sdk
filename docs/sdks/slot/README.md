# Slot

## Overview

### Available Operations

* [getHealthcareSlot](#gethealthcareslot) - Retrieve a slot
* [listHealthcareSlots](#listhealthcareslots) - List all slots

## getHealthcareSlot

Retrieves a single HealthcareSlot by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHealthcareSlot" method="get" path="/healthcare/{connection_id}/slot/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHealthcareSlotRequest;
import to.unified.unified_java_sdk.models.operations.GetHealthcareSlotResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHealthcareSlotRequest req = GetHealthcareSlotRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHealthcareSlotResponse res = sdk.slot().getHealthcareSlot()
                .request(req)
                .call();

        if (res.healthcareSlot().isPresent()) {
            System.out.println(res.healthcareSlot().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHealthcareSlotRequest](../../models/operations/GetHealthcareSlotRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHealthcareSlotResponse](../../models/operations/GetHealthcareSlotResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHealthcareSlots

Returns a list of HealthcareSlots. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHealthcareSlots" method="get" path="/healthcare/{connection_id}/slot" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHealthcareSlotsRequest;
import to.unified.unified_java_sdk.models.operations.ListHealthcareSlotsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHealthcareSlotsRequest req = ListHealthcareSlotsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHealthcareSlotsResponse res = sdk.slot().listHealthcareSlots()
                .request(req)
                .call();

        if (res.healthcareSlots().isPresent()) {
            System.out.println(res.healthcareSlots().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHealthcareSlotsRequest](../../models/operations/ListHealthcareSlotsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHealthcareSlotsResponse](../../models/operations/ListHealthcareSlotsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |