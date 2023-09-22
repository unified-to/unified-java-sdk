# Member

### Available Operations

* [deleteMartechConnectionIdListIdMemberId](#deletemartechconnectionidlistidmemberid) - Remove member from a list
* [getMartechConnectionIdListIdMember](#getmartechconnectionidlistidmember) - List all members in a list
* [getMartechConnectionIdListIdMemberId](#getmartechconnectionidlistidmemberid) - Retrieve a member from a list
* [patchMartechConnectionIdListIdMemberId](#patchmartechconnectionidlistidmemberid) - Update a member in a list
* [postMartechConnectionIdListIdMember](#postmartechconnectionidlistidmember) - Create a member in a list
* [putMartechConnectionIdListIdMemberId](#putmartechconnectionidlistidmemberid) - Update a member in a list

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
                .setSecurity(new Security("similique") {{
                    jwt = "";
                }})
                .build();

            DeleteMartechConnectionIdListIdMemberIdRequest req = new DeleteMartechConnectionIdListIdMemberIdRequest("porro", "blanditiis", "libero");            

            DeleteMartechConnectionIdListIdMemberIdResponse res = sdk.member.deleteMartechConnectionIdListIdMemberId(req);

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
                .setSecurity(new Security("sequi") {{
                    jwt = "";
                }})
                .build();

            GetMartechConnectionIdListIdMemberRequest req = new GetMartechConnectionIdListIdMemberRequest("laborum", "fugit") {{
                limit = 5193.42d;
                offset = 4894.97d;
                order = "corporis";
                query = "quo";
                sort = "nisi";
                updatedGte = OffsetDateTime.parse("2022-10-06T02:43:18.581Z");
            }};            

            GetMartechConnectionIdListIdMemberResponse res = sdk.member.getMartechConnectionIdListIdMember(req);

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
                .setSecurity(new Security("voluptatibus") {{
                    jwt = "";
                }})
                .build();

            GetMartechConnectionIdListIdMemberIdRequest req = new GetMartechConnectionIdListIdMemberIdRequest("officiis", "suscipit", "perferendis");            

            GetMartechConnectionIdListIdMemberIdResponse res = sdk.member.getMartechConnectionIdListIdMemberId(req);

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
                .setSecurity(new Security("nisi") {{
                    jwt = "";
                }})
                .build();

            PatchMartechConnectionIdListIdMemberIdRequest req = new PatchMartechConnectionIdListIdMemberIdRequest("quibusdam", "alias", "voluptate") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-06-13T04:59:38.820Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("repudiandae") {{
                            email = "Lincoln.Russel@yahoo.com";
                            type = MarketingEmailType.HOME;
                        }}),
                    }};
                    id = "50c16661-a1d9-4136-a7e8-d53213f3f658";
                    listIds = new String[]{{
                        add("esse"),
                    }};
                    name = "Beverly Shanahan";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("autem"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-03-13T21:35:14.080Z");
                }};;
            }};            

            PatchMartechConnectionIdListIdMemberIdResponse res = sdk.member.patchMartechConnectionIdListIdMemberId(req);

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
                .setSecurity(new Security("nostrum") {{
                    jwt = "";
                }})
                .build();

            PostMartechConnectionIdListIdMemberRequest req = new PostMartechConnectionIdListIdMemberRequest("occaecati", "asperiores") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-05-04T12:59:12.930Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("pariatur") {{
                            email = "Halie_Schowalter76@yahoo.com";
                            type = MarketingEmailType.HOME;
                        }}),
                    }};
                    id = "a29ca791-81c9-4567-9663-c530b5665163";
                    listIds = new String[]{{
                        add("culpa"),
                    }};
                    name = "Laurie Farrell";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("illo"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-05-03T15:31:29.291Z");
                }};;
            }};            

            PostMartechConnectionIdListIdMemberResponse res = sdk.member.postMartechConnectionIdListIdMember(req);

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
                .setSecurity(new Security("tempore") {{
                    jwt = "";
                }})
                .build();

            PutMartechConnectionIdListIdMemberIdRequest req = new PutMartechConnectionIdListIdMemberIdRequest("fugit", "nostrum", "magni") {{
                marketingMember = new MarketingMember() {{
                    createdAt = OffsetDateTime.parse("2022-04-21T17:57:13.521Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("aliquam") {{
                            email = "Yoshiko.Daugherty45@yahoo.com";
                            type = MarketingEmailType.WORK;
                        }}),
                    }};
                    id = "67b8a40b-c05f-4ab0-9650-edf22a94d20e";
                    listIds = new String[]{{
                        add("quo"),
                    }};
                    name = "Steven Toy";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("quasi"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-09-13T00:32:30.813Z");
                }};;
            }};            

            PutMartechConnectionIdListIdMemberIdResponse res = sdk.member.putMartechConnectionIdListIdMemberId(req);

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

