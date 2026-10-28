# Member

## Overview

### Available Operations

* [createMartechMember](#createmartechmember) - Create a member
* [getClubsMember](#getclubsmember) - Retrieve a member
* [getMartechMember](#getmartechmember) - Retrieve a member
* [listClubsMembers](#listclubsmembers) - List all members
* [listMartechMembers](#listmartechmembers) - List all members
* [patchMartechMember](#patchmartechmember) - Update a member
* [removeMartechMember](#removemartechmember) - Remove a member
* [updateMartechMember](#updatemartechmember) - Update a member

## createMartechMember

Creates a MarketingMember. Provide the unified MarketingMember fields in the request body; they are mapped to the provider's API. Returns the created MarketingMember.

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechMember" method="post" path="/martech/{connection_id}/member" example="martech_member" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.CreateMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechMemberRequest req = CreateMartechMemberRequest.builder()
                .marketingMember(MarketingMember.builder()
                    .company("Miller - Franecki")
                    .createdAt(OffsetDateTime.parse("2022-04-15T15:32:38.496Z"))
                    .emails(List.of(
                        MarketingEmail.builder()
                            .email("jude.leffler@hotmail.com")
                            .type(MarketingEmailType.HOME)
                            .build()))
                    .firstName("Jude")
                    .id("69a0dcc6-a7c7-4f0e-aa7b-b6587cc517bc")
                    .lastName("Leffler")
                    .metadata(List.of())
                    .name("Jude Leffler")
                    .status(MarketingMemberStatus.UNSUBSCRIBED)
                    .tags(List.of(
                        "adnuo",
                        "verumtamen"))
                    .updatedAt(OffsetDateTime.parse("2025-07-13T20:39:03.206Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechMemberResponse res = sdk.member().createMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateMartechMemberRequest](../../models/operations/CreateMartechMemberRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateMartechMemberResponse](../../models/operations/CreateMartechMemberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getClubsMember

Retrieves a single ClubsMember by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getClubsMember" method="get" path="/clubs/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetClubsMemberRequest;
import to.unified.unified_java_sdk.models.operations.GetClubsMemberResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetClubsMemberRequest req = GetClubsMemberRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetClubsMemberResponse res = sdk.member().getClubsMember()
                .request(req)
                .call();

        if (res.clubsMember().isPresent()) {
            System.out.println(res.clubsMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetClubsMemberRequest](../../models/operations/GetClubsMemberRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetClubsMemberResponse](../../models/operations/GetClubsMemberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechMember

Retrieves a single MarketingMember by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechMember" method="get" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.GetMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechMemberRequest req = GetMartechMemberRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechMemberResponse res = sdk.member().getMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetMartechMemberRequest](../../models/operations/GetMartechMemberRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetMartechMemberResponse](../../models/operations/GetMartechMemberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClubsMembers

Returns a list of ClubsMembers. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listClubsMembers" method="get" path="/clubs/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListClubsMembersRequest;
import to.unified.unified_java_sdk.models.operations.ListClubsMembersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListClubsMembersRequest req = ListClubsMembersRequest.builder()
                .connectionId("<id>")
                .build();

        ListClubsMembersResponse res = sdk.member().listClubsMembers()
                .request(req)
                .call();

        if (res.clubsMembers().isPresent()) {
            System.out.println(res.clubsMembers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListClubsMembersRequest](../../models/operations/ListClubsMembersRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListClubsMembersResponse](../../models/operations/ListClubsMembersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechMembers

Returns a list of MarketingMembers. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechMembers" method="get" path="/martech/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechMembersRequest;
import to.unified.unified_java_sdk.models.operations.ListMartechMembersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechMembersRequest req = ListMartechMembersRequest.builder()
                .connectionId("<id>")
                .build();

        ListMartechMembersResponse res = sdk.member().listMartechMembers()
                .request(req)
                .call();

        if (res.marketingMembers().isPresent()) {
            System.out.println(res.marketingMembers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListMartechMembersRequest](../../models/operations/ListMartechMembersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListMartechMembersResponse](../../models/operations/ListMartechMembersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechMember

Updates the MarketingMember identified by `id`. Provide the unified MarketingMember fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechMember" method="patch" path="/martech/{connection_id}/member/{id}" example="martech_member" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.PatchMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechMemberRequest req = PatchMartechMemberRequest.builder()
                .marketingMember(MarketingMember.builder()
                    .company("Miller - Franecki")
                    .createdAt(OffsetDateTime.parse("2022-04-15T15:32:38.496Z"))
                    .emails(List.of(
                        MarketingEmail.builder()
                            .email("jude.leffler@hotmail.com")
                            .type(MarketingEmailType.HOME)
                            .build()))
                    .firstName("Jude")
                    .id("94544785-a291-44e1-af7f-1131ede72b9d")
                    .lastName("Leffler")
                    .metadata(List.of())
                    .name("Jude Leffler")
                    .status(MarketingMemberStatus.UNSUBSCRIBED)
                    .tags(List.of(
                        "adnuo",
                        "verumtamen"))
                    .updatedAt(OffsetDateTime.parse("2025-07-13T20:39:03.219Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechMemberResponse res = sdk.member().patchMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchMartechMemberRequest](../../models/operations/PatchMartechMemberRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchMartechMemberResponse](../../models/operations/PatchMartechMemberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechMember

Deletes the MarketingMember identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechMember" method="delete" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.RemoveMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechMemberRequest req = RemoveMartechMemberRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechMemberResponse res = sdk.member().removeMartechMember()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveMartechMemberRequest](../../models/operations/RemoveMartechMemberRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveMartechMemberResponse](../../models/operations/RemoveMartechMemberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechMember

Updates the MarketingMember identified by `id`. Provide the unified MarketingMember fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechMember" method="put" path="/martech/{connection_id}/member/{id}" example="martech_member" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechMemberRequest req = UpdateMartechMemberRequest.builder()
                .marketingMember(MarketingMember.builder()
                    .company("Miller - Franecki")
                    .createdAt(OffsetDateTime.parse("2022-04-15T15:32:38.496Z"))
                    .emails(List.of(
                        MarketingEmail.builder()
                            .email("jude.leffler@hotmail.com")
                            .type(MarketingEmailType.HOME)
                            .build()))
                    .firstName("Jude")
                    .id("94544785-a291-44e1-af7f-1131ede72b9d")
                    .lastName("Leffler")
                    .metadata(List.of())
                    .name("Jude Leffler")
                    .status(MarketingMemberStatus.UNSUBSCRIBED)
                    .tags(List.of(
                        "adnuo",
                        "verumtamen"))
                    .updatedAt(OffsetDateTime.parse("2025-07-13T20:39:03.219Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechMemberResponse res = sdk.member().updateMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateMartechMemberRequest](../../models/operations/UpdateMartechMemberRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateMartechMemberResponse](../../models/operations/UpdateMartechMemberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |