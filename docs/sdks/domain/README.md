# Domain

## Overview

### Available Operations

* [createComputeDomain](#createcomputedomain) - Create a domain
* [getComputeDomain](#getcomputedomain) - Retrieve a domain
* [listComputeDomains](#listcomputedomains) - List all domains
* [patchComputeDomain](#patchcomputedomain) - Update a domain
* [removeComputeDomain](#removecomputedomain) - Remove a domain
* [updateComputeDomain](#updatecomputedomain) - Update a domain

## createComputeDomain

Creates a ComputeDomain. Provide the unified ComputeDomain fields in the request body; they are mapped to the provider's API. Returns the created ComputeDomain.

### Example Usage

<!-- UsageSnippet language="java" operationID="createComputeDomain" method="post" path="/compute/{connection_id}/domain" example="compute_domain" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.CreateComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateComputeDomainRequest req = CreateComputeDomainRequest.builder()
                .computeDomain(ComputeDomain.builder()
                    .createdAt(OffsetDateTime.parse("2019-11-22T16:38:26.009Z"))
                    .id("2bdbc93e-5feb-4074-a9fb-5ff67c88509b")
                    .isPrimary(false)
                    .metadata(List.of())
                    .name("mysterious-republican.usable-section.info")
                    .status(ComputeDomainStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-11-04T05:27:42.672Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateComputeDomainResponse res = sdk.domain().createComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateComputeDomainRequest](../../models/operations/CreateComputeDomainRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateComputeDomainResponse](../../models/operations/CreateComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getComputeDomain

Retrieves a single ComputeDomain by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getComputeDomain" method="get" path="/compute/{connection_id}/domain/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.GetComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetComputeDomainRequest req = GetComputeDomainRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetComputeDomainResponse res = sdk.domain().getComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetComputeDomainRequest](../../models/operations/GetComputeDomainRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetComputeDomainResponse](../../models/operations/GetComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listComputeDomains

Returns a list of ComputeDomains. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listComputeDomains" method="get" path="/compute/{connection_id}/domain" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListComputeDomainsRequest;
import to.unified.unified_java_sdk.models.operations.ListComputeDomainsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListComputeDomainsRequest req = ListComputeDomainsRequest.builder()
                .connectionId("<id>")
                .build();

        ListComputeDomainsResponse res = sdk.domain().listComputeDomains()
                .request(req)
                .call();

        if (res.computeDomains().isPresent()) {
            System.out.println(res.computeDomains().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListComputeDomainsRequest](../../models/operations/ListComputeDomainsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListComputeDomainsResponse](../../models/operations/ListComputeDomainsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchComputeDomain

Updates the ComputeDomain identified by `id`. Provide the unified ComputeDomain fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchComputeDomain" method="patch" path="/compute/{connection_id}/domain/{id}" example="compute_domain" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.PatchComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchComputeDomainRequest req = PatchComputeDomainRequest.builder()
                .computeDomain(ComputeDomain.builder()
                    .createdAt(OffsetDateTime.parse("2019-11-22T16:38:26.009Z"))
                    .id("ed820268-bac9-4c62-bfe9-6594add307ce")
                    .isPrimary(false)
                    .metadata(List.of())
                    .name("mysterious-republican.usable-section.info")
                    .status(ComputeDomainStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-11-04T05:27:42.677Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchComputeDomainResponse res = sdk.domain().patchComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchComputeDomainRequest](../../models/operations/PatchComputeDomainRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchComputeDomainResponse](../../models/operations/PatchComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeComputeDomain

Deletes the ComputeDomain identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeComputeDomain" method="delete" path="/compute/{connection_id}/domain/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.RemoveComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveComputeDomainRequest req = RemoveComputeDomainRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveComputeDomainResponse res = sdk.domain().removeComputeDomain()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveComputeDomainRequest](../../models/operations/RemoveComputeDomainRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveComputeDomainResponse](../../models/operations/RemoveComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateComputeDomain

Updates the ComputeDomain identified by `id`. Provide the unified ComputeDomain fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateComputeDomain" method="put" path="/compute/{connection_id}/domain/{id}" example="compute_domain" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDomainRequest;
import to.unified.unified_java_sdk.models.operations.UpdateComputeDomainResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateComputeDomainRequest req = UpdateComputeDomainRequest.builder()
                .computeDomain(ComputeDomain.builder()
                    .createdAt(OffsetDateTime.parse("2019-11-22T16:38:26.009Z"))
                    .id("ed820268-bac9-4c62-bfe9-6594add307ce")
                    .isPrimary(false)
                    .metadata(List.of())
                    .name("mysterious-republican.usable-section.info")
                    .status(ComputeDomainStatus.PENDING)
                    .updatedAt(OffsetDateTime.parse("2023-11-04T05:27:42.677Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateComputeDomainResponse res = sdk.domain().updateComputeDomain()
                .request(req)
                .call();

        if (res.computeDomain().isPresent()) {
            System.out.println(res.computeDomain().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateComputeDomainRequest](../../models/operations/UpdateComputeDomainRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateComputeDomainResponse](../../models/operations/UpdateComputeDomainResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |