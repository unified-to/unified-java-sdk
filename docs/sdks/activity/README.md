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
                    .bcc(List.of(
                        AtsEmail.builder()
                            .email("Mabel_Schuppe-Schowalter42@hotmail.com")
                            .name("Rochelle Franey-Bechtelar")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .cc(List.of(
                        AtsEmail.builder()
                            .email("Sasha24@hotmail.com")
                            .name("Dr. Elbert Kuvalis")
                            .type(AtsEmailType.HOME)
                            .build(),
                        AtsEmail.builder()
                            .email("Rosetta_Donnelly@gmail.com")
                            .name("Ramon Daniel")
                            .type(AtsEmailType.OTHER)
                            .build(),
                        AtsEmail.builder()
                            .email("Kathryne_Jast@yahoo.com")
                            .name("Christian Jacobson")
                            .type(AtsEmailType.OTHER)
                            .build(),
                        AtsEmail.builder()
                            .email("Eldred95@yahoo.com")
                            .name("Edna Bogan")
                            .type(AtsEmailType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Amplus.")
                    .from(PropertyAtsActivityFrom.builder()
                        .email("Norwood.Wiza47@yahoo.com")
                        .name("Toby Grant")
                        .type(PropertyAtsActivityFromType.OTHER)
                        .build())
                    .id("34ae8842-dcf7-45f0-9cdc-100db1b422ed")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("fd2b6fa7-74c6-44bf-81a4-e535ef6f7c90")
                            .namespace("activity")
                            .slug("acer")
                            .value(AtsMetadataValue.of("Pauci eius cena adamo summisse arguo pectus communis arcesso tergeo."))
                            .build(),
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("897647b8-f316-4d78-a7bd-41bf9028f3f8")
                            .namespace("activity")
                            .slug("tremo")
                            .value(AtsMetadataValue.of("Amita delectus dicta temptatio utroque ex."))
                            .build()))
                    .subType("TASK")
                    .title("Senior Interactions Manager")
                    .to(List.of(
                        AtsEmail.builder()
                            .email("Sister91@hotmail.com")
                            .name("Eddie Nienow PhD")
                            .type(AtsEmailType.WORK)
                            .build()))
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-03-06T13:34:25.451Z"))
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
                    .completedAt(OffsetDateTime.parse("2025-04-12T21:08:39.423Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("3c4a7fe6-f616-4cb1-b6f1-b07ad7470920")
                    .isCompleted(true)
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2023-12-24T04:54:05.825Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-23T21:45:04.318Z"))
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
                    .bcc(List.of(
                        AtsEmail.builder()
                            .email("Mabel_Schuppe-Schowalter42@hotmail.com")
                            .name("Rochelle Franey-Bechtelar")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .cc(List.of(
                        AtsEmail.builder()
                            .email("Sasha24@hotmail.com")
                            .name("Dr. Elbert Kuvalis")
                            .type(AtsEmailType.HOME)
                            .build(),
                        AtsEmail.builder()
                            .email("Rosetta_Donnelly@gmail.com")
                            .name("Ramon Daniel")
                            .type(AtsEmailType.OTHER)
                            .build(),
                        AtsEmail.builder()
                            .email("Kathryne_Jast@yahoo.com")
                            .name("Christian Jacobson")
                            .type(AtsEmailType.OTHER)
                            .build(),
                        AtsEmail.builder()
                            .email("Eldred95@yahoo.com")
                            .name("Edna Bogan")
                            .type(AtsEmailType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Amplus.")
                    .from(PropertyAtsActivityFrom.builder()
                        .email("Norwood.Wiza47@yahoo.com")
                        .name("Toby Grant")
                        .type(PropertyAtsActivityFromType.OTHER)
                        .build())
                    .id("689be512-24fa-4780-ac65-f4994fa849b7")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("ea8212f7-8ed7-40cb-98a8-770a6000e86a")
                            .namespace("activity")
                            .slug("acer")
                            .value(AtsMetadataValue.of("Pauci eius cena adamo summisse arguo pectus communis arcesso tergeo."))
                            .build(),
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("c3da64cc-3932-4c45-b713-1f3eef03925a")
                            .namespace("activity")
                            .slug("tremo")
                            .value(AtsMetadataValue.of("Amita delectus dicta temptatio utroque ex."))
                            .build()))
                    .subType("TASK")
                    .title("Senior Interactions Manager")
                    .to(List.of(
                        AtsEmail.builder()
                            .email("Sister91@hotmail.com")
                            .name("Eddie Nienow PhD")
                            .type(AtsEmailType.WORK)
                            .build()))
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-03-06T13:34:25.485Z"))
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
                    .completedAt(OffsetDateTime.parse("2025-04-12T21:08:39.427Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("69bd1cd5-438e-4eea-83f8-ada458c5ea2f")
                    .isCompleted(true)
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2023-12-24T04:54:05.825Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-23T21:45:04.320Z"))
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
                    .bcc(List.of(
                        AtsEmail.builder()
                            .email("Mabel_Schuppe-Schowalter42@hotmail.com")
                            .name("Rochelle Franey-Bechtelar")
                            .type(AtsEmailType.HOME)
                            .build()))
                    .cc(List.of(
                        AtsEmail.builder()
                            .email("Sasha24@hotmail.com")
                            .name("Dr. Elbert Kuvalis")
                            .type(AtsEmailType.HOME)
                            .build(),
                        AtsEmail.builder()
                            .email("Rosetta_Donnelly@gmail.com")
                            .name("Ramon Daniel")
                            .type(AtsEmailType.OTHER)
                            .build(),
                        AtsEmail.builder()
                            .email("Kathryne_Jast@yahoo.com")
                            .name("Christian Jacobson")
                            .type(AtsEmailType.OTHER)
                            .build(),
                        AtsEmail.builder()
                            .email("Eldred95@yahoo.com")
                            .name("Edna Bogan")
                            .type(AtsEmailType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2022-08-07T03:16:43.865Z"))
                    .description("Amplus.")
                    .from(PropertyAtsActivityFrom.builder()
                        .email("Norwood.Wiza47@yahoo.com")
                        .name("Toby Grant")
                        .type(PropertyAtsActivityFromType.OTHER)
                        .build())
                    .id("689be512-24fa-4780-ac65-f4994fa849b7")
                    .isPrivate(false)
                    .metadata(List.of(
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("ea8212f7-8ed7-40cb-98a8-770a6000e86a")
                            .namespace("activity")
                            .slug("acer")
                            .value(AtsMetadataValue.of("Pauci eius cena adamo summisse arguo pectus communis arcesso tergeo."))
                            .build(),
                        AtsMetadata.builder()
                            .extraData(AtsMetadataExtraData.of(Map.ofEntries(
                            )))
                            .format(AtsMetadataFormat.TEXT)
                            .id("c3da64cc-3932-4c45-b713-1f3eef03925a")
                            .namespace("activity")
                            .slug("tremo")
                            .value(AtsMetadataValue.of("Amita delectus dicta temptatio utroque ex."))
                            .build()))
                    .subType("TASK")
                    .title("Senior Interactions Manager")
                    .to(List.of(
                        AtsEmail.builder()
                            .email("Sister91@hotmail.com")
                            .name("Eddie Nienow PhD")
                            .type(AtsEmailType.WORK)
                            .build()))
                    .type(AtsActivityType.TASK)
                    .updatedAt(OffsetDateTime.parse("2026-03-06T13:34:25.485Z"))
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
                    .completedAt(OffsetDateTime.parse("2025-04-12T21:08:39.427Z"))
                    .createdAt(OffsetDateTime.parse("2020-10-17T01:25:21.745Z"))
                    .durationMinutes(55d)
                    .id("69bd1cd5-438e-4eea-83f8-ada458c5ea2f")
                    .isCompleted(true)
                    .progressPercentage(100d)
                    .startedAt(OffsetDateTime.parse("2023-12-24T04:54:05.825Z"))
                    .updatedAt(OffsetDateTime.parse("2022-01-23T21:45:04.320Z"))
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