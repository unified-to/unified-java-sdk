# Clubs

## Overview

### Available Operations

* [getClubsActivity](#getclubsactivity) - Retrieve an activity
* [getClubsEvent](#getclubsevent) - Retrieve an event
* [getClubsGroup](#getclubsgroup) - Retrieve a group
* [getClubsLocation](#getclubslocation) - Retrieve a location
* [getClubsMember](#getclubsmember) - Retrieve a member
* [listClubsActivities](#listclubsactivities) - List all activities
* [listClubsEvents](#listclubsevents) - List all events
* [listClubsGroups](#listclubsgroups) - List all groups
* [listClubsLocations](#listclubslocations) - List all locations
* [listClubsMembers](#listclubsmembers) - List all members

## getClubsActivity

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsActivity" method="get" path="/clubs/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsActivityRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsActivityRequest req = GetClubsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsActivityResponse res = sdk.clubs().getClubsActivity()
                .request(req)
                .call();

        if (res.clubsActivity().isPresent()) {
            System.out.println(res.clubsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetClubsActivityRequest](../../models/operations/GetClubsActivityRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetClubsActivityResponse](../../models/operations/GetClubsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsEvent" method="get" path="/clubs/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsEventRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsEventRequest req = GetClubsEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsEventResponse res = sdk.clubs().getClubsEvent()
                .request(req)
                .call();

        if (res.clubsEvent().isPresent()) {
            System.out.println(res.clubsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetClubsEventRequest](../../models/operations/GetClubsEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetClubsEventResponse](../../models/operations/GetClubsEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsGroup

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsGroup" method="get" path="/clubs/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsGroupRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsGroupRequest req = GetClubsGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsGroupResponse res = sdk.clubs().getClubsGroup()
                .request(req)
                .call();

        if (res.clubsGroup().isPresent()) {
            System.out.println(res.clubsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetClubsGroupRequest](../../models/operations/GetClubsGroupRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetClubsGroupResponse](../../models/operations/GetClubsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsLocation

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsLocation" method="get" path="/clubs/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsLocationRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsLocationRequest req = GetClubsLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsLocationResponse res = sdk.clubs().getClubsLocation()
                .request(req)
                .call();

        if (res.clubsLocation().isPresent()) {
            System.out.println(res.clubsLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetClubsLocationRequest](../../models/operations/GetClubsLocationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetClubsLocationResponse](../../models/operations/GetClubsLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsMember

Retrieve a member

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsMember" method="get" path="/clubs/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsMemberRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsMemberResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsMemberRequest req = GetClubsMemberRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsMemberResponse res = sdk.clubs().getClubsMember()
                .request(req)
                .call();

        if (res.clubsMember().isPresent()) {
            System.out.println(res.clubsMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetClubsMemberRequest](../../models/operations/GetClubsMemberRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetClubsMemberResponse](../../models/operations/GetClubsMemberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsActivities

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsActivities" method="get" path="/clubs/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsActivitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsActivitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsActivitiesRequest req = ListClubsActivitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsActivitiesResponse res = sdk.clubs().listClubsActivities()
                .request(req)
                .call();

        if (res.clubsActivities().isPresent()) {
            System.out.println(res.clubsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListClubsActivitiesRequest](../../models/operations/ListClubsActivitiesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListClubsActivitiesResponse](../../models/operations/ListClubsActivitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsEvents" method="get" path="/clubs/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsEventsRequest req = ListClubsEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsEventsResponse res = sdk.clubs().listClubsEvents()
                .request(req)
                .call();

        if (res.clubsEvents().isPresent()) {
            System.out.println(res.clubsEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListClubsEventsRequest](../../models/operations/ListClubsEventsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListClubsEventsResponse](../../models/operations/ListClubsEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsGroups

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsGroups" method="get" path="/clubs/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsGroupsRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsGroupsRequest req = ListClubsGroupsRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsGroupsResponse res = sdk.clubs().listClubsGroups()
                .request(req)
                .call();

        if (res.clubsGroups().isPresent()) {
            System.out.println(res.clubsGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListClubsGroupsRequest](../../models/operations/ListClubsGroupsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListClubsGroupsResponse](../../models/operations/ListClubsGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsLocations

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsLocations" method="get" path="/clubs/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsLocationsRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsLocationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsLocationsRequest req = ListClubsLocationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsLocationsResponse res = sdk.clubs().listClubsLocations()
                .request(req)
                .call();

        if (res.clubsLocations().isPresent()) {
            System.out.println(res.clubsLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListClubsLocationsRequest](../../models/operations/ListClubsLocationsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListClubsLocationsResponse](../../models/operations/ListClubsLocationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsMembers

List all members

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsMembers" method="get" path="/clubs/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsMembersRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsMembersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsMembersRequest req = ListClubsMembersRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsMembersResponse res = sdk.clubs().listClubsMembers()
                .request(req)
                .call();

        if (res.clubsMembers().isPresent()) {
            System.out.println(res.clubsMembers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListClubsMembersRequest](../../models/operations/ListClubsMembersRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListClubsMembersResponse](../../models/operations/ListClubsMembersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |