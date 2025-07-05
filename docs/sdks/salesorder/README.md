# Salesorder
(*salesorder()*)

## Overview

### Available Operations

* [createAccountingSalesorder](#createaccountingsalesorder) - Create a salesorder
* [getAccountingSalesorder](#getaccountingsalesorder) - Retrieve a salesorder
* [listAccountingSalesorders](#listaccountingsalesorders) - List all salesorders
* [patchAccountingSalesorder](#patchaccountingsalesorder) - Update a salesorder
* [removeAccountingSalesorder](#removeaccountingsalesorder) - Remove a salesorder
* [updateAccountingSalesorder](#updateaccountingsalesorder) - Update a salesorder

## createAccountingSalesorder

Create a salesorder

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.AccountingSalesorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateAccountingSalesorderRequest req = CreateAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingSalesorderResponse res = sdk.salesorder().createAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateAccountingSalesorderRequest](../../models/operations/CreateAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateAccountingSalesorderResponse](../../models/operations/CreateAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingSalesorder

Retrieve a salesorder

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetAccountingSalesorderRequest req = GetAccountingSalesorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingSalesorderResponse res = sdk.salesorder().getAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAccountingSalesorderRequest](../../models/operations/GetAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAccountingSalesorderResponse](../../models/operations/GetAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingSalesorders

List all salesorders

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingSalesordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListAccountingSalesordersRequest req = ListAccountingSalesordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingSalesordersResponse res = sdk.salesorder().listAccountingSalesorders()
                .request(req)
                .call();

        if (res.accountingSalesorders().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListAccountingSalesordersRequest](../../models/operations/ListAccountingSalesordersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListAccountingSalesordersResponse](../../models/operations/ListAccountingSalesordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingSalesorder

Update a salesorder

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.AccountingSalesorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchAccountingSalesorderRequest req = PatchAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingSalesorderResponse res = sdk.salesorder().patchAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchAccountingSalesorderRequest](../../models/operations/PatchAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchAccountingSalesorderResponse](../../models/operations/PatchAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingSalesorder

Remove a salesorder

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveAccountingSalesorderRequest req = RemoveAccountingSalesorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingSalesorderResponse res = sdk.salesorder().removeAccountingSalesorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveAccountingSalesorderRequest](../../models/operations/RemoveAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveAccountingSalesorderResponse](../../models/operations/RemoveAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingSalesorder

Update a salesorder

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingSalesorderResponse;
import to.unified.unified_java_sdk.models.shared.AccountingSalesorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateAccountingSalesorderRequest req = UpdateAccountingSalesorderRequest.builder()
                .accountingSalesorder(AccountingSalesorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingSalesorderResponse res = sdk.salesorder().updateAccountingSalesorder()
                .request(req)
                .call();

        if (res.accountingSalesorder().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateAccountingSalesorderRequest](../../models/operations/UpdateAccountingSalesorderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateAccountingSalesorderResponse](../../models/operations/UpdateAccountingSalesorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |