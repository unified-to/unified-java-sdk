# Interview

## Overview

### Available Operations

* [createAtsInterview](#createatsinterview) - Create an interview
* [getAtsInterview](#getatsinterview) - Retrieve an interview
* [listAtsInterviews](#listatsinterviews) - List all interviews
* [patchAtsInterview](#patchatsinterview) - Update an interview
* [removeAtsInterview](#removeatsinterview) - Remove an interview
* [updateAtsInterview](#updateatsinterview) - Update an interview

## createAtsInterview

Creates a AtsInterview. Provide the unified AtsInterview fields in the request body; they are mapped to the provider's API. Returns the created AtsInterview.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsInterview" method="post" path="/ats/{connection_id}/interview" example="ats_interview" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsInterviewRequest req = CreateAtsInterviewRequest.builder()
                .atsInterview(AtsInterview.builder()
                    .createdAt(OffsetDateTime.parse("2021-11-28T03:14:47.774Z"))
                    .endAt(OffsetDateTime.parse("2021-12-08T06:33:19.583Z"))
                    .id("67902ec5-16b8-4454-bd7b-197b5054b9ce")
                    .location("26596 Halle Trafficway")
                    .meetingUrl("https://immaculate-foodstuffs.biz")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-09-24T01:56:07.543Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsInterviewResponse res = sdk.interview().createAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsInterviewRequest](../../models/operations/CreateAtsInterviewRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsInterviewResponse](../../models/operations/CreateAtsInterviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsInterview

Retrieves a single AtsInterview by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsInterview" method="get" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsInterviewRequest req = GetAtsInterviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsInterviewResponse res = sdk.interview().getAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsInterviewRequest](../../models/operations/GetAtsInterviewRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsInterviewResponse](../../models/operations/GetAtsInterviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsInterviews

Returns a list of AtsInterviews. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsInterviews" method="get" path="/ats/{connection_id}/interview" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsInterviewsRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsInterviewsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsInterviewsRequest req = ListAtsInterviewsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsInterviewsResponse res = sdk.interview().listAtsInterviews()
                .request(req)
                .call();

        if (res.atsInterviews().isPresent()) {
            System.out.println(res.atsInterviews().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsInterviewsRequest](../../models/operations/ListAtsInterviewsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsInterviewsResponse](../../models/operations/ListAtsInterviewsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsInterview

Updates the AtsInterview identified by `id`. Provide the unified AtsInterview fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsInterview" method="patch" path="/ats/{connection_id}/interview/{id}" example="ats_interview" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsInterviewRequest req = PatchAtsInterviewRequest.builder()
                .atsInterview(AtsInterview.builder()
                    .createdAt(OffsetDateTime.parse("2021-11-28T03:14:47.774Z"))
                    .endAt(OffsetDateTime.parse("2021-12-08T06:33:19.583Z"))
                    .id("76639f90-a6b0-49c3-90e3-9d41e52c76b3")
                    .location("26596 Halle Trafficway")
                    .meetingUrl("https://immaculate-foodstuffs.biz")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-09-24T01:56:07.550Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsInterviewResponse res = sdk.interview().patchAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchAtsInterviewRequest](../../models/operations/PatchAtsInterviewRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsInterviewResponse](../../models/operations/PatchAtsInterviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsInterview

Deletes the AtsInterview identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsInterview" method="delete" path="/ats/{connection_id}/interview/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsInterviewRequest req = RemoveAtsInterviewRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsInterviewResponse res = sdk.interview().removeAtsInterview()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsInterviewRequest](../../models/operations/RemoveAtsInterviewRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsInterviewResponse](../../models/operations/RemoveAtsInterviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsInterview

Updates the AtsInterview identified by `id`. Provide the unified AtsInterview fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsInterview" method="put" path="/ats/{connection_id}/interview/{id}" example="ats_interview" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsInterviewRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsInterviewResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsInterviewRequest req = UpdateAtsInterviewRequest.builder()
                .atsInterview(AtsInterview.builder()
                    .createdAt(OffsetDateTime.parse("2021-11-28T03:14:47.774Z"))
                    .endAt(OffsetDateTime.parse("2021-12-08T06:33:19.583Z"))
                    .id("76639f90-a6b0-49c3-90e3-9d41e52c76b3")
                    .location("26596 Halle Trafficway")
                    .meetingUrl("https://immaculate-foodstuffs.biz")
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2021-12-08T06:03:19.583Z"))
                    .status(AtsInterviewStatus.SCHEDULED)
                    .updatedAt(OffsetDateTime.parse("2023-09-24T01:56:07.550Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsInterviewResponse res = sdk.interview().updateAtsInterview()
                .request(req)
                .call();

        if (res.atsInterview().isPresent()) {
            System.out.println(res.atsInterview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsInterviewRequest](../../models/operations/UpdateAtsInterviewRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsInterviewResponse](../../models/operations/UpdateAtsInterviewResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |