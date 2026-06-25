# Location

## Overview

### Available Operations

* [createCommerceLocation2](#createcommercelocation2) - Create a location
* [createHrisLocation2](#createhrislocation2) - Create a location
* [getClubsLocation2](#getclubslocation2) - Retrieve a location
* [getCommerceLocation2](#getcommercelocation2) - Retrieve a location
* [getHrisLocation2](#gethrislocation2) - Retrieve a location
* [listClubsLocations2](#listclubslocations2) - List all locations
* [listCommerceLocations2](#listcommercelocations2) - List all locations
* [listHrisLocations2](#listhrislocations2) - List all locations
* [patchCommerceLocation2](#patchcommercelocation2) - Update a location
* [patchHrisLocation2](#patchhrislocation2) - Update a location
* [removeCommerceLocation2](#removecommercelocation2) - Remove a location
* [removeHrisLocation2](#removehrislocation2) - Remove a location
* [updateCommerceLocation2](#updatecommercelocation2) - Update a location
* [updateHrisLocation2](#updatehrislocation2) - Update a location

## createCommerceLocation2

Create a location

### Example Usage

<!-- UsageSnippet language="java" operationID="createCommerceLocation2" method="post" path="/commerce/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.CreateCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCommerceLocation2Request req = CreateCommerceLocation2Request.builder()
                .commerceLocation(CommerceLocation.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCommerceLocation2Response res = sdk.location().createCommerceLocation2()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateCommerceLocation2Request](../../models/operations/CreateCommerceLocation2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateCommerceLocation2Response](../../models/operations/CreateCommerceLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisLocation2

Create a location

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisLocation2" method="post" path="/hris/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.HrisLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisLocation2Request req = CreateHrisLocation2Request.builder()
                .hrisLocation(HrisLocation.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisLocation2Response res = sdk.location().createHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateHrisLocation2Request](../../models/operations/CreateHrisLocation2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisLocation2Response](../../models/operations/CreateHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsLocation2

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsLocation2" method="get" path="/clubs/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsLocation2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsLocation2Request req = GetClubsLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsLocation2Response res = sdk.location().getClubsLocation2()
                .request(req)
                .call();

        if (res.clubsLocation().isPresent()) {
            System.out.println(res.clubsLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetClubsLocation2Request](../../models/operations/GetClubsLocation2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetClubsLocation2Response](../../models/operations/GetClubsLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommerceLocation2

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommerceLocation2" method="get" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.GetCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCommerceLocation2Request req = GetCommerceLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCommerceLocation2Response res = sdk.location().getCommerceLocation2()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetCommerceLocation2Request](../../models/operations/GetCommerceLocation2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetCommerceLocation2Response](../../models/operations/GetCommerceLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisLocation2

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisLocation2" method="get" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisLocation2Request req = GetHrisLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisLocation2Response res = sdk.location().getHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisLocation2Request](../../models/operations/GetHrisLocation2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisLocation2Response](../../models/operations/GetHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsLocations2

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsLocations2" method="get" path="/clubs/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsLocations2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsLocations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsLocations2Request req = ListClubsLocations2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsLocations2Response res = sdk.location().listClubsLocations2()
                .request(req)
                .call();

        if (res.clubsLocations().isPresent()) {
            System.out.println(res.clubsLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListClubsLocations2Request](../../models/operations/ListClubsLocations2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListClubsLocations2Response](../../models/operations/ListClubsLocations2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCommerceLocations2

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCommerceLocations2" method="get" path="/commerce/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCommerceLocations2Request;
import to.unified.unified_java_sdk.models.operations.ListCommerceLocations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCommerceLocations2Request req = ListCommerceLocations2Request.builder()
                .connectionId("<id>")
                .build();

        ListCommerceLocations2Response res = sdk.location().listCommerceLocations2()
                .request(req)
                .call();

        if (res.commerceLocations().isPresent()) {
            System.out.println(res.commerceLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListCommerceLocations2Request](../../models/operations/ListCommerceLocations2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListCommerceLocations2Response](../../models/operations/ListCommerceLocations2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisLocations2

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisLocations2" method="get" path="/hris/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisLocations2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisLocations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisLocations2Request req = ListHrisLocations2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisLocations2Response res = sdk.location().listHrisLocations2()
                .request(req)
                .call();

        if (res.hrisLocations().isPresent()) {
            System.out.println(res.hrisLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisLocations2Request](../../models/operations/ListHrisLocations2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisLocations2Response](../../models/operations/ListHrisLocations2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCommerceLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCommerceLocation2" method="patch" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.PatchCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCommerceLocation2Request req = PatchCommerceLocation2Request.builder()
                .commerceLocation(CommerceLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCommerceLocation2Response res = sdk.location().patchCommerceLocation2()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchCommerceLocation2Request](../../models/operations/PatchCommerceLocation2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchCommerceLocation2Response](../../models/operations/PatchCommerceLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisLocation2" method="patch" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.HrisLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisLocation2Request req = PatchHrisLocation2Request.builder()
                .hrisLocation(HrisLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisLocation2Response res = sdk.location().patchHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisLocation2Request](../../models/operations/PatchHrisLocation2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisLocation2Response](../../models/operations/PatchHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCommerceLocation2

Remove a location

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCommerceLocation2" method="delete" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCommerceLocation2Request req = RemoveCommerceLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCommerceLocation2Response res = sdk.location().removeCommerceLocation2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveCommerceLocation2Request](../../models/operations/RemoveCommerceLocation2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveCommerceLocation2Response](../../models/operations/RemoveCommerceLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisLocation2

Remove a location

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisLocation2" method="delete" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisLocation2Request req = RemoveHrisLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisLocation2Response res = sdk.location().removeHrisLocation2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisLocation2Request](../../models/operations/RemoveHrisLocation2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisLocation2Response](../../models/operations/RemoveHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCommerceLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCommerceLocation2" method="put" path="/commerce/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceLocation2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCommerceLocation2Response;
import to.unified.unified_java_sdk.models.shared.CommerceLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCommerceLocation2Request req = UpdateCommerceLocation2Request.builder()
                .commerceLocation(CommerceLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCommerceLocation2Response res = sdk.location().updateCommerceLocation2()
                .request(req)
                .call();

        if (res.commerceLocation().isPresent()) {
            System.out.println(res.commerceLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateCommerceLocation2Request](../../models/operations/UpdateCommerceLocation2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateCommerceLocation2Response](../../models/operations/UpdateCommerceLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisLocation2" method="put" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.HrisLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisLocation2Request req = UpdateHrisLocation2Request.builder()
                .hrisLocation(HrisLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisLocation2Response res = sdk.location().updateHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHrisLocation2Request](../../models/operations/UpdateHrisLocation2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisLocation2Response](../../models/operations/UpdateHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |