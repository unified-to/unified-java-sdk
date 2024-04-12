# Collection
(*collection*)

### Available Operations

* [createCommerceCollection](#createcommercecollection) - Create a collection
* [getCommerceCollection](#getcommercecollection) - Retrieve a collection
* [listCommerceCollections](#listcommercecollections) - List all collections
* [patchCommerceCollection](#patchcommercecollection) - Update a collection
* [removeCommerceCollection](#removecommercecollection) - Remove a collection
* [updateCommerceCollection](#updatecommercecollection) - Update a collection

## createCommerceCollection

Create a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceCollection;
import com.unifiedapi.unifiedto.models.shared.CommerceCollectionType;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMedia;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMediaType;
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

            com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionRequest req = new CreateCommerceCollectionRequest(
                "<value>"){{
                commerceCollection = new CommerceCollection(
                    "<value>",
                    "<value>"){{
                    createdAt = OffsetDateTime.parse("2023-06-14T12:03:57.982Z");
                    description = "Team-oriented intermediate interface";
                    isActive = false;
                    isFeatured = false;
                    isVisible = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "<value>"){{
                            url = "https://vivid-slump.com";
                        }}),
                    }};
                    publicDescription = "<value>";
                    publicName = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    type = CommerceCollectionType.SAVED_SEARCH;
                    updatedAt = OffsetDateTime.parse("2022-03-03T11:22:09.752Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionResponse res = sdk.collection.createCommerceCollection(req);

            if (res.commerceCollection != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionRequest](../../models/operations/CreateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionResponse](../../models/operations/CreateCommerceCollectionResponse.md)**


## getCommerceCollection

Retrieve a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionRequest req = new GetCommerceCollectionRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionResponse res = sdk.collection.getCommerceCollection(req);

            if (res.commerceCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionRequest](../../models/operations/GetCommerceCollectionRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionResponse](../../models/operations/GetCommerceCollectionResponse.md)**


## listCommerceCollections

List all collections

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsRequest req = new ListCommerceCollectionsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 2972.15d;
                offset = 5933.83d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                type = "<value>";
                updatedGte = OffsetDateTime.parse("2023-08-08T20:40:35.103Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsResponse res = sdk.collection.listCommerceCollections(req);

            if (res.commerceCollections != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsRequest](../../models/operations/ListCommerceCollectionsRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsResponse](../../models/operations/ListCommerceCollectionsResponse.md)**


## patchCommerceCollection

Update a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceCollection;
import com.unifiedapi.unifiedto.models.shared.CommerceCollectionType;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMedia;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMediaType;
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

            com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionRequest req = new PatchCommerceCollectionRequest(
                "<value>",
                "<value>"){{
                commerceCollection = new CommerceCollection(
                    "<value>",
                    "<value>"){{
                    createdAt = OffsetDateTime.parse("2022-12-27T01:30:16.292Z");
                    description = "Polarised solution-oriented analyzer";
                    isActive = false;
                    isFeatured = false;
                    isVisible = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "<value>"){{
                            url = "http://voluminous-airship.net";
                        }}),
                    }};
                    publicDescription = "<value>";
                    publicName = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    type = CommerceCollectionType.CATEGORY;
                    updatedAt = OffsetDateTime.parse("2023-08-29T23:35:48.700Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionResponse res = sdk.collection.patchCommerceCollection(req);

            if (res.commerceCollection != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionRequest](../../models/operations/PatchCommerceCollectionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionResponse](../../models/operations/PatchCommerceCollectionResponse.md)**


## removeCommerceCollection

Remove a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionRequest req = new RemoveCommerceCollectionRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionResponse res = sdk.collection.removeCommerceCollection(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionRequest](../../models/operations/RemoveCommerceCollectionRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionResponse](../../models/operations/RemoveCommerceCollectionResponse.md)**


## updateCommerceCollection

Update a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceCollection;
import com.unifiedapi.unifiedto.models.shared.CommerceCollectionType;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMedia;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMediaType;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionRequest req = new UpdateCommerceCollectionRequest(
                "<value>",
                "<value>"){{
                commerceCollection = new CommerceCollection(
                    "<value>",
                    "<value>"){{
                    createdAt = OffsetDateTime.parse("2024-07-30T10:24:18.569Z");
                    description = "Sharable dynamic solution";
                    isActive = false;
                    isFeatured = false;
                    isVisible = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "<value>"){{
                            url = "http://irritating-competence.com";
                        }}),
                    }};
                    publicDescription = "<value>";
                    publicName = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    type = CommerceCollectionType.COLLECTION;
                    updatedAt = OffsetDateTime.parse("2022-05-08T04:19:59.358Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionResponse res = sdk.collection.updateCommerceCollection(req);

            if (res.commerceCollection != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionRequest](../../models/operations/UpdateCommerceCollectionRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionResponse](../../models/operations/UpdateCommerceCollectionResponse.md)**

