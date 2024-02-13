# Commerce
(*commerce*)

### Available Operations

* [createCommerceCollection](#createcommercecollection) - Create a collection
* [createCommerceInventory](#createcommerceinventory) - Create an inventory
* [createCommerceItem](#createcommerceitem) - Create an item
* [createCommerceLocation](#createcommercelocation) - Create a location
* [getCommerceCollection](#getcommercecollection) - Retrieve a collection
* [getCommerceInventory](#getcommerceinventory) - Retrieve an inventory
* [getCommerceItem](#getcommerceitem) - Retrieve an item
* [getCommerceLocation](#getcommercelocation) - Retrieve a location
* [listCommerceCollections](#listcommercecollections) - List all collections
* [listCommerceInventories](#listcommerceinventories) - List all inventories
* [listCommerceItems](#listcommerceitems) - List all items
* [listCommerceLocations](#listcommercelocations) - List all locations
* [patchCommerceCollection](#patchcommercecollection) - Update a collection
* [patchCommerceInventory](#patchcommerceinventory) - Update an inventory
* [patchCommerceItem](#patchcommerceitem) - Update an item
* [patchCommerceLocation](#patchcommercelocation) - Update a location
* [removeCommerceCollection](#removecommercecollection) - Remove a collection
* [removeCommerceInventory](#removecommerceinventory) - Remove an inventory
* [removeCommerceItem](#removecommerceitem) - Remove an item
* [removeCommerceLocation](#removecommercelocation) - Remove a location
* [updateCommerceCollection](#updatecommercecollection) - Update a collection
* [updateCommerceInventory](#updatecommerceinventory) - Update an inventory
* [updateCommerceItem](#updatecommerceitem) - Update an item
* [updateCommerceLocation](#updatecommercelocation) - Update a location

## createCommerceCollection

Create a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceCollection;
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
                "string"){{
                commerceCollection = new CommerceCollection(
                    "string",
                    "string"){{
                    createdAt = OffsetDateTime.parse("2023-06-14T12:03:57.982Z");
                    description = "Team-oriented intermediate interface";
                    isActive = false;
                    isFeatured = false;
                    isVisible = false;
                    itemIds = new String[]{{
                        add("string"),
                    }};
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "string"){{
                            url = "https://vivid-slump.com";
                        }}),
                    }};
                    publicDescription = "string";
                    publicName = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-08-15T05:40:39.031Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionResponse res = sdk.commerce.createCommerceCollection(req);

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


## createCommerceInventory

Create an inventory

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceInventory;
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

            com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryRequest req = new CreateCommerceInventoryRequest(
                "string"){{
                commerceInventory = new CommerceInventory(
                    5165.08d){{
                    id = "<ID>";
                    itemId = "string";
                    itemOptionId = "string";
                    itemVariantId = "string";
                    locationId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-01-31T03:08:58.995Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryResponse res = sdk.commerce.createCommerceInventory(req);

            if (res.commerceInventory != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryRequest](../../models/operations/CreateCommerceInventoryRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryResponse](../../models/operations/CreateCommerceInventoryResponse.md)**


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
                "string"){{
                commerceItem = new CommerceItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2023-06-27T05:28:51.414Z");
                    description = "Object-based local intranet";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "string"){{
                            url = "http://other-external.info";
                        }}),
                    }};
                    publicDescription = "string";
                    publicName = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    type = "string";
                    updatedAt = OffsetDateTime.parse("2023-01-01T01:10:35.262Z");
                    variants = new com.unifiedapi.unifiedto.models.shared.CommerceItemVariant[]{{
                        add(new CommerceItemVariant(
                        "string"){{
                            name = "string";
                        }}),
                    }};
                    vendorName = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceItemResponse res = sdk.commerce.createCommerceItem(req);

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


## createCommerceLocation

Create a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
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

            com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest req = new CreateCommerceLocationRequest(
                "string"){{
                commerceLocation = new CommerceLocation(
                    "string"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "North Marysecester";
                        country = "Maldives";
                        countryCode = "CU";
                        postalCode = "81935";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2024-01-11T11:46:34.114Z");
                    id = "<ID>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-08T09:24:33.872Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationResponse res = sdk.commerce.createCommerceLocation(req);

            if (res.commerceLocation != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationRequest](../../models/operations/CreateCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCommerceLocationResponse](../../models/operations/CreateCommerceLocationResponse.md)**


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
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceCollectionResponse res = sdk.commerce.getCommerceCollection(req);

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


## getCommerceInventory

Retrieve an inventory

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryRequest;
import com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryRequest req = new GetCommerceInventoryRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryResponse res = sdk.commerce.getCommerceInventory(req);

            if (res.commerceInventory != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryRequest](../../models/operations/GetCommerceInventoryRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryResponse](../../models/operations/GetCommerceInventoryResponse.md)**


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
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceItemResponse res = sdk.commerce.getCommerceItem(req);

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


## getCommerceLocation

Retrieve a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.GetCommerceLocationResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest req = new GetCommerceLocationRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceLocationResponse res = sdk.commerce.getCommerceLocation(req);

            if (res.commerceLocation != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest](../../models/operations/GetCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCommerceLocationResponse](../../models/operations/GetCommerceLocationResponse.md)**


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
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2972.15d;
                offset = 5933.83d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-08-08T20:40:35.103Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceCollectionsResponse res = sdk.commerce.listCommerceCollections(req);

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


## listCommerceInventories

List all inventories

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesRequest;
import com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesRequest req = new ListCommerceInventoriesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2481.16d;
                offset = 9476.38d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-10-15T22:28:16.925Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesResponse res = sdk.commerce.listCommerceInventories(req);

            if (res.commerceInventories != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesRequest](../../models/operations/ListCommerceInventoriesRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesResponse](../../models/operations/ListCommerceInventoriesResponse.md)**


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
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2553.93d;
                offset = 4072.28d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-05-10T19:08:09.923Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceItemsResponse res = sdk.commerce.listCommerceItems(req);

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


## listCommerceLocations

List all locations

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest req = new ListCommerceLocationsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2087.22d;
                offset = 1166.59d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-06-09T14:52:37.550Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsResponse res = sdk.commerce.listCommerceLocations(req);

            if (res.commerceLocations != null) {
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
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsRequest](../../models/operations/ListCommerceLocationsRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCommerceLocationsResponse](../../models/operations/ListCommerceLocationsResponse.md)**


## patchCommerceCollection

Update a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceCollection;
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
                "string",
                "string"){{
                commerceCollection = new CommerceCollection(
                    "string",
                    "string"){{
                    createdAt = OffsetDateTime.parse("2022-12-27T01:30:16.292Z");
                    description = "Polarised solution-oriented analyzer";
                    isActive = false;
                    isFeatured = false;
                    isVisible = false;
                    itemIds = new String[]{{
                        add("string"),
                    }};
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "string"){{
                            url = "http://voluminous-airship.net";
                        }}),
                    }};
                    publicDescription = "string";
                    publicName = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-11-07T01:43:06.402Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceCollectionResponse res = sdk.commerce.patchCommerceCollection(req);

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


## patchCommerceInventory

Update an inventory

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceInventory;
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

            com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryRequest req = new PatchCommerceInventoryRequest(
                "string",
                "string"){{
                commerceInventory = new CommerceInventory(
                    615.23d){{
                    id = "<ID>";
                    itemId = "string";
                    itemOptionId = "string";
                    itemVariantId = "string";
                    locationId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-21T06:26:02.606Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryResponse res = sdk.commerce.patchCommerceInventory(req);

            if (res.commerceInventory != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryRequest](../../models/operations/PatchCommerceInventoryRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryResponse](../../models/operations/PatchCommerceInventoryResponse.md)**


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
                "string",
                "string"){{
                commerceItem = new CommerceItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2023-06-21T03:47:22.544Z");
                    description = "Front-line explicit circuit";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "string"){{
                            url = "http://irresponsible-reason.biz";
                        }}),
                    }};
                    publicDescription = "string";
                    publicName = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    type = "string";
                    updatedAt = OffsetDateTime.parse("2023-05-09T22:12:43.888Z");
                    variants = new com.unifiedapi.unifiedto.models.shared.CommerceItemVariant[]{{
                        add(new CommerceItemVariant(
                        "string"){{
                            name = "string";
                        }}),
                    }};
                    vendorName = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceItemResponse res = sdk.commerce.patchCommerceItem(req);

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


## patchCommerceLocation

Update a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
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

            com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest req = new PatchCommerceLocationRequest(
                "string",
                "string"){{
                commerceLocation = new CommerceLocation(
                    "string"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Lonniefurt";
                        country = "Libyan Arab Jamahiriya";
                        countryCode = "KM";
                        postalCode = "64647";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-03-12T06:32:06.220Z");
                    id = "<ID>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-15T19:35:06.232Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationResponse res = sdk.commerce.patchCommerceLocation(req);

            if (res.commerceLocation != null) {
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
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest](../../models/operations/PatchCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationResponse](../../models/operations/PatchCommerceLocationResponse.md)**


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
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceCollectionResponse res = sdk.commerce.removeCommerceCollection(req);

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


## removeCommerceInventory

Remove an inventory

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryRequest req = new RemoveCommerceInventoryRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryResponse res = sdk.commerce.removeCommerceInventory(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryRequest](../../models/operations/RemoveCommerceInventoryRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryResponse](../../models/operations/RemoveCommerceInventoryResponse.md)**


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
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceItemResponse res = sdk.commerce.removeCommerceItem(req);

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


## removeCommerceLocation

Remove a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest req = new RemoveCommerceLocationRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationResponse res = sdk.commerce.removeCommerceLocation(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationRequest](../../models/operations/RemoveCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCommerceLocationResponse](../../models/operations/RemoveCommerceLocationResponse.md)**


## updateCommerceCollection

Update a collection

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceCollection;
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
                "string",
                "string"){{
                commerceCollection = new CommerceCollection(
                    "string",
                    "string"){{
                    createdAt = OffsetDateTime.parse("2024-07-30T10:24:18.569Z");
                    description = "Sharable dynamic solution";
                    isActive = false;
                    isFeatured = false;
                    isVisible = false;
                    itemIds = new String[]{{
                        add("string"),
                    }};
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "string"){{
                            url = "http://irritating-competence.com";
                        }}),
                    }};
                    publicDescription = "string";
                    publicName = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-03T01:49:37.651Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionResponse res = sdk.commerce.updateCommerceCollection(req);

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


## updateCommerceInventory

Update an inventory

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceInventory;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryRequest req = new UpdateCommerceInventoryRequest(
                "string",
                "string"){{
                commerceInventory = new CommerceInventory(
                    9360.02d){{
                    id = "<ID>";
                    itemId = "string";
                    itemOptionId = "string";
                    itemVariantId = "string";
                    locationId = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-08-11T01:00:50.639Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryResponse res = sdk.commerce.updateCommerceInventory(req);

            if (res.commerceInventory != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryRequest](../../models/operations/UpdateCommerceInventoryRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryResponse](../../models/operations/UpdateCommerceInventoryResponse.md)**


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
                "string",
                "string"){{
                commerceItem = new CommerceItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2023-12-27T01:13:33.758Z");
                    description = "Advanced intangible toolset";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    media = new com.unifiedapi.unifiedto.models.shared.CommerceItemMedia[]{{
                        add(new CommerceItemMedia(
                        "string"){{
                            url = "https://reasonable-cast.biz";
                        }}),
                    }};
                    publicDescription = "string";
                    publicName = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    type = "string";
                    updatedAt = OffsetDateTime.parse("2024-07-17T00:14:33.118Z");
                    variants = new com.unifiedapi.unifiedto.models.shared.CommerceItemVariant[]{{
                        add(new CommerceItemVariant(
                        "string"){{
                            name = "string";
                        }}),
                    }};
                    vendorName = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceItemResponse res = sdk.commerce.updateCommerceItem(req);

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


## updateCommerceLocation

Update a location

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse;
import com.unifiedapi.unifiedto.models.shared.CommerceLocation;
import com.unifiedapi.unifiedto.models.shared.PropertyCommerceLocationAddress;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest req = new UpdateCommerceLocationRequest(
                "string",
                "string"){{
                commerceLocation = new CommerceLocation(
                    "string"){{
                    address = new PropertyCommerceLocationAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Stillwater";
                        country = "Sierra Leone";
                        countryCode = "AL";
                        postalCode = "49876-8332";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2022-04-19T11:29:36.755Z");
                    id = "<ID>";
                    isActive = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-11T12:53:41.097Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse res = sdk.commerce.updateCommerceLocation(req);

            if (res.commerceLocation != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationRequest](../../models/operations/UpdateCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCommerceLocationResponse](../../models/operations/UpdateCommerceLocationResponse.md)**

