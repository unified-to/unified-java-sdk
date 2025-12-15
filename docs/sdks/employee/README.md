# Employee

## Overview

### Available Operations

* [createHrisEmployee](#createhrisemployee) - Create an employee
* [getHrisEmployee](#gethrisemployee) - Retrieve an employee
* [listHrisEmployees](#listhrisemployees) - List all employees
* [patchHrisEmployee](#patchhrisemployee) - Update an employee
* [removeHrisEmployee](#removehrisemployee) - Remove an employee
* [updateHrisEmployee](#updatehrisemployee) - Update an employee

## createHrisEmployee

Create an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEmployee" method="post" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisEmployeeRequest req = CreateHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEmployeeResponse res = sdk.employee().createHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisEmployeeRequest](../../models/operations/CreateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisEmployeeResponse](../../models/operations/CreateHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisEmployee

Retrieve an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisEmployee" method="get" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisEmployeeRequest req = GetHrisEmployeeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisEmployeeResponse res = sdk.employee().getHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisEmployeeRequest](../../models/operations/GetHrisEmployeeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisEmployeeResponse](../../models/operations/GetHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisEmployees

List all employees

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisEmployees" method="get" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployeesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployeesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisEmployeesRequest req = ListHrisEmployeesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisEmployeesResponse res = sdk.employee().listHrisEmployees()
                .request(req)
                .call();

        if (res.hrisEmployees().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisEmployeesRequest](../../models/operations/ListHrisEmployeesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisEmployeesResponse](../../models/operations/ListHrisEmployeesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisEmployee

Update an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEmployee" method="patch" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisEmployeeRequest req = PatchHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEmployeeResponse res = sdk.employee().patchHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisEmployeeRequest](../../models/operations/PatchHrisEmployeeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisEmployeeResponse](../../models/operations/PatchHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisEmployee

Remove an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisEmployee" method="delete" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisEmployeeRequest req = RemoveHrisEmployeeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisEmployeeResponse res = sdk.employee().removeHrisEmployee()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisEmployeeRequest](../../models/operations/RemoveHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisEmployeeResponse](../../models/operations/RemoveHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisEmployee

Update an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEmployee" method="put" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisEmployeeRequest req = UpdateHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEmployeeResponse res = sdk.employee().updateHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisEmployeeRequest](../../models/operations/UpdateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisEmployeeResponse](../../models/operations/UpdateHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |