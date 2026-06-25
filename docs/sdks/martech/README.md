# Martech

## Overview

### Available Operations

* [createMartechCampaign2](#createmartechcampaign2) - Create a campaign
* [createMartechList2](#createmartechlist2) - Create a list
* [createMartechMember2](#createmartechmember2) - Create a member
* [getMartechCampaign2](#getmartechcampaign2) - Retrieve a campaign
* [getMartechList2](#getmartechlist2) - Retrieve a list
* [getMartechMember2](#getmartechmember2) - Retrieve a member
* [listMartechCampaigns2](#listmartechcampaigns2) - List all campaigns
* [listMartechLists2](#listmartechlists2) - List all lists
* [listMartechMembers2](#listmartechmembers2) - List all members
* [listMartechReports2](#listmartechreports2) - List all reports
* [patchMartechCampaign2](#patchmartechcampaign2) - Update a campaign
* [patchMartechList2](#patchmartechlist2) - Update a list
* [patchMartechMember2](#patchmartechmember2) - Update a member
* [removeMartechCampaign2](#removemartechcampaign2) - Remove a campaign
* [removeMartechList2](#removemartechlist2) - Remove a list
* [removeMartechMember2](#removemartechmember2) - Remove a member
* [updateMartechCampaign2](#updatemartechcampaign2) - Update a campaign
* [updateMartechList2](#updatemartechlist2) - Update a list
* [updateMartechMember2](#updatemartechmember2) - Update a member

## createMartechCampaign2

Create a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechCampaign2" method="post" path="/martech/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechCampaign2Request;
import to.unified.unified_java_sdk.models.operations.CreateMartechCampaign2Response;
import to.unified.unified_java_sdk.models.shared.MarketingCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechCampaign2Request req = CreateMartechCampaign2Request.builder()
                .marketingCampaign(MarketingCampaign.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechCampaign2Response res = sdk.martech().createMartechCampaign2()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            System.out.println(res.marketingCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateMartechCampaign2Request](../../models/operations/CreateMartechCampaign2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateMartechCampaign2Response](../../models/operations/CreateMartechCampaign2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createMartechList2

Create a list

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechList2" method="post" path="/martech/{connection_id}/list" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechList2Request;
import to.unified.unified_java_sdk.models.operations.CreateMartechList2Response;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechList2Request req = CreateMartechList2Request.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechList2Response res = sdk.martech().createMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateMartechList2Request](../../models/operations/CreateMartechList2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateMartechList2Response](../../models/operations/CreateMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createMartechMember2

Create a member

### Example Usage

<!-- UsageSnippet language="java" operationID="createMartechMember2" method="post" path="/martech/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.CreateMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMartechMember2Request req = CreateMartechMember2Request.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMartechMember2Response res = sdk.martech().createMartechMember2()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateMartechMember2Request](../../models/operations/CreateMartechMember2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateMartechMember2Response](../../models/operations/CreateMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechCampaign2

Retrieve a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechCampaign2" method="get" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechCampaign2Request;
import to.unified.unified_java_sdk.models.operations.GetMartechCampaign2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechCampaign2Request req = GetMartechCampaign2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechCampaign2Response res = sdk.martech().getMartechCampaign2()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            System.out.println(res.marketingCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetMartechCampaign2Request](../../models/operations/GetMartechCampaign2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetMartechCampaign2Response](../../models/operations/GetMartechCampaign2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechList2

Retrieve a list

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechList2" method="get" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechList2Request;
import to.unified.unified_java_sdk.models.operations.GetMartechList2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechList2Request req = GetMartechList2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechList2Response res = sdk.martech().getMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetMartechList2Request](../../models/operations/GetMartechList2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetMartechList2Response](../../models/operations/GetMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMartechMember2

Retrieve a member

### Example Usage

<!-- UsageSnippet language="java" operationID="getMartechMember2" method="get" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.GetMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMartechMember2Request req = GetMartechMember2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMartechMember2Response res = sdk.martech().getMartechMember2()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetMartechMember2Request](../../models/operations/GetMartechMember2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetMartechMember2Response](../../models/operations/GetMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechCampaigns2

List all campaigns

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechCampaigns2" method="get" path="/martech/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechCampaigns2Request;
import to.unified.unified_java_sdk.models.operations.ListMartechCampaigns2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechCampaigns2Request req = ListMartechCampaigns2Request.builder()
                .connectionId("<id>")
                .build();

        ListMartechCampaigns2Response res = sdk.martech().listMartechCampaigns2()
                .request(req)
                .call();

        if (res.marketingCampaigns().isPresent()) {
            System.out.println(res.marketingCampaigns().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListMartechCampaigns2Request](../../models/operations/ListMartechCampaigns2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListMartechCampaigns2Response](../../models/operations/ListMartechCampaigns2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechLists2

List all lists

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechLists2" method="get" path="/martech/{connection_id}/list" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechLists2Request;
import to.unified.unified_java_sdk.models.operations.ListMartechLists2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechLists2Request req = ListMartechLists2Request.builder()
                .connectionId("<id>")
                .build();

        ListMartechLists2Response res = sdk.martech().listMartechLists2()
                .request(req)
                .call();

        if (res.marketingLists().isPresent()) {
            System.out.println(res.marketingLists().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListMartechLists2Request](../../models/operations/ListMartechLists2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListMartechLists2Response](../../models/operations/ListMartechLists2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechMembers2

List all members

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechMembers2" method="get" path="/martech/{connection_id}/member" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechMembers2Request;
import to.unified.unified_java_sdk.models.operations.ListMartechMembers2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechMembers2Request req = ListMartechMembers2Request.builder()
                .connectionId("<id>")
                .build();

        ListMartechMembers2Response res = sdk.martech().listMartechMembers2()
                .request(req)
                .call();

        if (res.marketingMembers().isPresent()) {
            System.out.println(res.marketingMembers().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListMartechMembers2Request](../../models/operations/ListMartechMembers2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListMartechMembers2Response](../../models/operations/ListMartechMembers2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMartechReports2

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listMartechReports2" method="get" path="/martech/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMartechReports2Request;
import to.unified.unified_java_sdk.models.operations.ListMartechReports2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMartechReports2Request req = ListMartechReports2Request.builder()
                .connectionId("<id>")
                .build();

        ListMartechReports2Response res = sdk.martech().listMartechReports2()
                .request(req)
                .call();

        if (res.marketingReports().isPresent()) {
            System.out.println(res.marketingReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListMartechReports2Request](../../models/operations/ListMartechReports2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListMartechReports2Response](../../models/operations/ListMartechReports2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechCampaign2

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechCampaign2" method="patch" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechCampaign2Request;
import to.unified.unified_java_sdk.models.operations.PatchMartechCampaign2Response;
import to.unified.unified_java_sdk.models.shared.MarketingCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechCampaign2Request req = PatchMartechCampaign2Request.builder()
                .marketingCampaign(MarketingCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechCampaign2Response res = sdk.martech().patchMartechCampaign2()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            System.out.println(res.marketingCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchMartechCampaign2Request](../../models/operations/PatchMartechCampaign2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchMartechCampaign2Response](../../models/operations/PatchMartechCampaign2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechList2

Update a list

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechList2" method="patch" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechList2Request;
import to.unified.unified_java_sdk.models.operations.PatchMartechList2Response;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechList2Request req = PatchMartechList2Request.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechList2Response res = sdk.martech().patchMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchMartechList2Request](../../models/operations/PatchMartechList2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchMartechList2Response](../../models/operations/PatchMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMartechMember2

Update a member

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMartechMember2" method="patch" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.PatchMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMartechMember2Request req = PatchMartechMember2Request.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMartechMember2Response res = sdk.martech().patchMartechMember2()
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
| `request`                                                                           | [PatchMartechMember2Request](../../models/operations/PatchMartechMember2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchMartechMember2Response](../../models/operations/PatchMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechCampaign2

Remove a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechCampaign2" method="delete" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechCampaign2Request;
import to.unified.unified_java_sdk.models.operations.RemoveMartechCampaign2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechCampaign2Request req = RemoveMartechCampaign2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechCampaign2Response res = sdk.martech().removeMartechCampaign2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveMartechCampaign2Request](../../models/operations/RemoveMartechCampaign2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveMartechCampaign2Response](../../models/operations/RemoveMartechCampaign2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechList2

Remove a list

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechList2" method="delete" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechList2Request;
import to.unified.unified_java_sdk.models.operations.RemoveMartechList2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechList2Request req = RemoveMartechList2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechList2Response res = sdk.martech().removeMartechList2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveMartechList2Request](../../models/operations/RemoveMartechList2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveMartechList2Response](../../models/operations/RemoveMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMartechMember2

Remove a member

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMartechMember2" method="delete" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.RemoveMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMartechMember2Request req = RemoveMartechMember2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMartechMember2Response res = sdk.martech().removeMartechMember2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveMartechMember2Request](../../models/operations/RemoveMartechMember2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveMartechMember2Response](../../models/operations/RemoveMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechCampaign2

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechCampaign2" method="put" path="/martech/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechCampaign2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMartechCampaign2Response;
import to.unified.unified_java_sdk.models.shared.MarketingCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechCampaign2Request req = UpdateMartechCampaign2Request.builder()
                .marketingCampaign(MarketingCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechCampaign2Response res = sdk.martech().updateMartechCampaign2()
                .request(req)
                .call();

        if (res.marketingCampaign().isPresent()) {
            System.out.println(res.marketingCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateMartechCampaign2Request](../../models/operations/UpdateMartechCampaign2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateMartechCampaign2Response](../../models/operations/UpdateMartechCampaign2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechList2

Update a list

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechList2" method="put" path="/martech/{connection_id}/list/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechList2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMartechList2Response;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechList2Request req = UpdateMartechList2Request.builder()
                .marketingList(MarketingList.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechList2Response res = sdk.martech().updateMartechList2()
                .request(req)
                .call();

        if (res.marketingList().isPresent()) {
            System.out.println(res.marketingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateMartechList2Request](../../models/operations/UpdateMartechList2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateMartechList2Response](../../models/operations/UpdateMartechList2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMartechMember2

Update a member

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMartechMember2" method="put" path="/martech/{connection_id}/member/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMember2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMartechMember2Response;
import to.unified.unified_java_sdk.models.shared.MarketingMember;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMartechMember2Request req = UpdateMartechMember2Request.builder()
                .marketingMember(MarketingMember.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMartechMember2Response res = sdk.martech().updateMartechMember2()
                .request(req)
                .call();

        if (res.marketingMember().isPresent()) {
            System.out.println(res.marketingMember().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateMartechMember2Request](../../models/operations/UpdateMartechMember2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateMartechMember2Response](../../models/operations/UpdateMartechMember2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |