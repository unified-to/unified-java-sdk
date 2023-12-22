# File
(*file*)

### Available Operations

* [createCrmFile](#createcrmfile) - Create a file
* [createStorageFile](#createstoragefile) - Create a file
* [getCrmFile](#getcrmfile) - Retrieve a file
* [getStorageFile](#getstoragefile) - Retrieve a file
* [listCrmFiles](#listcrmfiles) - List all files
* [listStorageFiles](#liststoragefiles) - List all files
* [patchCrmFile](#patchcrmfile) - Update a file
* [patchStorageFile](#patchstoragefile) - Update a file
* [removeCrmFile](#removecrmfile) - Remove a file
* [removeStorageFile](#removestoragefile) - Remove a file
* [updateCrmFile](#updatecrmfile) - Update a file
* [updateStorageFile](#updatestoragefile) - Update a file

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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmFileRequest req = new CreateCrmFileRequest(
                "string"){{
                crmFile = new CrmFile(
){{
                    activityId = "string";
                    companyId = "string";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2023-08-23T16:58:07.247Z");
                    dealId = "string";
                    description = "Multi-lateral background database";
                    fileName = "the.mp4v";
                    fileSize = 3460.69d;
                    fileType = "text";
                    fileUrl = "string";
                    id = "<ID>";
                    isActive = false;
                    leadId = "string";
                    raw = new PropertyCrmFileRaw(
);
                    updatedAt = OffsetDateTime.parse("2022-05-03T12:27:57.377Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmFileResponse res = sdk.file.createCrmFile(req);

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


## createStorageFile

Create a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyStorageFileRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.models.shared.StorageFileType;
import com.unifiedapi.unifiedto.models.shared.StoragePermission;
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

            com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest req = new CreateStorageFileRequest(
                "string"){{
                storageFile = new StorageFile(
){{
                    createdAt = OffsetDateTime.parse("2023-11-26T17:57:07.851Z");
                    description = "Digitized systematic Graphic Interface";
                    downloadUrl = "string";
                    id = "<ID>";
                    mimeType = "string";
                    name = "string";
                    parentId = "string";
                    permissions = new com.unifiedapi.unifiedto.models.shared.StoragePermission[]{{
                        add(new StoragePermission(
                        new com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles[]{{
                            add(PropertyStoragePermissionRoles.OWNER),
                        }}){{
                            roles = new com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles[]{{
                                add(PropertyStoragePermissionRoles.WRITE),
                            }};
                        }}),
                    }};
                    raw = new PropertyStorageFileRaw(
);
                    size = 3999.85d;
                    type = StorageFileType.FOLDER;
                    updatedAt = OffsetDateTime.parse("2023-03-07T20:57:30.769Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse res = sdk.file.createStorageFile(req);

            if (res.storageFile != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest](../../models/operations/CreateStorageFileRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse](../../models/operations/CreateStorageFileResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmFileRequest req = new GetCrmFileRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmFileResponse res = sdk.file.getCrmFile(req);

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


## getStorageFile

Retrieve a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest req = new GetStorageFileRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse res = sdk.file.getStorageFile(req);

            if (res.storageFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest](../../models/operations/GetStorageFileRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse](../../models/operations/GetStorageFileResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmFilesRequest req = new ListCrmFilesRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                dealId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 7725.49d;
                offset = 1697.5d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-11-04T18:55:22.126Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmFilesResponse res = sdk.file.listCrmFiles(req);

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


## listStorageFiles

List all files

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest req = new ListStorageFilesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 1047.26d;
                offset = 7962.22d;
                order = "string";
                parentId = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-01-28T04:00:20.237Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse res = sdk.file.listStorageFiles(req);

            if (res.storageFiles != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest](../../models/operations/ListStorageFilesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse](../../models/operations/ListStorageFilesResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmFileRequest req = new PatchCrmFileRequest(
                "string",
                "string"){{
                crmFile = new CrmFile(
){{
                    activityId = "string";
                    companyId = "string";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2021-08-02T16:08:30.860Z");
                    dealId = "string";
                    description = "Networked multimedia database";
                    fileName = "country.wav";
                    fileSize = 7551.13d;
                    fileType = "image";
                    fileUrl = "string";
                    id = "<ID>";
                    isActive = false;
                    leadId = "string";
                    raw = new PropertyCrmFileRaw(
);
                    updatedAt = OffsetDateTime.parse("2023-06-07T04:39:27.375Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmFileResponse res = sdk.file.patchCrmFile(req);

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


## patchStorageFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyStorageFileRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.models.shared.StorageFileType;
import com.unifiedapi.unifiedto.models.shared.StoragePermission;
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

            com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest req = new PatchStorageFileRequest(
                "string",
                "string"){{
                storageFile = new StorageFile(
){{
                    createdAt = OffsetDateTime.parse("2021-03-01T12:30:10.419Z");
                    description = "Customer-focused mission-critical monitoring";
                    downloadUrl = "string";
                    id = "<ID>";
                    mimeType = "string";
                    name = "string";
                    parentId = "string";
                    permissions = new com.unifiedapi.unifiedto.models.shared.StoragePermission[]{{
                        add(new StoragePermission(
                        new com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles[]{{
                            add(PropertyStoragePermissionRoles.OWNER),
                        }}){{
                            roles = new com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles[]{{
                                add(PropertyStoragePermissionRoles.OWNER),
                            }};
                        }}),
                    }};
                    raw = new PropertyStorageFileRaw(
);
                    size = 2253.31d;
                    type = StorageFileType.FILE;
                    updatedAt = OffsetDateTime.parse("2022-11-03T00:36:38.789Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse res = sdk.file.patchStorageFile(req);

            if (res.storageFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest](../../models/operations/PatchStorageFileRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse](../../models/operations/PatchStorageFileResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmFileRequest req = new RemoveCrmFileRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmFileResponse res = sdk.file.removeCrmFile(req);

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


## removeStorageFile

Remove a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest req = new RemoveStorageFileRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse res = sdk.file.removeStorageFile(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest](../../models/operations/RemoveStorageFileRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse](../../models/operations/RemoveStorageFileResponse.md)**


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmFileRequest req = new UpdateCrmFileRequest(
                "string",
                "string"){{
                crmFile = new CrmFile(
){{
                    activityId = "string";
                    companyId = "string";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2021-02-11T14:36:52.051Z");
                    dealId = "string";
                    description = "Quality-focused mobile orchestration";
                    fileName = "circuit_extended.jpe";
                    fileSize = 2826.44d;
                    fileType = "text";
                    fileUrl = "string";
                    id = "<ID>";
                    isActive = false;
                    leadId = "string";
                    raw = new PropertyCrmFileRaw(
);
                    updatedAt = OffsetDateTime.parse("2021-09-11T08:15:48.719Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmFileResponse res = sdk.file.updateCrmFile(req);

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


## updateStorageFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyStorageFileRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.models.shared.StorageFileType;
import com.unifiedapi.unifiedto.models.shared.StoragePermission;
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

            com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest req = new UpdateStorageFileRequest(
                "string",
                "string"){{
                storageFile = new StorageFile(
){{
                    createdAt = OffsetDateTime.parse("2023-06-06T20:12:23.700Z");
                    description = "Polarised intangible architecture";
                    downloadUrl = "string";
                    id = "<ID>";
                    mimeType = "string";
                    name = "string";
                    parentId = "string";
                    permissions = new com.unifiedapi.unifiedto.models.shared.StoragePermission[]{{
                        add(new StoragePermission(
                        new com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles[]{{
                            add(PropertyStoragePermissionRoles.READ),
                        }}){{
                            roles = new com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles[]{{
                                add(PropertyStoragePermissionRoles.WRITE),
                            }};
                        }}),
                    }};
                    raw = new PropertyStorageFileRaw(
);
                    size = 4091d;
                    type = StorageFileType.FOLDER;
                    updatedAt = OffsetDateTime.parse("2021-06-25T17:25:38.480Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse res = sdk.file.updateStorageFile(req);

            if (res.storageFile != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest](../../models/operations/UpdateStorageFileRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse](../../models/operations/UpdateStorageFileResponse.md)**

