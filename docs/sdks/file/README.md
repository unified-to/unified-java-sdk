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
                    active = false;
                    activityId = "the";
                    companyId = "Tactics Bicycle copy";
                    contactId = "Soul";
                    createdAt = OffsetDateTime.parse("2022-08-31T22:30:51.049Z");
                    dealId = "SSL Reduced Buckinghamshire";
                    description = "Upgradable radical archive";
                    fileName = "coupe.mp4v";
                    fileSize = 4288.39d;
                    fileType = "application";
                    fileUrl = "program hacking";
                    id = "<ID>";
                    leadId = "Bicycle Marketing Helium";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2022-09-17T10:16:03.549Z");
                    userId = "mobile firewall salmon";
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

            GetCrmFileRequest req = new GetCrmFileRequest("sexy", "Southeast");            

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
                companyId = "Paradigm";
                contactId = "invoice hertz";
                dealId = "SUV Carbon";
                limit = 9242.75d;
                offset = 824.64d;
                order = "Gorgeous olive";
                query = "suite Checking";
                sort = "SUV";
                updatedGte = OffsetDateTime.parse("2021-11-26T17:23:51.411Z");
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
                    active = false;
                    activityId = "Oriental invoice";
                    companyId = "Texas blockchains";
                    contactId = "navigate";
                    createdAt = OffsetDateTime.parse("2021-12-30T16:07:40.056Z");
                    dealId = "yellow Buckinghamshire";
                    description = "Configurable exuding budgetary management";
                    fileName = "xml_oxygen.gif";
                    fileSize = 9689.63d;
                    fileType = "application";
                    fileUrl = "National Granite redundant";
                    id = "<ID>";
                    leadId = "East";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2022-11-16T13:24:51.820Z");
                    userId = "corrupti withdrawal Diesel";
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
                    active = false;
                    activityId = "Cotton Specialist";
                    companyId = "Rustic Bluffs";
                    contactId = "content sorrowful Lead";
                    createdAt = OffsetDateTime.parse("2022-06-16T11:45:11.956Z");
                    dealId = "successfully Account";
                    description = "Right-sized dedicated productivity";
                    fileName = "radium.jpg";
                    fileSize = 5172.6d;
                    fileType = "audio";
                    fileUrl = "Northeast Mandatory";
                    id = "<ID>";
                    leadId = "AI Small wasting";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2021-08-04T14:31:18.269Z");
                    userId = "UTF8";
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

