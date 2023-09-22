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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("adipisci") {{
                    jwt = "";
                }})
                .build();

            DeleteMartechConnectionIdListIdRequest req = new DeleteMartechConnectionIdListIdRequest("hic", "dolorem");            

            DeleteMartechConnectionIdListIdResponse res = sdk.martech.deleteMartechConnectionIdListId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdRequest](../../models/operations/DeleteMartechConnectionIdListIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("adipisci") {{
                    jwt = "";
                }})
                .build();

            DeleteMartechConnectionIdListIdMemberIdRequest req = new DeleteMartechConnectionIdListIdMemberIdRequest("optio", "similique", "odio");            

            DeleteMartechConnectionIdListIdMemberIdResponse res = sdk.martech.deleteMartechConnectionIdListIdMemberId(req);

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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdRequest](../../models/operations/DeleteMartechConnectionIdListIdMemberIdRequest.md) | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("unde") {{
                    jwt = "";
                }})
                .build();

            GetMartechConnectionIdListRequest req = new GetMartechConnectionIdListRequest("asperiores") {{
                limit = 7216.95d;
                offset = 5891.24d;
                order = "fugiat";
                query = "recusandae";
                sort = "non";
                updatedGte = OffsetDateTime.parse("2022-10-17T11:20:49.691Z");
            }};            

            GetMartechConnectionIdListResponse res = sdk.martech.getMartechConnectionIdList(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListRequest](../../models/operations/GetMartechConnectionIdListRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quia") {{
                    jwt = "";
                }})
                .build();

            GetMartechConnectionIdListIdRequest req = new GetMartechConnectionIdListIdRequest("soluta", "fuga");            

            GetMartechConnectionIdListIdResponse res = sdk.martech.getMartechConnectionIdListId(req);

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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdRequest](../../models/operations/GetMartechConnectionIdListIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("qui") {{
                    jwt = "";
                }})
                .build();

            GetMartechConnectionIdListIdMemberRequest req = new GetMartechConnectionIdListIdMemberRequest("commodi", "a") {{
                limit = 8359.65d;
                offset = 1972.56d;
                order = "eum";
                query = "rem";
                sort = "expedita";
                updatedGte = OffsetDateTime.parse("2021-11-13T16:52:34.700Z");
            }};            

            GetMartechConnectionIdListIdMemberResponse res = sdk.martech.getMartechConnectionIdListIdMember(req);

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberRequest](../../models/operations/GetMartechConnectionIdListIdMemberRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("dolores") {{
                    jwt = "";
                }})
                .build();

            GetMartechConnectionIdListIdMemberIdRequest req = new GetMartechConnectionIdListIdMemberIdRequest("dicta", "laboriosam", "distinctio");            

            GetMartechConnectionIdListIdMemberIdResponse res = sdk.martech.getMartechConnectionIdListIdMemberId(req);

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
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberIdRequest](../../models/operations/GetMartechConnectionIdListIdMemberIdRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingListRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quo") {{
                    jwt = "";
                }})
                .build();

            PatchMartechConnectionIdListIdRequest req = new PatchMartechConnectionIdListIdRequest("facilis", "magnam") {{
                marketingList = new MarketingList() {{
                    createdAt = "dicta";
                    id = "5835c736-4172-4313-bedc-046bc5163bbc";
                    name = "Ray Maggio";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2022-03-16T23:54:29.838Z");
                }};;
            }};            

            PatchMartechConnectionIdListIdResponse res = sdk.martech.patchMartechConnectionIdListId(req);

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdRequest](../../models/operations/PatchMartechConnectionIdListIdRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingMemberRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("non") {{
                    jwt = "";
                }})
                .build();

            PatchMartechConnectionIdListIdMemberIdRequest req = new PatchMartechConnectionIdListIdMemberIdRequest("odit", "maxime", "aspernatur") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-03-16T19:29:34.509Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("cupiditate") {{
                            email = "Frida3@gmail.com";
                            type = MarketingEmailType.WORK;
                        }}),
                    }};
                    id = "5c5dbb3c-57c1-4e49-81e8-aa257ddc1912";
                    listIds = new String[]{{
                        add("earum"),
                    }};
                    name = "Josh Tremblay";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("nam"),
                    }};
                    updatedAt = OffsetDateTime.parse("2020-08-25T03:12:50.028Z");
                }};;
            }};            

            PatchMartechConnectionIdListIdMemberIdResponse res = sdk.martech.patchMartechConnectionIdListIdMemberId(req);

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchMartechConnectionIdListIdMemberIdRequest](../../models/operations/PatchMartechConnectionIdListIdMemberIdRequest.md) | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingListRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("impedit") {{
                    jwt = "";
                }})
                .build();

            PostMartechConnectionIdListRequest req = new PostMartechConnectionIdListRequest("veniam") {{
                marketingList = new MarketingList() {{
                    createdAt = "magnam";
                    id = "69d4015d-fa79-4620-abef-2b0a3e42c1aa";
                    name = "Pamela Auer";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2021-09-25T16:42:58.940Z");
                }};;
            }};            

            PostMartechConnectionIdListResponse res = sdk.martech.postMartechConnectionIdList(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListRequest](../../models/operations/PostMartechConnectionIdListRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingMemberRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quo") {{
                    jwt = "";
                }})
                .build();

            PostMartechConnectionIdListIdMemberRequest req = new PostMartechConnectionIdListIdMemberRequest("sunt", "necessitatibus") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-11-01T16:02:43.804Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("dicta") {{
                            email = "Ethyl.Hauck@gmail.com";
                            type = MarketingEmailType.OTHER;
                        }}),
                    }};
                    id = "8f9f97a4-bfad-42bf-bd67-ca84ad99b41d";
                    listIds = new String[]{{
                        add("voluptas"),
                    }};
                    name = "Sara Funk";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("nesciunt"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-07-01T06:53:47.405Z");
                }};;
            }};            

            PostMartechConnectionIdListIdMemberResponse res = sdk.martech.postMartechConnectionIdListIdMember(req);

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PostMartechConnectionIdListIdMemberRequest](../../models/operations/PostMartechConnectionIdListIdMemberRequest.md) | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.MarketingList;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingListRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quam") {{
                    jwt = "";
                }})
                .build();

            PutMartechConnectionIdListIdRequest req = new PutMartechConnectionIdListIdRequest("perferendis", "cumque") {{
                marketingList = new MarketingList() {{
                    createdAt = "delectus";
                    id = "68b03ad4-21bd-443d-9f0c-b0a0003eb22d";
                    name = "Garry Effertz";
                    raw = new PropertyMarketingListRaw();;
                    updatedAt = OffsetDateTime.parse("2022-02-18T09:22:26.126Z");
                }};;
            }};            

            PutMartechConnectionIdListIdResponse res = sdk.martech.putMartechConnectionIdListId(req);

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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdRequest](../../models/operations/PutMartechConnectionIdListIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.MarketingEmail;
import com.unifiedapi.unifiedto.models.shared.MarketingEmailType;
import com.unifiedapi.unifiedto.models.shared.MarketingMember;
import com.unifiedapi.unifiedto.models.shared.PropertyMarketingMemberRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("excepturi") {{
                    jwt = "";
                }})
                .build();

            PutMartechConnectionIdListIdMemberIdRequest req = new PutMartechConnectionIdListIdMemberIdRequest("aliquam", "voluptatibus", "fuga") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-02-15T01:18:45.557Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("dicta") {{
                            email = "Austyn.Runte@gmail.com";
                            type = MarketingEmailType.OTHER;
                        }}),
                    }};
                    id = "fedc2050-d38d-4c3c-a185-472f9ee69166";
                    listIds = new String[]{{
                        add("error"),
                    }};
                    name = "Geoffrey Turner";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("tempora"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-09T06:59:30.365Z");
                }};;
            }};            

            PutMartechConnectionIdListIdMemberIdResponse res = sdk.martech.putMartechConnectionIdListIdMemberId(req);

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
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdRequest](../../models/operations/PutMartechConnectionIdListIdMemberIdRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutMartechConnectionIdListIdMemberIdResponse](../../models/operations/PutMartechConnectionIdListIdMemberIdResponse.md)**

