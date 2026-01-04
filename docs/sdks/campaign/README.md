# Campaign

## Overview

### Available Operations

* [createAdsCampaign](#createadscampaign) - Create a campaign
* [getAdsCampaign](#getadscampaign) - Retrieve a campaign
* [listAdsCampaigns](#listadscampaigns) - List all campaigns
* [patchAdsCampaign](#patchadscampaign) - Update a campaign
* [removeAdsCampaign](#removeadscampaign) - Remove a campaign
* [updateAdsCampaign](#updateadscampaign) - Update a campaign

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