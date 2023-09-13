# interview

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
import java.time.LocalDate;

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
                updatedGte = LocalDate.parse("2022-04-22");
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdInterviewIdRequest req = new PatchAtsConnectionIdInterviewIdRequest("voluptatum", "iste") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "eaque";
                    candidateId = "reiciendis";
                    createdAt = LocalDate.parse("2022-11-02");
                    endAt = LocalDate.parse("2022-06-16");
                    externalEventXref = "nobis";
                    id = "b438d85b-2605-491d-b45e-3c2059c9c3f5";
                    jobId = "autem";
                    location = "esse";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = LocalDate.parse("2022-11-09");
                    status = AtsInterviewStatus.COMPLETE;
                    updatedAt = LocalDate.parse("2022-08-21");
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdInterviewRequest req = new PostAtsConnectionIdInterviewRequest("suscipit") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "quis";
                    candidateId = "nobis";
                    createdAt = LocalDate.parse("2022-03-03");
                    endAt = LocalDate.parse("2022-11-02");
                    externalEventXref = "delectus";
                    id = "cdace1f0-1216-4ce2-a39e-8f25cd0d19d9";
                    jobId = "nostrum";
                    location = "sint";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = LocalDate.parse("2022-02-05");
                    status = AtsInterviewStatus.SCHEDULED;
                    updatedAt = LocalDate.parse("2021-03-14");
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdInterviewIdRequest req = new PutAtsConnectionIdInterviewIdRequest("eos", "nisi") {{
                atsInterview = new AtsInterview() {{
                    applicationId = "commodi";
                    candidateId = "impedit";
                    createdAt = LocalDate.parse("2021-04-27");
                    endAt = LocalDate.parse("2022-05-17");
                    externalEventXref = "delectus";
                    id = "7aa2b241-1369-45d1-a669-8fcc4596217c";
                    jobId = "dolores";
                    location = "molestias";
                    raw = new PropertyAtsInterviewRaw();;
                    startAt = LocalDate.parse("2022-07-12");
                    status = AtsInterviewStatus.AWAITING_FEEDBACK;
                    updatedAt = LocalDate.parse("2022-07-26");
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

