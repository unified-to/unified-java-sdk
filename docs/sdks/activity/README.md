# Activity
(*activity*)

### Available Operations

* [createAtsActivity](#createatsactivity) - Create an activity
* [getAtsActivity](#getatsactivity) - Retrieve an activity
* [listAtsActivities](#listatsactivities) - List all activities
* [patchAtsActivity](#patchatsactivity) - Update an activity
* [removeAtsActivity](#removeatsactivity) - Remove an activity
* [updateAtsActivity](#updateatsactivity) - Update an activity

## createAtsActivity

Create an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAtsActivitySecurity;
import com.unifiedapi.unifiedto.models.shared.AtsActivity;
import com.unifiedapi.unifiedto.models.shared.AtsActivityType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsActivityRequest req = new CreateAtsActivityRequest(
                "<value>"){{
                atsActivity = new AtsActivity(
                    "<value>"){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-11-03T02:06:02.932Z");
                    description = "Future-proofed non-volatile artificial intelligence";
                    documentId = "<value>";
                    id = "<id>";
                    interviewId = "<value>";
                    isPrivate = false;
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsActivityType.NOTE;
                    updatedAt = OffsetDateTime.parse("2023-01-22T20:04:14.417Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsActivityResponse res = sdk.activity.createAtsActivity(req, new CreateAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsActivityRequest](../../models/operations/CreateAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.CreateAtsActivitySecurity](../../models/operations/CreateAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsActivityResponse](../../models/operations/CreateAtsActivityResponse.md)**


## getAtsActivity

Retrieve an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsActivitySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsActivityRequest req = new GetAtsActivityRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsActivityResponse res = sdk.activity.getAtsActivity(req, new GetAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsActivityRequest](../../models/operations/GetAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetAtsActivitySecurity](../../models/operations/GetAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsActivityResponse](../../models/operations/GetAtsActivityResponse.md)**


## listAtsActivities

List all activities

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesResponse;
import com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesRequest req = new ListAtsActivitiesRequest(
                "<value>"){{
                applicationId = "<value>";
                candidateId = "<value>";
                documentId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                interviewId = "<value>";
                jobId = "<value>";
                limit = 2367.19d;
                offset = 8254.25d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-11-13T18:19:17.967Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesResponse res = sdk.activity.listAtsActivities(req, new ListAtsActivitiesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivities != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesRequest](../../models/operations/ListAtsActivitiesRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesSecurity](../../models/operations/ListAtsActivitiesSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsActivitiesResponse](../../models/operations/ListAtsActivitiesResponse.md)**


## patchAtsActivity

Update an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsActivitySecurity;
import com.unifiedapi.unifiedto.models.shared.AtsActivity;
import com.unifiedapi.unifiedto.models.shared.AtsActivityType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsActivityRequest req = new PatchAtsActivityRequest(
                "<value>",
                "<value>"){{
                atsActivity = new AtsActivity(
                    "<value>"){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-11-03T16:46:57.187Z");
                    description = "Compatible reciprocal archive";
                    documentId = "<value>";
                    id = "<id>";
                    interviewId = "<value>";
                    isPrivate = false;
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsActivityType.NOTE;
                    updatedAt = OffsetDateTime.parse("2022-05-17T01:47:31.125Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsActivityResponse res = sdk.activity.patchAtsActivity(req, new PatchAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsActivityRequest](../../models/operations/PatchAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchAtsActivitySecurity](../../models/operations/PatchAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsActivityResponse](../../models/operations/PatchAtsActivityResponse.md)**


## removeAtsActivity

Remove an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsActivitySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityRequest req = new RemoveAtsActivityRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityResponse res = sdk.activity.removeAtsActivity(req, new RemoveAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityRequest](../../models/operations/RemoveAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.RemoveAtsActivitySecurity](../../models/operations/RemoveAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsActivityResponse](../../models/operations/RemoveAtsActivityResponse.md)**


## updateAtsActivity

Update an activity

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsActivitySecurity;
import com.unifiedapi.unifiedto.models.shared.AtsActivity;
import com.unifiedapi.unifiedto.models.shared.AtsActivityType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityRequest req = new UpdateAtsActivityRequest(
                "<value>",
                "<value>"){{
                atsActivity = new AtsActivity(
                    "<value>"){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-06-06T07:57:58.715Z");
                    description = "Total fault-tolerant collaboration";
                    documentId = "<value>";
                    id = "<id>";
                    interviewId = "<value>";
                    isPrivate = false;
                    jobId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    type = AtsActivityType.NOTE;
                    updatedAt = OffsetDateTime.parse("2022-10-09T08:30:27.721Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityResponse res = sdk.activity.updateAtsActivity(req, new UpdateAtsActivitySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.atsActivity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityRequest](../../models/operations/UpdateAtsActivityRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.UpdateAtsActivitySecurity](../../models/operations/UpdateAtsActivitySecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsActivityResponse](../../models/operations/UpdateAtsActivityResponse.md)**

