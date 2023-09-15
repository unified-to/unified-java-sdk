# Martech

### Available Operations

* [deleteMartechConnectionIdListId](#deletemartechconnectionidlistid) - Remove a list
* [deleteMartechConnectionIdListIdMemberId](#deletemartechconnectionidlistidmemberid) - Remove member from a list
* [getMartechConnectionIdList](#getmartechconnectionidlist) - List all lists
* [getMartechConnectionIdListId](#getmartechconnectionidlistid) - Retrieve a list
* [getMartechConnectionIdListIdMember](#getmartechconnectionidlistidmember) - List all members in a list
* [getMartechConnectionIdListIdMemberId](#getmartechconnectionidlistidmemberid) - Retrieve a member from a list
* [patchMartechConnectionIdListId](#patchmartechconnectionidlistid) - Update a list
* [patchMartechConnectionIdListIdMemberId](#patchmartechconnectionidlistidmemberid) - Update a member in a list
* [postMartechConnectionIdList](#postmartechconnectionidlist) - Create a list
* [postMartechConnectionIdListIdMember](#postmartechconnectionidlistidmember) - Create a member in a list
* [putMartechConnectionIdListId](#putmartechconnectionidlistid) - Update a list
* [putMartechConnectionIdListIdMemberId](#putmartechconnectionidlistidmemberid) - Update a member in a list

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

            DeleteMartechConnectionIdListIdRequest req = new DeleteMartechConnectionIdListIdRequest("vel", "qui");            

            DeleteMartechConnectionIdListIdResponse res = sdk.martech.deleteMartechConnectionIdListId(req, new DeleteMartechConnectionIdListIdSecurity("perspiciatis") {{
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


## deleteMartechConnectionIdListIdMemberId

Remove member from a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteMartechConnectionIdListIdMemberIdRequest req = new DeleteMartechConnectionIdListIdMemberIdRequest("accusantium", "voluptatibus", "occaecati");            

            DeleteMartechConnectionIdListIdMemberIdResponse res = sdk.martech.deleteMartechConnectionIdListIdMemberId(req, new DeleteMartechConnectionIdListIdMemberIdSecurity("nemo") {{
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

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdRequest](../../models/operations/DeleteMartechConnectionIdListIdMemberIdRequest.md)   | :heavy_check_mark:                                                                                                                                                       | The request object to use for the request.                                                                                                                               |
| `security`                                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdSecurity](../../models/operations/DeleteMartechConnectionIdListIdMemberIdSecurity.md) | :heavy_check_mark:                                                                                                                                                       | The security requirements to use for the request.                                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdResponse](../../models/operations/DeleteMartechConnectionIdListIdMemberIdResponse.md)**


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

            GetMartechConnectionIdListRequest req = new GetMartechConnectionIdListRequest("quam") {{
                limit = 9704.91d;
                offset = 1997.04d;
                order = "laudantium";
                query = "nemo";
                sort = "ab";
                updatedGte = OffsetDateTime.parse("2021-10-07T22:54:11.070Z");
            }};            

            GetMartechConnectionIdListResponse res = sdk.martech.getMartechConnectionIdList(req, new GetMartechConnectionIdListSecurity("culpa") {{
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

            GetMartechConnectionIdListIdRequest req = new GetMartechConnectionIdListIdRequest("possimus", "molestiae");            

            GetMartechConnectionIdListIdResponse res = sdk.martech.getMartechConnectionIdListId(req, new GetMartechConnectionIdListIdSecurity("officiis") {{
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


## getMartechConnectionIdListIdMember

List all members in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberResponse;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetMartechConnectionIdListIdMemberRequest req = new GetMartechConnectionIdListIdMemberRequest("reiciendis", "voluptatum") {{
                limit = 462.26d;
                offset = 4448.16d;
                order = "animi";
                query = "officia";
                sort = "eveniet";
                updatedGte = OffsetDateTime.parse("2022-10-06T15:41:50.283Z");
            }};            

            GetMartechConnectionIdListIdMemberResponse res = sdk.martech.getMartechConnectionIdListIdMember(req, new GetMartechConnectionIdListIdMemberSecurity("hic") {{
                jwt = "";
            }});

            if (res.marketingMembers != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberRequest](../../models/operations/GetMartechConnectionIdListIdMemberRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberSecurity](../../models/operations/GetMartechConnectionIdListIdMemberSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberResponse](../../models/operations/GetMartechConnectionIdListIdMemberResponse.md)**


## getMartechConnectionIdListIdMemberId

Retrieve a member from a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetMartechConnectionIdListIdMemberIdRequest req = new GetMartechConnectionIdListIdMemberIdRequest("dolorem", "adipisci", "optio");            

            GetMartechConnectionIdListIdMemberIdResponse res = sdk.martech.getMartechConnectionIdListIdMemberId(req, new GetMartechConnectionIdListIdMemberIdSecurity("similique") {{
                jwt = "";
            }});

            if (res.marketingMember != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberIdRequest](../../models/operations/GetMartechConnectionIdListIdMemberIdRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberIdSecurity](../../models/operations/GetMartechConnectionIdListIdMemberIdSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberIdResponse](../../models/operations/GetMartechConnectionIdListIdMemberIdResponse.md)**


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

            PatchMartechConnectionIdListIdRequest req = new PatchMartechConnectionIdListIdRequest("odio", "unde") {{
                marketingList = new MarketingList() {{
                    createdAt = "asperiores";
                    id = "b9de4032-ba26-4fd3-a8ba-9216bcb41583";
                    name = "Marianne Koelpin";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2022-11-23T18:10:33.380Z");
                }};;
            }};            

            PatchMartechConnectionIdListIdResponse res = sdk.martech.patchMartechConnectionIdListId(req, new PatchMartechConnectionIdListIdSecurity("dignissimos") {{
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


## patchMartechConnectionIdListIdMemberId

Update a member in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdMemberIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdMemberIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdMemberIdSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingMemberRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchMartechConnectionIdListIdMemberIdRequest req = new PatchMartechConnectionIdListIdMemberIdRequest("quia", "ratione", "veritatis") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-10-22T18:09:50.221Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("rerum") {{
                            email = "Royal26@hotmail.com";
                            type = MarketingEmailType.HOME;
                        }}),
                    }};
                    id = "c5163bbc-a492-427c-82c2-2c55350495c5";
                    listIds = new String[]{{
                        add("facere"),
                    }};
                    name = "Roderick Fisher";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("reprehenderit"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-08-28T20:03:47.661Z");
                }};;
            }};            

            PatchMartechConnectionIdListIdMemberIdResponse res = sdk.martech.patchMartechConnectionIdListIdMemberId(req, new PatchMartechConnectionIdListIdMemberIdSecurity("voluptates") {{
                jwt = "";
            }});

            if (res.marketingMember != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdMemberIdRequest](../../models/operations/PatchMartechConnectionIdListIdMemberIdRequest.md)   | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `security`                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdMemberIdSecurity](../../models/operations/PatchMartechConnectionIdListIdMemberIdSecurity.md) | :heavy_check_mark:                                                                                                                                                     | The security requirements to use for the request.                                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdMemberIdResponse](../../models/operations/PatchMartechConnectionIdListIdMemberIdResponse.md)**


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

            PostMartechConnectionIdListRequest req = new PostMartechConnectionIdListRequest("tempora") {{
                marketingList = new MarketingList() {{
                    createdAt = "iste";
                    id = "81e8aa25-7ddc-4191-aebd-e64bfcc5469d";
                    name = "Maria Bradtke";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2021-01-01T22:35:27.825Z");
                }};;
            }};            

            PostMartechConnectionIdListResponse res = sdk.martech.postMartechConnectionIdList(req, new PostMartechConnectionIdListSecurity("esse") {{
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


## postMartechConnectionIdListIdMember

Create a member in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListIdMemberRequest;
import com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListIdMemberResponse;
import com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListIdMemberSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingMemberRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostMartechConnectionIdListIdMemberRequest req = new PostMartechConnectionIdListIdMemberRequest("iste", "ex") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-12-20T02:54:13.052Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("animi") {{
                            email = "Montana.Terry69@yahoo.com";
                            type = MarketingEmailType.WORK;
                        }}),
                    }};
                    id = "3e42c1aa-010e-49aa-82e9-135586d18f9f";
                    listIds = new String[]{{
                        add("sint"),
                    }};
                    name = "Genevieve Gerhold";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("fuga"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-08-02T17:10:52.899Z");
                }};;
            }};            

            PostMartechConnectionIdListIdMemberResponse res = sdk.martech.postMartechConnectionIdListIdMember(req, new PostMartechConnectionIdListIdMemberSecurity("nam") {{
                jwt = "";
            }});

            if (res.marketingMember != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListIdMemberRequest](../../models/operations/PostMartechConnectionIdListIdMemberRequest.md)   | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |
| `security`                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListIdMemberSecurity](../../models/operations/PostMartechConnectionIdListIdMemberSecurity.md) | :heavy_check_mark:                                                                                                                                               | The security requirements to use for the request.                                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListIdMemberResponse](../../models/operations/PostMartechConnectionIdListIdMemberResponse.md)**


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

            PutMartechConnectionIdListIdRequest req = new PutMartechConnectionIdListIdRequest("asperiores", "quam") {{
                marketingList = new MarketingList() {{
                    createdAt = "fugiat";
                    id = "67ca84ad-99b4-41d6-9243-531870cf68b0";
                    name = "Kristine Shields";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2022-04-20T01:03:40.880Z");
                }};;
            }};            

            PutMartechConnectionIdListIdResponse res = sdk.martech.putMartechConnectionIdListId(req, new PutMartechConnectionIdListIdSecurity("repellendus") {{
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


## putMartechConnectionIdListIdMemberId

Update a member in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdSecurity;
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingMemberRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutMartechConnectionIdListIdMemberIdRequest req = new PutMartechConnectionIdListIdMemberIdRequest("ut", "nesciunt", "facere") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-01-13T21:44:45.202Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("consequatur") {{
                            email = "Orie65@gmail.com";
                            type = MarketingEmailType.WORK;
                        }}),
                    }};
                    id = "03eb22d9-b3a7-40d9-8faa-741c57d1fedc";
                    listIds = new String[]{{
                        add("consequuntur"),
                    }};
                    name = "Audrey Bauch";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("quos"),
                    }};
                    updatedAt = OffsetDateTime.parse("2020-09-03T01:50:13.755Z");
                }};;
            }};            

            PutMartechConnectionIdListIdMemberIdResponse res = sdk.martech.putMartechConnectionIdListIdMemberId(req, new PutMartechConnectionIdListIdMemberIdSecurity("sequi") {{
                jwt = "";
            }});

            if (res.marketingMember != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdRequest](../../models/operations/PutMartechConnectionIdListIdMemberIdRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdSecurity](../../models/operations/PutMartechConnectionIdListIdMemberIdSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdResponse](../../models/operations/PutMartechConnectionIdListIdMemberIdResponse.md)**

