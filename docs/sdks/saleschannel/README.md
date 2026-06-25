# Saleschannel

## Overview

### Available Operations

* [createCommerceSaleschannel2](#createcommercesaleschannel2) - Create a saleschannel
* [getCommerceSaleschannel2](#getcommercesaleschannel2) - Retrieve a saleschannel
* [listCommerceSaleschannels2](#listcommercesaleschannels2) - List all saleschannels
* [patchCommerceSaleschannel2](#patchcommercesaleschannel2) - Update a saleschannel
* [removeCommerceSaleschannel2](#removecommercesaleschannel2) - Remove a saleschannel
* [updateCommerceSaleschannel2](#updatecommercesaleschannel2) - Update a saleschannel

## createCommerceSaleschannel2

Create a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceSaleschannel2" method="post" path="/commerce/{connection_id}/saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceSaleschannel2Request req = CreateCommerceSaleschannel2Request.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceSaleschannel2Response res = sdk.saleschannel().createCommerceSaleschannel2()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateCommerceSaleschannel2Request](../../models/operations/CreateCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateCommerceSaleschannel2Response](../../models/operations/CreateCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceSaleschannel2

Retrieve a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceSaleschannel2" method="get" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceSaleschannel2Request req = GetCommerceSaleschannel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceSaleschannel2Response res = sdk.saleschannel().getCommerceSaleschannel2()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetCommerceSaleschannel2Request](../../models/operations/GetCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetCommerceSaleschannel2Response](../../models/operations/GetCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceSaleschannels2

List all saleschannels

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceSaleschannels2" method="get" path="/commerce/{connection_id}/saleschannel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceSaleschannels2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceSaleschannels2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceSaleschannels2Request req = ListCommerceSaleschannels2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceSaleschannels2Response res = sdk.saleschannel().listCommerceSaleschannels2()
                .request(req)
                .call();

        if (res.commerceSaleschannels().isPresent()) {
            System.out.println(res.commerceSaleschannels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListCommerceSaleschannels2Request](../../models/operations/ListCommerceSaleschannels2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListCommerceSaleschannels2Response](../../models/operations/ListCommerceSaleschannels2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceSaleschannel2

Update a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceSaleschannel2" method="patch" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceSaleschannel2Request req = PatchCommerceSaleschannel2Request.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceSaleschannel2Response res = sdk.saleschannel().patchCommerceSaleschannel2()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchCommerceSaleschannel2Request](../../models/operations/PatchCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchCommerceSaleschannel2Response](../../models/operations/PatchCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceSaleschannel2

Remove a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceSaleschannel2" method="delete" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceSaleschannel2Request req = RemoveCommerceSaleschannel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceSaleschannel2Response res = sdk.saleschannel().removeCommerceSaleschannel2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [RemoveCommerceSaleschannel2Request](../../models/operations/RemoveCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[RemoveCommerceSaleschannel2Response](../../models/operations/RemoveCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceSaleschannel2

Update a saleschannel

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceSaleschannel2" method="put" path="/commerce/{connection_id}/saleschannel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceSaleschannel2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceSaleschannel2Response;
import to.unified.unified_java_sdk.models.shared.CommerceSaleschannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceSaleschannel2Request req = UpdateCommerceSaleschannel2Request.builder()
                .commerceSaleschannel(CommerceSaleschannel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceSaleschannel2Response res = sdk.saleschannel().updateCommerceSaleschannel2()
                .request(req)
                .call();

        if (res.commerceSaleschannel().isPresent()) {
            System.out.println(res.commerceSaleschannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateCommerceSaleschannel2Request](../../models/operations/UpdateCommerceSaleschannel2Request.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateCommerceSaleschannel2Response](../../models/operations/UpdateCommerceSaleschannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |