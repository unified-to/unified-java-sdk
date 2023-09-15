# List

### Available Operations

* [deleteMartechConnectionIdListId](#deletemartechconnectionidlistid) - Remove a list
* [getMartechConnectionIdList](#getmartechconnectionidlist) - List all lists
* [getMartechConnectionIdListId](#getmartechconnectionidlistid) - Retrieve a list
* [patchMartechConnectionIdListId](#patchmartechconnectionidlistid) - Update a list
* [postMartechConnectionIdList](#postmartechconnectionidlist) - Create a list
* [putMartechConnectionIdListId](#putmartechconnectionidlistid) - Update a list

## deleteMartechConnectionIdListId

Remove a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteMartechConnectionIdListIdRequest req = new DeleteMartechConnectionIdListIdRequest("sit", "labore");            

            DeleteMartechConnectionIdListIdResponse res = sdk.list.deleteMartechConnectionIdListId(req, new DeleteMartechConnectionIdListIdSecurity("ullam") {{
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdRequest](../../models/operations/DeleteMartechConnectionIdListIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdSecurity](../../models/operations/DeleteMartechConnectionIdListIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdResponse](../../models/operations/DeleteMartechConnectionIdListIdResponse.md)**


## getMartechConnectionIdList

List all lists

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListResponse;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetMartechConnectionIdListRequest req = new GetMartechConnectionIdListRequest("excepturi") {{
                limit = 7463.15d;
                offset = 9146.95d;
                order = "rerum";
                query = "cum";
                sort = "est";
                updatedGte = OffsetDateTime.parse("2022-12-08T11:45:26.358Z");
            }};            

            GetMartechConnectionIdListResponse res = sdk.list.getMartechConnectionIdList(req, new GetMartechConnectionIdListSecurity("qui") {{
                jwt = "";
            }});

            if (res.marketingLists != null) {
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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListRequest](../../models/operations/GetMartechConnectionIdListRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListSecurity](../../models/operations/GetMartechConnectionIdListSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListResponse](../../models/operations/GetMartechConnectionIdListResponse.md)**


## getMartechConnectionIdListId

Retrieve a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetMartechConnectionIdListIdRequest req = new GetMartechConnectionIdListIdRequest("tenetur", "sunt");            

            GetMartechConnectionIdListIdResponse res = sdk.list.getMartechConnectionIdListId(req, new GetMartechConnectionIdListIdSecurity("quis") {{
                jwt = "";
            }});

            if (res.marketingList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdRequest](../../models/operations/GetMartechConnectionIdListIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdSecurity](../../models/operations/GetMartechConnectionIdListIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdResponse](../../models/operations/GetMartechConnectionIdListIdResponse.md)**


## patchMartechConnectionIdListId

Update a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingListRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchMartechConnectionIdListIdRequest req = new PatchMartechConnectionIdListIdRequest("corrupti", "iure") {{
                marketingList = new MarketingList() {{
                    createdAt = "quidem";
                    id = "cf152558-daa9-45be-acd0-2756c354aa43";
                    name = "Celia Gutkowski";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2022-07-16T18:39:49.107Z");
                }};;
            }};            

            PatchMartechConnectionIdListIdResponse res = sdk.list.patchMartechConnectionIdListId(req, new PatchMartechConnectionIdListIdSecurity("ex") {{
                jwt = "";
            }});

            if (res.marketingList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdRequest](../../models/operations/PatchMartechConnectionIdListIdRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdSecurity](../../models/operations/PatchMartechConnectionIdListIdSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdResponse](../../models/operations/PatchMartechConnectionIdListIdResponse.md)**


## postMartechConnectionIdList

Create a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListRequest;
import com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListResponse;
import com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingListRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostMartechConnectionIdListRequest req = new PostMartechConnectionIdListRequest("amet") {{
                marketingList = new MarketingList() {{
                    createdAt = "minus";
                    id = "5208c23e-9802-4d82-b0d4-5eb4a8b674ee";
                    name = "Rosalie Windler IV";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2020-07-11T18:38:06.473Z");
                }};;
            }};            

            PostMartechConnectionIdListResponse res = sdk.list.postMartechConnectionIdList(req, new PostMartechConnectionIdListSecurity("optio") {{
                jwt = "";
            }});

            if (res.marketingList != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListRequest](../../models/operations/PostMartechConnectionIdListRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListSecurity](../../models/operations/PostMartechConnectionIdListSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListResponse](../../models/operations/PostMartechConnectionIdListResponse.md)**


## putMartechConnectionIdListId

Update a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingListRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutMartechConnectionIdListIdRequest req = new PutMartechConnectionIdListIdRequest("esse", "a") {{
                marketingList = new MarketingList() {{
                    createdAt = "quam";
                    id = "87e32e04-b3d3-4ed0-8567-0ef42bd3c9f1";
                    name = "Mrs. Colin Harris";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2022-03-14T11:41:30.046Z");
                }};;
            }};            

            PutMartechConnectionIdListIdResponse res = sdk.list.putMartechConnectionIdListId(req, new PutMartechConnectionIdListIdSecurity("nesciunt") {{
                jwt = "";
            }});

            if (res.marketingList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdRequest](../../models/operations/PutMartechConnectionIdListIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdSecurity](../../models/operations/PutMartechConnectionIdListIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdResponse](../../models/operations/PutMartechConnectionIdListIdResponse.md)**

