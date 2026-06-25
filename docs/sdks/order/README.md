# Order

## Overview

### Available Operations

* [createAccountingOrder2](#createaccountingorder2) - Create an order
* [getAccountingOrder2](#getaccountingorder2) - Retrieve an order
* [listAccountingOrders2](#listaccountingorders2) - List all orders
* [patchAccountingOrder2](#patchaccountingorder2) - Update an order
* [patchAssessmentOrder2](#patchassessmentorder2) - Update an order
* [removeAccountingOrder2](#removeaccountingorder2) - Remove an order
* [updateAccountingOrder2](#updateaccountingorder2) - Update an order
* [updateAssessmentOrder2](#updateassessmentorder2) - Update an order

## createAccountingOrder2

Create an order

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingOrder2" method="post" path="/accounting/{connection_id}/order" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingOrder2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingOrder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingOrder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingOrder2Request req = CreateAccountingOrder2Request.builder()
                .accountingOrder(AccountingOrder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingOrder2Response res = sdk.order().createAccountingOrder2()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateAccountingOrder2Request](../../models/operations/CreateAccountingOrder2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateAccountingOrder2Response](../../models/operations/CreateAccountingOrder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingOrder2

Retrieve an order

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingOrder2" method="get" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrder2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingOrder2Request req = GetAccountingOrder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingOrder2Response res = sdk.order().getAccountingOrder2()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAccountingOrder2Request](../../models/operations/GetAccountingOrder2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAccountingOrder2Response](../../models/operations/GetAccountingOrder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingOrders2

List all orders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingOrders2" method="get" path="/accounting/{connection_id}/order" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrders2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrders2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingOrders2Request req = ListAccountingOrders2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingOrders2Response res = sdk.order().listAccountingOrders2()
                .request(req)
                .call();

        if (res.accountingOrders().isPresent()) {
            System.out.println(res.accountingOrders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAccountingOrders2Request](../../models/operations/ListAccountingOrders2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAccountingOrders2Response](../../models/operations/ListAccountingOrders2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingOrder2

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingOrder2" method="patch" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingOrder2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingOrder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingOrder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingOrder2Request req = PatchAccountingOrder2Request.builder()
                .accountingOrder(AccountingOrder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingOrder2Response res = sdk.order().patchAccountingOrder2()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchAccountingOrder2Request](../../models/operations/PatchAccountingOrder2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchAccountingOrder2Response](../../models/operations/PatchAccountingOrder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAssessmentOrder2

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentOrder2" method="patch" path="/assessment/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrder2Request;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrder2Response;
import to.unified.unified_java_sdk.models.shared.AssessmentOrder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAssessmentOrder2Request req = PatchAssessmentOrder2Request.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentOrder2Response res = sdk.order().patchAssessmentOrder2()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchAssessmentOrder2Request](../../models/operations/PatchAssessmentOrder2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchAssessmentOrder2Response](../../models/operations/PatchAssessmentOrder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingOrder2

Remove an order

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingOrder2" method="delete" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingOrder2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingOrder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingOrder2Request req = RemoveAccountingOrder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingOrder2Response res = sdk.order().removeAccountingOrder2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveAccountingOrder2Request](../../models/operations/RemoveAccountingOrder2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveAccountingOrder2Response](../../models/operations/RemoveAccountingOrder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingOrder2

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingOrder2" method="put" path="/accounting/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingOrder2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingOrder2Response;
import to.unified.unified_java_sdk.models.shared.AccountingOrder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingOrder2Request req = UpdateAccountingOrder2Request.builder()
                .accountingOrder(AccountingOrder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingOrder2Response res = sdk.order().updateAccountingOrder2()
                .request(req)
                .call();

        if (res.accountingOrder().isPresent()) {
            System.out.println(res.accountingOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateAccountingOrder2Request](../../models/operations/UpdateAccountingOrder2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateAccountingOrder2Response](../../models/operations/UpdateAccountingOrder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAssessmentOrder2

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentOrder2" method="put" path="/assessment/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrder2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrder2Response;
import to.unified.unified_java_sdk.models.shared.AssessmentOrder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAssessmentOrder2Request req = UpdateAssessmentOrder2Request.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentOrder2Response res = sdk.order().updateAssessmentOrder2()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateAssessmentOrder2Request](../../models/operations/UpdateAssessmentOrder2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateAssessmentOrder2Response](../../models/operations/UpdateAssessmentOrder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |