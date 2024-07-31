# Item
(*item*)

### Available Operations

* [createCommerceItem](#createcommerceitem) - Create an item
* [getCommerceItem](#getcommerceitem) - Retrieve an item
* [listCommerceItems](#listcommerceitems) - List all items
* [patchCommerceItem](#patchcommerceitem) - Update an item
* [removeCommerceItem](#removecommerceitem) - Remove an item
* [updateCommerceItem](#updatecommerceitem) - Update an item

## createCommerceItem

Create an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceItemRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceItemResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceItem;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMedia;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMediaType;
import com.unifiedapi.unifiedto.models.shared.CommerceItemOption;
import com.unifiedapi.unifiedto.models.shared.CommerceItemPrice;
import com.unifiedapi.unifiedto.models.shared.CommerceItemVariant;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.SizeUnit;
import com.unifiedapi.unifiedto.models.shared.WeightUnit;
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

            com.unifiedapi.unifiedto.models.operations.CreateCommerceItemRequest req = new CreateCommerceItemRequest(
                "<value>"){{
                commerceItem = new CommerceItem(
){{
                    collectionIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-06-27T05:28:51.414Z");
                    description = "Object-based local intranet";
                    id = "<id>";
                    isActive = false;
                    isTaxable = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "<value>"){{
                            url = "http://other-external.info";
                        }}),
                    }};
                    name = "<value>";
                    publicDescription = "<value>";
                    publicName = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    slug = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    type = "<value>";
                    updatedAt = OffsetDateTime.parse("2023-01-01T01:10:35.262Z");
                    variants = new com.unifiedapi.unifiedto.models.shared.CommerceItemVariant[]{{
                        add(new CommerceItemVariant(
                        ){{}}),
                    }};
                    vendorName = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceItemResponse res = sdk.item.createCommerceItem(req);

            if (res.commerceItem != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateCommerceItemRequest](../../models/operations/CreateCommerceItemRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCommerceItemResponse](../../models/operations/CreateCommerceItemResponse.md)**


## getCommerceItem

Retrieve an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCommerceItemRequest;
import com.unifiedapi.unifiedto.models.operations.GetCommerceItemResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetCommerceItemRequest req = new GetCommerceItemRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceItemResponse res = sdk.item.getCommerceItem(req);

            if (res.commerceItem != null) {
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
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCommerceItemRequest](../../models/operations/GetCommerceItemRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCommerceItemResponse](../../models/operations/GetCommerceItemResponse.md)**


## listCommerceItems

List all items

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCommerceItemsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCommerceItemsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListCommerceItemsRequest req = new ListCommerceItemsRequest(
                "<value>"){{
                collectionId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 2553.93d;
                offset = 4072.28d;
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-05-10T19:08:09.923Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceItemsResponse res = sdk.item.listCommerceItems(req);

            if (res.commerceItems != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListCommerceItemsRequest](../../models/operations/ListCommerceItemsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCommerceItemsResponse](../../models/operations/ListCommerceItemsResponse.md)**


## patchCommerceItem

Update an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceItemRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceItemResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceItem;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMedia;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMediaType;
import com.unifiedapi.unifiedto.models.shared.CommerceItemOption;
import com.unifiedapi.unifiedto.models.shared.CommerceItemPrice;
import com.unifiedapi.unifiedto.models.shared.CommerceItemVariant;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.SizeUnit;
import com.unifiedapi.unifiedto.models.shared.WeightUnit;
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

            com.unifiedapi.unifiedto.models.operations.PatchCommerceItemRequest req = new PatchCommerceItemRequest(
                "<value>",
                "<value>"){{
                commerceItem = new CommerceItem(
){{
                    collectionIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-06-21T03:47:22.544Z");
                    description = "Front-line explicit circuit";
                    id = "<id>";
                    isActive = false;
                    isTaxable = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "<value>"){{
                            url = "http://irresponsible-reason.biz";
                        }}),
                    }};
                    name = "<value>";
                    publicDescription = "<value>";
                    publicName = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    slug = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    type = "<value>";
                    updatedAt = OffsetDateTime.parse("2023-05-09T22:12:43.888Z");
                    variants = new com.unifiedapi.unifiedto.models.shared.CommerceItemVariant[]{{
                        add(new CommerceItemVariant(
                        ){{}}),
                    }};
                    vendorName = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceItemResponse res = sdk.item.patchCommerceItem(req);

            if (res.commerceItem != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchCommerceItemRequest](../../models/operations/PatchCommerceItemRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCommerceItemResponse](../../models/operations/PatchCommerceItemResponse.md)**


## removeCommerceItem

Remove an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceItemRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceItemResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceItemRequest req = new RemoveCommerceItemRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceItemResponse res = sdk.item.removeCommerceItem(req);

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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveCommerceItemRequest](../../models/operations/RemoveCommerceItemRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCommerceItemResponse](../../models/operations/RemoveCommerceItemResponse.md)**


## updateCommerceItem

Update an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceItemRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceItemResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceItem;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMedia;
import com.unifiedapi.unifiedto.models.shared.CommerceItemMediaType;
import com.unifiedapi.unifiedto.models.shared.CommerceItemOption;
import com.unifiedapi.unifiedto.models.shared.CommerceItemPrice;
import com.unifiedapi.unifiedto.models.shared.CommerceItemVariant;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.SizeUnit;
import com.unifiedapi.unifiedto.models.shared.WeightUnit;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceItemRequest req = new UpdateCommerceItemRequest(
                "<value>",
                "<value>"){{
                commerceItem = new CommerceItem(
){{
                    collectionIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-12-27T01:13:33.758Z");
                    description = "Advanced intangible toolset";
                    id = "<id>";
                    isActive = false;
                    isTaxable = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "<value>"){{
                            url = "https://reasonable-cast.biz";
                        }}),
                    }};
                    name = "<value>";
                    publicDescription = "<value>";
                    publicName = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    slug = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    type = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-07-17T00:14:33.118Z");
                    variants = new com.unifiedapi.unifiedto.models.shared.CommerceItemVariant[]{{
                        add(new CommerceItemVariant(
                        ){{}}),
                    }};
                    vendorName = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceItemResponse res = sdk.item.updateCommerceItem(req);

            if (res.commerceItem != null) {
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
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateCommerceItemRequest](../../models/operations/UpdateCommerceItemRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCommerceItemResponse](../../models/operations/UpdateCommerceItemResponse.md)**

