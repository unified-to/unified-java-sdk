# Campaign

## Overview

### Available Operations

* [createAdsCampaign2](#createadscampaign2) - Create a campaign
* [createMartechCampaign2](#createmartechcampaign2) - Create a campaign
* [getAdsCampaign2](#getadscampaign2) - Retrieve a campaign
* [getMartechCampaign2](#getmartechcampaign2) - Retrieve a campaign
* [listAdsCampaigns2](#listadscampaigns2) - List all campaigns
* [listMartechCampaigns2](#listmartechcampaigns2) - List all campaigns
* [patchAdsCampaign2](#patchadscampaign2) - Update a campaign
* [patchMartechCampaign2](#patchmartechcampaign2) - Update a campaign
* [removeAdsCampaign2](#removeadscampaign2) - Remove a campaign
* [removeMartechCampaign2](#removemartechcampaign2) - Remove a campaign
* [updateAdsCampaign2](#updateadscampaign2) - Update a campaign
* [updateMartechCampaign2](#updatemartechcampaign2) - Update a campaign

## createAdsCampaign2

Create a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCampaign2" method="post" path="/ads/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCampaign2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsCampaign2Response;
import to.unified.unified_java_sdk.models.shared.AdsCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCampaign2Request req = CreateAdsCampaign2Request.builder()
                .adsCampaign(AdsCampaign.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCampaign2Response res = sdk.campaign().createAdsCampaign2()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            System.out.println(res.adsCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAdsCampaign2Request](../../models/operations/CreateAdsCampaign2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAdsCampaign2Response](../../models/operations/CreateAdsCampaign2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateMartechCampaign2Response res = sdk.campaign().createMartechCampaign2()
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

## getAdsCampaign2

Retrieve a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsCampaign2" method="get" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsCampaign2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsCampaign2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsCampaign2Request req = GetAdsCampaign2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsCampaign2Response res = sdk.campaign().getAdsCampaign2()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            System.out.println(res.adsCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAdsCampaign2Request](../../models/operations/GetAdsCampaign2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAdsCampaign2Response](../../models/operations/GetAdsCampaign2Response.md)**

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

        GetMartechCampaign2Response res = sdk.campaign().getMartechCampaign2()
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

## listAdsCampaigns2

List all campaigns

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsCampaigns2" method="get" path="/ads/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsCampaigns2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsCampaigns2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsCampaigns2Request req = ListAdsCampaigns2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsCampaigns2Response res = sdk.campaign().listAdsCampaigns2()
                .request(req)
                .call();

        if (res.adsCampaigns().isPresent()) {
            System.out.println(res.adsCampaigns().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAdsCampaigns2Request](../../models/operations/ListAdsCampaigns2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAdsCampaigns2Response](../../models/operations/ListAdsCampaigns2Response.md)**

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

        ListMartechCampaigns2Response res = sdk.campaign().listMartechCampaigns2()
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

## patchAdsCampaign2

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCampaign2" method="patch" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCampaign2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsCampaign2Response;
import to.unified.unified_java_sdk.models.shared.AdsCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCampaign2Request req = PatchAdsCampaign2Request.builder()
                .adsCampaign(AdsCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCampaign2Response res = sdk.campaign().patchAdsCampaign2()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            System.out.println(res.adsCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchAdsCampaign2Request](../../models/operations/PatchAdsCampaign2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAdsCampaign2Response](../../models/operations/PatchAdsCampaign2Response.md)**

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

        PatchMartechCampaign2Response res = sdk.campaign().patchMartechCampaign2()
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

## removeAdsCampaign2

Remove a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsCampaign2" method="delete" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCampaign2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCampaign2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsCampaign2Request req = RemoveAdsCampaign2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsCampaign2Response res = sdk.campaign().removeAdsCampaign2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAdsCampaign2Request](../../models/operations/RemoveAdsCampaign2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAdsCampaign2Response](../../models/operations/RemoveAdsCampaign2Response.md)**

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

        RemoveMartechCampaign2Response res = sdk.campaign().removeMartechCampaign2()
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

## updateAdsCampaign2

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCampaign2" method="put" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCampaign2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCampaign2Response;
import to.unified.unified_java_sdk.models.shared.AdsCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCampaign2Request req = UpdateAdsCampaign2Request.builder()
                .adsCampaign(AdsCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCampaign2Response res = sdk.campaign().updateAdsCampaign2()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            System.out.println(res.adsCampaign().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAdsCampaign2Request](../../models/operations/UpdateAdsCampaign2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAdsCampaign2Response](../../models/operations/UpdateAdsCampaign2Response.md)**

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

        UpdateMartechCampaign2Response res = sdk.campaign().updateMartechCampaign2()
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