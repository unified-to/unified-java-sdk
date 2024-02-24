# Storage
(*storage*)

### Available Operations

* [createStorageFile](#createstoragefile) - Create a file
* [getStorageFile](#getstoragefile) - Retrieve a file
* [listStorageFiles](#liststoragefiles) - List all files
* [patchStorageFile](#patchstoragefile) - Update a file
* [removeStorageFile](#removestoragefile) - Remove a file
* [updateStorageFile](#updatestoragefile) - Update a file

## createStorageFile

Create a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.models.shared.StorageFileType;
import com.unifiedapi.unifiedto.models.shared.StoragePermission;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest req = new CreateStorageFileRequest(
                "<value>"){{
                storageFile = new StorageFile(
){{
                    createdAt = OffsetDateTime.parse("2024-11-26T17:10:46.324Z");
                    description = "Digitized systematic Graphic Interface";
                    downloadUrl = "<value>";
                    hash = "<value>";
                    id = "<id>";
                    mimeType = "<value>";
                    name = "<value>";
                    parentId = "<value>";
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
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    size = 3999.85d;
                    type = StorageFileType.FOLDER;
                    updatedAt = OffsetDateTime.parse("2024-03-07T14:24:08.441Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse res = sdk.storage.createStorageFile(req, new CreateStorageFileSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest](../../models/operations/CreateStorageFileRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.CreateStorageFileSecurity](../../models/operations/CreateStorageFileSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse](../../models/operations/CreateStorageFileResponse.md)**


## getStorageFile

Retrieve a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest req = new GetStorageFileRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse res = sdk.storage.getStorageFile(req, new GetStorageFileSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest](../../models/operations/GetStorageFileRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetStorageFileSecurity](../../models/operations/GetStorageFileSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse](../../models/operations/GetStorageFileResponse.md)**


## listStorageFiles

List all files

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest req = new ListStorageFilesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 1047.26d;
                offset = 7962.22d;
                order = "<value>";
                parentId = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-01-28T04:36:03.817Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse res = sdk.storage.listStorageFiles(req, new ListStorageFilesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest](../../models/operations/ListStorageFilesRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.ListStorageFilesSecurity](../../models/operations/ListStorageFilesSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse](../../models/operations/ListStorageFilesResponse.md)**


## patchStorageFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.models.shared.StorageFileType;
import com.unifiedapi.unifiedto.models.shared.StoragePermission;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest req = new PatchStorageFileRequest(
                "<value>",
                "<value>"){{
                storageFile = new StorageFile(
){{
                    createdAt = OffsetDateTime.parse("2022-03-01T13:48:26.867Z");
                    description = "Customer-focused mission-critical monitoring";
                    downloadUrl = "<value>";
                    hash = "<value>";
                    id = "<id>";
                    mimeType = "<value>";
                    name = "<value>";
                    parentId = "<value>";
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
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    size = 2253.31d;
                    type = StorageFileType.FILE;
                    updatedAt = OffsetDateTime.parse("2023-11-03T15:19:05.454Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse res = sdk.storage.patchStorageFile(req, new PatchStorageFileSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest](../../models/operations/PatchStorageFileRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchStorageFileSecurity](../../models/operations/PatchStorageFileSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse](../../models/operations/PatchStorageFileResponse.md)**


## removeStorageFile

Remove a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest req = new RemoveStorageFileRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse res = sdk.storage.removeStorageFile(req, new RemoveStorageFileSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest](../../models/operations/RemoveStorageFileRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.RemoveStorageFileSecurity](../../models/operations/RemoveStorageFileSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse](../../models/operations/RemoveStorageFileResponse.md)**


## updateStorageFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyStoragePermissionRoles;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.models.shared.StorageFileType;
import com.unifiedapi.unifiedto.models.shared.StoragePermission;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest req = new UpdateStorageFileRequest(
                "<value>",
                "<value>"){{
                storageFile = new StorageFile(
){{
                    createdAt = OffsetDateTime.parse("2024-06-06T15:38:39.174Z");
                    description = "Polarised intangible architecture";
                    downloadUrl = "<value>";
                    hash = "<value>";
                    id = "<id>";
                    mimeType = "<value>";
                    name = "<value>";
                    parentId = "<value>";
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
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    size = 4091d;
                    type = StorageFileType.FOLDER;
                    updatedAt = OffsetDateTime.parse("2022-06-25T21:16:43.994Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse res = sdk.storage.updateStorageFile(req, new UpdateStorageFileSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest](../../models/operations/UpdateStorageFileRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.UpdateStorageFileSecurity](../../models/operations/UpdateStorageFileSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse](../../models/operations/UpdateStorageFileResponse.md)**

