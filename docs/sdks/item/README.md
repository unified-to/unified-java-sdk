# Item
(*item*)

### Available Operations

* [createAccountingItem](#createaccountingitem) - Create an item
* [getAccountingItem](#getaccountingitem) - Retrieve an item
* [listAccountingItems](#listaccountingitems) - List all items
* [patchAccountingItem](#patchaccountingitem) - Update an item
* [removeAccountingItem](#removeaccountingitem) - Remove an item
* [updateAccountingItem](#updateaccountingitem) - Update an item

## createAccountingItem

Create an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingItemResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingItem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingItemRaw;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingItemRequest req = new CreateAccountingItemRequest(
                "string"){{
                accountingItem = new AccountingItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2022-11-04T21:45:18.227Z");
                    description = "Team-oriented grid-enabled open system";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    price = 8182.36d;
                    publicDescription = "string";
                    quantityOnHand = 9042.97d;
                    raw = new PropertyAccountingItemRaw(
);
                    sku = "string";
                    updatedAt = OffsetDateTime.parse("2024-04-05T08:21:06.807Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingItemResponse res = sdk.item.createAccountingItem(req);

            if (res.accountingItem != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateAccountingItemRequest](../../models/operations/CreateAccountingItemRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingItemResponse](../../models/operations/CreateAccountingItemResponse.md)**


## getAccountingItem

Retrieve an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingItemResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingItemRequest req = new GetAccountingItemRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingItemResponse res = sdk.item.getAccountingItem(req);

            if (res.accountingItem != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAccountingItemRequest](../../models/operations/GetAccountingItemRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingItemResponse](../../models/operations/GetAccountingItemResponse.md)**


## listAccountingItems

List all items

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingItemsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingItemsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingItemsRequest req = new ListAccountingItemsRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 5739.49d;
                offset = 6744.69d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-11-10T17:07:55.262Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingItemsResponse res = sdk.item.listAccountingItems(req);

            if (res.accountingItems != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAccountingItemsRequest](../../models/operations/ListAccountingItemsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingItemsResponse](../../models/operations/ListAccountingItemsResponse.md)**


## patchAccountingItem

Update an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingItemResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingItem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingItemRaw;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingItemRequest req = new PatchAccountingItemRequest(
                "string",
                "string"){{
                accountingItem = new AccountingItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2022-09-12T01:22:35.181Z");
                    description = "Operative coherent forecast";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    price = 1007.53d;
                    publicDescription = "string";
                    quantityOnHand = 3510.34d;
                    raw = new PropertyAccountingItemRaw(
);
                    sku = "string";
                    updatedAt = OffsetDateTime.parse("2023-11-19T01:12:30.848Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingItemResponse res = sdk.item.patchAccountingItem(req);

            if (res.accountingItem != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchAccountingItemRequest](../../models/operations/PatchAccountingItemRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingItemResponse](../../models/operations/PatchAccountingItemResponse.md)**


## removeAccountingItem

Remove an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemRequest req = new RemoveAccountingItemRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemResponse res = sdk.item.removeAccountingItem(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemRequest](../../models/operations/RemoveAccountingItemRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingItemResponse](../../models/operations/RemoveAccountingItemResponse.md)**


## updateAccountingItem

Update an item

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingItem;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingItemRaw;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemRequest req = new UpdateAccountingItemRequest(
                "string",
                "string"){{
                accountingItem = new AccountingItem(
                    "string"){{
                    createdAt = OffsetDateTime.parse("2022-03-31T23:31:53.009Z");
                    description = "Programmable modular artificial intelligence";
                    id = "<ID>";
                    isActive = false;
                    isTaxable = false;
                    price = 3314.34d;
                    publicDescription = "string";
                    quantityOnHand = 9226.47d;
                    raw = new PropertyAccountingItemRaw(
);
                    sku = "string";
                    updatedAt = OffsetDateTime.parse("2022-12-09T06:37:51.326Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemResponse res = sdk.item.updateAccountingItem(req);

            if (res.accountingItem != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemRequest](../../models/operations/UpdateAccountingItemRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingItemResponse](../../models/operations/UpdateAccountingItemResponse.md)**

