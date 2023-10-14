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
                .setSecurity(new Security("Home"){{
                    jwt = "";
                }})
                .build();

            CreateMartechMemberRequest req = new CreateMartechMemberRequest("esse", "Towels"){{
                marketingMember = new MarketingMember(){{
                    createdAt = OffsetDateTime.parse("2023-04-25T03:20:19.740Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("Electronic"){{
                            email = "Lavada29@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    listIds = new String[]{{
                        add("calculate"),
                    }};
                    name = "ew scalable Hassium";
                    raw = new PropertyMarketingMemberRaw();
                    tags = new String[]{{
                        add("Buckinghamshire"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-07-26T05:07:38.623Z");
                }};
                fields = new String[]{{
                    add("Hybrid"),
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
                .setSecurity(new Security("Japan"){{
                    jwt = "";
                }})
                .build();

            GetMartechMemberRequest req = new GetMartechMemberRequest("orange", "Gibraltar", "Northeast"){{
                fields = new String[]{{
                    add("Franc"),
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
                .setSecurity(new Security("Frida"){{
                    jwt = "";
                }})
                .build();

            ListMartechMembersRequest req = new ListMartechMembersRequest("structure", "Thallium"){{
                fields = new String[]{{
                    add("Bike"),
                }};
                limit = 8667.14d;
                offset = 6022.21d;
                order = "huzzah wireless";
                query = "Loop";
                sort = "standardise reinvent microchip";
                updatedGte = OffsetDateTime.parse("2022-12-12T03:36:49.362Z");
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
                .setSecurity(new Security("Transexual"){{
                    jwt = "";
                }})
                .build();

            PatchMartechMemberRequest req = new PatchMartechMemberRequest("Northwest", "astride", "female"){{
                marketingMember = new MarketingMember(){{
                    createdAt = OffsetDateTime.parse("2023-07-23T02:40:10.928Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("Money"){{
                            email = "Danika.Walter@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    listIds = new String[]{{
                        add("Brand"),
                    }};
                    name = "West integrated";
                    raw = new PropertyMarketingMemberRaw();
                    tags = new String[]{{
                        add("Regional"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-01T06:57:40.654Z");
                }};
                fields = new String[]{{
                    add("quis"),
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
                .setSecurity(new Security("integrated"){{
                    jwt = "";
                }})
                .build();

            RemoveMartechMemberRequest req = new RemoveMartechMemberRequest("Analyst", "North", "invoice");            

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
                .setSecurity(new Security("BMX"){{
                    jwt = "";
                }})
                .build();

            UpdateMartechMemberRequest req = new UpdateMartechMemberRequest("Kong", "mobile", "deposit"){{
                marketingMember = new MarketingMember(){{
                    createdAt = OffsetDateTime.parse("2021-08-21T23:18:02.833Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("payment"){{
                            email = "Haven30@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    listIds = new String[]{{
                        add("Lithuanian"),
                    }};
                    name = "methodologies state";
                    raw = new PropertyMarketingMemberRaw();
                    tags = new String[]{{
                        add("Computer"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-09-28T08:50:18.886Z");
                }};
                fields = new String[]{{
                    add("Unbranded"),
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

