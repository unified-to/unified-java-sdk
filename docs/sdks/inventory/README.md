# Inventory
(*inventory*)

### Available Operations

* [createCommerceInventory](#createcommerceinventory) - Create an inventory
* [getCommerceInventory](#getcommerceinventory) - Retrieve an inventory
* [listCommerceInventories](#listcommerceinventories) - List all inventories
* [patchCommerceInventory](#patchcommerceinventory) - Update an inventory
* [removeCommerceInventory](#removecommerceinventory) - Remove an inventory
* [updateCommerceInventory](#updatecommerceinventory) - Update an inventory

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
                "<value>"){{
                commerceInventory = new CommerceInventory(
                    5165.08d){{
                    id = "<id>";
                    itemId = "<value>";
                    itemOptionId = "<value>";
                    itemVariantId = "<value>";
                    locationId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-01-31T03:08:58.995Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryResponse res = sdk.inventory.createCommerceInventory(req);

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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryResponse res = sdk.inventory.getCommerceInventory(req);

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
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                itemVariantId = "<value>";
                limit = 2481.16d;
                locationId = "<value>";
                offset = 9476.38d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-10-15T22:28:16.925Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesResponse res = sdk.inventory.listCommerceInventories(req);

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
                "<value>",
                "<value>"){{
                commerceInventory = new CommerceInventory(
                    615.23d){{
                    id = "<id>";
                    itemId = "<value>";
                    itemOptionId = "<value>";
                    itemVariantId = "<value>";
                    locationId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-21T06:26:02.606Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryResponse res = sdk.inventory.patchCommerceInventory(req);

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
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryResponse res = sdk.inventory.removeCommerceInventory(req);

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
                "<value>",
                "<value>"){{
                commerceInventory = new CommerceInventory(
                    9360.02d){{
                    id = "<id>";
                    itemId = "<value>";
                    itemOptionId = "<value>";
                    itemVariantId = "<value>";
                    locationId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-08-11T01:00:50.639Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryResponse res = sdk.inventory.updateCommerceInventory(req);

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

