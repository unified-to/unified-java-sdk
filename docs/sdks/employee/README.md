# Employee

## Overview

### Available Operations

* [createHrisEmployee2](#createhrisemployee2) - Create an employee
* [getHrisEmployee2](#gethrisemployee2) - Retrieve an employee
* [listHrisEmployees2](#listhrisemployees2) - List all employees
* [patchHrisEmployee2](#patchhrisemployee2) - Update an employee
* [removeHrisEmployee2](#removehrisemployee2) - Remove an employee
* [updateHrisEmployee2](#updatehrisemployee2) - Update an employee

## createHrisEmployee2

Create an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEmployee2" method="post" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisEmployee2Request req = CreateHrisEmployee2Request.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEmployee2Response res = sdk.employee().createHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateHrisEmployee2Request](../../models/operations/CreateHrisEmployee2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisEmployee2Response](../../models/operations/CreateHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisEmployee2

Retrieve an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisEmployee2" method="get" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisEmployee2Request req = GetHrisEmployee2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisEmployee2Response res = sdk.employee().getHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisEmployee2Request](../../models/operations/GetHrisEmployee2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisEmployee2Response](../../models/operations/GetHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisEmployees2

List all employees

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisEmployees2" method="get" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployees2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployees2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisEmployees2Request req = ListHrisEmployees2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisEmployees2Response res = sdk.employee().listHrisEmployees2()
                .request(req)
                .call();

        if (res.hrisEmployees().isPresent()) {
            System.out.println(res.hrisEmployees().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisEmployees2Request](../../models/operations/ListHrisEmployees2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisEmployees2Response](../../models/operations/ListHrisEmployees2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisEmployee2

Update an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEmployee2" method="patch" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisEmployee2Request req = PatchHrisEmployee2Request.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEmployee2Response res = sdk.employee().patchHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisEmployee2Request](../../models/operations/PatchHrisEmployee2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisEmployee2Response](../../models/operations/PatchHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisEmployee2

Remove an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisEmployee2" method="delete" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisEmployee2Request req = RemoveHrisEmployee2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisEmployee2Response res = sdk.employee().removeHrisEmployee2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisEmployee2Request](../../models/operations/RemoveHrisEmployee2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisEmployee2Response](../../models/operations/RemoveHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisEmployee2

Update an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEmployee2" method="put" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisEmployee2Request req = UpdateHrisEmployee2Request.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEmployee2Response res = sdk.employee().updateHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHrisEmployee2Request](../../models/operations/UpdateHrisEmployee2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisEmployee2Response](../../models/operations/UpdateHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |