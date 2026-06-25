# Lead

## Overview

### Available Operations

* [createCrmLead2](#createcrmlead2) - Create a lead
* [getCrmLead2](#getcrmlead2) - Retrieve a lead
* [listCrmLeads2](#listcrmleads2) - List all leads
* [patchCrmLead2](#patchcrmlead2) - Update a lead
* [removeCrmLead2](#removecrmlead2) - Remove a lead
* [updateCrmLead2](#updatecrmlead2) - Update a lead

## createCrmLead2

Create a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmLead2" method="post" path="/crm/{connection_id}/lead" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.CrmLead;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmLead2Request req = CreateCrmLead2Request.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmLead2Response res = sdk.lead().createCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCrmLead2Request](../../models/operations/CreateCrmLead2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCrmLead2Response](../../models/operations/CreateCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmLead2

Retrieve a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmLead2" method="get" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmLead2Request req = GetCrmLead2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmLead2Response res = sdk.lead().getCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCrmLead2Request](../../models/operations/GetCrmLead2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCrmLead2Response](../../models/operations/GetCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmLeads2

List all leads

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmLeads2" method="get" path="/crm/{connection_id}/lead" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmLeads2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmLeads2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmLeads2Request req = ListCrmLeads2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmLeads2Response res = sdk.lead().listCrmLeads2()
                .request(req)
                .call();

        if (res.crmLeads().isPresent()) {
            System.out.println(res.crmLeads().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCrmLeads2Request](../../models/operations/ListCrmLeads2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCrmLeads2Response](../../models/operations/ListCrmLeads2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmLead2

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmLead2" method="patch" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.CrmLead;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmLead2Request req = PatchCrmLead2Request.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmLead2Response res = sdk.lead().patchCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCrmLead2Request](../../models/operations/PatchCrmLead2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCrmLead2Response](../../models/operations/PatchCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmLead2

Remove a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmLead2" method="delete" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmLead2Request req = RemoveCrmLead2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmLead2Response res = sdk.lead().removeCrmLead2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCrmLead2Request](../../models/operations/RemoveCrmLead2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCrmLead2Response](../../models/operations/RemoveCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmLead2

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmLead2" method="put" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.CrmLead;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmLead2Request req = UpdateCrmLead2Request.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmLead2Response res = sdk.lead().updateCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCrmLead2Request](../../models/operations/UpdateCrmLead2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCrmLead2Response](../../models/operations/UpdateCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |