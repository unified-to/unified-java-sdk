# Bankaccount

## Overview

### Available Operations

* [createHrisBankaccount2](#createhrisbankaccount2) - Create a bankaccount
* [getHrisBankaccount2](#gethrisbankaccount2) - Retrieve a bankaccount
* [listHrisBankaccounts2](#listhrisbankaccounts2) - List all bankaccounts
* [patchHrisBankaccount2](#patchhrisbankaccount2) - Update a bankaccount
* [removeHrisBankaccount2](#removehrisbankaccount2) - Remove a bankaccount
* [updateHrisBankaccount2](#updatehrisbankaccount2) - Update a bankaccount

## createHrisBankaccount2

Create a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBankaccount2" method="post" path="/hris/{connection_id}/bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.HrisBankaccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBankaccount2Request req = CreateHrisBankaccount2Request.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBankaccount2Response res = sdk.bankaccount().createHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateHrisBankaccount2Request](../../models/operations/CreateHrisBankaccount2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateHrisBankaccount2Response](../../models/operations/CreateHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBankaccount2

Retrieve a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBankaccount2" method="get" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBankaccount2Request req = GetHrisBankaccount2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBankaccount2Response res = sdk.bankaccount().getHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetHrisBankaccount2Request](../../models/operations/GetHrisBankaccount2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetHrisBankaccount2Response](../../models/operations/GetHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBankaccounts2

List all bankaccounts

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBankaccounts2" method="get" path="/hris/{connection_id}/bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccounts2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccounts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBankaccounts2Request req = ListHrisBankaccounts2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisBankaccounts2Response res = sdk.bankaccount().listHrisBankaccounts2()
                .request(req)
                .call();

        if (res.hrisBankaccounts().isPresent()) {
            System.out.println(res.hrisBankaccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListHrisBankaccounts2Request](../../models/operations/ListHrisBankaccounts2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListHrisBankaccounts2Response](../../models/operations/ListHrisBankaccounts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBankaccount2

Update a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBankaccount2" method="patch" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.HrisBankaccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBankaccount2Request req = PatchHrisBankaccount2Request.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBankaccount2Response res = sdk.bankaccount().patchHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchHrisBankaccount2Request](../../models/operations/PatchHrisBankaccount2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchHrisBankaccount2Response](../../models/operations/PatchHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBankaccount2

Remove a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBankaccount2" method="delete" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBankaccount2Request req = RemoveHrisBankaccount2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBankaccount2Response res = sdk.bankaccount().removeHrisBankaccount2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveHrisBankaccount2Request](../../models/operations/RemoveHrisBankaccount2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveHrisBankaccount2Response](../../models/operations/RemoveHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBankaccount2

Update a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBankaccount2" method="put" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.HrisBankaccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBankaccount2Request req = UpdateHrisBankaccount2Request.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBankaccount2Response res = sdk.bankaccount().updateHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateHrisBankaccount2Request](../../models/operations/UpdateHrisBankaccount2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateHrisBankaccount2Response](../../models/operations/UpdateHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |