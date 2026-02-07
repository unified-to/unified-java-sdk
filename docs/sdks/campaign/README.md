# Campaign

## Overview

### Available Operations

* [createAdsCampaign](#createadscampaign) - Create a campaign
* [createMartechCampaign](#createmartechcampaign) - Create a campaign
* [getAdsCampaign](#getadscampaign) - Retrieve a campaign
* [getMartechCampaign](#getmartechcampaign) - Retrieve a campaign
* [listAdsCampaigns](#listadscampaigns) - List all campaigns
* [listMartechCampaigns](#listmartechcampaigns) - List all campaigns
* [patchAdsCampaign](#patchadscampaign) - Update a campaign
* [patchMartechCampaign](#patchmartechcampaign) - Update a campaign
* [removeAdsCampaign](#removeadscampaign) - Remove a campaign
* [removeMartechCampaign](#removemartechcampaign) - Remove a campaign
* [updateAdsCampaign](#updateadscampaign) - Update a campaign
* [updateMartechCampaign](#updatemartechcampaign) - Update a campaign

## createAdsCampaign

Create a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCampaign" method="post" path="/ads/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.AdsCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCampaignRequest req = CreateAdsCampaignRequest.builder()
                .adsCampaign(AdsCampaign.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCampaignResponse res = sdk.campaign().createAdsCampaign()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAdsCampaignRequest](../../models/operations/CreateAdsCampaignRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAdsCampaignResponse](../../models/operations/CreateAdsCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateMartechCampaignResponse res = sdk.campaign().createMartechCampaign()
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

## getAdsCampaign

Retrieve a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsCampaign" method="get" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsCampaignRequest req = GetAdsCampaignRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsCampaignResponse res = sdk.campaign().getAdsCampaign()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAdsCampaignRequest](../../models/operations/GetAdsCampaignRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAdsCampaignResponse](../../models/operations/GetAdsCampaignResponse.md)**

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

        GetMartechCampaignResponse res = sdk.campaign().getMartechCampaign()
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

## listAdsCampaigns

List all campaigns

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsCampaigns" method="get" path="/ads/{connection_id}/campaign" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsCampaignsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsCampaignsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsCampaignsRequest req = ListAdsCampaignsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsCampaignsResponse res = sdk.campaign().listAdsCampaigns()
                .request(req)
                .call();

        if (res.adsCampaigns().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAdsCampaignsRequest](../../models/operations/ListAdsCampaignsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAdsCampaignsResponse](../../models/operations/ListAdsCampaignsResponse.md)**

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

        ListMartechCampaignsResponse res = sdk.campaign().listMartechCampaigns()
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

## patchAdsCampaign

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCampaign" method="patch" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.AdsCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCampaignRequest req = PatchAdsCampaignRequest.builder()
                .adsCampaign(AdsCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCampaignResponse res = sdk.campaign().patchAdsCampaign()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAdsCampaignRequest](../../models/operations/PatchAdsCampaignRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAdsCampaignResponse](../../models/operations/PatchAdsCampaignResponse.md)**

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

        PatchMartechCampaignResponse res = sdk.campaign().patchMartechCampaign()
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

## removeAdsCampaign

Remove a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsCampaign" method="delete" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsCampaignRequest req = RemoveAdsCampaignRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsCampaignResponse res = sdk.campaign().removeAdsCampaign()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAdsCampaignRequest](../../models/operations/RemoveAdsCampaignRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAdsCampaignResponse](../../models/operations/RemoveAdsCampaignResponse.md)**

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

        RemoveMartechCampaignResponse res = sdk.campaign().removeMartechCampaign()
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

## updateAdsCampaign

Update a campaign

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCampaign" method="put" path="/ads/{connection_id}/campaign/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.AdsCampaign;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCampaignRequest req = UpdateAdsCampaignRequest.builder()
                .adsCampaign(AdsCampaign.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCampaignResponse res = sdk.campaign().updateAdsCampaign()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAdsCampaignRequest](../../models/operations/UpdateAdsCampaignRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAdsCampaignResponse](../../models/operations/UpdateAdsCampaignResponse.md)**

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

        UpdateMartechCampaignResponse res = sdk.campaign().updateMartechCampaign()
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