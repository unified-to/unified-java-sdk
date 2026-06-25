# Itemvariant

## Overview

### Available Operations

* [createCommerceItemvariant2](#createcommerceitemvariant2) - Create an itemvariant
* [getCommerceItemvariant2](#getcommerceitemvariant2) - Retrieve an itemvariant
* [listCommerceItemvariants2](#listcommerceitemvariants2) - List all itemvariants
* [patchCommerceItemvariant2](#patchcommerceitemvariant2) - Update an itemvariant
* [removeCommerceItemvariant2](#removecommerceitemvariant2) - Remove an itemvariant
* [updateCommerceItemvariant2](#updatecommerceitemvariant2) - Update an itemvariant

## createCommerceItemvariant2

Create an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceItemvariant2" method="post" path="/commerce/{connection_id}/itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItemvariant;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceItemvariant2Request req = CreateCommerceItemvariant2Request.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceItemvariant2Response res = sdk.itemvariant().createCommerceItemvariant2()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateCommerceItemvariant2Request](../../models/operations/CreateCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateCommerceItemvariant2Response](../../models/operations/CreateCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceItemvariant2

Retrieve an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceItemvariant2" method="get" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceItemvariant2Request req = GetCommerceItemvariant2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceItemvariant2Response res = sdk.itemvariant().getCommerceItemvariant2()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCommerceItemvariant2Request](../../models/operations/GetCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCommerceItemvariant2Response](../../models/operations/GetCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceItemvariants2

List all itemvariants

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceItemvariants2" method="get" path="/commerce/{connection_id}/itemvariant" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemvariants2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceItemvariants2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceItemvariants2Request req = ListCommerceItemvariants2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceItemvariants2Response res = sdk.itemvariant().listCommerceItemvariants2()
                .request(req)
                .call();

        if (res.commerceItemvariants().isPresent()) {
            System.out.println(res.commerceItemvariants().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListCommerceItemvariants2Request](../../models/operations/ListCommerceItemvariants2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListCommerceItemvariants2Response](../../models/operations/ListCommerceItemvariants2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceItemvariant2

Update an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceItemvariant2" method="patch" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItemvariant;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceItemvariant2Request req = PatchCommerceItemvariant2Request.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceItemvariant2Response res = sdk.itemvariant().patchCommerceItemvariant2()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [PatchCommerceItemvariant2Request](../../models/operations/PatchCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[PatchCommerceItemvariant2Response](../../models/operations/PatchCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceItemvariant2

Remove an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceItemvariant2" method="delete" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceItemvariant2Request req = RemoveCommerceItemvariant2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceItemvariant2Response res = sdk.itemvariant().removeCommerceItemvariant2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RemoveCommerceItemvariant2Request](../../models/operations/RemoveCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RemoveCommerceItemvariant2Response](../../models/operations/RemoveCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceItemvariant2

Update an itemvariant

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceItemvariant2" method="put" path="/commerce/{connection_id}/itemvariant/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemvariant2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceItemvariant2Response;
import to.unified.unified_java_sdk.models.shared.CommerceItemvariant;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceItemvariant2Request req = UpdateCommerceItemvariant2Request.builder()
                .commerceItemvariant(CommerceItemvariant.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceItemvariant2Response res = sdk.itemvariant().updateCommerceItemvariant2()
                .request(req)
                .call();

        if (res.commerceItemvariant().isPresent()) {
            System.out.println(res.commerceItemvariant().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateCommerceItemvariant2Request](../../models/operations/UpdateCommerceItemvariant2Request.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateCommerceItemvariant2Response](../../models/operations/UpdateCommerceItemvariant2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |