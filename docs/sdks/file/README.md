# File
(*file*)

### Available Operations

* [deleteCrmConnectionIdFileId](#deletecrmconnectionidfileid) - Remove a file
* [getCrmConnectionIdFile](#getcrmconnectionidfile) - List all files
* [getCrmConnectionIdFileId](#getcrmconnectionidfileid) - Retrieve a file
* [patchCrmConnectionIdFileId](#patchcrmconnectionidfileid) - Update a file
* [postCrmConnectionIdFile](#postcrmconnectionidfile) - Create a file
* [putCrmConnectionIdFileId](#putcrmconnectionidfileid) - Update a file

## deleteCrmConnectionIdFileId

Remove a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("ivory") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdFileIdRequest req = new DeleteCrmConnectionIdFileIdRequest("Hybrid", "Dobra");            

            DeleteCrmConnectionIdFileIdResponse res = sdk.file.deleteCrmConnectionIdFileId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdRequest](../../models/operations/DeleteCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdResponse](../../models/operations/DeleteCrmConnectionIdFileIdResponse.md)**


## getCrmConnectionIdFile

List all files

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("South") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdFileRequest req = new GetCrmConnectionIdFileRequest("hm") {{
                companyId = "Salad Recycled Electronic";
                contactId = "Seychelles";
                dealId = "Investment deposit";
                limit = 2748.99d;
                offset = 7968.15d;
                order = "experiences Milo";
                query = "Unbranded haptic FTP";
                sort = "watt soprano deliverables";
                updatedGte = OffsetDateTime.parse("2022-03-02T03:00:09.711Z");
            }};            

            GetCrmConnectionIdFileResponse res = sdk.file.getCrmConnectionIdFile(req);

            if (res.crmFiles != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileRequest](../../models/operations/GetCrmConnectionIdFileRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileResponse](../../models/operations/GetCrmConnectionIdFileResponse.md)**


## getCrmConnectionIdFileId

Retrieve a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Buckinghamshire") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdFileIdRequest req = new GetCrmConnectionIdFileIdRequest("haptic", "Sheboygan");            

            GetCrmConnectionIdFileIdResponse res = sdk.file.getCrmConnectionIdFileId(req);

            if (res.crmFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdRequest](../../models/operations/GetCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdResponse](../../models/operations/GetCrmConnectionIdFileIdResponse.md)**


## patchCrmConnectionIdFileId

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("tragedy") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdFileIdRequest req = new PatchCrmConnectionIdFileIdRequest("Engineer", "male") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "Home communities CFP";
                    companyId = "unaware yellow generating";
                    contactId = "World";
                    createdAt = OffsetDateTime.parse("2021-07-25T09:47:16.664Z");
                    dealId = "City and Electronic";
                    description = "Virtual client-driven benchmark";
                    fileName = "handcrafted_kong_maximized.jpeg";
                    fileSize = 8601.07d;
                    fileType = "image";
                    fileUrl = "Awesome Accountability gadzooks";
                    id = "<ID>";
                    leadId = "Incredible Chromium";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2021-10-07T21:25:44.502Z");
                    userId = "Hybrid";
                }};;
            }};            

            PatchCrmConnectionIdFileIdResponse res = sdk.file.patchCrmConnectionIdFileId(req);

            if (res.crmFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdRequest](../../models/operations/PatchCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdResponse](../../models/operations/PatchCrmConnectionIdFileIdResponse.md)**


## postCrmConnectionIdFile

Create a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("contaminate") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdFileRequest req = new PostCrmConnectionIdFileRequest("standardization") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "Manager";
                    companyId = "Florida Shoes East";
                    contactId = "Ohio loyally regarding";
                    createdAt = OffsetDateTime.parse("2022-08-05T21:17:21.878Z");
                    dealId = "indigo Delaware";
                    description = "Enhanced bifurcated structure";
                    fileName = "for_chips_under.gif";
                    fileSize = 9649.84d;
                    fileType = "video";
                    fileUrl = "Avon male";
                    id = "<ID>";
                    leadId = "Transgender";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2021-11-20T07:00:09.078Z");
                    userId = "national Lead";
                }};;
            }};            

            PostCrmConnectionIdFileResponse res = sdk.file.postCrmConnectionIdFile(req);

            if (res.crmFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileRequest](../../models/operations/PostCrmConnectionIdFileRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileResponse](../../models/operations/PostCrmConnectionIdFileResponse.md)**


## putCrmConnectionIdFileId

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("East") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdFileIdRequest req = new PutCrmConnectionIdFileIdRequest("Checking", "South") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "Southwest";
                    companyId = "brief";
                    contactId = "toward confiscate East";
                    createdAt = OffsetDateTime.parse("2021-07-09T08:13:21.861Z");
                    dealId = "Hip Suriname Tactics";
                    description = "Extended homogeneous forecast";
                    fileName = "framework_azure_metal.gif";
                    fileSize = 7410.83d;
                    fileType = "video";
                    fileUrl = "Cheese error Minnesota";
                    id = "<ID>";
                    leadId = "biplane Handcrafted";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2021-02-25T14:09:45.532Z");
                    userId = "Implementation Fremont Rutherfordium";
                }};;
            }};            

            PutCrmConnectionIdFileIdResponse res = sdk.file.putCrmConnectionIdFileId(req);

            if (res.crmFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdRequest](../../models/operations/PutCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdResponse](../../models/operations/PutCrmConnectionIdFileIdResponse.md)**

