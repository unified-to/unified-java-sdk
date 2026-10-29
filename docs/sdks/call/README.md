# Call

## Overview

### Available Operations

* [createUcCall](#createuccall) - Create a call
* [getUcCall](#getuccall) - Retrieve a call
* [listUcCalls](#listuccalls) - List all calls
* [patchUcCall](#patchuccall) - Update a call
* [updateUcCall](#updateuccall) - Update a call

## createUcCall

Creates a UcCall. Provide the unified UcCall fields in the request body; they are mapped to the provider's API. Returns the created UcCall.

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcCall" method="post" path="/uc/{connection_id}/call" example="uc_call" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcCallRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcCallResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcCallRequest req = CreateUcCallRequest.builder()
                .ucCall(UcCall.builder()
                    .answerAt(OffsetDateTime.parse("2025-05-18T03:34:42.227Z"))
                    .contacts(List.of())
                    .conversationIdentifier("65870c5e-7ff3-465b-9732-7212a2e4671c")
                    .costAmount(1.564)
                    .createdAt(OffsetDateTime.parse("2023-04-22T19:05:34.882Z"))
                    .currency("USD")
                    .durationSeconds(2556d)
                    .endAt(OffsetDateTime.parse("2024-06-01T11:38:09.352Z"))
                    .id("65870c5e-7ff3-465b-9732-7212a2e4671c")
                    .isPrivate(false)
                    .metadata(List.of(
                        UcMetadata.builder()
                            .extraData(UcMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(UcMetadataFormat.PRICE)
                            .id("a2653887-0ec7-478d-86f3-1a83e663f017")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(UcMetadataValue.of("tui"))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-12-18T20:22:36.621Z"))
                    .status(UcCallStatus.IN_PROGRESS)
                    .telephone(PropertyUcCallTelephone.builder()
                        .telephone("(493) 534-0768")
                        .type(PropertyUcCallTelephoneType.MOBILE)
                        .build())
                    .type(UcCallType.INBOUND)
                    .updatedAt(OffsetDateTime.parse("2023-08-03T23:20:31.004Z"))
                    .userPhone("819-894-3317 x163")
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcCallResponse res = sdk.call().createUcCall()
                .request(req)
                .call();

        if (res.ucCall().isPresent()) {
            System.out.println(res.ucCall().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreateUcCallRequest](../../models/operations/CreateUcCallRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateUcCallResponse](../../models/operations/CreateUcCallResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcCall

Retrieves a single UcCall by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcCall" method="get" path="/uc/{connection_id}/call/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcCallRequest;
import to.unified.unified_java_sdk.models.operations.GetUcCallResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcCallRequest req = GetUcCallRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcCallResponse res = sdk.call().getUcCall()
                .request(req)
                .call();

        if (res.ucCall().isPresent()) {
            System.out.println(res.ucCall().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetUcCallRequest](../../models/operations/GetUcCallRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetUcCallResponse](../../models/operations/GetUcCallResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcCalls

Returns a list of UcCalls. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcCalls" method="get" path="/uc/{connection_id}/call" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcCallsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcCallsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcCallsRequest req = ListUcCallsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcCallsResponse res = sdk.call().listUcCalls()
                .request(req)
                .call();

        if (res.ucCalls().isPresent()) {
            System.out.println(res.ucCalls().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListUcCallsRequest](../../models/operations/ListUcCallsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListUcCallsResponse](../../models/operations/ListUcCallsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUcCall

Updates the UcCall identified by `id`. Provide the unified UcCall fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcCall" method="patch" path="/uc/{connection_id}/call/{id}" example="uc_call" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcCallRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcCallResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcCallRequest req = PatchUcCallRequest.builder()
                .ucCall(UcCall.builder()
                    .answerAt(OffsetDateTime.parse("2025-05-18T03:34:42.253Z"))
                    .contacts(List.of())
                    .conversationIdentifier("34ed46fd-aab2-47e5-9663-5718a6a848ea")
                    .costAmount(1.564)
                    .createdAt(OffsetDateTime.parse("2023-04-22T19:05:34.882Z"))
                    .currency("USD")
                    .durationSeconds(2556d)
                    .endAt(OffsetDateTime.parse("2024-06-01T11:38:09.366Z"))
                    .id("34ed46fd-aab2-47e5-9663-5718a6a848ea")
                    .isPrivate(false)
                    .metadata(List.of(
                        UcMetadata.builder()
                            .extraData(UcMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(UcMetadataFormat.PRICE)
                            .id("afd0ef3d-ec84-4ccf-9d41-66b3a8d74b7e")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(UcMetadataValue.of("tui"))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-12-18T20:22:36.629Z"))
                    .status(UcCallStatus.IN_PROGRESS)
                    .telephone(PropertyUcCallTelephone.builder()
                        .telephone("(493) 534-0768")
                        .type(PropertyUcCallTelephoneType.MOBILE)
                        .build())
                    .type(UcCallType.INBOUND)
                    .updatedAt(OffsetDateTime.parse("2023-08-03T23:20:31.008Z"))
                    .userPhone("819-894-3317 x163")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcCallResponse res = sdk.call().patchUcCall()
                .request(req)
                .call();

        if (res.ucCall().isPresent()) {
            System.out.println(res.ucCall().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [PatchUcCallRequest](../../models/operations/PatchUcCallRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PatchUcCallResponse](../../models/operations/PatchUcCallResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUcCall

Updates the UcCall identified by `id`. Provide the unified UcCall fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcCall" method="put" path="/uc/{connection_id}/call/{id}" example="uc_call" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcCallRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcCallResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcCallRequest req = UpdateUcCallRequest.builder()
                .ucCall(UcCall.builder()
                    .answerAt(OffsetDateTime.parse("2025-05-18T03:34:42.253Z"))
                    .contacts(List.of())
                    .conversationIdentifier("34ed46fd-aab2-47e5-9663-5718a6a848ea")
                    .costAmount(1.564)
                    .createdAt(OffsetDateTime.parse("2023-04-22T19:05:34.882Z"))
                    .currency("USD")
                    .durationSeconds(2556d)
                    .endAt(OffsetDateTime.parse("2024-06-01T11:38:09.366Z"))
                    .id("34ed46fd-aab2-47e5-9663-5718a6a848ea")
                    .isPrivate(false)
                    .metadata(List.of(
                        UcMetadata.builder()
                            .extraData(UcMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(UcMetadataFormat.PRICE)
                            .id("afd0ef3d-ec84-4ccf-9d41-66b3a8d74b7e")
                            .namespace("custom")
                            .slug("custom_field")
                            .value(UcMetadataValue.of("tui"))
                            .build()))
                    .startAt(OffsetDateTime.parse("2023-12-18T20:22:36.629Z"))
                    .status(UcCallStatus.IN_PROGRESS)
                    .telephone(PropertyUcCallTelephone.builder()
                        .telephone("(493) 534-0768")
                        .type(PropertyUcCallTelephoneType.MOBILE)
                        .build())
                    .type(UcCallType.INBOUND)
                    .updatedAt(OffsetDateTime.parse("2023-08-03T23:20:31.008Z"))
                    .userPhone("819-894-3317 x163")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcCallResponse res = sdk.call().updateUcCall()
                .request(req)
                .call();

        if (res.ucCall().isPresent()) {
            System.out.println(res.ucCall().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateUcCallRequest](../../models/operations/UpdateUcCallRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateUcCallResponse](../../models/operations/UpdateUcCallResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |