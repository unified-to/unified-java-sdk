# Deal
(*deal*)

### Available Operations

* [deleteCrmConnectionIdDealId](#deletecrmconnectioniddealid) - Remove a deal
* [getCrmConnectionIdDeal](#getcrmconnectioniddeal) - List all deals
* [getCrmConnectionIdDealId](#getcrmconnectioniddealid) - Retrieve a deal
* [patchCrmConnectionIdDealId](#patchcrmconnectioniddealid) - Update a deal
* [postCrmConnectionIdDeal](#postcrmconnectioniddeal) - Create a deal
* [putCrmConnectionIdDealId](#putcrmconnectioniddealid) - Update a deal

## deleteCrmConnectionIdDealId

Remove a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Concrete"){{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdDealIdRequest req = new DeleteCrmConnectionIdDealIdRequest("Tokelau", "Generic");            

            DeleteCrmConnectionIdDealIdResponse res = sdk.deal.deleteCrmConnectionIdDealId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdRequest](../../models/operations/DeleteCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdResponse](../../models/operations/DeleteCrmConnectionIdDealIdResponse.md)**


## getCrmConnectionIdDeal

List all deals

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("apud"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdDealRequest req = new GetCrmConnectionIdDealRequest("foreground"){{
                companyId = "Soul communities Renminbi";
                contactId = "till payment World";
                limit = 8656.16d;
                offset = 4455.8d;
                order = "global";
                query = "Program Bespoke Wisconsin";
                sort = "Netherlands under";
                updatedGte = OffsetDateTime.parse("2022-12-23T01:47:21.816Z");
            }};            

            GetCrmConnectionIdDealResponse res = sdk.deal.getCrmConnectionIdDeal(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealRequest](../../models/operations/GetCrmConnectionIdDealRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealResponse](../../models/operations/GetCrmConnectionIdDealResponse.md)**


## getCrmConnectionIdDealId

Retrieve a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Response"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdDealIdRequest req = new GetCrmConnectionIdDealIdRequest("Electric", "Practical");            

            GetCrmConnectionIdDealIdResponse res = sdk.deal.getCrmConnectionIdDealId(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdRequest](../../models/operations/GetCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdResponse](../../models/operations/GetCrmConnectionIdDealIdResponse.md)**


## patchCrmConnectionIdDealId

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bicycle"){{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdDealIdRequest req = new PatchCrmConnectionIdDealIdRequest("East", "North"){{
                crmDeal = new CrmDeal(){{
                    amount = 83.47d;
                    closedAt = OffsetDateTime.parse("2023-11-10T10:13:15.860Z");
                    createdAt = OffsetDateTime.parse("2022-09-06T02:31:05.722Z");
                    currency = "European Unit of Account 17(E.U.A.-17)";
                    id = "<ID>";
                    lostReason = "benchmark";
                    name = "Loan";
                    pipeline = "Cotton Blues ah";
                    probability = 263.43d;
                    raw = new PropertyCrmDealRaw();
                    source = "logistical transition Universal";
                    stage = "Investment Elegant kilogram";
                    tags = new String[]{{
                        add("Germanium"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-08-13T23:49:24.798Z");
                    wonReason = "West";
                }};
            }};            

            PatchCrmConnectionIdDealIdResponse res = sdk.deal.patchCrmConnectionIdDealId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdRequest](../../models/operations/PatchCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdResponse](../../models/operations/PatchCrmConnectionIdDealIdResponse.md)**


## postCrmConnectionIdDeal

Create a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("M2F"){{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdDealRequest req = new PostCrmConnectionIdDealRequest("programming"){{
                crmDeal = new CrmDeal(){{
                    amount = 2558.82d;
                    closedAt = OffsetDateTime.parse("2023-02-16T08:39:46.084Z");
                    createdAt = OffsetDateTime.parse("2021-12-12T19:23:52.754Z");
                    currency = "Canadian Dollar";
                    id = "<ID>";
                    lostReason = "payment";
                    name = "International";
                    pipeline = "Luxurious West";
                    probability = 867.08d;
                    raw = new PropertyCrmDealRaw();
                    source = "Account sometimes South";
                    stage = "intermediate Latin Cisgender";
                    tags = new String[]{{
                        add("input"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-01T07:39:00.559Z");
                    wonReason = "local Huntsville";
                }};
            }};            

            PostCrmConnectionIdDealResponse res = sdk.deal.postCrmConnectionIdDeal(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealRequest](../../models/operations/PostCrmConnectionIdDealRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealResponse](../../models/operations/PostCrmConnectionIdDealResponse.md)**


## putCrmConnectionIdDealId

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Account"){{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdDealIdRequest req = new PutCrmConnectionIdDealIdRequest("West", "laudantium"){{
                crmDeal = new CrmDeal(){{
                    amount = 1175.04d;
                    closedAt = OffsetDateTime.parse("2023-10-14T13:29:58.098Z");
                    createdAt = OffsetDateTime.parse("2022-10-24T03:12:54.428Z");
                    currency = "Zambian Kwacha";
                    id = "<ID>";
                    lostReason = "Developer magenta calculating";
                    name = "Gourde Chief";
                    pipeline = "program Nihonium Corporate";
                    probability = 4456.95d;
                    raw = new PropertyCrmDealRaw();
                    source = "Tasty extranet";
                    stage = "Unbranded";
                    tags = new String[]{{
                        add("Bangladesh"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-01T16:47:53.632Z");
                    wonReason = "deter Montana";
                }};
            }};            

            PutCrmConnectionIdDealIdResponse res = sdk.deal.putCrmConnectionIdDealId(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdRequest](../../models/operations/PutCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdResponse](../../models/operations/PutCrmConnectionIdDealIdResponse.md)**

