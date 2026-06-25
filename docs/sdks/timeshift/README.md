# Timeshift

## Overview

### Available Operations

* [createHrisTimeshift2](#createhristimeshift2) - Create a timeshift
* [getHrisTimeshift2](#gethristimeshift2) - Retrieve a timeshift
* [listHrisTimeshifts2](#listhristimeshifts2) - List all timeshifts
* [patchHrisTimeshift2](#patchhristimeshift2) - Update a timeshift
* [removeHrisTimeshift2](#removehristimeshift2) - Remove a timeshift
* [updateHrisTimeshift2](#updatehristimeshift2) - Update a timeshift

## createHrisTimeshift2

Create a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeshift2" method="post" path="/hris/{connection_id}/timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeshift;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeshift2Request req = CreateHrisTimeshift2Request.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeshift2Response res = sdk.timeshift().createHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateHrisTimeshift2Request](../../models/operations/CreateHrisTimeshift2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateHrisTimeshift2Response](../../models/operations/CreateHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTimeshift2

Retrieve a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeshift2" method="get" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeshift2Request req = GetHrisTimeshift2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeshift2Response res = sdk.timeshift().getHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHrisTimeshift2Request](../../models/operations/GetHrisTimeshift2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHrisTimeshift2Response](../../models/operations/GetHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTimeshifts2

List all timeshifts

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeshifts2" method="get" path="/hris/{connection_id}/timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshifts2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshifts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeshifts2Request req = ListHrisTimeshifts2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeshifts2Response res = sdk.timeshift().listHrisTimeshifts2()
                .request(req)
                .call();

        if (res.hrisTimeshifts().isPresent()) {
            System.out.println(res.hrisTimeshifts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHrisTimeshifts2Request](../../models/operations/ListHrisTimeshifts2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHrisTimeshifts2Response](../../models/operations/ListHrisTimeshifts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeshift2

Update a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeshift2" method="patch" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeshift;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeshift2Request req = PatchHrisTimeshift2Request.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeshift2Response res = sdk.timeshift().patchHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchHrisTimeshift2Request](../../models/operations/PatchHrisTimeshift2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchHrisTimeshift2Response](../../models/operations/PatchHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeshift2

Remove a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeshift2" method="delete" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeshift2Request req = RemoveHrisTimeshift2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeshift2Response res = sdk.timeshift().removeHrisTimeshift2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveHrisTimeshift2Request](../../models/operations/RemoveHrisTimeshift2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveHrisTimeshift2Response](../../models/operations/RemoveHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeshift2

Update a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeshift2" method="put" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeshift;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeshift2Request req = UpdateHrisTimeshift2Request.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeshift2Response res = sdk.timeshift().updateHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateHrisTimeshift2Request](../../models/operations/UpdateHrisTimeshift2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateHrisTimeshift2Response](../../models/operations/UpdateHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |