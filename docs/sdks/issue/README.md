# Issue

## Overview

### Available Operations

* [createQmsIssue](#createqmsissue) - Create an issue
* [getQmsIssue](#getqmsissue) - Retrieve an issue
* [getUnifiedIssue](#getunifiedissue) - Retrieve support issue
* [listQmsIssues](#listqmsissues) - List all issues
* [listUnifiedIssues](#listunifiedissues) - List support issues
* [patchQmsIssue](#patchqmsissue) - Update an issue
* [updateQmsIssue](#updateqmsissue) - Update an issue

## createQmsIssue

Creates a QmsIssue. Provide the unified QmsIssue fields in the request body; they are mapped to the provider's API. Returns the created QmsIssue.

### Example Usage

<!-- UsageSnippet language="java" operationID="createQmsIssue" method="post" path="/qms/{connection_id}/issue" example="qms_issue" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateQmsIssueRequest;
import to.unified.unified_java_sdk.models.operations.CreateQmsIssueResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateQmsIssueRequest req = CreateQmsIssueRequest.builder()
                .qmsIssue(QmsIssue.builder()
                    .actionIds(List.of())
                    .affectedItems(List.of(
                        QmsAffectedItem.builder()
                            .partNumber("PRT-051260")
                            .quantity(27d)
                            .revision("B")
                            .serialNumber("SN-419784")
                            .build()))
                    .changeIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-10T05:10:42.904Z"))
                    .description("Adfero delectatio earum contabesco convoco uxor avaritia volaticus dens.")
                    .dueAt(OffsetDateTime.parse("2024-07-23T23:27:44.473Z"))
                    .fileIds(List.of())
                    .id("d0973912-0afb-4b7f-9558-5d0f8dc7c8ae")
                    .lifecycleState("In Progress")
                    .metadata(List.of())
                    .name("Labeling error on tuxedo")
                    .number("CMP-5154")
                    .openedAt(OffsetDateTime.parse("2024-07-08T22:53:20.681Z"))
                    .originalType("Customer Complaint")
                    .severity(Severity.MEDIUM)
                    .source(QmsIssueSource.CUSTOMER)
                    .status(QmsIssueStatus.IN_PROGRESS)
                    .type(QmsIssueType.COMPLAINT)
                    .updatedAt(OffsetDateTime.parse("2021-03-13T04:40:43.127Z"))
                    .url("https://annual-cycle.org/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateQmsIssueResponse res = sdk.issue().createQmsIssue()
                .request(req)
                .call();

        if (res.qmsIssue().isPresent()) {
            System.out.println(res.qmsIssue().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateQmsIssueRequest](../../models/operations/CreateQmsIssueRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateQmsIssueResponse](../../models/operations/CreateQmsIssueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getQmsIssue

Retrieves a single QmsIssue by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getQmsIssue" method="get" path="/qms/{connection_id}/issue/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetQmsIssueRequest;
import to.unified.unified_java_sdk.models.operations.GetQmsIssueResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetQmsIssueRequest req = GetQmsIssueRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetQmsIssueResponse res = sdk.issue().getQmsIssue()
                .request(req)
                .call();

        if (res.qmsIssue().isPresent()) {
            System.out.println(res.qmsIssue().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetQmsIssueRequest](../../models/operations/GetQmsIssueRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetQmsIssueResponse](../../models/operations/GetQmsIssueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedIssue

Retrieve support issue

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnifiedIssue" method="get" path="/unified/issue/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIssueRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedIssueResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedIssueRequest req = GetUnifiedIssueRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedIssueResponse res = sdk.issue().getUnifiedIssue()
                .request(req)
                .call();

        if (res.issue().isPresent()) {
            System.out.println(res.issue().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetUnifiedIssueRequest](../../models/operations/GetUnifiedIssueRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetUnifiedIssueResponse](../../models/operations/GetUnifiedIssueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listQmsIssues

Returns a list of QmsIssues. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listQmsIssues" method="get" path="/qms/{connection_id}/issue" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListQmsIssuesRequest;
import to.unified.unified_java_sdk.models.operations.ListQmsIssuesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListQmsIssuesRequest req = ListQmsIssuesRequest.builder()
                .connectionId("<id>")
                .build();

        ListQmsIssuesResponse res = sdk.issue().listQmsIssues()
                .request(req)
                .call();

        if (res.qmsIssues().isPresent()) {
            System.out.println(res.qmsIssues().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListQmsIssuesRequest](../../models/operations/ListQmsIssuesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListQmsIssuesResponse](../../models/operations/ListQmsIssuesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedIssues

List support issues

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedIssues" method="get" path="/unified/issue" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedIssuesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedIssuesResponse res = sdk.issue().listUnifiedIssues()
                .call();

        if (res.issues().isPresent()) {
            System.out.println(res.issues().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListUnifiedIssuesRequest](../../models/operations/ListUnifiedIssuesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListUnifiedIssuesResponse](../../models/operations/ListUnifiedIssuesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchQmsIssue

Updates the QmsIssue identified by `id`. Provide the unified QmsIssue fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchQmsIssue" method="patch" path="/qms/{connection_id}/issue/{id}" example="qms_issue" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchQmsIssueRequest;
import to.unified.unified_java_sdk.models.operations.PatchQmsIssueResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchQmsIssueRequest req = PatchQmsIssueRequest.builder()
                .qmsIssue(QmsIssue.builder()
                    .actionIds(List.of())
                    .affectedItems(List.of(
                        QmsAffectedItem.builder()
                            .partNumber("PRT-051260")
                            .quantity(27d)
                            .revision("B")
                            .serialNumber("SN-419784")
                            .build()))
                    .changeIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-10T05:10:42.904Z"))
                    .description("Adfero delectatio earum contabesco convoco uxor avaritia volaticus dens.")
                    .dueAt(OffsetDateTime.parse("2024-07-23T23:27:44.485Z"))
                    .fileIds(List.of())
                    .id("e90c2f58-2e63-42c9-99f8-50f865d74711")
                    .lifecycleState("In Progress")
                    .metadata(List.of())
                    .name("Labeling error on tuxedo")
                    .number("CMP-5154")
                    .openedAt(OffsetDateTime.parse("2024-07-08T22:53:20.693Z"))
                    .originalType("Customer Complaint")
                    .severity(Severity.MEDIUM)
                    .source(QmsIssueSource.CUSTOMER)
                    .status(QmsIssueStatus.IN_PROGRESS)
                    .type(QmsIssueType.COMPLAINT)
                    .updatedAt(OffsetDateTime.parse("2021-03-13T04:40:43.129Z"))
                    .url("https://annual-cycle.org/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchQmsIssueResponse res = sdk.issue().patchQmsIssue()
                .request(req)
                .call();

        if (res.qmsIssue().isPresent()) {
            System.out.println(res.qmsIssue().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchQmsIssueRequest](../../models/operations/PatchQmsIssueRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchQmsIssueResponse](../../models/operations/PatchQmsIssueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateQmsIssue

Updates the QmsIssue identified by `id`. Provide the unified QmsIssue fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateQmsIssue" method="put" path="/qms/{connection_id}/issue/{id}" example="qms_issue" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateQmsIssueRequest;
import to.unified.unified_java_sdk.models.operations.UpdateQmsIssueResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateQmsIssueRequest req = UpdateQmsIssueRequest.builder()
                .qmsIssue(QmsIssue.builder()
                    .actionIds(List.of())
                    .affectedItems(List.of(
                        QmsAffectedItem.builder()
                            .partNumber("PRT-051260")
                            .quantity(27d)
                            .revision("B")
                            .serialNumber("SN-419784")
                            .build()))
                    .changeIds(List.of())
                    .createdAt(OffsetDateTime.parse("2020-06-10T05:10:42.904Z"))
                    .description("Adfero delectatio earum contabesco convoco uxor avaritia volaticus dens.")
                    .dueAt(OffsetDateTime.parse("2024-07-23T23:27:44.485Z"))
                    .fileIds(List.of())
                    .id("e90c2f58-2e63-42c9-99f8-50f865d74711")
                    .lifecycleState("In Progress")
                    .metadata(List.of())
                    .name("Labeling error on tuxedo")
                    .number("CMP-5154")
                    .openedAt(OffsetDateTime.parse("2024-07-08T22:53:20.693Z"))
                    .originalType("Customer Complaint")
                    .severity(Severity.MEDIUM)
                    .source(QmsIssueSource.CUSTOMER)
                    .status(QmsIssueStatus.IN_PROGRESS)
                    .type(QmsIssueType.COMPLAINT)
                    .updatedAt(OffsetDateTime.parse("2021-03-13T04:40:43.129Z"))
                    .url("https://annual-cycle.org/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateQmsIssueResponse res = sdk.issue().updateQmsIssue()
                .request(req)
                .call();

        if (res.qmsIssue().isPresent()) {
            System.out.println(res.qmsIssue().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateQmsIssueRequest](../../models/operations/UpdateQmsIssueRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateQmsIssueResponse](../../models/operations/UpdateQmsIssueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |