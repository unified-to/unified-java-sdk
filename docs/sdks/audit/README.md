# Audit

## Overview

### Available Operations

* [createQmsAudit](#createqmsaudit) - Create an audit
* [getQmsAudit](#getqmsaudit) - Retrieve an audit
* [listQmsAudits](#listqmsaudits) - List all audits
* [patchQmsAudit](#patchqmsaudit) - Update an audit
* [updateQmsAudit](#updateqmsaudit) - Update an audit

## createQmsAudit

Creates a QmsAudit. Provide the unified QmsAudit fields in the request body; they are mapped to the provider's API. Returns the created QmsAudit.

### Example Usage

<!-- UsageSnippet language="java" operationID="createQmsAudit" method="post" path="/qms/{connection_id}/audit" example="qms_audit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateQmsAuditRequest;
import to.unified.unified_java_sdk.models.operations.CreateQmsAuditResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateQmsAuditRequest req = CreateQmsAuditRequest.builder()
                .qmsAudit(QmsAudit.builder()
                    .createdAt(OffsetDateTime.parse("2021-02-20T23:02:37.667Z"))
                    .endAt(OffsetDateTime.parse("2026-03-27T10:01:22.380Z"))
                    .fileIds(List.of())
                    .id("34275c70-e1f9-4e26-905f-258fccbab3ff")
                    .issueIds(List.of())
                    .lifecycleState("In Review")
                    .metadata(List.of())
                    .name("soggy certification audit")
                    .number("AUD-215")
                    .scheduledAt(OffsetDateTime.parse("2021-02-20T23:02:37.667Z"))
                    .scope("Calibration")
                    .standard("ISO 9001:2015")
                    .startAt(OffsetDateTime.parse("2023-01-25T00:54:50.577Z"))
                    .status(QmsAuditStatus.IN_REVIEW)
                    .type(QmsAuditType.CERTIFICATION)
                    .updatedAt(OffsetDateTime.parse("2024-02-08T13:44:04.840Z"))
                    .url("https://mushy-obesity.name/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateQmsAuditResponse res = sdk.audit().createQmsAudit()
                .request(req)
                .call();

        if (res.qmsAudit().isPresent()) {
            System.out.println(res.qmsAudit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateQmsAuditRequest](../../models/operations/CreateQmsAuditRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateQmsAuditResponse](../../models/operations/CreateQmsAuditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getQmsAudit

Retrieves a single QmsAudit by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getQmsAudit" method="get" path="/qms/{connection_id}/audit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetQmsAuditRequest;
import to.unified.unified_java_sdk.models.operations.GetQmsAuditResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetQmsAuditRequest req = GetQmsAuditRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetQmsAuditResponse res = sdk.audit().getQmsAudit()
                .request(req)
                .call();

        if (res.qmsAudit().isPresent()) {
            System.out.println(res.qmsAudit().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetQmsAuditRequest](../../models/operations/GetQmsAuditRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetQmsAuditResponse](../../models/operations/GetQmsAuditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listQmsAudits

Returns a list of QmsAudits. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listQmsAudits" method="get" path="/qms/{connection_id}/audit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListQmsAuditsRequest;
import to.unified.unified_java_sdk.models.operations.ListQmsAuditsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListQmsAuditsRequest req = ListQmsAuditsRequest.builder()
                .connectionId("<id>")
                .build();

        ListQmsAuditsResponse res = sdk.audit().listQmsAudits()
                .request(req)
                .call();

        if (res.qmsAudits().isPresent()) {
            System.out.println(res.qmsAudits().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListQmsAuditsRequest](../../models/operations/ListQmsAuditsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListQmsAuditsResponse](../../models/operations/ListQmsAuditsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchQmsAudit

Updates the QmsAudit identified by `id`. Provide the unified QmsAudit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchQmsAudit" method="patch" path="/qms/{connection_id}/audit/{id}" example="qms_audit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchQmsAuditRequest;
import to.unified.unified_java_sdk.models.operations.PatchQmsAuditResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchQmsAuditRequest req = PatchQmsAuditRequest.builder()
                .qmsAudit(QmsAudit.builder()
                    .createdAt(OffsetDateTime.parse("2021-02-20T23:02:37.667Z"))
                    .endAt(OffsetDateTime.parse("2026-03-27T10:01:22.392Z"))
                    .fileIds(List.of())
                    .id("335ee2aa-03ee-47e8-a800-de344235d2ff")
                    .issueIds(List.of())
                    .lifecycleState("In Review")
                    .metadata(List.of())
                    .name("soggy certification audit")
                    .number("AUD-215")
                    .scheduledAt(OffsetDateTime.parse("2021-02-20T23:02:37.667Z"))
                    .scope("Calibration")
                    .standard("ISO 9001:2015")
                    .startAt(OffsetDateTime.parse("2023-01-25T00:54:50.582Z"))
                    .status(QmsAuditStatus.IN_REVIEW)
                    .type(QmsAuditType.CERTIFICATION)
                    .updatedAt(OffsetDateTime.parse("2024-02-08T13:44:04.846Z"))
                    .url("https://mushy-obesity.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchQmsAuditResponse res = sdk.audit().patchQmsAudit()
                .request(req)
                .call();

        if (res.qmsAudit().isPresent()) {
            System.out.println(res.qmsAudit().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchQmsAuditRequest](../../models/operations/PatchQmsAuditRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchQmsAuditResponse](../../models/operations/PatchQmsAuditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateQmsAudit

Updates the QmsAudit identified by `id`. Provide the unified QmsAudit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateQmsAudit" method="put" path="/qms/{connection_id}/audit/{id}" example="qms_audit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateQmsAuditRequest;
import to.unified.unified_java_sdk.models.operations.UpdateQmsAuditResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateQmsAuditRequest req = UpdateQmsAuditRequest.builder()
                .qmsAudit(QmsAudit.builder()
                    .createdAt(OffsetDateTime.parse("2021-02-20T23:02:37.667Z"))
                    .endAt(OffsetDateTime.parse("2026-03-27T10:01:22.392Z"))
                    .fileIds(List.of())
                    .id("335ee2aa-03ee-47e8-a800-de344235d2ff")
                    .issueIds(List.of())
                    .lifecycleState("In Review")
                    .metadata(List.of())
                    .name("soggy certification audit")
                    .number("AUD-215")
                    .scheduledAt(OffsetDateTime.parse("2021-02-20T23:02:37.667Z"))
                    .scope("Calibration")
                    .standard("ISO 9001:2015")
                    .startAt(OffsetDateTime.parse("2023-01-25T00:54:50.582Z"))
                    .status(QmsAuditStatus.IN_REVIEW)
                    .type(QmsAuditType.CERTIFICATION)
                    .updatedAt(OffsetDateTime.parse("2024-02-08T13:44:04.846Z"))
                    .url("https://mushy-obesity.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateQmsAuditResponse res = sdk.audit().updateQmsAudit()
                .request(req)
                .call();

        if (res.qmsAudit().isPresent()) {
            System.out.println(res.qmsAudit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateQmsAuditRequest](../../models/operations/UpdateQmsAuditRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateQmsAuditResponse](../../models/operations/UpdateQmsAuditResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |