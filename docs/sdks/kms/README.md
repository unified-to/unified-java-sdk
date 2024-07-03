# Kms
(*kms*)

### Available Operations

* [createKmsPage](#createkmspage) - Create a page
* [createKmsSpace](#createkmsspace) - Create a space
* [getKmsPage](#getkmspage) - Retrieve a page
* [getKmsSpace](#getkmsspace) - Retrieve a space
* [listKmsPages](#listkmspages) - List all pages
* [listKmsSpaces](#listkmsspaces) - List all spaces
* [patchKmsPage](#patchkmspage) - Update a page
* [patchKmsSpace](#patchkmsspace) - Update a space
* [removeKmsPage](#removekmspage) - Remove a page
* [removeKmsSpace](#removekmsspace) - Remove a space
* [updateKmsPage](#updatekmspage) - Update a page
* [updateKmsSpace](#updatekmsspace) - Update a space

## createKmsPage

Create a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.CreateKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.KmsPage;
import com.unifiedapi.unifiedto.models.shared.KmsPageType;
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

            com.unifiedapi.unifiedto.models.operations.CreateKmsPageRequest req = new CreateKmsPageRequest(
                "<value>"){{
                kmsPage = new KmsPage(
                    "<value>",
                    "<value>",
                    "<value>",
                    "<value>",
                    KmsPageType.HTML){{
                    createdAt = OffsetDateTime.parse("2024-03-19T03:04:03.192Z");
                    isActive = false;
                    parentPageId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-03-16T02:46:02.438Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateKmsPageResponse res = sdk.kms.createKmsPage(req);

            if (res.kmsPage != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateKmsPageRequest](../../models/operations/CreateKmsPageRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateKmsPageResponse](../../models/operations/CreateKmsPageResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.CreateKmsSpaceResponse res = sdk.kms.createKmsSpace(req);

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


## getKmsPage

Retrieve a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.GetKmsPageResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetKmsPageRequest req = new GetKmsPageRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetKmsPageResponse res = sdk.kms.getKmsPage(req);

            if (res.kmsPage != null) {
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
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetKmsPageRequest](../../models/operations/GetKmsPageRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetKmsPageResponse](../../models/operations/GetKmsPageResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.GetKmsSpaceResponse res = sdk.kms.getKmsSpace(req);

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


## listKmsPages

List all pages

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListKmsPagesRequest;
import com.unifiedapi.unifiedto.models.operations.ListKmsPagesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListKmsPagesRequest req = new ListKmsPagesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 549.23d;
                offset = 3993.53d;
                parentId = "<value>";
                query = "<value>";
                spaceId = "<value>";
                updatedGte = OffsetDateTime.parse("2023-09-01T15:54:02.024Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListKmsPagesResponse res = sdk.kms.listKmsPages(req);

            if (res.kmsPages != null) {
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
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListKmsPagesRequest](../../models/operations/ListKmsPagesRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListKmsPagesResponse](../../models/operations/ListKmsPagesResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.ListKmsSpacesResponse res = sdk.kms.listKmsSpaces(req);

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


## patchKmsPage

Update a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.PatchKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.KmsPage;
import com.unifiedapi.unifiedto.models.shared.KmsPageType;
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

            com.unifiedapi.unifiedto.models.operations.PatchKmsPageRequest req = new PatchKmsPageRequest(
                "<value>",
                "<value>"){{
                kmsPage = new KmsPage(
                    "<value>",
                    "<value>",
                    "<value>",
                    "<value>",
                    KmsPageType.TEXT){{
                    createdAt = OffsetDateTime.parse("2023-03-14T10:32:18.100Z");
                    isActive = false;
                    parentPageId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-09-20T04:17:54.183Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchKmsPageResponse res = sdk.kms.patchKmsPage(req);

            if (res.kmsPage != null) {
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
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchKmsPageRequest](../../models/operations/PatchKmsPageRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchKmsPageResponse](../../models/operations/PatchKmsPageResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceResponse res = sdk.kms.patchKmsSpace(req);

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


## removeKmsPage

Remove a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveKmsPageResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveKmsPageRequest req = new RemoveKmsPageRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveKmsPageResponse res = sdk.kms.removeKmsPage(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveKmsPageRequest](../../models/operations/RemoveKmsPageRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveKmsPageResponse](../../models/operations/RemoveKmsPageResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceResponse res = sdk.kms.removeKmsSpace(req);

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


## updateKmsPage

Update a page

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsPageRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateKmsPageResponse;
import com.unifiedapi.unifiedto.models.shared.KmsPage;
import com.unifiedapi.unifiedto.models.shared.KmsPageType;
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

            com.unifiedapi.unifiedto.models.operations.UpdateKmsPageRequest req = new UpdateKmsPageRequest(
                "<value>",
                "<value>"){{
                kmsPage = new KmsPage(
                    "<value>",
                    "<value>",
                    "<value>",
                    "<value>",
                    KmsPageType.TEXT){{
                    createdAt = OffsetDateTime.parse("2024-12-15T20:24:07.681Z");
                    isActive = false;
                    parentPageId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-02-11T00:44:59.678Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateKmsPageResponse res = sdk.kms.updateKmsPage(req);

            if (res.kmsPage != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateKmsPageRequest](../../models/operations/UpdateKmsPageRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateKmsPageResponse](../../models/operations/UpdateKmsPageResponse.md)**


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

            com.unifiedapi.unifiedto.models.operations.UpdateKmsSpaceResponse res = sdk.kms.updateKmsSpace(req);

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

