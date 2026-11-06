# Change

## Overview

### Available Operations

* [createPlmChange](#createplmchange) - Create a change
* [getPlmChange](#getplmchange) - Retrieve a change
* [getTaskChange](#gettaskchange) - Retrieve a change
* [listPlmChanges](#listplmchanges) - List all changes
* [listTaskChanges](#listtaskchanges) - List all changes
* [patchPlmChange](#patchplmchange) - Update a change
* [updatePlmChange](#updateplmchange) - Update a change

## createPlmChange

Creates a PlmChange. Provide the unified PlmChange fields in the request body; they are mapped to the provider's API. Returns the created PlmChange.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlmChange" method="post" path="/plm/{connection_id}/change" example="plm_change" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.CreatePlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePlmChangeRequest req = CreatePlmChangeRequest.builder()
                .plmChange(PlmChange.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2021-08-02T05:58:32.287Z"))
                    .description("Vorago spiculum avaritia adipiscor callide.")
                    .id("c755ebc5-8e66-4258-be84-567db4218d63")
                    .metadata(List.of())
                    .name("Update goodwill")
                    .number("ECO-6591")
                    .priority("Medium")
                    .status(PlmChangeStatus.IN_REVIEW)
                    .type(PlmChangeType.ORDER)
                    .updatedAt(OffsetDateTime.parse("2026-09-19T15:27:03.324Z"))
                    .url("https://warmhearted-fraudster.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreatePlmChangeResponse res = sdk.change().createPlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreatePlmChangeRequest](../../models/operations/CreatePlmChangeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreatePlmChangeResponse](../../models/operations/CreatePlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmChange

Retrieves a single PlmChange by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmChange" method="get" path="/plm/{connection_id}/change/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmChangeRequest req = GetPlmChangeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmChangeResponse res = sdk.change().getPlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetPlmChangeRequest](../../models/operations/GetPlmChangeRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetPlmChangeResponse](../../models/operations/GetPlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTaskChange

Retrieves a single TaskChange by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTaskChange" method="get" path="/task/{connection_id}/change/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTaskChangeRequest;
import to.unified.unified_java_sdk.models.operations.GetTaskChangeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTaskChangeRequest req = GetTaskChangeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTaskChangeResponse res = sdk.change().getTaskChange()
                .request(req)
                .call();

        if (res.taskChange().isPresent()) {
            System.out.println(res.taskChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetTaskChangeRequest](../../models/operations/GetTaskChangeRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetTaskChangeResponse](../../models/operations/GetTaskChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmChanges

Returns a list of PlmChanges. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmChanges" method="get" path="/plm/{connection_id}/change" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmChangesRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmChangesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmChangesRequest req = ListPlmChangesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmChangesResponse res = sdk.change().listPlmChanges()
                .request(req)
                .call();

        if (res.plmChanges().isPresent()) {
            System.out.println(res.plmChanges().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListPlmChangesRequest](../../models/operations/ListPlmChangesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListPlmChangesResponse](../../models/operations/ListPlmChangesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTaskChanges

Returns a list of TaskChanges. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTaskChanges" method="get" path="/task/{connection_id}/change" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTaskChangesRequest;
import to.unified.unified_java_sdk.models.operations.ListTaskChangesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTaskChangesRequest req = ListTaskChangesRequest.builder()
                .connectionId("<id>")
                .build();

        ListTaskChangesResponse res = sdk.change().listTaskChanges()
                .request(req)
                .call();

        if (res.taskChanges().isPresent()) {
            System.out.println(res.taskChanges().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListTaskChangesRequest](../../models/operations/ListTaskChangesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListTaskChangesResponse](../../models/operations/ListTaskChangesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPlmChange

Updates the PlmChange identified by `id`. Provide the unified PlmChange fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPlmChange" method="patch" path="/plm/{connection_id}/change/{id}" example="plm_change" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.PatchPlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPlmChangeRequest req = PatchPlmChangeRequest.builder()
                .plmChange(PlmChange.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2021-08-02T05:58:32.287Z"))
                    .description("Vorago spiculum avaritia adipiscor callide.")
                    .id("42c61d18-0d10-42a1-b2c1-4f3c65507ff4")
                    .metadata(List.of())
                    .name("Update goodwill")
                    .number("ECO-6591")
                    .priority("Medium")
                    .status(PlmChangeStatus.IN_REVIEW)
                    .type(PlmChangeType.ORDER)
                    .updatedAt(OffsetDateTime.parse("2026-09-19T15:27:03.349Z"))
                    .url("https://warmhearted-fraudster.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPlmChangeResponse res = sdk.change().patchPlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchPlmChangeRequest](../../models/operations/PatchPlmChangeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchPlmChangeResponse](../../models/operations/PatchPlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlmChange

Updates the PlmChange identified by `id`. Provide the unified PlmChange fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlmChange" method="put" path="/plm/{connection_id}/change/{id}" example="plm_change" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePlmChangeRequest;
import to.unified.unified_java_sdk.models.operations.UpdatePlmChangeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePlmChangeRequest req = UpdatePlmChangeRequest.builder()
                .plmChange(PlmChange.builder()
                    .affectedItems(List.of())
                    .createdAt(OffsetDateTime.parse("2021-08-02T05:58:32.287Z"))
                    .description("Vorago spiculum avaritia adipiscor callide.")
                    .id("42c61d18-0d10-42a1-b2c1-4f3c65507ff4")
                    .metadata(List.of())
                    .name("Update goodwill")
                    .number("ECO-6591")
                    .priority("Medium")
                    .status(PlmChangeStatus.IN_REVIEW)
                    .type(PlmChangeType.ORDER)
                    .updatedAt(OffsetDateTime.parse("2026-09-19T15:27:03.349Z"))
                    .url("https://warmhearted-fraudster.biz/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePlmChangeResponse res = sdk.change().updatePlmChange()
                .request(req)
                .call();

        if (res.plmChange().isPresent()) {
            System.out.println(res.plmChange().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdatePlmChangeRequest](../../models/operations/UpdatePlmChangeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdatePlmChangeResponse](../../models/operations/UpdatePlmChangeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |