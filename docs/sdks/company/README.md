# Company

## Overview

### Available Operations

* [createAtsCompany2](#createatscompany2) - Create a company
* [createCrmCompany2](#createcrmcompany2) - Create a company
* [createHrisCompany2](#createhriscompany2) - Create a company
* [getAtsCompany2](#getatscompany2) - Retrieve a company
* [getCrmCompany2](#getcrmcompany2) - Retrieve a company
* [getHrisCompany2](#gethriscompany2) - Retrieve a company
* [listAtsCompanies2](#listatscompanies2) - List all companies
* [listCrmCompanies2](#listcrmcompanies2) - List all companies
* [listEnrichCompanies2](#listenrichcompanies2) - Retrieve enrichment information for a company
* [listHrisCompanies2](#listhriscompanies2) - List all companies
* [patchAtsCompany2](#patchatscompany2) - Update a company
* [patchCrmCompany2](#patchcrmcompany2) - Update a company
* [patchHrisCompany2](#patchhriscompany2) - Update a company
* [removeAtsCompany2](#removeatscompany2) - Remove a company
* [removeCrmCompany2](#removecrmcompany2) - Remove a company
* [removeHrisCompany2](#removehriscompany2) - Remove a company
* [updateAtsCompany2](#updateatscompany2) - Update a company
* [updateCrmCompany2](#updatecrmcompany2) - Update a company
* [updateHrisCompany2](#updatehriscompany2) - Update a company

## createAtsCompany2

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsCompany2" method="post" path="/ats/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsCompany2Request req = CreateAtsCompany2Request.builder()
                .atsCompany(AtsCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsCompany2Response res = sdk.company().createAtsCompany2()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAtsCompany2Request](../../models/operations/CreateAtsCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAtsCompany2Response](../../models/operations/CreateAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmCompany2

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmCompany2" method="post" path="/crm/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmCompany2Request req = CreateCrmCompany2Request.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmCompany2Response res = sdk.company().createCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateCrmCompany2Request](../../models/operations/CreateCrmCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateCrmCompany2Response](../../models/operations/CreateCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisCompany2

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisCompany2" method="post" path="/hris/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisCompany2Request req = CreateHrisCompany2Request.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisCompany2Response res = sdk.company().createHrisCompany2()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisCompany2Request](../../models/operations/CreateHrisCompany2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisCompany2Response](../../models/operations/CreateHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsCompany2

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsCompany2" method="get" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsCompany2Request req = GetAtsCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsCompany2Response res = sdk.company().getAtsCompany2()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAtsCompany2Request](../../models/operations/GetAtsCompany2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAtsCompany2Response](../../models/operations/GetAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmCompany2

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmCompany2" method="get" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmCompany2Request req = GetCrmCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmCompany2Response res = sdk.company().getCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCrmCompany2Request](../../models/operations/GetCrmCompany2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCrmCompany2Response](../../models/operations/GetCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisCompany2

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisCompany2" method="get" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisCompany2Request req = GetHrisCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisCompany2Response res = sdk.company().getHrisCompany2()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisCompany2Request](../../models/operations/GetHrisCompany2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisCompany2Response](../../models/operations/GetHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsCompanies2

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsCompanies2" method="get" path="/ats/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsCompanies2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsCompanies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsCompanies2Request req = ListAtsCompanies2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsCompanies2Response res = sdk.company().listAtsCompanies2()
                .request(req)
                .call();

        if (res.atsCompanies().isPresent()) {
            System.out.println(res.atsCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsCompanies2Request](../../models/operations/ListAtsCompanies2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsCompanies2Response](../../models/operations/ListAtsCompanies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmCompanies2

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmCompanies2" method="get" path="/crm/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmCompanies2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmCompanies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmCompanies2Request req = ListCrmCompanies2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmCompanies2Response res = sdk.company().listCrmCompanies2()
                .request(req)
                .call();

        if (res.crmCompanies().isPresent()) {
            System.out.println(res.crmCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmCompanies2Request](../../models/operations/ListCrmCompanies2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmCompanies2Response](../../models/operations/ListCrmCompanies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEnrichCompanies2

Retrieve enrichment information for a company

### Example Usage

<!-- UsageSnippet language="java" operationID="listEnrichCompanies2" method="get" path="/enrich/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListEnrichCompanies2Request;
import to.unified.unified_java_sdk.models.operations.ListEnrichCompanies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListEnrichCompanies2Request req = ListEnrichCompanies2Request.builder()
                .connectionId("<id>")
                .build();

        ListEnrichCompanies2Response res = sdk.company().listEnrichCompanies2()
                .request(req)
                .call();

        if (res.enrichCompany().isPresent()) {
            System.out.println(res.enrichCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListEnrichCompanies2Request](../../models/operations/ListEnrichCompanies2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListEnrichCompanies2Response](../../models/operations/ListEnrichCompanies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisCompanies2

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisCompanies2" method="get" path="/hris/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisCompanies2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisCompanies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisCompanies2Request req = ListHrisCompanies2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisCompanies2Response res = sdk.company().listHrisCompanies2()
                .request(req)
                .call();

        if (res.hrisCompanies().isPresent()) {
            System.out.println(res.hrisCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisCompanies2Request](../../models/operations/ListHrisCompanies2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisCompanies2Response](../../models/operations/ListHrisCompanies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsCompany2" method="patch" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsCompany2Request req = PatchAtsCompany2Request.builder()
                .atsCompany(AtsCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsCompany2Response res = sdk.company().patchAtsCompany2()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAtsCompany2Request](../../models/operations/PatchAtsCompany2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAtsCompany2Response](../../models/operations/PatchAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmCompany2" method="patch" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmCompany2Request req = PatchCrmCompany2Request.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmCompany2Response res = sdk.company().patchCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchCrmCompany2Request](../../models/operations/PatchCrmCompany2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchCrmCompany2Response](../../models/operations/PatchCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisCompany2" method="patch" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisCompany2Request req = PatchHrisCompany2Request.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisCompany2Response res = sdk.company().patchHrisCompany2()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisCompany2Request](../../models/operations/PatchHrisCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisCompany2Response](../../models/operations/PatchHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsCompany2

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsCompany2" method="delete" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsCompany2Request req = RemoveAtsCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsCompany2Response res = sdk.company().removeAtsCompany2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAtsCompany2Request](../../models/operations/RemoveAtsCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAtsCompany2Response](../../models/operations/RemoveAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmCompany2

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmCompany2" method="delete" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmCompany2Request req = RemoveCrmCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmCompany2Response res = sdk.company().removeCrmCompany2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveCrmCompany2Request](../../models/operations/RemoveCrmCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveCrmCompany2Response](../../models/operations/RemoveCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisCompany2

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisCompany2" method="delete" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisCompany2Request req = RemoveHrisCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisCompany2Response res = sdk.company().removeHrisCompany2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisCompany2Request](../../models/operations/RemoveHrisCompany2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisCompany2Response](../../models/operations/RemoveHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsCompany2" method="put" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompany2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompany2Response;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsCompany2Request req = UpdateAtsCompany2Request.builder()
                .atsCompany(AtsCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsCompany2Response res = sdk.company().updateAtsCompany2()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAtsCompany2Request](../../models/operations/UpdateAtsCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAtsCompany2Response](../../models/operations/UpdateAtsCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmCompany2" method="put" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmCompany2Request req = UpdateCrmCompany2Request.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmCompany2Response res = sdk.company().updateCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCrmCompany2Request](../../models/operations/UpdateCrmCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCrmCompany2Response](../../models/operations/UpdateCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisCompany2" method="put" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisCompany2Request req = UpdateHrisCompany2Request.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisCompany2Response res = sdk.company().updateHrisCompany2()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisCompany2Request](../../models/operations/UpdateHrisCompany2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisCompany2Response](../../models/operations/UpdateHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |