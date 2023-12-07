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
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest req = new CreateCrmDealRequest(
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 1917.45d;
                    closedAt = OffsetDateTime.parse("2022-08-27T15:05:01.017Z");
                    createdAt = OffsetDateTime.parse("2022-07-23T03:04:45.267Z");
                    currency = "Cuban Peso";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 1087.81d;
                    raw = new PropertyCrmDealRaw(
);
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-13T05:28:26.663Z");
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
                "string"){{
                    jwt = "";
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
                "string"){{
                    jwt = "";
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
                updatedGte = OffsetDateTime.parse("2022-09-03T12:16:34.604Z");

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
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest req = new PatchCrmDealRequest(
                "string",
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 9874.05d;
                    closedAt = OffsetDateTime.parse("2021-07-09T08:48:03.715Z");
                    createdAt = OffsetDateTime.parse("2022-04-30T07:03:46.302Z");
                    currency = "Riel";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 9555.58d;
                    raw = new PropertyCrmDealRaw(
);
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-02-21T14:41:27.897Z");
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
                "string"){{
                    jwt = "";
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
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                "string"){{
                    jwt = "";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest req = new UpdateCrmDealRequest(
                "string",
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 854.3d;
                    closedAt = OffsetDateTime.parse("2022-01-13T07:04:58.998Z");
                    createdAt = OffsetDateTime.parse("2021-11-20T16:49:31.989Z");
                    currency = "Pound Sterling";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 2970.01d;
                    raw = new PropertyCrmDealRaw(
);
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-31T15:37:01.475Z");
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

