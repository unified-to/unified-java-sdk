# Fax

## Overview

### Available Operations

* [createUcFax](#createucfax) - Create a fax
* [getUcFax](#getucfax) - Retrieve a fax
* [listUcFaxes](#listucfaxes) - List all faxes
* [removeUcFax](#removeucfax) - Remove a fax

## createUcFax

Creates a UcFax. Provide the unified UcFax fields in the request body; they are mapped to the provider's API. Returns the created UcFax.

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcFax" method="post" path="/uc/{connection_id}/fax" example="uc_fax" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcFaxRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcFaxResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcFaxRequest req = CreateUcFaxRequest.builder()
                .ucFax(UcFax.builder()
                    .costAmount(1.2207)
                    .createdAt(OffsetDateTime.parse("2022-10-25T13:37:51.431Z"))
                    .currency("USD")
                    .fromTelephone("+13605107540")
                    .id("38de9ab0-6046-4181-b792-34540680352d")
                    .mediaUrl("https://doting-jump.biz")
                    .metadata(List.of())
                    .pages(20d)
                    .status(UcFaxStatus.DELIVERED)
                    .toTelephone("+19083998866")
                    .type(UcFaxType.INBOUND)
                    .updatedAt(OffsetDateTime.parse("2023-04-16T11:35:50.685Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcFaxResponse res = sdk.fax().createUcFax()
                .request(req)
                .call();

        if (res.ucFax().isPresent()) {
            System.out.println(res.ucFax().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [CreateUcFaxRequest](../../models/operations/CreateUcFaxRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateUcFaxResponse](../../models/operations/CreateUcFaxResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUcFax

Retrieves a single UcFax by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcFax" method="get" path="/uc/{connection_id}/fax/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcFaxRequest;
import to.unified.unified_java_sdk.models.operations.GetUcFaxResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcFaxRequest req = GetUcFaxRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcFaxResponse res = sdk.fax().getUcFax()
                .request(req)
                .call();

        if (res.ucFax().isPresent()) {
            System.out.println(res.ucFax().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetUcFaxRequest](../../models/operations/GetUcFaxRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetUcFaxResponse](../../models/operations/GetUcFaxResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUcFaxes

Returns a list of UcFaxes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcFaxes" method="get" path="/uc/{connection_id}/fax" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcFaxesRequest;
import to.unified.unified_java_sdk.models.operations.ListUcFaxesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcFaxesRequest req = ListUcFaxesRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcFaxesResponse res = sdk.fax().listUcFaxes()
                .request(req)
                .call();

        if (res.ucFaxes().isPresent()) {
            System.out.println(res.ucFaxes().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListUcFaxesRequest](../../models/operations/ListUcFaxesRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListUcFaxesResponse](../../models/operations/ListUcFaxesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUcFax

Deletes the UcFax identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcFax" method="delete" path="/uc/{connection_id}/fax/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcFaxRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcFaxResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcFaxRequest req = RemoveUcFaxRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcFaxResponse res = sdk.fax().removeUcFax()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [RemoveUcFaxRequest](../../models/operations/RemoveUcFaxRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[RemoveUcFaxResponse](../../models/operations/RemoveUcFaxResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |