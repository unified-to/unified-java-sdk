# Deduction

## Overview

### Available Operations

* [createHrisDeduction2](#createhrisdeduction2) - Create a deduction
* [getHrisDeduction2](#gethrisdeduction2) - Retrieve a deduction
* [listHrisDeductions2](#listhrisdeductions2) - List all deductions
* [patchHrisDeduction2](#patchhrisdeduction2) - Update a deduction
* [removeHrisDeduction2](#removehrisdeduction2) - Remove a deduction
* [updateHrisDeduction2](#updatehrisdeduction2) - Update a deduction

## createHrisDeduction2

Create a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDeduction2" method="post" path="/hris/{connection_id}/deduction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.HrisDeduction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDeduction2Request req = CreateHrisDeduction2Request.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDeduction2Response res = sdk.deduction().createHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateHrisDeduction2Request](../../models/operations/CreateHrisDeduction2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateHrisDeduction2Response](../../models/operations/CreateHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDeduction2

Retrieve a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDeduction2" method="get" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDeduction2Request req = GetHrisDeduction2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDeduction2Response res = sdk.deduction().getHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHrisDeduction2Request](../../models/operations/GetHrisDeduction2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHrisDeduction2Response](../../models/operations/GetHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDeductions2

List all deductions

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDeductions2" method="get" path="/hris/{connection_id}/deduction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductions2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductions2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDeductions2Request req = ListHrisDeductions2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisDeductions2Response res = sdk.deduction().listHrisDeductions2()
                .request(req)
                .call();

        if (res.hrisDeductions().isPresent()) {
            System.out.println(res.hrisDeductions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHrisDeductions2Request](../../models/operations/ListHrisDeductions2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHrisDeductions2Response](../../models/operations/ListHrisDeductions2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDeduction2

Update a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDeduction2" method="patch" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.HrisDeduction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDeduction2Request req = PatchHrisDeduction2Request.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDeduction2Response res = sdk.deduction().patchHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchHrisDeduction2Request](../../models/operations/PatchHrisDeduction2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchHrisDeduction2Response](../../models/operations/PatchHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDeduction2

Remove a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDeduction2" method="delete" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDeduction2Request req = RemoveHrisDeduction2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDeduction2Response res = sdk.deduction().removeHrisDeduction2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveHrisDeduction2Request](../../models/operations/RemoveHrisDeduction2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveHrisDeduction2Response](../../models/operations/RemoveHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDeduction2

Update a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDeduction2" method="put" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.HrisDeduction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDeduction2Request req = UpdateHrisDeduction2Request.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDeduction2Response res = sdk.deduction().updateHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateHrisDeduction2Request](../../models/operations/UpdateHrisDeduction2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateHrisDeduction2Response](../../models/operations/UpdateHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |