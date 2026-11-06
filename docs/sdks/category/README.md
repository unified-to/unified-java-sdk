# Category

## Overview

### Available Operations

* [createAccountingCategory](#createaccountingcategory) - Create a category
* [createTicketingCategory](#createticketingcategory) - Create a category
* [getAccountingCategory](#getaccountingcategory) - Retrieve a category
* [getPlmCategory](#getplmcategory) - Retrieve a category
* [getTicketingCategory](#getticketingcategory) - Retrieve a category
* [listAccountingCategories](#listaccountingcategories) - List all categories
* [listPlmCategories](#listplmcategories) - List all categories
* [listTicketingCategories](#listticketingcategories) - List all categories
* [patchAccountingCategory](#patchaccountingcategory) - Update a category
* [patchTicketingCategory](#patchticketingcategory) - Update a category
* [removeAccountingCategory](#removeaccountingcategory) - Remove a category
* [removeTicketingCategory](#removeticketingcategory) - Remove a category
* [updateAccountingCategory](#updateaccountingcategory) - Update a category
* [updateTicketingCategory](#updateticketingcategory) - Update a category

## createAccountingCategory

Creates a AccountingCategory. Provide the unified AccountingCategory fields in the request body; they are mapped to the provider's API. Returns the created AccountingCategory.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingCategory" method="post" path="/accounting/{connection_id}/category" example="accounting_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingCategoryRequest req = CreateAccountingCategoryRequest.builder()
                .accountingCategory(AccountingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-30T12:29:04.257Z"))
                    .description("Textus ab thymum labore basium.")
                    .id("b7de835d-635d-4878-8934-bac2a570f464")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Beauty")
                    .updatedAt(OffsetDateTime.parse("2025-09-22T07:22:17.869Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingCategoryResponse res = sdk.category().createAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingCategoryRequest](../../models/operations/CreateAccountingCategoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingCategoryResponse](../../models/operations/CreateAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTicketingCategory

Creates a TicketingCategory. Provide the unified TicketingCategory fields in the request body; they are mapped to the provider's API. Returns the created TicketingCategory.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingCategory" method="post" path="/ticketing/{connection_id}/category" example="ticketing_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingCategoryRequest req = CreateTicketingCategoryRequest.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-19T22:02:51.067Z"))
                    .description("Tempus umbra cibus carpo depulso torqueo. Curtus aperiam nam optio tendo. Bardus tumultus delectus arbitro amplus tollo coerceo clam comprehendo vulnero.")
                    .id("c57c8a17-ca60-4a83-b9e5-601e3e1d1afb")
                    .isActive(true)
                    .metadata(List.of())
                    .name("amicitia")
                    .updatedAt(OffsetDateTime.parse("2026-01-28T07:12:05.248Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCategoryResponse res = sdk.category().createTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateTicketingCategoryRequest](../../models/operations/CreateTicketingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateTicketingCategoryResponse](../../models/operations/CreateTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingCategory

Retrieves a single AccountingCategory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCategory" method="get" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCategoryRequest req = GetAccountingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCategoryResponse res = sdk.category().getAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingCategoryRequest](../../models/operations/GetAccountingCategoryRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingCategoryResponse](../../models/operations/GetAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlmCategory

Retrieves a single PlmCategory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlmCategory" method="get" path="/plm/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPlmCategoryRequest;
import to.unified.unified_java_sdk.models.operations.GetPlmCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPlmCategoryRequest req = GetPlmCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPlmCategoryResponse res = sdk.category().getPlmCategory()
                .request(req)
                .call();

        if (res.plmCategory().isPresent()) {
            System.out.println(res.plmCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetPlmCategoryRequest](../../models/operations/GetPlmCategoryRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetPlmCategoryResponse](../../models/operations/GetPlmCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingCategory

Retrieves a single TicketingCategory by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingCategory" method="get" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingCategoryRequest req = GetTicketingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingCategoryResponse res = sdk.category().getTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetTicketingCategoryRequest](../../models/operations/GetTicketingCategoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetTicketingCategoryResponse](../../models/operations/GetTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCategories

Returns a list of AccountingCategories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCategories" method="get" path="/accounting/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCategoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingCategoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCategoriesRequest req = ListAccountingCategoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCategoriesResponse res = sdk.category().listAccountingCategories()
                .request(req)
                .call();

        if (res.accountingCategories().isPresent()) {
            System.out.println(res.accountingCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListAccountingCategoriesRequest](../../models/operations/ListAccountingCategoriesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListAccountingCategoriesResponse](../../models/operations/ListAccountingCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlmCategories

Returns a list of PlmCategories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlmCategories" method="get" path="/plm/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPlmCategoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListPlmCategoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPlmCategoriesRequest req = ListPlmCategoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListPlmCategoriesResponse res = sdk.category().listPlmCategories()
                .request(req)
                .call();

        if (res.plmCategories().isPresent()) {
            System.out.println(res.plmCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListPlmCategoriesRequest](../../models/operations/ListPlmCategoriesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListPlmCategoriesResponse](../../models/operations/ListPlmCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingCategories

Returns a list of TicketingCategories. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingCategories" method="get" path="/ticketing/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingCategoriesRequest req = ListTicketingCategoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListTicketingCategoriesResponse res = sdk.category().listTicketingCategories()
                .request(req)
                .call();

        if (res.ticketingCategories().isPresent()) {
            System.out.println(res.ticketingCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListTicketingCategoriesRequest](../../models/operations/ListTicketingCategoriesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListTicketingCategoriesResponse](../../models/operations/ListTicketingCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingCategory

Updates the AccountingCategory identified by `id`. Provide the unified AccountingCategory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingCategory" method="patch" path="/accounting/{connection_id}/category/{id}" example="accounting_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingCategoryRequest req = PatchAccountingCategoryRequest.builder()
                .accountingCategory(AccountingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-30T12:29:04.257Z"))
                    .description("Textus ab thymum labore basium.")
                    .id("7dcd9445-e086-4df9-afe9-f3bfc6af9db1")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Beauty")
                    .updatedAt(OffsetDateTime.parse("2025-09-22T07:22:17.877Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingCategoryResponse res = sdk.category().patchAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingCategoryRequest](../../models/operations/PatchAccountingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingCategoryResponse](../../models/operations/PatchAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingCategory

Updates the TicketingCategory identified by `id`. Provide the unified TicketingCategory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingCategory" method="patch" path="/ticketing/{connection_id}/category/{id}" example="ticketing_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingCategoryRequest req = PatchTicketingCategoryRequest.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-19T22:02:51.067Z"))
                    .description("Tempus umbra cibus carpo depulso torqueo. Curtus aperiam nam optio tendo. Bardus tumultus delectus arbitro amplus tollo coerceo clam comprehendo vulnero.")
                    .id("db8e2d0b-9b88-443e-b83b-a991ebfc04b4")
                    .isActive(true)
                    .metadata(List.of())
                    .name("amicitia")
                    .updatedAt(OffsetDateTime.parse("2026-01-28T07:12:05.259Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCategoryResponse res = sdk.category().patchTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchTicketingCategoryRequest](../../models/operations/PatchTicketingCategoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchTicketingCategoryResponse](../../models/operations/PatchTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingCategory

Deletes the AccountingCategory identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingCategory" method="delete" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingCategoryRequest req = RemoveAccountingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingCategoryResponse res = sdk.category().removeAccountingCategory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingCategoryRequest](../../models/operations/RemoveAccountingCategoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingCategoryResponse](../../models/operations/RemoveAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingCategory

Deletes the TicketingCategory identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingCategory" method="delete" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingCategoryRequest req = RemoveTicketingCategoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingCategoryResponse res = sdk.category().removeTicketingCategory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveTicketingCategoryRequest](../../models/operations/RemoveTicketingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveTicketingCategoryResponse](../../models/operations/RemoveTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingCategory

Updates the AccountingCategory identified by `id`. Provide the unified AccountingCategory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingCategory" method="put" path="/accounting/{connection_id}/category/{id}" example="accounting_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingCategoryRequest req = UpdateAccountingCategoryRequest.builder()
                .accountingCategory(AccountingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2023-05-30T12:29:04.257Z"))
                    .description("Textus ab thymum labore basium.")
                    .id("7dcd9445-e086-4df9-afe9-f3bfc6af9db1")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Beauty")
                    .updatedAt(OffsetDateTime.parse("2025-09-22T07:22:17.877Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingCategoryResponse res = sdk.category().updateAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingCategoryRequest](../../models/operations/UpdateAccountingCategoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingCategoryResponse](../../models/operations/UpdateAccountingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingCategory

Updates the TicketingCategory identified by `id`. Provide the unified TicketingCategory fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingCategory" method="put" path="/ticketing/{connection_id}/category/{id}" example="ticketing_category" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingCategoryRequest req = UpdateTicketingCategoryRequest.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .createdAt(OffsetDateTime.parse("2019-10-19T22:02:51.067Z"))
                    .description("Tempus umbra cibus carpo depulso torqueo. Curtus aperiam nam optio tendo. Bardus tumultus delectus arbitro amplus tollo coerceo clam comprehendo vulnero.")
                    .id("db8e2d0b-9b88-443e-b83b-a991ebfc04b4")
                    .isActive(true)
                    .metadata(List.of())
                    .name("amicitia")
                    .updatedAt(OffsetDateTime.parse("2026-01-28T07:12:05.259Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCategoryResponse res = sdk.category().updateTicketingCategory()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateTicketingCategoryRequest](../../models/operations/UpdateTicketingCategoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateTicketingCategoryResponse](../../models/operations/UpdateTicketingCategoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |