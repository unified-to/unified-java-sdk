# Action

## Overview

### Available Operations

* [createQmsAction](#createqmsaction) - Create an action
* [getQmsAction](#getqmsaction) - Retrieve an action
* [listQmsActions](#listqmsactions) - List all actions
* [patchQmsAction](#patchqmsaction) - Update an action
* [updateQmsAction](#updateqmsaction) - Update an action

## createQmsAction

Creates a QmsAction. Provide the unified QmsAction fields in the request body; they are mapped to the provider's API. Returns the created QmsAction.

### Example Usage

<!-- UsageSnippet language="java" operationID="createQmsAction" method="post" path="/qms/{connection_id}/action" example="qms_action" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateQmsActionRequest;
import to.unified.unified_java_sdk.models.operations.CreateQmsActionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateQmsActionRequest req = CreateQmsActionRequest.builder()
                .qmsAction(QmsAction.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-07T03:01:29.933Z"))
                    .description("Auditor sunt tego apparatus aegre ascisco.")
                    .dueAt(OffsetDateTime.parse("2022-04-04T03:42:01.290Z"))
                    .fileIds(List.of())
                    .id("c750277d-cea6-4dbc-9a13-5184d62fbbcf")
                    .issueIds(List.of())
                    .lifecycleState("Cancelled")
                    .metadata(List.of())
                    .name("Add inspection step")
                    .number("CAPA-6268")
                    .originalType("Corrective Action")
                    .priority("Medium")
                    .rootCause("Worn tooling")
                    .status(QmsActionStatus.CANCELLED)
                    .type(QmsActionType.CORRECTIVE)
                    .updatedAt(OffsetDateTime.parse("2025-02-16T23:21:31.555Z"))
                    .url("https://incomplete-conservation.org")
                    .build())
                .connectionId("<id>")
                .build();

        CreateQmsActionResponse res = sdk.action().createQmsAction()
                .request(req)
                .call();

        if (res.qmsAction().isPresent()) {
            System.out.println(res.qmsAction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateQmsActionRequest](../../models/operations/CreateQmsActionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateQmsActionResponse](../../models/operations/CreateQmsActionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getQmsAction

Retrieves a single QmsAction by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getQmsAction" method="get" path="/qms/{connection_id}/action/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetQmsActionRequest;
import to.unified.unified_java_sdk.models.operations.GetQmsActionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetQmsActionRequest req = GetQmsActionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetQmsActionResponse res = sdk.action().getQmsAction()
                .request(req)
                .call();

        if (res.qmsAction().isPresent()) {
            System.out.println(res.qmsAction().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetQmsActionRequest](../../models/operations/GetQmsActionRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetQmsActionResponse](../../models/operations/GetQmsActionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listQmsActions

Returns a list of QmsActions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listQmsActions" method="get" path="/qms/{connection_id}/action" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListQmsActionsRequest;
import to.unified.unified_java_sdk.models.operations.ListQmsActionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListQmsActionsRequest req = ListQmsActionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListQmsActionsResponse res = sdk.action().listQmsActions()
                .request(req)
                .call();

        if (res.qmsActions().isPresent()) {
            System.out.println(res.qmsActions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListQmsActionsRequest](../../models/operations/ListQmsActionsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListQmsActionsResponse](../../models/operations/ListQmsActionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchQmsAction

Updates the QmsAction identified by `id`. Provide the unified QmsAction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchQmsAction" method="patch" path="/qms/{connection_id}/action/{id}" example="qms_action" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchQmsActionRequest;
import to.unified.unified_java_sdk.models.operations.PatchQmsActionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchQmsActionRequest req = PatchQmsActionRequest.builder()
                .qmsAction(QmsAction.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-07T03:01:29.933Z"))
                    .description("Auditor sunt tego apparatus aegre ascisco.")
                    .dueAt(OffsetDateTime.parse("2022-04-04T03:42:01.290Z"))
                    .fileIds(List.of())
                    .id("6636ca53-e4e9-4877-87d7-9c5f1c0247b6")
                    .issueIds(List.of())
                    .lifecycleState("Cancelled")
                    .metadata(List.of())
                    .name("Add inspection step")
                    .number("CAPA-6268")
                    .originalType("Corrective Action")
                    .priority("Medium")
                    .rootCause("Worn tooling")
                    .status(QmsActionStatus.CANCELLED)
                    .type(QmsActionType.CORRECTIVE)
                    .updatedAt(OffsetDateTime.parse("2025-02-16T23:21:31.565Z"))
                    .url("https://incomplete-conservation.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchQmsActionResponse res = sdk.action().patchQmsAction()
                .request(req)
                .call();

        if (res.qmsAction().isPresent()) {
            System.out.println(res.qmsAction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchQmsActionRequest](../../models/operations/PatchQmsActionRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchQmsActionResponse](../../models/operations/PatchQmsActionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateQmsAction

Updates the QmsAction identified by `id`. Provide the unified QmsAction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateQmsAction" method="put" path="/qms/{connection_id}/action/{id}" example="qms_action" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateQmsActionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateQmsActionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateQmsActionRequest req = UpdateQmsActionRequest.builder()
                .qmsAction(QmsAction.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2022-03-07T03:01:29.933Z"))
                    .description("Auditor sunt tego apparatus aegre ascisco.")
                    .dueAt(OffsetDateTime.parse("2022-04-04T03:42:01.290Z"))
                    .fileIds(List.of())
                    .id("6636ca53-e4e9-4877-87d7-9c5f1c0247b6")
                    .issueIds(List.of())
                    .lifecycleState("Cancelled")
                    .metadata(List.of())
                    .name("Add inspection step")
                    .number("CAPA-6268")
                    .originalType("Corrective Action")
                    .priority("Medium")
                    .rootCause("Worn tooling")
                    .status(QmsActionStatus.CANCELLED)
                    .type(QmsActionType.CORRECTIVE)
                    .updatedAt(OffsetDateTime.parse("2025-02-16T23:21:31.565Z"))
                    .url("https://incomplete-conservation.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateQmsActionResponse res = sdk.action().updateQmsAction()
                .request(req)
                .call();

        if (res.qmsAction().isPresent()) {
            System.out.println(res.qmsAction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateQmsActionRequest](../../models/operations/UpdateQmsActionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateQmsActionResponse](../../models/operations/UpdateQmsActionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |