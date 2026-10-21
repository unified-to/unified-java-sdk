# Activity

## Overview

### Available Operations

* [createAtsActivity](#createatsactivity) - Create an activity
* [createLmsActivity](#createlmsactivity) - Create an activity
* [getAtsActivity](#getatsactivity) - Retrieve an activity
* [getClubsActivity](#getclubsactivity) - Retrieve an activity
* [getLmsActivity](#getlmsactivity) - Retrieve an activity
* [listAtsActivities](#listatsactivities) - List all activities
* [listClubsActivities](#listclubsactivities) - List all activities
* [listLmsActivities](#listlmsactivities) - List all activities
* [patchAtsActivity](#patchatsactivity) - Update an activity
* [patchLmsActivity](#patchlmsactivity) - Update an activity
* [removeAtsActivity](#removeatsactivity) - Remove an activity
* [removeLmsActivity](#removelmsactivity) - Remove an activity
* [updateAtsActivity](#updateatsactivity) - Update an activity
* [updateLmsActivity](#updatelmsactivity) - Update an activity

## createAtsActivity

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsActivity" method="post" path="/ats/{connection_id}/activity" example="ats_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsActivityRequest req = CreateAtsActivityRequest.builder()
                .atsActivity(AtsActivity.builder()
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Sapiente.")
                    .id("3c14a299-3547-4e83-b99a-b57dc66403c4")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("f3e491bf-7b0b-4cbe-957e-7eef210c4b8b")
                            .namespace("activity")
                            .slug("cimentarius")
                            .value(AtsMetadataValue.of("Reprehenderit verto."))
                            .build()))
                    .subType("TASK")
                    .title("Venio blandior aureus.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-04-04T06:40:00.298Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsActivityResponse res = sdk.activity().createAtsActivity()
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
| `request`                                                                       | [CreateAtsActivityRequest](../../models/operations/CreateAtsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAtsActivityResponse](../../models/operations/CreateAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLmsActivity

Create an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="createLmsActivity" method="post" path="/lms/{connection_id}/activity" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLmsActivityRequest req = CreateLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("summopere")
                    .completedAt(OffsetDateTime.parse("2023-12-05T23:41:44.018Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("3ba61ca7-c020-4916-bb67-5f5d3536307d")
                    .isCompleted(true)
                    .metadata(List.of())
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2021-04-25T04:23:43.300Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-30T23:41:47.325Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLmsActivityResponse res = sdk.activity().createLmsActivity()
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
| `request`                                                                       | [CreateLmsActivityRequest](../../models/operations/CreateLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLmsActivityResponse](../../models/operations/CreateLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsActivity

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsActivity" method="get" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsActivityRequest req = GetAtsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsActivityResponse res = sdk.activity().getAtsActivity()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAtsActivityRequest](../../models/operations/GetAtsActivityRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAtsActivityResponse](../../models/operations/GetAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        GetClubsActivityResponse res = sdk.activity().getClubsActivity()
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

## getLmsActivity

Retrieve an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="getLmsActivity" method="get" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLmsActivityRequest req = GetLmsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLmsActivityResponse res = sdk.activity().getLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLmsActivityRequest](../../models/operations/GetLmsActivityRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLmsActivityResponse](../../models/operations/GetLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsActivities

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsActivities" method="get" path="/ats/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsActivitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsActivitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsActivitiesRequest req = ListAtsActivitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsActivitiesResponse res = sdk.activity().listAtsActivities()
                .request(req)
                .call();

        if (res.atsActivities().isPresent()) {
            System.out.println(res.atsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAtsActivitiesRequest](../../models/operations/ListAtsActivitiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAtsActivitiesResponse](../../models/operations/ListAtsActivitiesResponse.md)**

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

        ListClubsActivitiesResponse res = sdk.activity().listClubsActivities()
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

## listLmsActivities

List all activities

### Example Usage

<!-- UsageSnippet language="java" operationID="listLmsActivities" method="get" path="/lms/{connection_id}/activity" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLmsActivitiesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsActivitiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLmsActivitiesRequest req = ListLmsActivitiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListLmsActivitiesResponse res = sdk.activity().listLmsActivities()
                .request(req)
                .call();

        if (res.lmsActivities().isPresent()) {
            System.out.println(res.lmsActivities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListLmsActivitiesRequest](../../models/operations/ListLmsActivitiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListLmsActivitiesResponse](../../models/operations/ListLmsActivitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsActivity" method="patch" path="/ats/{connection_id}/activity/{id}" example="ats_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsActivityRequest req = PatchAtsActivityRequest.builder()
                .atsActivity(AtsActivity.builder()
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Sapiente.")
                    .id("e8a70891-5a59-4cf0-8ba1-c6b7bc5e559f")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("7ebcf8cb-68d6-4497-876f-9749dcd46be6")
                            .namespace("activity")
                            .slug("cimentarius")
                            .value(AtsMetadataValue.of("Reprehenderit verto."))
                            .build()))
                    .subType("TASK")
                    .title("Venio blandior aureus.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-04-04T06:40:00.325Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsActivityResponse res = sdk.activity().patchAtsActivity()
                .request(req)
                .call();

        if (res.atsActivity().isPresent()) {
            System.out.println(res.atsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAtsActivityRequest](../../models/operations/PatchAtsActivityRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAtsActivityResponse](../../models/operations/PatchAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLmsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLmsActivity" method="patch" path="/lms/{connection_id}/activity/{id}" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLmsActivityRequest req = PatchLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("summopere")
                    .completedAt(OffsetDateTime.parse("2023-12-05T23:41:44.024Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("ba944cbb-c06e-4d58-a007-5bc0c48a85f9")
                    .isCompleted(true)
                    .metadata(List.of())
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2021-04-25T04:23:43.301Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-30T23:41:47.328Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLmsActivityResponse res = sdk.activity().patchLmsActivity()
                .request(req)
                .call();

        if (res.lmsActivity().isPresent()) {
            System.out.println(res.lmsActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLmsActivityRequest](../../models/operations/PatchLmsActivityRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLmsActivityResponse](../../models/operations/PatchLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsActivity

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsActivity" method="delete" path="/ats/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsActivityRequest req = RemoveAtsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsActivityResponse res = sdk.activity().removeAtsActivity()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAtsActivityRequest](../../models/operations/RemoveAtsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAtsActivityResponse](../../models/operations/RemoveAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLmsActivity

Remove an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLmsActivity" method="delete" path="/lms/{connection_id}/activity/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLmsActivityRequest req = RemoveLmsActivityRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLmsActivityResponse res = sdk.activity().removeLmsActivity()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLmsActivityRequest](../../models/operations/RemoveLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLmsActivityResponse](../../models/operations/RemoveLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsActivity" method="put" path="/ats/{connection_id}/activity/{id}" example="ats_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivityRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsActivityResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsActivityRequest req = UpdateAtsActivityRequest.builder()
                .atsActivity(AtsActivity.builder()
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Sapiente.")
                    .id("e8a70891-5a59-4cf0-8ba1-c6b7bc5e559f")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("7ebcf8cb-68d6-4497-876f-9749dcd46be6")
                            .namespace("activity")
                            .slug("cimentarius")
                            .value(AtsMetadataValue.of("Reprehenderit verto."))
                            .build()))
                    .subType("TASK")
                    .title("Venio blandior aureus.")
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-04-04T06:40:00.325Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsActivityResponse res = sdk.activity().updateAtsActivity()
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
| `request`                                                                       | [UpdateAtsActivityRequest](../../models/operations/UpdateAtsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAtsActivityResponse](../../models/operations/UpdateAtsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLmsActivity

Update an activity

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLmsActivity" method="put" path="/lms/{connection_id}/activity/{id}" example="lms_activity" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivityRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsActivityResponse;
import to.unified.unified_java_sdk.models.shared.LmsActivity;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLmsActivityRequest req = UpdateLmsActivityRequest.builder()
                .lmsActivity(LmsActivity.builder()
                    .assignedGrade("summopere")
                    .completedAt(OffsetDateTime.parse("2023-12-05T23:41:44.024Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("ba944cbb-c06e-4d58-a007-5bc0c48a85f9")
                    .isCompleted(true)
                    .metadata(List.of())
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2021-04-25T04:23:43.301Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-30T23:41:47.328Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLmsActivityResponse res = sdk.activity().updateLmsActivity()
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
| `request`                                                                       | [UpdateLmsActivityRequest](../../models/operations/UpdateLmsActivityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLmsActivityResponse](../../models/operations/UpdateLmsActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |