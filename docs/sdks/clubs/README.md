# Clubs

## Overview

### Available Operations

* [getClubsActivity2](#getclubsactivity2) - Retrieve an activity
* [getClubsEvent2](#getclubsevent2) - Retrieve an event
* [getClubsGroup2](#getclubsgroup2) - Retrieve a group
* [getClubsLocation2](#getclubslocation2) - Retrieve a location
* [getClubsMember2](#getclubsmember2) - Retrieve a member
* [listClubsActivities2](#listclubsactivities2) - List all activities
* [listClubsEvents2](#listclubsevents2) - List all events
* [listClubsGroups2](#listclubsgroups2) - List all groups
* [listClubsLocations2](#listclubslocations2) - List all locations
* [listClubsMembers2](#listclubsmembers2) - List all members

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

        GetClubsActivity2Response res = sdk.clubs().getClubsActivity2()
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

## getClubsEvent2

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsEvent2" method="get" path="/clubs/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsEvent2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsEvent2Request req = GetClubsEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsEvent2Response res = sdk.clubs().getClubsEvent2()
                .request(req)
                .call();

        if (res.clubsEvent().isPresent()) {
            System.out.println(res.clubsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetClubsEvent2Request](../../models/operations/GetClubsEvent2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetClubsEvent2Response](../../models/operations/GetClubsEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsGroup2

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsGroup2" method="get" path="/clubs/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsGroup2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsGroup2Request req = GetClubsGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsGroup2Response res = sdk.clubs().getClubsGroup2()
                .request(req)
                .call();

        if (res.clubsGroup().isPresent()) {
            System.out.println(res.clubsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetClubsGroup2Request](../../models/operations/GetClubsGroup2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetClubsGroup2Response](../../models/operations/GetClubsGroup2Response.md)**

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

        GetClubsLocation2Response res = sdk.clubs().getClubsLocation2()
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

## getClubsMember2

Retrieve a member

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsMember2" method="get" path="/clubs/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsMember2Request;
import to.unified.unified_java_sdk.models.operations.GetClubsMember2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsMember2Request req = GetClubsMember2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsMember2Response res = sdk.clubs().getClubsMember2()
                .request(req)
                .call();

        if (res.clubsMember().isPresent()) {
            System.out.println(res.clubsMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetClubsMember2Request](../../models/operations/GetClubsMember2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetClubsMember2Response](../../models/operations/GetClubsMember2Response.md)**

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

        ListClubsActivities2Response res = sdk.clubs().listClubsActivities2()
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

## listClubsEvents2

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsEvents2" method="get" path="/clubs/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsEvents2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsEvents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsEvents2Request req = ListClubsEvents2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsEvents2Response res = sdk.clubs().listClubsEvents2()
                .request(req)
                .call();

        if (res.clubsEvents().isPresent()) {
            System.out.println(res.clubsEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListClubsEvents2Request](../../models/operations/ListClubsEvents2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListClubsEvents2Response](../../models/operations/ListClubsEvents2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsGroups2

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsGroups2" method="get" path="/clubs/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsGroups2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsGroups2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsGroups2Request req = ListClubsGroups2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsGroups2Response res = sdk.clubs().listClubsGroups2()
                .request(req)
                .call();

        if (res.clubsGroups().isPresent()) {
            System.out.println(res.clubsGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListClubsGroups2Request](../../models/operations/ListClubsGroups2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListClubsGroups2Response](../../models/operations/ListClubsGroups2Response.md)**

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

        ListClubsLocations2Response res = sdk.clubs().listClubsLocations2()
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

## listClubsMembers2

List all members

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsMembers2" method="get" path="/clubs/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsMembers2Request;
import to.unified.unified_java_sdk.models.operations.ListClubsMembers2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsMembers2Request req = ListClubsMembers2Request.builder()
                .connectionId("<id>")
                .build();

        ListClubsMembers2Response res = sdk.clubs().listClubsMembers2()
                .request(req)
                .call();

        if (res.clubsMembers().isPresent()) {
            System.out.println(res.clubsMembers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListClubsMembers2Request](../../models/operations/ListClubsMembers2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListClubsMembers2Response](../../models/operations/ListClubsMembers2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |