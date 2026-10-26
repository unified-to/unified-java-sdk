# List

## Overview

### Available Operations

* [createMartechList](#createmartechlist) - Create a list
* [getMartechList](#getmartechlist) - Retrieve a list
* [listMartechLists](#listmartechlists) - List all lists
* [patchMartechList](#patchmartechlist) - Update a list
* [removeMartechList](#removemartechlist) - Remove a list
* [updateMartechList](#updatemartechlist) - Update a list

## createMartechList

Creates a MarketingList. Provide the unified MarketingList fields in the request body; they are mapped to the provider's API. Returns the created MarketingList.

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechList" method="post" path="/martech/{connection_id}/list" example="martech_list" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechListRequest;
import to.unified.unified_java_sdk.models.operations.CreateMartechListResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechListRequest req = CreateMartechListRequest.builder()
                .marketingList(MarketingList.builder()
                    .address(PropertyMarketingListAddress.builder()
                        .address1("76564 Coronation Road")
                        .address2("Suite 922")
                        .city("West Jordon")
                        .country("Mexico")
                        .postalCode("04183")
                        .region("NC")
                        .build())
                    .createdAt(OffsetDateTime.parse("2019-09-18T02:01:36.950Z"))
                    .description("Vilis.")
                    .id("55982559-147a-40cd-a35b-4eaa0b9fb043")
                    .isActive(true)
                    .language("ru")
                    .metadata(List.of())
                    .name("Electronics Newsletter")
                    .senderCompany("Koepp and Sons")
                    .senderEmail("blake.kuhn@hotmail.com")
                    .senderName("Blake Kuhn")
                    .senderPhone("359.305.7962 x28115")
                    .subject("Theca caecus copia crebro valeo ulciscor.")
                    .updatedAt(OffsetDateTime.parse("2022-09-15T11:51:09.234Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechListResponse res = sdk.list().createMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateMartechListRequest](../../models/operations/CreateMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateMartechListResponse](../../models/operations/CreateMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechList

Retrieves a single MarketingList by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechList" method="get" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechListRequest;
import to.unified.unified_java_sdk.models.operations.GetMartechListResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechListRequest req = GetMartechListRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechListResponse res = sdk.list().getMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetMartechListRequest](../../models/operations/GetMartechListRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetMartechListResponse](../../models/operations/GetMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechLists

Returns a list of MarketingLists. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechLists" method="get" path="/martech/{connection_id}/list" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechListsRequest;
import to.unified.unified_java_sdk.models.operations.ListMartechListsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechListsRequest req = ListMartechListsRequest.builder()
                .connectionId("<id>")
                .build();

        ListMartechListsResponse res = sdk.list().listMartechLists()
                .request(req)
                .call();

        if (res.marketingLists().isPresent()) {
            System.out.println(res.marketingLists().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListMartechListsRequest](../../models/operations/ListMartechListsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListMartechListsResponse](../../models/operations/ListMartechListsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechList

Updates the MarketingList identified by `id`. Provide the unified MarketingList fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechList" method="patch" path="/martech/{connection_id}/list/{id}" example="martech_list" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechListRequest;
import to.unified.unified_java_sdk.models.operations.PatchMartechListResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechListRequest req = PatchMartechListRequest.builder()
                .marketingList(MarketingList.builder()
                    .address(PropertyMarketingListAddress.builder()
                        .address1("76564 Coronation Road")
                        .address2("Suite 922")
                        .city("West Jordon")
                        .country("Mexico")
                        .postalCode("04183")
                        .region("NC")
                        .build())
                    .createdAt(OffsetDateTime.parse("2019-09-18T02:01:36.950Z"))
                    .description("Vilis.")
                    .id("107b72b6-1164-4a88-98fc-1c8c993dee3d")
                    .isActive(true)
                    .language("ru")
                    .metadata(List.of())
                    .name("Electronics Newsletter")
                    .senderCompany("Koepp and Sons")
                    .senderEmail("blake.kuhn@hotmail.com")
                    .senderName("Blake Kuhn")
                    .senderPhone("359.305.7962 x28115")
                    .subject("Theca caecus copia crebro valeo ulciscor.")
                    .updatedAt(OffsetDateTime.parse("2022-09-15T11:51:09.249Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechListResponse res = sdk.list().patchMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchMartechListRequest](../../models/operations/PatchMartechListRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchMartechListResponse](../../models/operations/PatchMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechList

Deletes the MarketingList identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechList" method="delete" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechListRequest;
import to.unified.unified_java_sdk.models.operations.RemoveMartechListResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechListRequest req = RemoveMartechListRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechListResponse res = sdk.list().removeMartechList()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveMartechListRequest](../../models/operations/RemoveMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveMartechListResponse](../../models/operations/RemoveMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechList

Updates the MarketingList identified by `id`. Provide the unified MarketingList fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechList" method="put" path="/martech/{connection_id}/list/{id}" example="martech_list" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechListRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMartechListResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechListRequest req = UpdateMartechListRequest.builder()
                .marketingList(MarketingList.builder()
                    .address(PropertyMarketingListAddress.builder()
                        .address1("76564 Coronation Road")
                        .address2("Suite 922")
                        .city("West Jordon")
                        .country("Mexico")
                        .postalCode("04183")
                        .region("NC")
                        .build())
                    .createdAt(OffsetDateTime.parse("2019-09-18T02:01:36.950Z"))
                    .description("Vilis.")
                    .id("107b72b6-1164-4a88-98fc-1c8c993dee3d")
                    .isActive(true)
                    .language("ru")
                    .metadata(List.of())
                    .name("Electronics Newsletter")
                    .senderCompany("Koepp and Sons")
                    .senderEmail("blake.kuhn@hotmail.com")
                    .senderName("Blake Kuhn")
                    .senderPhone("359.305.7962 x28115")
                    .subject("Theca caecus copia crebro valeo ulciscor.")
                    .updatedAt(OffsetDateTime.parse("2022-09-15T11:51:09.249Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechListResponse res = sdk.list().updateMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateMartechListRequest](../../models/operations/UpdateMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateMartechListResponse](../../models/operations/UpdateMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |