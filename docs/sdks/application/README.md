# Application
(*application*)

### Available Operations

* [deleteAtsConnectionIdApplicationId](#deleteatsconnectionidapplicationid) - Remove an application
* [getAtsConnectionIdApplication](#getatsconnectionidapplication) - List all applications
* [getAtsConnectionIdApplicationId](#getatsconnectionidapplicationid) - Retrieve an application
* [patchAtsConnectionIdApplicationId](#patchatsconnectionidapplicationid) - Update an application
* [postAtsConnectionIdApplication](#postatsconnectionidapplication) - Create an application
* [putAtsConnectionIdApplicationId](#putatsconnectionidapplicationid) - Update an application

## deleteAtsConnectionIdApplicationId

Remove an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("female") {{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdApplicationIdRequest req = new DeleteAtsConnectionIdApplicationIdRequest("Southeast", "Darmstadtium");            

            DeleteAtsConnectionIdApplicationIdResponse res = sdk.application.deleteAtsConnectionIdApplicationId(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdRequest](../../models/operations/DeleteAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdResponse](../../models/operations/DeleteAtsConnectionIdApplicationIdResponse.md)**


## getAtsConnectionIdApplication

List all applications

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bacon") {{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdApplicationRequest req = new GetAtsConnectionIdApplicationRequest("withdrawal") {{
                candidateId = "approach Bacon";
                jobId = "Mobility";
                limit = 576.8d;
                offset = 7467.13d;
                order = "Architect";
                query = "loosely contingency";
                sort = "female";
                updatedGte = OffsetDateTime.parse("2023-09-05T13:59:23.348Z");
            }};            

            GetAtsConnectionIdApplicationResponse res = sdk.application.getAtsConnectionIdApplication(req);

            if (res.atsApplications != null) {
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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationRequest](../../models/operations/GetAtsConnectionIdApplicationRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationResponse](../../models/operations/GetAtsConnectionIdApplicationResponse.md)**


## getAtsConnectionIdApplicationId

Retrieve an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Brand") {{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdApplicationIdRequest req = new GetAtsConnectionIdApplicationIdRequest("Bicycle", "North");            

            GetAtsConnectionIdApplicationIdResponse res = sdk.application.getAtsConnectionIdApplicationId(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdRequest](../../models/operations/GetAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdResponse](../../models/operations/GetAtsConnectionIdApplicationIdResponse.md)**


## patchAtsConnectionIdApplicationId

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("ouch") {{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdApplicationIdRequest req = new PatchAtsConnectionIdApplicationIdRequest("North", "et") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = OffsetDateTime.parse("2023-12-06T09:54:21.775Z");
                    candidateId = "Human";
                    createdAt = OffsetDateTime.parse("2023-10-31T19:54:06.290Z");
                    id = "<ID>";
                    jobId = "Washington";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = OffsetDateTime.parse("2023-07-30T09:27:03.900Z");
                    rejectedReason = "Northwest";
                    source = "quantify models Carolina";
                    status = AtsApplicationStatus.SUBMITTED;
                    updatedAt = OffsetDateTime.parse("2021-05-11T22:36:02.527Z");
                }};;
            }};            

            PatchAtsConnectionIdApplicationIdResponse res = sdk.application.patchAtsConnectionIdApplicationId(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdRequest](../../models/operations/PatchAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdResponse](../../models/operations/PatchAtsConnectionIdApplicationIdResponse.md)**


## postAtsConnectionIdApplication

Create an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cotton") {{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdApplicationRequest req = new PostAtsConnectionIdApplicationRequest("impedit") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = OffsetDateTime.parse("2021-08-17T19:51:25.858Z");
                    candidateId = "Pizza";
                    createdAt = OffsetDateTime.parse("2022-06-18T11:59:47.948Z");
                    id = "<ID>";
                    jobId = "globalize";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = OffsetDateTime.parse("2021-04-05T14:19:56.779Z");
                    rejectedReason = "Kids Van Tasty";
                    source = "Electric Norfolk";
                    status = AtsApplicationStatus.SCREENING;
                    updatedAt = OffsetDateTime.parse("2022-09-29T00:44:25.415Z");
                }};;
            }};            

            PostAtsConnectionIdApplicationResponse res = sdk.application.postAtsConnectionIdApplication(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationRequest](../../models/operations/PostAtsConnectionIdApplicationRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationResponse](../../models/operations/PostAtsConnectionIdApplicationResponse.md)**


## putAtsConnectionIdApplicationId

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("farad") {{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdApplicationIdRequest req = new PutAtsConnectionIdApplicationIdRequest("Indianapolis", "Credit") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = OffsetDateTime.parse("2021-06-01T03:05:28.938Z");
                    candidateId = "middleware Jeep";
                    createdAt = OffsetDateTime.parse("2021-12-14T14:50:12.070Z");
                    id = "<ID>";
                    jobId = "North";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = OffsetDateTime.parse("2022-10-28T04:38:47.547Z");
                    rejectedReason = "Fort solid";
                    source = "Ghana";
                    status = AtsApplicationStatus.REVIEWING;
                    updatedAt = OffsetDateTime.parse("2023-03-12T05:49:54.060Z");
                }};;
            }};            

            PutAtsConnectionIdApplicationIdResponse res = sdk.application.putAtsConnectionIdApplicationId(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdRequest](../../models/operations/PutAtsConnectionIdApplicationIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdResponse](../../models/operations/PutAtsConnectionIdApplicationIdResponse.md)**

