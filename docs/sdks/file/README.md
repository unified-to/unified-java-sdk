# file

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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdFileIdRequest req = new DeleteCrmConnectionIdFileIdRequest("hic", "corrupti");            

            DeleteCrmConnectionIdFileIdResponse res = sdk.file.deleteCrmConnectionIdFileId(req, new DeleteCrmConnectionIdFileIdSecurity("soluta") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdRequest](../../models/operations/DeleteCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdSecurity](../../models/operations/DeleteCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdFileRequest req = new GetCrmConnectionIdFileRequest("earum") {{
                companyId = "praesentium";
                contactId = "explicabo";
                dealId = "odit";
                limit = 731.97d;
                offset = 1037.6d;
                order = "quia";
                query = "ad";
                sort = "velit";
                updatedGte = LocalDate.parse("2022-05-29");
            }};            

            GetCrmConnectionIdFileResponse res = sdk.file.getCrmConnectionIdFile(req, new GetCrmConnectionIdFileSecurity("possimus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileRequest](../../models/operations/GetCrmConnectionIdFileRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileSecurity](../../models/operations/GetCrmConnectionIdFileSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdFileIdRequest req = new GetCrmConnectionIdFileIdRequest("iste", "blanditiis");            

            GetCrmConnectionIdFileIdResponse res = sdk.file.getCrmConnectionIdFileId(req, new GetCrmConnectionIdFileIdSecurity("consectetur") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdRequest](../../models/operations/GetCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdSecurity](../../models/operations/GetCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdFileIdRequest req = new PatchCrmConnectionIdFileIdRequest("totam", "dignissimos") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "repellat";
                    companyId = "iusto";
                    contactId = "culpa";
                    createdAt = LocalDate.parse("2022-06-02");
                    dealId = "maxime";
                    description = "assumenda";
                    fileName = "nihil";
                    fileSize = 1520.52d;
                    fileType = "optio";
                    fileUrl = "nulla";
                    id = "2484da21-729f-42ac-81ef-5725f1169ac1";
                    leadId = "itaque";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = LocalDate.parse("2022-11-21");
                    userId = "temporibus";
                }};;
            }};            

            PatchCrmConnectionIdFileIdResponse res = sdk.file.patchCrmConnectionIdFileId(req, new PatchCrmConnectionIdFileIdSecurity("voluptatum") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdRequest](../../models/operations/PatchCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdSecurity](../../models/operations/PatchCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdFileRequest req = new PostCrmConnectionIdFileRequest("deserunt") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "aspernatur";
                    companyId = "neque";
                    contactId = "impedit";
                    createdAt = LocalDate.parse("2022-10-18");
                    dealId = "saepe";
                    description = "amet";
                    fileName = "labore";
                    fileSize = 9984.45d;
                    fileType = "eos";
                    fileUrl = "quibusdam";
                    id = "fa4a197f-6de9-4221-91fe-1712099853e9";
                    leadId = "reiciendis";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = LocalDate.parse("2022-09-26");
                    userId = "adipisci";
                }};;
            }};            

            PostCrmConnectionIdFileResponse res = sdk.file.postCrmConnectionIdFile(req, new PostCrmConnectionIdFileSecurity("pariatur") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileRequest](../../models/operations/PostCrmConnectionIdFileRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileSecurity](../../models/operations/PostCrmConnectionIdFileSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdFileIdRequest req = new PutCrmConnectionIdFileIdRequest("praesentium", "nemo") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "dolore";
                    companyId = "numquam";
                    contactId = "dolor";
                    createdAt = LocalDate.parse("2021-03-29");
                    dealId = "voluptates";
                    description = "quia";
                    fileName = "aspernatur";
                    fileSize = 2805.9d;
                    fileType = "non";
                    fileUrl = "laboriosam";
                    id = "0443bc15-4188-4c2f-96e8-5da7832eabd6";
                    leadId = "et";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = LocalDate.parse("2022-03-31");
                    userId = "nesciunt";
                }};;
            }};            

            PutCrmConnectionIdFileIdResponse res = sdk.file.putCrmConnectionIdFileId(req, new PutCrmConnectionIdFileIdSecurity("harum") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdRequest](../../models/operations/PutCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdSecurity](../../models/operations/PutCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdResponse](../../models/operations/PutCrmConnectionIdFileIdResponse.md)**

