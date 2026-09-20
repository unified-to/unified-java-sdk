# Pullrequest

## Overview

### Available Operations

* [createRepoPullrequest](#createrepopullrequest) - Create a pullrequest
* [getRepoPullrequest](#getrepopullrequest) - Retrieve a pullrequest
* [listRepoPullrequests](#listrepopullrequests) - List all pullrequests
* [patchRepoPullrequest](#patchrepopullrequest) - Update a pullrequest
* [removeRepoPullrequest](#removerepopullrequest) - Remove a pullrequest
* [updateRepoPullrequest](#updaterepopullrequest) - Update a pullrequest

## createRepoPullrequest

Create a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoPullrequest" method="post" path="/repo/{connection_id}/pullrequest" example="repo_pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.CreateRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoPullrequestRequest req = CreateRepoPullrequestRequest.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .closedAt(OffsetDateTime.parse("2025-04-13T02:47:06.452Z"))
                    .createdAt(OffsetDateTime.parse("2023-02-27T09:37:13.663Z"))
                    .id("1d05ff03-6a0a-487e-b893-5cbc820c89e0")
                    .labels(List.of(
                        "adhuc",
                        "quaerat"))
                    .notes("Coadunatio turbo curtus ceno consuasor aggero. Suggero adeo creptio tutamen vulnus aqua delicate adopto derelinquo caritas. Maiores vulgivagus succurro temporibus.")
                    .sourceBranchId("microchip-navigate")
                    .status(RepoPullrequestStatus.REJECTED)
                    .targetBranchId("feed-reboot")
                    .title("Cunae aegrus averto texo advoco bibo amet asporto.")
                    .updatedAt(OffsetDateTime.parse("2025-01-01T01:09:49.523Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoPullrequestResponse res = sdk.pullrequest().createRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateRepoPullrequestRequest](../../models/operations/CreateRepoPullrequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateRepoPullrequestResponse](../../models/operations/CreateRepoPullrequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoPullrequest

Retrieve a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoPullrequest" method="get" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.GetRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoPullrequestRequest req = GetRepoPullrequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoPullrequestResponse res = sdk.pullrequest().getRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetRepoPullrequestRequest](../../models/operations/GetRepoPullrequestRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetRepoPullrequestResponse](../../models/operations/GetRepoPullrequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoPullrequests

List all pullrequests

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoPullrequests" method="get" path="/repo/{connection_id}/pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequestsRequest;
import to.unified.unified_java_sdk.models.operations.ListRepoPullrequestsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoPullrequestsRequest req = ListRepoPullrequestsRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoPullrequestsResponse res = sdk.pullrequest().listRepoPullrequests()
                .request(req)
                .call();

        if (res.repoPullrequests().isPresent()) {
            System.out.println(res.repoPullrequests().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListRepoPullrequestsRequest](../../models/operations/ListRepoPullrequestsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListRepoPullrequestsResponse](../../models/operations/ListRepoPullrequestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoPullrequest

Update a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoPullrequest" method="patch" path="/repo/{connection_id}/pullrequest/{id}" example="repo_pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.PatchRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoPullrequestRequest req = PatchRepoPullrequestRequest.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .closedAt(OffsetDateTime.parse("2025-04-13T02:47:06.456Z"))
                    .createdAt(OffsetDateTime.parse("2023-02-27T09:37:13.663Z"))
                    .id("bceaef18-faa8-48f0-aab4-8ef726149b87")
                    .labels(List.of(
                        "adhuc",
                        "quaerat"))
                    .notes("Coadunatio turbo curtus ceno consuasor aggero. Suggero adeo creptio tutamen vulnus aqua delicate adopto derelinquo caritas. Maiores vulgivagus succurro temporibus.")
                    .sourceBranchId("microchip-navigate")
                    .status(RepoPullrequestStatus.REJECTED)
                    .targetBranchId("feed-reboot")
                    .title("Cunae aegrus averto texo advoco bibo amet asporto.")
                    .updatedAt(OffsetDateTime.parse("2025-01-01T01:09:49.526Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoPullrequestResponse res = sdk.pullrequest().patchRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchRepoPullrequestRequest](../../models/operations/PatchRepoPullrequestRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchRepoPullrequestResponse](../../models/operations/PatchRepoPullrequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoPullrequest

Remove a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoPullrequest" method="delete" path="/repo/{connection_id}/pullrequest/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoPullrequestRequest req = RemoveRepoPullrequestRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoPullrequestResponse res = sdk.pullrequest().removeRepoPullrequest()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveRepoPullrequestRequest](../../models/operations/RemoveRepoPullrequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveRepoPullrequestResponse](../../models/operations/RemoveRepoPullrequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoPullrequest

Update a pullrequest

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoPullrequest" method="put" path="/repo/{connection_id}/pullrequest/{id}" example="repo_pullrequest" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoPullrequestRequest req = UpdateRepoPullrequestRequest.builder()
                .repoPullrequest(RepoPullrequest.builder()
                    .closedAt(OffsetDateTime.parse("2025-04-13T02:47:06.456Z"))
                    .createdAt(OffsetDateTime.parse("2023-02-27T09:37:13.663Z"))
                    .id("bceaef18-faa8-48f0-aab4-8ef726149b87")
                    .labels(List.of(
                        "adhuc",
                        "quaerat"))
                    .notes("Coadunatio turbo curtus ceno consuasor aggero. Suggero adeo creptio tutamen vulnus aqua delicate adopto derelinquo caritas. Maiores vulgivagus succurro temporibus.")
                    .sourceBranchId("microchip-navigate")
                    .status(RepoPullrequestStatus.REJECTED)
                    .targetBranchId("feed-reboot")
                    .title("Cunae aegrus averto texo advoco bibo amet asporto.")
                    .updatedAt(OffsetDateTime.parse("2025-01-01T01:09:49.526Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoPullrequestResponse res = sdk.pullrequest().updateRepoPullrequest()
                .request(req)
                .call();

        if (res.repoPullrequest().isPresent()) {
            System.out.println(res.repoPullrequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateRepoPullrequestRequest](../../models/operations/UpdateRepoPullrequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateRepoPullrequestResponse](../../models/operations/UpdateRepoPullrequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |