# Category

## Overview

### Available Operations

* [createAccountingCategory2](#createaccountingcategory2) - Create a category
* [createTicketingCategory2](#createticketingcategory2) - Create a category
* [getAccountingCategory2](#getaccountingcategory2) - Retrieve a category
* [getTicketingCategory2](#getticketingcategory2) - Retrieve a category
* [listAccountingCategories2](#listaccountingcategories2) - List all categories
* [listTicketingCategories2](#listticketingcategories2) - List all categories
* [patchAccountingCategory2](#patchaccountingcategory2) - Update a category
* [patchTicketingCategory2](#patchticketingcategory2) - Update a category
* [removeAccountingCategory2](#removeaccountingcategory2) - Remove a category
* [removeTicketingCategory2](#removeticketingcategory2) - Remove a category
* [updateAccountingCategory2](#updateaccountingcategory2) - Update a category
* [updateTicketingCategory2](#updateticketingcategory2) - Update a category

## createAccountingCategory2

Create a category

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingCategory2" method="post" path="/accounting/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCategory2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingCategory2Response;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingCategory2Request req = CreateAccountingCategory2Request.builder()
                .accountingCategory(AccountingCategory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingCategory2Response res = sdk.category().createAccountingCategory2()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CreateAccountingCategory2Request](../../models/operations/CreateAccountingCategory2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CreateAccountingCategory2Response](../../models/operations/CreateAccountingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTicketingCategory2

Create a category

### Example Usage

<!-- UsageSnippet language="java" operationID="createTicketingCategory2" method="post" path="/ticketing/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.CreateTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateTicketingCategory2Request req = CreateTicketingCategory2Request.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateTicketingCategory2Response res = sdk.category().createTicketingCategory2()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateTicketingCategory2Request](../../models/operations/CreateTicketingCategory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateTicketingCategory2Response](../../models/operations/CreateTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingCategory2

Retrieve a category

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingCategory2" method="get" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingCategory2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingCategory2Request req = GetAccountingCategory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingCategory2Response res = sdk.category().getAccountingCategory2()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetAccountingCategory2Request](../../models/operations/GetAccountingCategory2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetAccountingCategory2Response](../../models/operations/GetAccountingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTicketingCategory2

Retrieve a category

### Example Usage

<!-- UsageSnippet language="java" operationID="getTicketingCategory2" method="get" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.GetTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetTicketingCategory2Request req = GetTicketingCategory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetTicketingCategory2Response res = sdk.category().getTicketingCategory2()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetTicketingCategory2Request](../../models/operations/GetTicketingCategory2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetTicketingCategory2Response](../../models/operations/GetTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingCategories2

List all categories

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingCategories2" method="get" path="/accounting/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingCategories2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingCategories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingCategories2Request req = ListAccountingCategories2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingCategories2Response res = sdk.category().listAccountingCategories2()
                .request(req)
                .call();

        if (res.accountingCategories().isPresent()) {
            System.out.println(res.accountingCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListAccountingCategories2Request](../../models/operations/ListAccountingCategories2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListAccountingCategories2Response](../../models/operations/ListAccountingCategories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTicketingCategories2

List all categories

### Example Usage

<!-- UsageSnippet language="java" operationID="listTicketingCategories2" method="get" path="/ticketing/{connection_id}/category" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategories2Request;
import to.unified.unified_java_sdk.models.operations.ListTicketingCategories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListTicketingCategories2Request req = ListTicketingCategories2Request.builder()
                .connectionId("<id>")
                .build();

        ListTicketingCategories2Response res = sdk.category().listTicketingCategories2()
                .request(req)
                .call();

        if (res.ticketingCategories().isPresent()) {
            System.out.println(res.ticketingCategories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListTicketingCategories2Request](../../models/operations/ListTicketingCategories2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListTicketingCategories2Response](../../models/operations/ListTicketingCategories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingCategory2

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingCategory2" method="patch" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCategory2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingCategory2Response;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingCategory2Request req = PatchAccountingCategory2Request.builder()
                .accountingCategory(AccountingCategory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingCategory2Response res = sdk.category().patchAccountingCategory2()
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
| `request`                                                                                     | [PatchAccountingCategory2Request](../../models/operations/PatchAccountingCategory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[PatchAccountingCategory2Response](../../models/operations/PatchAccountingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchTicketingCategory2

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="patchTicketingCategory2" method="patch" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.PatchTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchTicketingCategory2Request req = PatchTicketingCategory2Request.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchTicketingCategory2Response res = sdk.category().patchTicketingCategory2()
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
| `request`                                                                                   | [PatchTicketingCategory2Request](../../models/operations/PatchTicketingCategory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchTicketingCategory2Response](../../models/operations/PatchTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingCategory2

Remove a category

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingCategory2" method="delete" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCategory2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingCategory2Request req = RemoveAccountingCategory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingCategory2Response res = sdk.category().removeAccountingCategory2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [RemoveAccountingCategory2Request](../../models/operations/RemoveAccountingCategory2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[RemoveAccountingCategory2Response](../../models/operations/RemoveAccountingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeTicketingCategory2

Remove a category

### Example Usage

<!-- UsageSnippet language="java" operationID="removeTicketingCategory2" method="delete" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.RemoveTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveTicketingCategory2Request req = RemoveTicketingCategory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveTicketingCategory2Response res = sdk.category().removeTicketingCategory2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveTicketingCategory2Request](../../models/operations/RemoveTicketingCategory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveTicketingCategory2Response](../../models/operations/RemoveTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingCategory2

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingCategory2" method="put" path="/accounting/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCategory2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingCategory2Response;
import to.unified.unified_java_sdk.models.shared.AccountingCategory;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingCategory2Request req = UpdateAccountingCategory2Request.builder()
                .accountingCategory(AccountingCategory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingCategory2Response res = sdk.category().updateAccountingCategory2()
                .request(req)
                .call();

        if (res.accountingCategory().isPresent()) {
            System.out.println(res.accountingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateAccountingCategory2Request](../../models/operations/UpdateAccountingCategory2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateAccountingCategory2Response](../../models/operations/UpdateAccountingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateTicketingCategory2

Update a category

### Example Usage

<!-- UsageSnippet language="java" operationID="updateTicketingCategory2" method="put" path="/ticketing/{connection_id}/category/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategory2Request;
import to.unified.unified_java_sdk.models.operations.UpdateTicketingCategory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.TicketingCategory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateTicketingCategory2Request req = UpdateTicketingCategory2Request.builder()
                .ticketingCategory(TicketingCategory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateTicketingCategory2Response res = sdk.category().updateTicketingCategory2()
                .request(req)
                .call();

        if (res.ticketingCategory().isPresent()) {
            System.out.println(res.ticketingCategory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateTicketingCategory2Request](../../models/operations/UpdateTicketingCategory2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateTicketingCategory2Response](../../models/operations/UpdateTicketingCategory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |