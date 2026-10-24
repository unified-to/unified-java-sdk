# Timeentry

## Overview

### Available Operations

* [createLegalTimeentry](#createlegaltimeentry) - Create a timeentry
* [getLegalTimeentry](#getlegaltimeentry) - Retrieve a timeentry
* [listLegalTimeentries](#listlegaltimeentries) - List all timeentries
* [patchLegalTimeentry](#patchlegaltimeentry) - Update a timeentry
* [removeLegalTimeentry](#removelegaltimeentry) - Remove a timeentry
* [updateLegalTimeentry](#updatelegaltimeentry) - Update a timeentry

## createLegalTimeentry

Creates a LegalTimeentry. Provide the unified LegalTimeentry fields in the request body; they are mapped to the provider's API. Returns the created LegalTimeentry.

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalTimeentry" method="post" path="/legal/{connection_id}/timeentry" example="legal_timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.LegalTimeentry;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalTimeentryRequest req = CreateLegalTimeentryRequest.builder()
                .legalTimeentry(LegalTimeentry.builder()
                    .billableMinutes(390d)
                    .createdAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .currency("ZAR")
                    .description("Ea derideo adulatio torrens.")
                    .id("ffe0710d-456b-45dd-a3f7-bcead0686cf5")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-30T04:16:36.193Z"))
                    .workedAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalTimeentryResponse res = sdk.timeentry().createLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateLegalTimeentryRequest](../../models/operations/CreateLegalTimeentryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateLegalTimeentryResponse](../../models/operations/CreateLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegalTimeentry

Retrieves a single LegalTimeentry by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalTimeentry" method="get" path="/legal/{connection_id}/timeentry/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalTimeentryRequest req = GetLegalTimeentryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalTimeentryResponse res = sdk.timeentry().getLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLegalTimeentryRequest](../../models/operations/GetLegalTimeentryRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLegalTimeentryResponse](../../models/operations/GetLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLegalTimeentries

Returns a list of LegalTimeentries. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalTimeentries" method="get" path="/legal/{connection_id}/timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalTimeentriesRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalTimeentriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalTimeentriesRequest req = ListLegalTimeentriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalTimeentriesResponse res = sdk.timeentry().listLegalTimeentries()
                .request(req)
                .call();

        if (res.legalTimeentries().isPresent()) {
            System.out.println(res.legalTimeentries().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListLegalTimeentriesRequest](../../models/operations/ListLegalTimeentriesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListLegalTimeentriesResponse](../../models/operations/ListLegalTimeentriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLegalTimeentry

Updates the LegalTimeentry identified by `id`. Provide the unified LegalTimeentry fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalTimeentry" method="patch" path="/legal/{connection_id}/timeentry/{id}" example="legal_timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.LegalTimeentry;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalTimeentryRequest req = PatchLegalTimeentryRequest.builder()
                .legalTimeentry(LegalTimeentry.builder()
                    .billableMinutes(390d)
                    .createdAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .currency("ZAR")
                    .description("Ea derideo adulatio torrens.")
                    .id("81f315ef-7a9f-42ce-98e0-b3dcf059bfcc")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-30T04:16:36.194Z"))
                    .workedAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalTimeentryResponse res = sdk.timeentry().patchLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchLegalTimeentryRequest](../../models/operations/PatchLegalTimeentryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchLegalTimeentryResponse](../../models/operations/PatchLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLegalTimeentry

Deletes the LegalTimeentry identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalTimeentry" method="delete" path="/legal/{connection_id}/timeentry/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalTimeentryRequest req = RemoveLegalTimeentryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalTimeentryResponse res = sdk.timeentry().removeLegalTimeentry()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveLegalTimeentryRequest](../../models/operations/RemoveLegalTimeentryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveLegalTimeentryResponse](../../models/operations/RemoveLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLegalTimeentry

Updates the LegalTimeentry identified by `id`. Provide the unified LegalTimeentry fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalTimeentry" method="put" path="/legal/{connection_id}/timeentry/{id}" example="legal_timeentry" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalTimeentryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalTimeentryResponse;
import to.unified.unified_java_sdk.models.shared.LegalTimeentry;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalTimeentryRequest req = UpdateLegalTimeentryRequest.builder()
                .legalTimeentry(LegalTimeentry.builder()
                    .billableMinutes(390d)
                    .createdAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .currency("ZAR")
                    .description("Ea derideo adulatio torrens.")
                    .id("81f315ef-7a9f-42ce-98e0-b3dcf059bfcc")
                    .isBillable(true)
                    .metadata(List.of())
                    .minutes(390d)
                    .rateAmount(637d)
                    .totalAmount(4140.5)
                    .updatedAt(OffsetDateTime.parse("2022-06-30T04:16:36.194Z"))
                    .workedAt(OffsetDateTime.parse("2022-05-06T03:26:03.756Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalTimeentryResponse res = sdk.timeentry().updateLegalTimeentry()
                .request(req)
                .call();

        if (res.legalTimeentry().isPresent()) {
            System.out.println(res.legalTimeentry().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateLegalTimeentryRequest](../../models/operations/UpdateLegalTimeentryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateLegalTimeentryResponse](../../models/operations/UpdateLegalTimeentryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |