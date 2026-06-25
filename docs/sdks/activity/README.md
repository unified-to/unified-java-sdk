# Activity

## Overview

### Available Operations

* [createAtsActivity2](#createatsactivity2) - Create an activity
* [createLmsActivity2](#createlmsactivity2) - Create an activity
* [getAtsActivity2](#getatsactivity2) - Retrieve an activity
* [getClubsActivity2](#getclubsactivity2) - Retrieve an activity
* [getLmsActivity2](#getlmsactivity2) - Retrieve an activity
* [listAtsActivities2](#listatsactivities2) - List all activities
* [listClubsActivities2](#listclubsactivities2) - List all activities
* [listLmsActivities2](#listlmsactivities2) - List all activities
* [patchAtsActivity2](#patchatsactivity2) - Update an activity
* [patchLmsActivity2](#patchlmsactivity2) - Update an activity
* [removeAtsActivity2](#removeatsactivity2) - Remove an activity
* [removeLmsActivity2](#removelmsactivity2) - Remove an activity
* [updateAtsActivity2](#updateatsactivity2) - Update an activity
* [updateLmsActivity2](#updatelmsactivity2) - Update an activity

## createAtsActivity2

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsActivity2" method="post" path="/ats/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.AtsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsActivity2Request req = CreateAtsActivity2Request.builder()
                .atsActivity(AtsActivity.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsActivity2Response res = sdk.activity().createAtsActivity2()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAtsActivity2Request](../../models/operations/CreateAtsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAtsActivity2Response](../../models/operations/CreateAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsActivity2

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsActivity2" method="post" path="/lms/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsActivity2Request req = CreateLmsActivity2Request.builder()
                .lmsActivity(LmsActivity.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsActivity2Response res = sdk.activity().createLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateLmsActivity2Request](../../models/operations/CreateLmsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateLmsActivity2Response](../../models/operations/CreateLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsActivity2

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsActivity2" method="get" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.GetAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsActivity2Request req = GetAtsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsActivity2Response res = sdk.activity().getAtsActivity2()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAtsActivity2Request](../../models/operations/GetAtsActivity2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAtsActivity2Response](../../models/operations/GetAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsActivity2

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsActivity2" method="get" path="/clubs/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsActivity2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsActivity2Request req = GetClubsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsActivity2Response res = sdk.activity().getClubsActivity2()
                .request(req)
                .call();

        if (res.clubsActivity().isPresent()) {
            System.out.println(res.clubsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetClubsActivity2Request](../../models/operations/GetClubsActivity2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetClubsActivity2Response](../../models/operations/GetClubsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLmsActivity2

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsActivity2" method="get" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.GetLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsActivity2Request req = GetLmsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsActivity2Response res = sdk.activity().getLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetLmsActivity2Request](../../models/operations/GetLmsActivity2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetLmsActivity2Response](../../models/operations/GetLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsActivities2

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsActivities2" method="get" path="/ats/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsActivities2Request;
import to.unified.unified_java_sdk.models.operations.ListAtsActivities2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsActivities2Request req = ListAtsActivities2Request.builder()
                .connectionId("<id>")
                .build();

        ListAtsActivities2Response res = sdk.activity().listAtsActivities2()
                .request(req)
                .call();

        if (res.atsActivities().isPresent()) {
            System.out.println(res.atsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAtsActivities2Request](../../models/operations/ListAtsActivities2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAtsActivities2Response](../../models/operations/ListAtsActivities2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsActivities2

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsActivities2" method="get" path="/clubs/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsActivities2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsActivities2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsActivities2Request req = ListClubsActivities2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsActivities2Response res = sdk.activity().listClubsActivities2()
                .request(req)
                .call();

        if (res.clubsActivities().isPresent()) {
            System.out.println(res.clubsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListClubsActivities2Request](../../models/operations/ListClubsActivities2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListClubsActivities2Response](../../models/operations/ListClubsActivities2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLmsActivities2

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsActivities2" method="get" path="/lms/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsActivities2Request;
import to.unified.unified_java_sdk.models.operations.ListLmsActivities2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsActivities2Request req = ListLmsActivities2Request.builder()
                .connectionId("<id>")
                .build();

        ListLmsActivities2Response res = sdk.activity().listLmsActivities2()
                .request(req)
                .call();

        if (res.lmsActivities().isPresent()) {
            System.out.println(res.lmsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListLmsActivities2Request](../../models/operations/ListLmsActivities2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListLmsActivities2Response](../../models/operations/ListLmsActivities2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsActivity2" method="patch" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.AtsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsActivity2Request req = PatchAtsActivity2Request.builder()
                .atsActivity(AtsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsActivity2Response res = sdk.activity().patchAtsActivity2()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchAtsActivity2Request](../../models/operations/PatchAtsActivity2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAtsActivity2Response](../../models/operations/PatchAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsActivity2" method="patch" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsActivity2Request req = PatchLmsActivity2Request.builder()
                .lmsActivity(LmsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsActivity2Response res = sdk.activity().patchLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchLmsActivity2Request](../../models/operations/PatchLmsActivity2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchLmsActivity2Response](../../models/operations/PatchLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsActivity2

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsActivity2" method="delete" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsActivity2Request req = RemoveAtsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsActivity2Response res = sdk.activity().removeAtsActivity2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAtsActivity2Request](../../models/operations/RemoveAtsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAtsActivity2Response](../../models/operations/RemoveAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsActivity2

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsActivity2" method="delete" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsActivity2Request req = RemoveLmsActivity2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsActivity2Response res = sdk.activity().removeLmsActivity2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveLmsActivity2Request](../../models/operations/RemoveLmsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveLmsActivity2Response](../../models/operations/RemoveLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsActivity2" method="put" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivity2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivity2Response;
import to.unified.unified_java_sdk.models.shared.AtsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsActivity2Request req = UpdateAtsActivity2Request.builder()
                .atsActivity(AtsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsActivity2Response res = sdk.activity().updateAtsActivity2()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAtsActivity2Request](../../models/operations/UpdateAtsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAtsActivity2Response](../../models/operations/UpdateAtsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsActivity2

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsActivity2" method="put" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivity2Request;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivity2Response;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsActivity2Request req = UpdateLmsActivity2Request.builder()
                .lmsActivity(LmsActivity.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsActivity2Response res = sdk.activity().updateLmsActivity2()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateLmsActivity2Request](../../models/operations/UpdateLmsActivity2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateLmsActivity2Response](../../models/operations/UpdateLmsActivity2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |