# Category
(*category()*)

## Overview

### Available Operations

* [createAccountingCategory](#createaccountingcategory) - Create a category
* [getAccountingCategory](#getaccountingcategory) - Retrieve a category
* [listAccountingCategories](#listaccountingcategories) - List all categories
* [patchAccountingCategory](#patchaccountingcategory) - Update a category
* [removeAccountingCategory](#removeaccountingcategory) - Remove a category
* [updateAccountingCategory](#updateaccountingcategory) - Update a category

## createAccountingCategory

Create a category

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingCategory" method="post" path="/accounting/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingCategoryResponse res = sdk.category().createAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            // handle response
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

## getAccountingCategory

Retrieve a category

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
            // handle response
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

## listAccountingCategories

List all categories

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
            // handle response
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

## patchAccountingCategory

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingCategory" method="patch" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingCategoryResponse res = sdk.category().patchAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            // handle response
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

## removeAccountingCategory

Remove a category

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

## updateAccountingCategory

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingCategory" method="put" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
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
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingCategoryResponse res = sdk.category().updateAccountingCategory()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            // handle response
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