# Interview

### Available Operations

* [deleteAtsConnectionIdInterviewId](#deleteatsconnectionidinterviewid) - Remove a interview
* [getAtsConnectionIdInterview](#getatsconnectionidinterview) - List all interviews
* [getAtsConnectionIdInterviewId](#getatsconnectionidinterviewid) - Retrieve a interview
* [patchAtsConnectionIdInterviewId](#patchatsconnectionidinterviewid) - Update a interview
* [postAtsConnectionIdInterview](#postatsconnectionidinterview) - Create a interview
* [putAtsConnectionIdInterviewId](#putatsconnectionidinterviewid) - Update a interview

## deleteAtsConnectionIdInterviewId

Remove a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdInterviewIdRequest req = new DeleteAtsConnectionIdInterviewIdRequest("culpa", "illo");            

            DeleteAtsConnectionIdInterviewIdResponse res = sdk.interview.deleteAtsConnectionIdInterviewId(req, new DeleteAtsConnectionIdInterviewIdSecurity("reiciendis") {{
                jwt = "";
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdRequest](../../models/operations/DeleteAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdSecurity](../../models/operations/DeleteAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdResponse](../../models/operations/DeleteAtsConnectionIdInterviewIdResponse.md)**


## getAtsConnectionIdInterview

List all interviews

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdInterviewRequest req = new GetAtsConnectionIdInterviewRequest("ipsum") {{
                applicationId = "doloremque";
                limit = 7972.38d;
                offset = 4918.81d;
                order = "non";
                query = "facere";
                sort = "repellat";
                updatedGte = OffsetDateTime.parse("2022-04-22T16:39:49.741Z");
            }};            

            GetAtsConnectionIdInterviewResponse res = sdk.interview.getAtsConnectionIdInterview(req, new GetAtsConnectionIdInterviewSecurity("ea") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewRequest](../../models/operations/GetAtsConnectionIdInterviewRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewSecurity](../../models/operations/GetAtsConnectionIdInterviewSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewResponse](../../models/operations/GetAtsConnectionIdInterviewResponse.md)**


## getAtsConnectionIdInterviewId

Retrieve a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdInterviewIdRequest req = new GetAtsConnectionIdInterviewIdRequest("molestiae", "vitae");            

            GetAtsConnectionIdInterviewIdResponse res = sdk.interview.getAtsConnectionIdInterviewId(req, new GetAtsConnectionIdInterviewIdSecurity("excepturi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdRequest](../../models/operations/GetAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdSecurity](../../models/operations/GetAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdResponse](../../models/operations/GetAtsConnectionIdInterviewIdResponse.md)**


## patchAtsConnectionIdInterviewId

Update a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdInterviewIdRequest req = new PatchAtsConnectionIdInterviewIdRequest("voluptatum", "iste") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "eaque";
                    candidateId = "reiciendis";
                    createdAt = OffsetDateTime.parse("2022-11-02T23:08:48.799Z");
                    endAt = OffsetDateTime.parse("2022-06-16T03:37:31.369Z");
                    externalEventXref = "nobis";
                    id = "b438d85b-2605-491d-b45e-3c2059c9c3f5";
                    jobId = "autem";
                    location = "esse";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = OffsetDateTime.parse("2022-11-09T08:30:53.107Z");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = OffsetDateTime.parse("2022-08-21T17:48:50.289Z");
                    userIds = new String[]{{
                        add("consequuntur"),
                    }};
                }};;
            }};            

            PatchAtsConnectionIdInterviewIdResponse res = sdk.interview.patchAtsConnectionIdInterviewId(req, new PatchAtsConnectionIdInterviewIdSecurity("odio") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdRequest](../../models/operations/PatchAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdSecurity](../../models/operations/PatchAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdResponse](../../models/operations/PatchAtsConnectionIdInterviewIdResponse.md)**


## postAtsConnectionIdInterview

Create a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewResponse;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdInterviewRequest req = new PostAtsConnectionIdInterviewRequest("suscipit") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "quis";
                    candidateId = "nobis";
                    createdAt = OffsetDateTime.parse("2022-03-03T13:46:47.659Z");
                    endAt = OffsetDateTime.parse("2022-11-02T13:26:31.816Z");
                    externalEventXref = "delectus";
                    id = "cdace1f0-1216-4ce2-a39e-8f25cd0d19d9";
                    jobId = "nostrum";
                    location = "sint";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = OffsetDateTime.parse("2022-02-05T02:07:11.321Z");
                    status = AtsInterviewStatus.SCHEDULED;
                    updatedAt = OffsetDateTime.parse("2021-03-14T15:36:36.235Z");
                    userIds = new String[]{{
                        add("velit"),
                    }};
                }};;
            }};            

            PostAtsConnectionIdInterviewResponse res = sdk.interview.postAtsConnectionIdInterview(req, new PostAtsConnectionIdInterviewSecurity("sint") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewRequest](../../models/operations/PostAtsConnectionIdInterviewRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewSecurity](../../models/operations/PostAtsConnectionIdInterviewSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewResponse](../../models/operations/PostAtsConnectionIdInterviewResponse.md)**


## putAtsConnectionIdInterviewId

Update a interview

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdInterviewIdRequest req = new PutAtsConnectionIdInterviewIdRequest("eos", "nisi") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "commodi";
                    candidateId = "impedit";
                    createdAt = OffsetDateTime.parse("2021-04-27T21:49:48.563Z");
                    endAt = OffsetDateTime.parse("2022-05-17T19:06:35.400Z");
                    externalEventXref = "delectus";
                    id = "7aa2b241-1369-45d1-a669-8fcc4596217c";
                    jobId = "dolores";
                    location = "molestias";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = OffsetDateTime.parse("2022-07-12T06:49:58.900Z");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = OffsetDateTime.parse("2022-07-26T20:35:59.823Z");
                    userIds = new String[]{{
                        add("consectetur"),
                    }};
                }};;
            }};            

            PutAtsConnectionIdInterviewIdResponse res = sdk.interview.putAtsConnectionIdInterviewId(req, new PutAtsConnectionIdInterviewIdSecurity("velit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdRequest](../../models/operations/PutAtsConnectionIdInterviewIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdSecurity](../../models/operations/PutAtsConnectionIdInterviewIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdResponse](../../models/operations/PutAtsConnectionIdInterviewIdResponse.md)**

