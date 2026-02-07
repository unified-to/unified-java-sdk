# Martech

## Overview

### Available Operations

* [createMartechCampaign](#createmartechcampaign) - Create a campaign
* [createMartechList](#createmartechlist) - Create a list
* [createMartechMember](#createmartechmember) - Create a member
* [getMartechCampaign](#getmartechcampaign) - Retrieve a campaign
* [getMartechList](#getmartechlist) - Retrieve a list
* [getMartechMember](#getmartechmember) - Retrieve a member
* [listMartechCampaigns](#listmartechcampaigns) - List all campaigns
* [listMartechLists](#listmartechlists) - List all lists
* [listMartechMembers](#listmartechmembers) - List all members
* [listMartechReports](#listmartechreports) - List all reports
* [patchMartechCampaign](#patchmartechcampaign) - Update a campaign
* [patchMartechList](#patchmartechlist) - Update a list
* [patchMartechMember](#patchmartechmember) - Update a member
* [removeMartechCampaign](#removemartechcampaign) - Remove a campaign
* [removeMartechList](#removemartechlist) - Remove a list
* [removeMartechMember](#removemartechmember) - Remove a member
* [updateMartechCampaign](#updatemartechcampaign) - Update a campaign
* [updateMartechList](#updatemartechlist) - Update a list
* [updateMartechMember](#updatemartechmember) - Update a member

## createMartechCampaign

Create a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechCampaign" method="post" path="/martech/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechCampaignRequest;
import to.unified.unified_java_sdk.models.operations.CreateMartechCampaignResponse;
import to.unified.unified_java_sdk.models.shared.MarketingCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechCampaignRequest req = CreateMartechCampaignRequest.builder()
                .marketingCampaign(MarketingCampaign.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechCampaignResponse res = sdk.martech().createMartechCampaign()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateMartechCampaignRequest](../../models/operations/CreateMartechCampaignRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateMartechCampaignResponse](../../models/operations/CreateMartechCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createMartechList

Create a list

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechList" method="post" path="/martech/{connection_id}/list" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechListRequest;
import to.unified.unified_java_sdk.models.operations.CreateMartechListResponse;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechListRequest req = CreateMartechListRequest.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechListResponse res = sdk.martech().createMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateMartechListRequest](../../models/operations/CreateMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateMartechListResponse](../../models/operations/CreateMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createMartechMember

Create a member

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechMember" method="post" path="/martech/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.CreateMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechMemberRequest req = CreateMartechMemberRequest.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechMemberResponse res = sdk.martech().createMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            // handle response
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

## getMartechCampaign

Retrieve a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechCampaign" method="get" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechCampaignRequest;
import to.unified.unified_java_sdk.models.operations.GetMartechCampaignResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechCampaignRequest req = GetMartechCampaignRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechCampaignResponse res = sdk.martech().getMartechCampaign()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetMartechCampaignRequest](../../models/operations/GetMartechCampaignRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetMartechCampaignResponse](../../models/operations/GetMartechCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechList

Retrieve a list

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechList" method="get" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechListRequest;
import to.unified.unified_java_sdk.models.operations.GetMartechListResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechListRequest req = GetMartechListRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechListResponse res = sdk.martech().getMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetMartechListRequest](../../models/operations/GetMartechListRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetMartechListResponse](../../models/operations/GetMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechMember

Retrieve a member

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

        GetMartechMemberResponse res = sdk.martech().getMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            // handle response
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

## listMartechCampaigns

List all campaigns

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechCampaigns" method="get" path="/martech/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechCampaignsRequest;
import to.unified.unified_java_sdk.models.operations.ListMartechCampaignsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechCampaignsRequest req = ListMartechCampaignsRequest.builder()
                .connectionId("<id>")
                .build();

        ListMartechCampaignsResponse res = sdk.martech().listMartechCampaigns()
                .request(req)
                .call();

        if (res.marketingCampaigns().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListMartechCampaignsRequest](../../models/operations/ListMartechCampaignsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListMartechCampaignsResponse](../../models/operations/ListMartechCampaignsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechLists

List all lists

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechLists" method="get" path="/martech/{connection_id}/list" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechListsRequest;
import to.unified.unified_java_sdk.models.operations.ListMartechListsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechListsRequest req = ListMartechListsRequest.builder()
                .connectionId("<id>")
                .build();

        ListMartechListsResponse res = sdk.martech().listMartechLists()
                .request(req)
                .call();

        if (res.marketingLists().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListMartechListsRequest](../../models/operations/ListMartechListsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListMartechListsResponse](../../models/operations/ListMartechListsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechMembers

List all members

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

        ListMartechMembersResponse res = sdk.martech().listMartechMembers()
                .request(req)
                .call();

        if (res.marketingMembers().isPresent()) {
            // handle response
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

## listMartechReports

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechReports" method="get" path="/martech/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechReportsRequest;
import to.unified.unified_java_sdk.models.operations.ListMartechReportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechReportsRequest req = ListMartechReportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListMartechReportsResponse res = sdk.martech().listMartechReports()
                .request(req)
                .call();

        if (res.marketingReports().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListMartechReportsRequest](../../models/operations/ListMartechReportsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListMartechReportsResponse](../../models/operations/ListMartechReportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechCampaign

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechCampaign" method="patch" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechCampaignRequest;
import to.unified.unified_java_sdk.models.operations.PatchMartechCampaignResponse;
import to.unified.unified_java_sdk.models.shared.MarketingCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechCampaignRequest req = PatchMartechCampaignRequest.builder()
                .marketingCampaign(MarketingCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechCampaignResponse res = sdk.martech().patchMartechCampaign()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchMartechCampaignRequest](../../models/operations/PatchMartechCampaignRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchMartechCampaignResponse](../../models/operations/PatchMartechCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechList

Update a list

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechList" method="patch" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechListRequest;
import to.unified.unified_java_sdk.models.operations.PatchMartechListResponse;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechListRequest req = PatchMartechListRequest.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechListResponse res = sdk.martech().patchMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchMartechListRequest](../../models/operations/PatchMartechListRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchMartechListResponse](../../models/operations/PatchMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechMember

Update a member

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechMember" method="patch" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.PatchMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechMemberRequest req = PatchMartechMemberRequest.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechMemberResponse res = sdk.martech().patchMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            // handle response
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

## removeMartechCampaign

Remove a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechCampaign" method="delete" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechCampaignRequest;
import to.unified.unified_java_sdk.models.operations.RemoveMartechCampaignResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechCampaignRequest req = RemoveMartechCampaignRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechCampaignResponse res = sdk.martech().removeMartechCampaign()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveMartechCampaignRequest](../../models/operations/RemoveMartechCampaignRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveMartechCampaignResponse](../../models/operations/RemoveMartechCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechList

Remove a list

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechList" method="delete" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechListRequest;
import to.unified.unified_java_sdk.models.operations.RemoveMartechListResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechListRequest req = RemoveMartechListRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechListResponse res = sdk.martech().removeMartechList()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveMartechListRequest](../../models/operations/RemoveMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveMartechListResponse](../../models/operations/RemoveMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechMember

Remove a member

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

        RemoveMartechMemberResponse res = sdk.martech().removeMartechMember()
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

## updateMartechCampaign

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechCampaign" method="put" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechCampaignRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMartechCampaignResponse;
import to.unified.unified_java_sdk.models.shared.MarketingCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechCampaignRequest req = UpdateMartechCampaignRequest.builder()
                .marketingCampaign(MarketingCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechCampaignResponse res = sdk.martech().updateMartechCampaign()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateMartechCampaignRequest](../../models/operations/UpdateMartechCampaignRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateMartechCampaignResponse](../../models/operations/UpdateMartechCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechList

Update a list

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechList" method="put" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechListRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMartechListResponse;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechListRequest req = UpdateMartechListRequest.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechListResponse res = sdk.martech().updateMartechList()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateMartechListRequest](../../models/operations/UpdateMartechListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateMartechListResponse](../../models/operations/UpdateMartechListResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechMember

Update a member

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechMember" method="put" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMemberRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMemberResponse;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechMemberRequest req = UpdateMartechMemberRequest.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechMemberResponse res = sdk.martech().updateMartechMember()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            // handle response
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