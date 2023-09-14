# deal

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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdDealIdRequest req = new DeleteCrmConnectionIdDealIdRequest("reiciendis", "voluptate");            

            DeleteCrmConnectionIdDealIdResponse res = sdk.deal.deleteCrmConnectionIdDealId(req, new DeleteCrmConnectionIdDealIdSecurity("tempore") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdRequest](../../models/operations/DeleteCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdSecurity](../../models/operations/DeleteCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdDealRequest req = new GetCrmConnectionIdDealRequest("in") {{
                companyId = "omnis";
                contactId = "possimus";
                limit = 9503.37d;
                offset = 9238.79d;
                order = "expedita";
                query = "iusto";
                sort = "esse";
                updatedGte = OffsetDateTime.parse("2022-05-11T04:37:28.493Z");
            }};            

            GetCrmConnectionIdDealResponse res = sdk.deal.getCrmConnectionIdDeal(req, new GetCrmConnectionIdDealSecurity("quod") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealRequest](../../models/operations/GetCrmConnectionIdDealRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealSecurity](../../models/operations/GetCrmConnectionIdDealSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdDealIdRequest req = new GetCrmConnectionIdDealIdRequest("ratione", "totam");            

            GetCrmConnectionIdDealIdResponse res = sdk.deal.getCrmConnectionIdDealId(req, new GetCrmConnectionIdDealIdSecurity("vero") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdRequest](../../models/operations/GetCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdSecurity](../../models/operations/GetCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdDealIdRequest req = new PatchCrmConnectionIdDealIdRequest("dolore", "nam") {{
                crmDeal = new CrmDeal() {{
                    amount = 6380.85d;
                    closedAt = OffsetDateTime.parse("2021-03-31T07:19:57.193Z");
                    createdAt = OffsetDateTime.parse("2022-02-05T22:18:34.745Z");
                    currency = "enim";
                    id = "06ef890a-54b4-475f-96f5-6d385a3c4ac6";
                    lostReason = "adipisci";
                    name = "Luz McClure";
                    pipeline = "fugit";
                    probability = 4188.92d;
                    raw = new PropertyCrmDealRaw();;
                    source = "optio";
                    stage = "eveniet";
                    tags = new String[]{{
                        add("fugiat"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-02-02T03:05:58.880Z");
                    wonReason = "natus";
                }};;
            }};            

            PatchCrmConnectionIdDealIdResponse res = sdk.deal.patchCrmConnectionIdDealId(req, new PatchCrmConnectionIdDealIdSecurity("sapiente") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdRequest](../../models/operations/PatchCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdSecurity](../../models/operations/PatchCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdDealRequest req = new PostCrmConnectionIdDealRequest("repellendus") {{
                crmDeal = new CrmDeal() {{
                    amount = 7063.71d;
                    closedAt = OffsetDateTime.parse("2022-06-02T07:38:36.555Z");
                    createdAt = OffsetDateTime.parse("2022-12-18T03:53:36.869Z");
                    currency = "maiores";
                    id = "63bbf817-837b-401a-bdd7-88624189eb44";
                    lostReason = "blanditiis";
                    name = "Kim Williamson I";
                    pipeline = "consectetur";
                    probability = 9905.4d;
                    raw = new PropertyCrmDealRaw();;
                    source = "architecto";
                    stage = "sint";
                    tags = new String[]{{
                        add("possimus"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-01-06T15:53:40.796Z");
                    wonReason = "quasi";
                }};;
            }};            

            PostCrmConnectionIdDealResponse res = sdk.deal.postCrmConnectionIdDeal(req, new PostCrmConnectionIdDealSecurity("consequuntur") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealRequest](../../models/operations/PostCrmConnectionIdDealRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealSecurity](../../models/operations/PostCrmConnectionIdDealSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdDealIdRequest req = new PutCrmConnectionIdDealIdRequest("nemo", "nobis") {{
                crmDeal = new CrmDeal() {{
                    amount = 8926.4d;
                    closedAt = OffsetDateTime.parse("2022-12-01T04:19:12.078Z");
                    createdAt = OffsetDateTime.parse("2022-11-01T14:22:00.104Z");
                    currency = "itaque";
                    id = "ab9cd7e5-224a-46a0-a123-b7847ec59e1f";
                    lostReason = "autem";
                    name = "Jaime Farrell";
                    pipeline = "optio";
                    probability = 7763.34d;
                    raw = new PropertyCrmDealRaw();;
                    source = "repudiandae";
                    stage = "tempora";
                    tags = new String[]{{
                        add("libero"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-25T11:39:14.701Z");
                    wonReason = "iusto";
                }};;
            }};            

            PutCrmConnectionIdDealIdResponse res = sdk.deal.putCrmConnectionIdDealId(req, new PutCrmConnectionIdDealIdSecurity("aliquid") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdRequest](../../models/operations/PutCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdSecurity](../../models/operations/PutCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdResponse](../../models/operations/PutCrmConnectionIdDealIdResponse.md)**

