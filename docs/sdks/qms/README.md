# Qms

## Overview

### Available Operations

* [createQmsAction](#createqmsaction) - Create an action
* [createQmsAudit](#createqmsaudit) - Create an audit
* [createQmsInspection](#createqmsinspection) - Create an inspection
* [createQmsIssue](#createqmsissue) - Create an issue
* [getQmsAction](#getqmsaction) - Retrieve an action
* [getQmsAudit](#getqmsaudit) - Retrieve an audit
* [getQmsInspection](#getqmsinspection) - Retrieve an inspection
* [getQmsIssue](#getqmsissue) - Retrieve an issue
* [listQmsActions](#listqmsactions) - List all actions
* [listQmsAudits](#listqmsaudits) - List all audits
* [listQmsInspections](#listqmsinspections) - List all inspections
* [listQmsIssues](#listqmsissues) - List all issues
* [patchQmsAction](#patchqmsaction) - Update an action
* [patchQmsAudit](#patchqmsaudit) - Update an audit
* [patchQmsInspection](#patchqmsinspection) - Update an inspection
* [patchQmsIssue](#patchqmsissue) - Update an issue
* [updateQmsAction](#updateqmsaction) - Update an action
* [updateQmsAudit](#updateqmsaudit) - Update an audit
* [updateQmsInspection](#updateqmsinspection) - Update an inspection
* [updateQmsIssue](#updateqmsissue) - Update an issue

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

        CreateQmsActionResponse res = sdk.qms().createQmsAction()
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

        CreateQmsAuditResponse res = sdk.qms().createQmsAudit()
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

## createQmsInspection

Creates a QmsInspection. Provide the unified QmsInspection fields in the request body; they are mapped to the provider's API. Returns the created QmsInspection.

### Example Usage

<!-- UsageSnippet language="java" operationID="createQmsInspection" method="post" path="/qms/{connection_id}/inspection" example="qms_inspection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.CreateQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateQmsInspectionRequest req = CreateQmsInspectionRequest.builder()
                .qmsInspection(QmsInspection.builder()
                    .characteristics(List.of(
                        QmsCharacteristic.builder()
                            .lowerLimit(152.9)
                            .measuredValue("152.94")
                            .name("Hole position")
                            .nominalValue(153d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(153.1)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(24.95)
                            .measuredValue("25.03")
                            .name("Flatness")
                            .nominalValue(25d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(25.05)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(53.99)
                            .measuredValue("53.99")
                            .name("Bore diameter")
                            .nominalValue(54d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(54.01)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2020-04-18T21:23:54.000Z"))
                    .fileIds(List.of())
                    .id("013e67cc-e4a7-4f03-8e8e-db614eb1877b")
                    .inspectedAt(OffsetDateTime.parse("2021-02-07T08:45:10.646Z"))
                    .issueIds(List.of())
                    .lifecycleState("Complete")
                    .metadata(List.of())
                    .name("Source inspection")
                    .number("INSP-96996")
                    .partNumber("PRT-048483")
                    .quantityAccepted(41d)
                    .quantityInspected(41d)
                    .quantityRejected(0d)
                    .result(QmsInspectionResult.PASS)
                    .revision("A")
                    .status(QmsInspectionStatus.CLOSED)
                    .supplierName("Gerlach LLC")
                    .type(QmsInspectionType.SOURCE)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:03:14.383Z"))
                    .url("https://purple-newsprint.name/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateQmsInspectionResponse res = sdk.qms().createQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateQmsInspectionRequest](../../models/operations/CreateQmsInspectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateQmsInspectionResponse](../../models/operations/CreateQmsInspectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateQmsIssueResponse res = sdk.qms().createQmsIssue()
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

        GetQmsActionResponse res = sdk.qms().getQmsAction()
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

        GetQmsAuditResponse res = sdk.qms().getQmsAudit()
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

## getQmsInspection

Retrieves a single QmsInspection by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getQmsInspection" method="get" path="/qms/{connection_id}/inspection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.GetQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetQmsInspectionRequest req = GetQmsInspectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetQmsInspectionResponse res = sdk.qms().getQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetQmsInspectionRequest](../../models/operations/GetQmsInspectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetQmsInspectionResponse](../../models/operations/GetQmsInspectionResponse.md)**

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

        GetQmsIssueResponse res = sdk.qms().getQmsIssue()
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

        ListQmsActionsResponse res = sdk.qms().listQmsActions()
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

        ListQmsAuditsResponse res = sdk.qms().listQmsAudits()
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

## listQmsInspections

Returns a list of QmsInspections. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listQmsInspections" method="get" path="/qms/{connection_id}/inspection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListQmsInspectionsRequest;
import to.unified.unified_java_sdk.models.operations.ListQmsInspectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListQmsInspectionsRequest req = ListQmsInspectionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListQmsInspectionsResponse res = sdk.qms().listQmsInspections()
                .request(req)
                .call();

        if (res.qmsInspections().isPresent()) {
            System.out.println(res.qmsInspections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListQmsInspectionsRequest](../../models/operations/ListQmsInspectionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListQmsInspectionsResponse](../../models/operations/ListQmsInspectionsResponse.md)**

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

        ListQmsIssuesResponse res = sdk.qms().listQmsIssues()
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

        PatchQmsActionResponse res = sdk.qms().patchQmsAction()
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

        PatchQmsAuditResponse res = sdk.qms().patchQmsAudit()
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

## patchQmsInspection

Updates the QmsInspection identified by `id`. Provide the unified QmsInspection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchQmsInspection" method="patch" path="/qms/{connection_id}/inspection/{id}" example="qms_inspection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchQmsInspectionRequest req = PatchQmsInspectionRequest.builder()
                .qmsInspection(QmsInspection.builder()
                    .characteristics(List.of(
                        QmsCharacteristic.builder()
                            .lowerLimit(152.9)
                            .measuredValue("152.94")
                            .name("Hole position")
                            .nominalValue(153d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(153.1)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(24.95)
                            .measuredValue("25.03")
                            .name("Flatness")
                            .nominalValue(25d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(25.05)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(53.99)
                            .measuredValue("53.99")
                            .name("Bore diameter")
                            .nominalValue(54d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(54.01)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2020-04-18T21:23:54.000Z"))
                    .fileIds(List.of())
                    .id("893f655e-e036-4227-acd8-5cbe7f5e02c0")
                    .inspectedAt(OffsetDateTime.parse("2021-02-07T08:45:10.649Z"))
                    .issueIds(List.of())
                    .lifecycleState("Complete")
                    .metadata(List.of())
                    .name("Source inspection")
                    .number("INSP-96996")
                    .partNumber("PRT-048483")
                    .quantityAccepted(41d)
                    .quantityInspected(41d)
                    .quantityRejected(0d)
                    .result(QmsInspectionResult.PASS)
                    .revision("A")
                    .status(QmsInspectionStatus.CLOSED)
                    .supplierName("Gerlach LLC")
                    .type(QmsInspectionType.SOURCE)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:03:14.400Z"))
                    .url("https://purple-newsprint.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchQmsInspectionResponse res = sdk.qms().patchQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchQmsInspectionRequest](../../models/operations/PatchQmsInspectionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchQmsInspectionResponse](../../models/operations/PatchQmsInspectionResponse.md)**

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

        PatchQmsIssueResponse res = sdk.qms().patchQmsIssue()
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

        UpdateQmsActionResponse res = sdk.qms().updateQmsAction()
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

        UpdateQmsAuditResponse res = sdk.qms().updateQmsAudit()
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

## updateQmsInspection

Updates the QmsInspection identified by `id`. Provide the unified QmsInspection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateQmsInspection" method="put" path="/qms/{connection_id}/inspection/{id}" example="qms_inspection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateQmsInspectionRequest req = UpdateQmsInspectionRequest.builder()
                .qmsInspection(QmsInspection.builder()
                    .characteristics(List.of(
                        QmsCharacteristic.builder()
                            .lowerLimit(152.9)
                            .measuredValue("152.94")
                            .name("Hole position")
                            .nominalValue(153d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(153.1)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(24.95)
                            .measuredValue("25.03")
                            .name("Flatness")
                            .nominalValue(25d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(25.05)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(53.99)
                            .measuredValue("53.99")
                            .name("Bore diameter")
                            .nominalValue(54d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(54.01)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2020-04-18T21:23:54.000Z"))
                    .fileIds(List.of())
                    .id("893f655e-e036-4227-acd8-5cbe7f5e02c0")
                    .inspectedAt(OffsetDateTime.parse("2021-02-07T08:45:10.649Z"))
                    .issueIds(List.of())
                    .lifecycleState("Complete")
                    .metadata(List.of())
                    .name("Source inspection")
                    .number("INSP-96996")
                    .partNumber("PRT-048483")
                    .quantityAccepted(41d)
                    .quantityInspected(41d)
                    .quantityRejected(0d)
                    .result(QmsInspectionResult.PASS)
                    .revision("A")
                    .status(QmsInspectionStatus.CLOSED)
                    .supplierName("Gerlach LLC")
                    .type(QmsInspectionType.SOURCE)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:03:14.400Z"))
                    .url("https://purple-newsprint.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateQmsInspectionResponse res = sdk.qms().updateQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateQmsInspectionRequest](../../models/operations/UpdateQmsInspectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateQmsInspectionResponse](../../models/operations/UpdateQmsInspectionResponse.md)**

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

        UpdateQmsIssueResponse res = sdk.qms().updateQmsIssue()
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