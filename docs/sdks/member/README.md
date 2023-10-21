# Member
(*member*)

### Available Operations

* [createMartechMember](#createmartechmember) - Create a member in a list
* [getMartechMember](#getmartechmember) - Retrieve a member from a list
* [listMartechMembers](#listmartechmembers) - List all members in a list
* [patchMartechMember](#patchmartechmember) - Update a member in a list
* [removeMartechMember](#removemartechmember) - Remove member from a list
* [updateMartechMember](#updatemartechmember) - Update a member in a list

## createMartechMember

Create a member in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.CreateMartechMemberResponse;
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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateMartechMemberRequest req = new CreateMartechMemberRequest("string", "string"){{
                marketingMember = new MarketingMember(){{
                    createdAt = OffsetDateTime.parse("2021-07-29T12:25:04.271Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("string"){{
                            email = "Kimberly55@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    listIds = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new PropertyMarketingMemberRaw();
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-25T03:20:19.740Z");
                }};
            }};            

            CreateMartechMemberResponse res = sdk.member.createMartechMember(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.CreateMartechMemberRequest](../../models/operations/CreateMartechMemberRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateMartechMemberResponse](../../models/operations/CreateMartechMemberResponse.md)**


## getMartechMember

Retrieve a member from a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechMemberResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            GetMartechMemberRequest req = new GetMartechMemberRequest("string", "string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
            }};            

            GetMartechMemberResponse res = sdk.member.getMartechMember(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetMartechMemberRequest](../../models/operations/GetMartechMemberRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMartechMemberResponse](../../models/operations/GetMartechMemberResponse.md)**


## listMartechMembers

List all members in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListMartechMembersRequest;
import com.unifiedapi.unifiedto.models.operations.ListMartechMembersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            ListMartechMembersRequest req = new ListMartechMembersRequest("string", "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 1432.99d;
                offset = 4150.29d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-02-09T03:38:53.799Z");
            }};            

            ListMartechMembersResponse res = sdk.member.listMartechMembers(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.ListMartechMembersRequest](../../models/operations/ListMartechMembersRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListMartechMembersResponse](../../models/operations/ListMartechMembersResponse.md)**


## patchMartechMember

Update a member in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMartechMemberResponse;
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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            PatchMartechMemberRequest req = new PatchMartechMemberRequest("string", "string", "string"){{
                marketingMember = new MarketingMember(){{
                    createdAt = OffsetDateTime.parse("2022-11-02T06:23:45.231Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("string"){{
                            email = "Avis.Nikolaus70@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    listIds = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new PropertyMarketingMemberRaw();
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-21T22:23:04.281Z");
                }};
            }};            

            PatchMartechMemberResponse res = sdk.member.patchMartechMember(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchMartechMemberRequest](../../models/operations/PatchMartechMemberRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchMartechMemberResponse](../../models/operations/PatchMartechMemberResponse.md)**


## removeMartechMember

Remove member from a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            RemoveMartechMemberRequest req = new RemoveMartechMemberRequest("string", "string", "string");            

            RemoveMartechMemberResponse res = sdk.member.removeMartechMember(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberRequest](../../models/operations/RemoveMartechMemberRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveMartechMemberResponse](../../models/operations/RemoveMartechMemberResponse.md)**


## updateMartechMember

Update a member in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberResponse;
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
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            UpdateMartechMemberRequest req = new UpdateMartechMemberRequest("string", "string", "string"){{
                marketingMember = new MarketingMember(){{
                    createdAt = OffsetDateTime.parse("2023-04-24T11:56:04.469Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("string"){{
                            email = "Horacio55@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    listIds = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new PropertyMarketingMemberRaw();
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-16T07:22:55.607Z");
                }};
            }};            

            UpdateMartechMemberResponse res = sdk.member.updateMartechMember(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberRequest](../../models/operations/UpdateMartechMemberRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateMartechMemberResponse](../../models/operations/UpdateMartechMemberResponse.md)**

