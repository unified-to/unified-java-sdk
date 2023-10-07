# Interview
(*interview*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("coulomb"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdInterviewIdRequest req = new DeleteAtsConnectionIdInterviewIdRequest("Verde", "Hayes");            

            DeleteAtsConnectionIdInterviewIdResponse res = sdk.interview.deleteAtsConnectionIdInterviewId(req);

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdInterviewIdRequest](../../models/operations/DeleteAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("disinter"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdInterviewRequest req = new GetAtsConnectionIdInterviewRequest("Smart"){{
                applicationId = "Strategist blue";
                limit = 3279.77d;
                offset = 4526.93d;
                order = "Customer Oregon";
                query = "ivory";
                sort = "Corporate Account";
                updatedGte = OffsetDateTime.parse("2021-04-20T14:34:40.760Z");
            }};            

            GetAtsConnectionIdInterviewResponse res = sdk.interview.getAtsConnectionIdInterview(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewRequest](../../models/operations/GetAtsConnectionIdInterviewRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("haemorrhage"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdInterviewIdRequest req = new GetAtsConnectionIdInterviewIdRequest("Funk", "Gorgeous");            

            GetAtsConnectionIdInterviewIdResponse res = sdk.interview.getAtsConnectionIdInterviewId(req);

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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdInterviewIdRequest](../../models/operations/GetAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("coulomb"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdInterviewIdRequest req = new PatchAtsConnectionIdInterviewIdRequest("Cruiser", "pascal"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "Buckinghamshire example";
                    candidateId = "salmon";
                    createdAt = OffsetDateTime.parse("2023-12-02T13:16:53.615Z");
                    endAt = OffsetDateTime.parse("2021-07-14T21:18:57.758Z");
                    externalEventXref = "drive input transmitting";
                    id = "<ID>";
                    jobId = "Investor synthesizing";
                    location = "Identity";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2023-06-29T20:36:38.891Z");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = OffsetDateTime.parse("2023-01-27T15:59:11.216Z");
                    userIds = new String[]{{
                        add("Myrl"),
                    }};
                }};
            }};            

            PatchAtsConnectionIdInterviewIdResponse res = sdk.interview.patchAtsConnectionIdInterviewId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdInterviewIdRequest](../../models/operations/PatchAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Tricycle"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdInterviewRequest req = new PostAtsConnectionIdInterviewRequest("hertz"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "Stokes North Northeast";
                    candidateId = "vertical platforms";
                    createdAt = OffsetDateTime.parse("2023-03-16T18:42:23.230Z");
                    endAt = OffsetDateTime.parse("2022-05-12T23:51:49.123Z");
                    externalEventXref = "panel Identity";
                    id = "<ID>";
                    jobId = "Northwest Buckinghamshire";
                    location = "ultimately Chevrolet";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2023-12-01T23:03:25.142Z");
                    status = AtsInterviewStatus.SCHEDULED;
                    updatedAt = OffsetDateTime.parse("2022-05-19T12:56:14.783Z");
                    userIds = new String[]{{
                        add("Northeast"),
                    }};
                }};
            }};            

            PostAtsConnectionIdInterviewResponse res = sdk.interview.postAtsConnectionIdInterview(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdInterviewRequest](../../models/operations/PostAtsConnectionIdInterviewRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.AtsInterview;
import com.unifiedapi.unifiedto.models.shared.AtsInterviewStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsInterviewRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("amet"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdInterviewIdRequest req = new PutAtsConnectionIdInterviewIdRequest("Global", "greatness"){{
                atsInterview = new AtsInterview(){{
                    applicationId = "Meriden disbelieve online";
                    candidateId = "architectures";
                    createdAt = OffsetDateTime.parse("2023-07-30T10:46:54.075Z");
                    endAt = OffsetDateTime.parse("2021-02-05T22:53:23.541Z");
                    externalEventXref = "1080p";
                    id = "<ID>";
                    jobId = "Quality";
                    location = "Metal Ferrari";
                    raw = new PropertyAtsInterviewRaw();
                    startAt = OffsetDateTime.parse("2021-05-02T03:07:23.809Z");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = OffsetDateTime.parse("2023-11-10T18:42:28.617Z");
                    userIds = new String[]{{
                        add("Cis"),
                    }};
                }};
            }};            

            PutAtsConnectionIdInterviewIdResponse res = sdk.interview.putAtsConnectionIdInterviewId(req);

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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdRequest](../../models/operations/PutAtsConnectionIdInterviewIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdInterviewIdResponse](../../models/operations/PutAtsConnectionIdInterviewIdResponse.md)**

