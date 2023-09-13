# member

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
import com.unifiedapi.unifiedto.models.operations.DeleteMartechConnectionIdListIdMemberIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteMartechConnectionIdListIdMemberIdRequest req = new DeleteMartechConnectionIdListIdMemberIdRequest("quo", "repudiandae", "ab");            

            DeleteMartechConnectionIdListIdMemberIdResponse res = sdk.member.deleteMartechConnectionIdListIdMemberId(req, new DeleteMartechConnectionIdListIdMemberIdSecurity("praesentium") {{
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


## getMartechConnectionIdListIdMember

List all members in a list

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberRequest;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberResponse;
import com.unifiedapi.unifiedto.models.operations.GetMartechConnectionIdListIdMemberSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetMartechConnectionIdListIdMemberRequest req = new GetMartechConnectionIdListIdMemberRequest("nostrum", "labore") {{
                limit = 4790.21d;
                offset = 1250.36d;
                order = "tenetur";
                query = "occaecati";
                sort = "necessitatibus";
                updatedGte = LocalDate.parse("2021-09-24");
            }};            

            GetMartechConnectionIdListIdMemberResponse res = sdk.member.getMartechConnectionIdListIdMember(req, new GetMartechConnectionIdListIdMemberSecurity("natus") {{
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

            GetMartechConnectionIdListIdMemberIdRequest req = new GetMartechConnectionIdListIdMemberIdRequest("quasi", "iure", "ex");            

            GetMartechConnectionIdListIdMemberIdResponse res = sdk.member.getMartechConnectionIdListIdMemberId(req, new GetMartechConnectionIdListIdMemberIdSecurity("error") {{
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchMartechConnectionIdListIdMemberIdRequest req = new PatchMartechConnectionIdListIdMemberIdRequest("deleniti", "tempore", "saepe") {{
                marketingMember = new MarketingMember() {{
                    createdAt = LocalDate.parse("2022-09-15");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("libero") {{
                            email = "Elroy_Trantow@gmail.com";
                            type = MarketingEmailType.HOME;
                        }}),
                    }};
                    id = "3a2875c6-c1fe-4606-907d-2a9c87ae50c1";
                    listIds = new String[]{{
                        add("vel"),
                    }};
                    name = "Vanessa Bogan PhD";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("excepturi"),
                    }};
                    updatedAt = LocalDate.parse("2022-10-14");
                }};;
            }};            

            PatchMartechConnectionIdListIdMemberIdResponse res = sdk.member.patchMartechConnectionIdListIdMemberId(req, new PatchMartechConnectionIdListIdMemberIdSecurity("iure") {{
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostMartechConnectionIdListIdMemberRequest req = new PostMartechConnectionIdListIdMemberRequest("similique", "molestiae") {{
                marketingMember = new MarketingMember() {{
                    createdAt = LocalDate.parse("2021-05-28");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("tenetur") {{
                            email = "Erica8@hotmail.com";
                            type = MarketingEmailType.WORK;
                        }}),
                    }};
                    id = "3f658752-db76-44c5-9f0a-56cebcada29c";
                    listIds = new String[]{{
                        add("officia"),
                    }};
                    name = "Natasha Bernhard DDS";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("sint"),
                    }};
                    updatedAt = LocalDate.parse("2022-08-12");
                }};;
            }};            

            PostMartechConnectionIdListIdMemberResponse res = sdk.member.postMartechConnectionIdListIdMember(req, new PostMartechConnectionIdListIdMemberSecurity("molestiae") {{
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
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutMartechConnectionIdListIdMemberIdRequest req = new PutMartechConnectionIdListIdMemberIdRequest("ab", "ex", "iure") {{
                marketingMember = new MarketingMember() {{
                    createdAt = LocalDate.parse("2022-03-17");
                    emails = new com.unifiedapi.unifiedto.models.shared.MarketingEmail[]{{
                        add(new MarketingEmail("minima") {{
                            email = "Cristopher.Bednar42@gmail.com";
                            type = MarketingEmailType.HOME;
                        }}),
                    }};
                    id = "163a3638-512a-4b25-a1b9-f2e072467b8a";
                    listIds = new String[]{{
                        add("modi"),
                    }};
                    name = "Mrs. Antoinette Schimmel";
                    raw = new PropertyMarketingMemberRaw();;
                    tags = new String[]{{
                        add("dolorum"),
                    }};
                    updatedAt = LocalDate.parse("2022-12-08");
                }};;
            }};            

            PutMartechConnectionIdListIdMemberIdResponse res = sdk.member.putMartechConnectionIdListIdMemberId(req, new PutMartechConnectionIdListIdMemberIdSecurity("at") {{
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

