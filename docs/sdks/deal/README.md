# Deal

## Overview

### Available Operations

* [createCrmDeal2](#createcrmdeal2) - Create a deal
* [getCrmDeal2](#getcrmdeal2) - Retrieve a deal
* [listCrmDeals2](#listcrmdeals2) - List all deals
* [patchCrmDeal2](#patchcrmdeal2) - Update a deal
* [removeCrmDeal2](#removecrmdeal2) - Remove a deal
* [updateCrmDeal2](#updatecrmdeal2) - Update a deal

## createCrmDeal2

Create a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmDeal2" method="post" path="/crm/{connection_id}/deal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.CrmDeal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmDeal2Request req = CreateCrmDeal2Request.builder()
                .crmDeal(CrmDeal.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmDeal2Response res = sdk.deal().createCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCrmDeal2Request](../../models/operations/CreateCrmDeal2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCrmDeal2Response](../../models/operations/CreateCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmDeal2

Retrieve a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmDeal2" method="get" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmDeal2Request req = GetCrmDeal2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmDeal2Response res = sdk.deal().getCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCrmDeal2Request](../../models/operations/GetCrmDeal2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCrmDeal2Response](../../models/operations/GetCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmDeals2

List all deals

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmDeals2" method="get" path="/crm/{connection_id}/deal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmDeals2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmDeals2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmDeals2Request req = ListCrmDeals2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmDeals2Response res = sdk.deal().listCrmDeals2()
                .request(req)
                .call();

        if (res.crmDeals().isPresent()) {
            System.out.println(res.crmDeals().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCrmDeals2Request](../../models/operations/ListCrmDeals2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCrmDeals2Response](../../models/operations/ListCrmDeals2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmDeal2

Update a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmDeal2" method="patch" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.CrmDeal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmDeal2Request req = PatchCrmDeal2Request.builder()
                .crmDeal(CrmDeal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmDeal2Response res = sdk.deal().patchCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCrmDeal2Request](../../models/operations/PatchCrmDeal2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCrmDeal2Response](../../models/operations/PatchCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmDeal2

Remove a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmDeal2" method="delete" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmDeal2Request req = RemoveCrmDeal2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmDeal2Response res = sdk.deal().removeCrmDeal2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCrmDeal2Request](../../models/operations/RemoveCrmDeal2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCrmDeal2Response](../../models/operations/RemoveCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmDeal2

Update a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmDeal2" method="put" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.CrmDeal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmDeal2Request req = UpdateCrmDeal2Request.builder()
                .crmDeal(CrmDeal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmDeal2Response res = sdk.deal().updateCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCrmDeal2Request](../../models/operations/UpdateCrmDeal2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCrmDeal2Response](../../models/operations/UpdateCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |