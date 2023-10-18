# File
(*file*)

### Available Operations

* [createCrmFile](#createcrmfile) - Create a file
* [getCrmFile](#getcrmfile) - Retrieve a file
* [listCrmFiles](#listcrmfiles) - List all files
* [patchCrmFile](#patchcrmfile) - Update a file
* [removeCrmFile](#removecrmfile) - Remove a file
* [updateCrmFile](#updatecrmfile) - Update a file

## createCrmFile

Create a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("loyally"){{
                    jwt = "";
                }})
                .build();

            CreateCrmFileRequest req = new CreateCrmFileRequest("Northwest"){{
                crmFile = new CrmFile(){{
                    activityId = "Tasty";
                    companyId = "Gasoline";
                    contactId = "Tactics";
                    createdAt = OffsetDateTime.parse("2023-04-25T01:22:24.549Z");
                    dealId = "invoice";
                    description = "Optional eco-centric definition";
                    fileName = "generate_coulomb.mp4v";
                    fileSize = 7403.39d;
                    fileType = "video";
                    fileUrl = "male";
                    id = "<ID>";
                    isActive = false;
                    leadId = "mole";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2021-08-10T15:19:38.772Z");
                    userId = "Coupe";
                }};
            }};            

            CreateCrmFileResponse res = sdk.file.createCrmFile(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmFileRequest](../../models/operations/CreateCrmFileRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmFileResponse](../../models/operations/CreateCrmFileResponse.md)**


## getCrmFile

Retrieve a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Southwest"){{
                    jwt = "";
                }})
                .build();

            GetCrmFileRequest req = new GetCrmFileRequest("sexy", "Southeast"){{
                fields = new String[]{{
                    add("lightly"),
                }};
            }};            

            GetCrmFileResponse res = sdk.file.getCrmFile(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmFileRequest](../../models/operations/GetCrmFileRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmFileResponse](../../models/operations/GetCrmFileResponse.md)**


## listCrmFiles

List all files

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmFilesRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmFilesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bicycle"){{
                    jwt = "";
                }})
                .build();

            ListCrmFilesRequest req = new ListCrmFilesRequest("Genderflux"){{
                companyId = "Southeast";
                contactId = "invoice";
                dealId = "hertz";
                fields = new String[]{{
                    add("invoice"),
                }};
                limit = 7868.48d;
                offset = 7222.04d;
                order = "Tuvalu";
                query = "West";
                sort = "Gorgeous";
                updatedGte = OffsetDateTime.parse("2021-07-02T02:06:49.991Z");
            }};            

            ListCrmFilesResponse res = sdk.file.listCrmFiles(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmFilesRequest](../../models/operations/ListCrmFilesRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmFilesResponse](../../models/operations/ListCrmFilesResponse.md)**


## patchCrmFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Health"){{
                    jwt = "";
                }})
                .build();

            PatchCrmFileRequest req = new PatchCrmFileRequest("Future", "Southeast"){{
                crmFile = new CrmFile(){{
                    activityId = "communities";
                    companyId = "watt";
                    contactId = "Gasoline";
                    createdAt = OffsetDateTime.parse("2021-02-07T08:18:55.524Z");
                    dealId = "dreamily";
                    description = "Function-based zero defect conglomeration";
                    fileName = "fundamental_directives.mpga";
                    fileSize = 7321.52d;
                    fileType = "video";
                    fileUrl = "molestiae";
                    id = "<ID>";
                    isActive = false;
                    leadId = "qua";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2021-03-11T08:59:40.328Z");
                    userId = "Usability";
                }};
            }};            

            PatchCrmFileResponse res = sdk.file.patchCrmFile(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmFileRequest](../../models/operations/PatchCrmFileRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmFileResponse](../../models/operations/PatchCrmFileResponse.md)**


## removeCrmFile

Remove a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Zambia"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmFileRequest req = new RemoveCrmFileRequest("Florida", "female");            

            RemoveCrmFileResponse res = sdk.file.removeCrmFile(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmFileRequest](../../models/operations/RemoveCrmFileRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmFileResponse](../../models/operations/RemoveCrmFileResponse.md)**


## updateCrmFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Plano"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmFileRequest req = new UpdateCrmFileRequest("generate", "unexpectedly"){{
                crmFile = new CrmFile(){{
                    activityId = "Nakfa";
                    companyId = "wireless";
                    contactId = "seamless";
                    createdAt = OffsetDateTime.parse("2021-09-11T08:15:48.719Z");
                    dealId = "Station";
                    description = "Function-based grid-enabled strategy";
                    fileName = "lead_haptic_successfully.png";
                    fileSize = 2930.3d;
                    fileType = "text";
                    fileUrl = "Bicycle";
                    id = "<ID>";
                    isActive = false;
                    leadId = "Oregon";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2023-03-20T00:28:11.359Z");
                    userId = "navigating";
                }};
            }};            

            UpdateCrmFileResponse res = sdk.file.updateCrmFile(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmFileRequest](../../models/operations/UpdateCrmFileRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmFileResponse](../../models/operations/UpdateCrmFileResponse.md)**

