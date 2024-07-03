# Interview
(*interview*)

### Available Operations

* [createAtsInterview](#createatsinterview) - Create an interview
* [getAtsInterview](#getatsinterview) - Retrieve an interview
* [listAtsInterviews](#listatsinterviews) - List all interviews
* [patchAtsInterview](#patchatsinterview) - Update an interview
* [removeAtsInterview](#removeatsinterview) - Remove an interview
* [updateAtsInterview](#updateatsinterview) - Update an interview

## createAtsInterview

Create an interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest req = new CreateAtsInterviewRequest(
                "<value>"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-01-11T04:08:22.567Z");
                    endAt = OffsetDateTime.parse("2024-12-21T08:47:56.138Z");
                    externalEventXref = "<value>";
                    id = "<id>";
                    jobId = "<value>";
                    location = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    startAt = OffsetDateTime.parse("2023-11-20T00:14:00.277Z");
                    status = AtsInterviewStatus.NEEDS_SCHEDULING;
                    updatedAt = OffsetDateTime.parse("2022-02-07T15:15:23.855Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewResponse res = sdk.interview.createAtsInterview(req);

            if (res.atsInterview != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewRequest](../../models/operations/CreateAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsInterviewResponse](../../models/operations/CreateAtsInterviewResponse.md)**


## getAtsInterview

Retrieve an interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest req = new GetAtsInterviewRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsInterviewResponse res = sdk.interview.getAtsInterview(req);

            if (res.atsInterview != null) {
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
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsInterviewRequest](../../models/operations/GetAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsInterviewResponse](../../models/operations/GetAtsInterviewResponse.md)**


## listAtsInterviews

List all interviews

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest req = new ListAtsInterviewsRequest(
                "<value>"){{
                applicationId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 2562.12d;
                offset = 1185.02d;
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-09-28T15:15:00.508Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsResponse res = sdk.interview.listAtsInterviews(req);

            if (res.atsInterviews != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsRequest](../../models/operations/ListAtsInterviewsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsInterviewsResponse](../../models/operations/ListAtsInterviewsResponse.md)**


## patchAtsInterview

Update an interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest req = new PatchAtsInterviewRequest(
                "<value>",
                "<value>"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-09-11T19:09:34.526Z");
                    endAt = OffsetDateTime.parse("2022-05-28T22:25:51.616Z");
                    externalEventXref = "<value>";
                    id = "<id>";
                    jobId = "<value>";
                    location = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    startAt = OffsetDateTime.parse("2022-09-10T07:32:43.966Z");
                    status = AtsInterviewStatus.CANCELED;
                    updatedAt = OffsetDateTime.parse("2024-03-18T02:52:45.725Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewResponse res = sdk.interview.patchAtsInterview(req);

            if (res.atsInterview != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewRequest](../../models/operations/PatchAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsInterviewResponse](../../models/operations/PatchAtsInterviewResponse.md)**


## removeAtsInterview

Remove an interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest req = new RemoveAtsInterviewRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewResponse res = sdk.interview.removeAtsInterview(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest](../../models/operations/RemoveAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewResponse](../../models/operations/RemoveAtsInterviewResponse.md)**


## updateAtsInterview

Update an interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewResponse;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest req = new UpdateAtsInterviewRequest(
                "<value>",
                "<value>"){{
                atsInterview = new AtsInterview(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-05-06T05:22:44.534Z");
                    endAt = OffsetDateTime.parse("2023-03-29T20:29:22.648Z");
                    externalEventXref = "<value>";
                    id = "<id>";
                    jobId = "<value>";
                    location = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    startAt = OffsetDateTime.parse("2024-05-05T07:21:58.674Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2022-05-01T17:04:47.962Z");
                    userIds = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewResponse res = sdk.interview.updateAtsInterview(req);

            if (res.atsInterview != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewRequest](../../models/operations/UpdateAtsInterviewRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsInterviewResponse](../../models/operations/UpdateAtsInterviewResponse.md)**

