# Deal
(*deal*)

### Available Operations

* [createCrmDeal](#createcrmdeal) - Create a deal
* [getCrmDeal](#getcrmdeal) - Retrieve a deal
* [listCrmDeals](#listcrmdeals) - List all deals
* [patchCrmDeal](#patchcrmdeal) - Update a deal
* [removeCrmDeal](#removecrmdeal) - Remove a deal
* [updateCrmDeal](#updatecrmdeal) - Update a deal

## createCrmDeal

Create a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmDealResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
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

            com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest req = new CreateCrmDealRequest(
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 1917.45d;
                    closedAt = OffsetDateTime.parse("2023-08-28T04:18:49.785Z");
                    createdAt = OffsetDateTime.parse("2023-07-23T15:31:52.925Z");
                    currency = "Cuban Peso";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 1087.81d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-13T19:43:32.331Z");
                    userId = "string";
                    wonReason = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmDealResponse res = sdk.deal.createCrmDeal(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest](../../models/operations/CreateCrmDealRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmDealResponse](../../models/operations/CreateCrmDealResponse.md)**


## getCrmDeal

Retrieve a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmDealResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest req = new GetCrmDealRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmDealResponse res = sdk.deal.getCrmDeal(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest](../../models/operations/GetCrmDealRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmDealResponse](../../models/operations/GetCrmDealResponse.md)**


## listCrmDeals

List all deals

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmDealsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest req = new ListCrmDealsRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 917.49d;
                offset = 8216.92d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-09-04T01:39:26.472Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmDealsResponse res = sdk.deal.listCrmDeals(req);

            if (res.crmDeals != null) {
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
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest](../../models/operations/ListCrmDealsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmDealsResponse](../../models/operations/ListCrmDealsResponse.md)**


## patchCrmDeal

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmDealResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
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

            com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest req = new PatchCrmDealRequest(
                "string",
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 9874.05d;
                    closedAt = OffsetDateTime.parse("2022-07-09T12:57:05.527Z");
                    createdAt = OffsetDateTime.parse("2023-04-30T17:40:39.112Z");
                    currency = "Riel";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 9555.58d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-02-22T07:49:20.306Z");
                    userId = "string";
                    wonReason = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmDealResponse res = sdk.deal.patchCrmDeal(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest](../../models/operations/PatchCrmDealRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmDealResponse](../../models/operations/PatchCrmDealResponse.md)**


## removeCrmDeal

Remove a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmDealResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest req = new RemoveCrmDealRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmDealResponse res = sdk.deal.removeCrmDeal(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest](../../models/operations/RemoveCrmDealRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmDealResponse](../../models/operations/RemoveCrmDealResponse.md)**


## updateCrmDeal

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmDealResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest req = new UpdateCrmDealRequest(
                "string",
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 854.3d;
                    closedAt = OffsetDateTime.parse("2023-01-13T15:21:09.134Z");
                    createdAt = OffsetDateTime.parse("2022-11-20T23:55:13.334Z");
                    currency = "Pound Sterling";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 2970.01d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-02-01T00:17:19.942Z");
                    userId = "string";
                    wonReason = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmDealResponse res = sdk.deal.updateCrmDeal(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest](../../models/operations/UpdateCrmDealRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmDealResponse](../../models/operations/UpdateCrmDealResponse.md)**

