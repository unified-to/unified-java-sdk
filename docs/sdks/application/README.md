# application

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
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdApplicationIdRequest req = new DeleteAtsConnectionIdApplicationIdRequest("tempore", "labore");            

            DeleteAtsConnectionIdApplicationIdResponse res = sdk.application.deleteAtsConnectionIdApplicationId(req, new DeleteAtsConnectionIdApplicationIdSecurity("delectus") {{
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdRequest](../../models/operations/DeleteAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdApplicationIdSecurity](../../models/operations/DeleteAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdApplicationRequest req = new GetAtsConnectionIdApplicationRequest("eum") {{
                candidateId = "non";
                jobId = "eligendi";
                limit = 5761.57d;
                offset = 3960.98d;
                order = "provident";
                query = "necessitatibus";
                sort = "sint";
                updatedGte = LocalDate.parse("2022-07-22");
            }};            

            GetAtsConnectionIdApplicationResponse res = sdk.application.getAtsConnectionIdApplication(req, new GetAtsConnectionIdApplicationSecurity("debitis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationRequest](../../models/operations/GetAtsConnectionIdApplicationRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationSecurity](../../models/operations/GetAtsConnectionIdApplicationSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdApplicationIdRequest req = new GetAtsConnectionIdApplicationIdRequest("a", "dolorum");            

            GetAtsConnectionIdApplicationIdResponse res = sdk.application.getAtsConnectionIdApplicationId(req, new GetAtsConnectionIdApplicationIdSecurity("in") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdRequest](../../models/operations/GetAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdApplicationIdSecurity](../../models/operations/GetAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdApplicationIdRequest req = new PatchAtsConnectionIdApplicationIdRequest("in", "illum") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = LocalDate.parse("2020-11-26");
                    candidateId = "dicta";
                    createdAt = LocalDate.parse("2022-03-27");
                    id = "d66ae395-efb9-4ba8-8f3a-66997074ba44";
                    jobId = "suscipit";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = LocalDate.parse("2021-07-03");
                    rejectedReason = "eum";
                    source = "vero";
                    status = AtsApplicationStatus.REVIEWING;
                    updatedAt = LocalDate.parse("2022-09-14");
                }};;
            }};            

            PatchAtsConnectionIdApplicationIdResponse res = sdk.application.patchAtsConnectionIdApplicationId(req, new PatchAtsConnectionIdApplicationIdSecurity("et") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdRequest](../../models/operations/PatchAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdApplicationIdSecurity](../../models/operations/PatchAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdApplicationRequest req = new PostAtsConnectionIdApplicationRequest("excepturi") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = LocalDate.parse("2022-05-30");
                    candidateId = "quos";
                    createdAt = LocalDate.parse("2022-12-07");
                    id = "afa563e2-516f-4e4c-8b71-1e5b7fd2ed02";
                    jobId = "praesentium";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = LocalDate.parse("2022-09-01");
                    rejectedReason = "sunt";
                    source = "quo";
                    status = AtsApplicationStatus.HIRED;
                    updatedAt = LocalDate.parse("2020-07-30");
                }};;
            }};            

            PostAtsConnectionIdApplicationResponse res = sdk.application.postAtsConnectionIdApplication(req, new PostAtsConnectionIdApplicationSecurity("ea") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationRequest](../../models/operations/PostAtsConnectionIdApplicationRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdApplicationSecurity](../../models/operations/PostAtsConnectionIdApplicationSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsApplicationRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdApplicationIdRequest req = new PutAtsConnectionIdApplicationIdRequest("excepturi", "odit") {{
                atsApplication = new AtsApplication() {{
                    appliedAt = LocalDate.parse("2022-12-19");
                    candidateId = "ab";
                    createdAt = LocalDate.parse("2020-11-28");
                    id = "576b0d5f-0d30-4c5f-bb25-87053202c73d";
                    jobId = "nostrum";
                    raw = new PropertyAtsApplicationRaw();;
                    rejectedAt = LocalDate.parse("2020-03-20");
                    rejectedReason = "omnis";
                    source = "facilis";
                    status = AtsApplicationStatus.BACKGROUND_CHECK;
                    updatedAt = LocalDate.parse("2022-03-20");
                }};;
            }};            

            PutAtsConnectionIdApplicationIdResponse res = sdk.application.putAtsConnectionIdApplicationId(req, new PutAtsConnectionIdApplicationIdSecurity("consequuntur") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdRequest](../../models/operations/PutAtsConnectionIdApplicationIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdSecurity](../../models/operations/PutAtsConnectionIdApplicationIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdApplicationIdResponse](../../models/operations/PutAtsConnectionIdApplicationIdResponse.md)**

