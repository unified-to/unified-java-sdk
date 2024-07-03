# Space
(*space*)

### Available Operations

* [createKmsSpace](#createkmsspace) - Create a space
* [getKmsSpace](#getkmsspace) - Retrieve a space
* [listKmsSpaces](#listkmsspaces) - List all spaces
* [patchKmsSpace](#patchkmsspace) - Update a space
* [removeKmsSpace](#removekmsspace) - Remove a space
* [updateKmsSpace](#updatekmsspace) - Update a space

## createKmsSpace

Create a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.KmsSpace;
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

            com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceRequest req = new CreateKmsSpaceRequest(
                "<value>"){{
                kmsSpace = new KmsSpace(
                    "<value>",
                    "<value>"){{
                    createdAt = OffsetDateTime.parse("2024-12-05T14:15:26.081Z");
                    description = "Synchronised mission-critical hub";
                    isActive = false;
                    parentSpaceId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-03-22T02:26:55.498Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceResponse res = sdk.space.createKmsSpace(req);

            if (res.kmsSpace != null) {
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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceRequest](../../models/operations/CreateKmsSpaceRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceResponse](../../models/operations/CreateKmsSpaceResponse.md)**


## getKmsSpace

Retrieve a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.GetKmsSpaceResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetKmsSpaceRequest req = new GetKmsSpaceRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetKmsSpaceResponse res = sdk.space.getKmsSpace(req);

            if (res.kmsSpace != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetKmsSpaceRequest](../../models/operations/GetKmsSpaceRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetKmsSpaceResponse](../../models/operations/GetKmsSpaceResponse.md)**


## listKmsSpaces

List all spaces

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListKmsSpacesRequest;
import com.unifiedapi.unifiedto.models.operations.ListKmsSpacesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListKmsSpacesRequest req = new ListKmsSpacesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 9216.91d;
                offset = 2110.39d;
                parentId = "<value>";
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2023-12-18T23:16:42.907Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListKmsSpacesResponse res = sdk.space.listKmsSpaces(req);

            if (res.kmsSpaces != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListKmsSpacesRequest](../../models/operations/ListKmsSpacesRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListKmsSpacesResponse](../../models/operations/ListKmsSpacesResponse.md)**


## patchKmsSpace

Update a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.KmsSpace;
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

            com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceRequest req = new PatchKmsSpaceRequest(
                "<value>",
                "<value>"){{
                kmsSpace = new KmsSpace(
                    "<value>",
                    "<value>"){{
                    createdAt = OffsetDateTime.parse("2024-11-04T17:16:51.659Z");
                    description = "Compatible homogeneous info-mediaries";
                    isActive = false;
                    parentSpaceId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-05-29T18:36:26.855Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceResponse res = sdk.space.patchKmsSpace(req);

            if (res.kmsSpace != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceRequest](../../models/operations/PatchKmsSpaceRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceResponse](../../models/operations/PatchKmsSpaceResponse.md)**


## removeKmsSpace

Remove a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceRequest req = new RemoveKmsSpaceRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceResponse res = sdk.space.removeKmsSpace(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceRequest](../../models/operations/RemoveKmsSpaceRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceResponse](../../models/operations/RemoveKmsSpaceResponse.md)**


## updateKmsSpace

Update a space

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceResponse;
import com.unifiedapi.unifiedto.models.shared.KmsSpace;
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

            com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceRequest req = new UpdateKmsSpaceRequest(
                "<value>",
                "<value>"){{
                kmsSpace = new KmsSpace(
                    "<value>",
                    "<value>"){{
                    createdAt = OffsetDateTime.parse("2023-05-28T11:59:07.928Z");
                    description = "Cross-platform human-resource hierarchy";
                    isActive = false;
                    parentSpaceId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-10-05T23:06:20.079Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceResponse res = sdk.space.updateKmsSpace(req);

            if (res.kmsSpace != null) {
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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceRequest](../../models/operations/UpdateKmsSpaceRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceResponse](../../models/operations/UpdateKmsSpaceResponse.md)**

