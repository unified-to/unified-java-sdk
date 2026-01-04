# Ads

## Overview

### Available Operations

* [createAdsAd](#createadsad) - Create an ad
* [createAdsCampaign](#createadscampaign) - Create a campaign
* [createAdsGroup](#createadsgroup) - Create a group
* [createAdsOrganization](#createadsorganization) - Create an organization
* [getAdsAd](#getadsad) - Retrieve an ad
* [getAdsCampaign](#getadscampaign) - Retrieve a campaign
* [getAdsGroup](#getadsgroup) - Retrieve a group
* [getAdsOrganization](#getadsorganization) - Retrieve an organization
* [listAdsAds](#listadsads) - List all ads
* [listAdsCampaigns](#listadscampaigns) - List all campaigns
* [listAdsGroups](#listadsgroups) - List all groups
* [listAdsOrganizations](#listadsorganizations) - List all organizations
* [listAdsReports](#listadsreports) - List all reports
* [patchAdsAd](#patchadsad) - Update an ad
* [patchAdsCampaign](#patchadscampaign) - Update a campaign
* [patchAdsGroup](#patchadsgroup) - Update a group
* [patchAdsOrganization](#patchadsorganization) - Update an organization
* [removeAdsAd](#removeadsad) - Remove an ad
* [removeAdsCampaign](#removeadscampaign) - Remove a campaign
* [removeAdsGroup](#removeadsgroup) - Remove a group
* [removeAdsOrganization](#removeadsorganization) - Remove an organization
* [updateAdsAd](#updateadsad) - Update an ad
* [updateAdsCampaign](#updateadscampaign) - Update a campaign
* [updateAdsGroup](#updateadsgroup) - Update a group
* [updateAdsOrganization](#updateadsorganization) - Update an organization

## createAdsAd

Create an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAd" method="post" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAdRequest req = CreateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAdResponse res = sdk.ads().createAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [CreateAdsAdRequest](../../models/operations/CreateAdsAdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateAdsAdResponse](../../models/operations/CreateAdsAdResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateAdsCampaignResponse res = sdk.ads().createAdsCampaign()
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

## createAdsGroup

Create a group

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsGroup" method="post" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsGroupRequest req = CreateAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsGroupResponse res = sdk.ads().createAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateAdsGroupRequest](../../models/operations/CreateAdsGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateAdsGroupResponse](../../models/operations/CreateAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsOrganization

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsOrganization" method="post" path="/ads/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsOrganizationRequest req = CreateAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsOrganizationResponse res = sdk.ads().createAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAdsOrganizationRequest](../../models/operations/CreateAdsOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAdsOrganizationResponse](../../models/operations/CreateAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsAd

Retrieve an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsAd" method="get" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsAdRequest req = GetAdsAdRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsAdResponse res = sdk.ads().getAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetAdsAdRequest](../../models/operations/GetAdsAdRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetAdsAdResponse](../../models/operations/GetAdsAdResponse.md)**

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

        GetAdsCampaignResponse res = sdk.ads().getAdsCampaign()
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

## getAdsGroup

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsGroup" method="get" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsGroupRequest req = GetAdsGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsGroupResponse res = sdk.ads().getAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetAdsGroupRequest](../../models/operations/GetAdsGroupRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetAdsGroupResponse](../../models/operations/GetAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsOrganization

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsOrganization" method="get" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsOrganizationRequest req = GetAdsOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsOrganizationResponse res = sdk.ads().getAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAdsOrganizationRequest](../../models/operations/GetAdsOrganizationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAdsOrganizationResponse](../../models/operations/GetAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsAds

List all ads

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsAds" method="get" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsAdsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsAdsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsAdsRequest req = ListAdsAdsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsAdsResponse res = sdk.ads().listAdsAds()
                .request(req)
                .call();

        if (res.adsAds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListAdsAdsRequest](../../models/operations/ListAdsAdsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListAdsAdsResponse](../../models/operations/ListAdsAdsResponse.md)**

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

        ListAdsCampaignsResponse res = sdk.ads().listAdsCampaigns()
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

## listAdsGroups

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsGroups" method="get" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsGroupsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsGroupsRequest req = ListAdsGroupsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsGroupsResponse res = sdk.ads().listAdsGroups()
                .request(req)
                .call();

        if (res.adsGroups().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListAdsGroupsRequest](../../models/operations/ListAdsGroupsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListAdsGroupsResponse](../../models/operations/ListAdsGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsOrganizations

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsOrganizations" method="get" path="/ads/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsOrganizationsRequest req = ListAdsOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsOrganizationsResponse res = sdk.ads().listAdsOrganizations()
                .request(req)
                .call();

        if (res.adsOrganizations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAdsOrganizationsRequest](../../models/operations/ListAdsOrganizationsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAdsOrganizationsResponse](../../models/operations/ListAdsOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsReports

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsReports" method="get" path="/ads/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsReportsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsReportsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsReportsRequest req = ListAdsReportsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsReportsResponse res = sdk.ads().listAdsReports()
                .request(req)
                .call();

        if (res.adsReports().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListAdsReportsRequest](../../models/operations/ListAdsReportsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListAdsReportsResponse](../../models/operations/ListAdsReportsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsAd

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsAd" method="patch" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsAdRequest req = PatchAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsAdResponse res = sdk.ads().patchAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [PatchAdsAdRequest](../../models/operations/PatchAdsAdRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[PatchAdsAdResponse](../../models/operations/PatchAdsAdResponse.md)**

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

        PatchAdsCampaignResponse res = sdk.ads().patchAdsCampaign()
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

## patchAdsGroup

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsGroup" method="patch" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsGroupRequest req = PatchAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsGroupResponse res = sdk.ads().patchAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchAdsGroupRequest](../../models/operations/PatchAdsGroupRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchAdsGroupResponse](../../models/operations/PatchAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsOrganization" method="patch" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsOrganizationRequest req = PatchAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsOrganizationResponse res = sdk.ads().patchAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAdsOrganizationRequest](../../models/operations/PatchAdsOrganizationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAdsOrganizationResponse](../../models/operations/PatchAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsAd

Remove an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsAd" method="delete" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsAdRequest req = RemoveAdsAdRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsAdResponse res = sdk.ads().removeAdsAd()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [RemoveAdsAdRequest](../../models/operations/RemoveAdsAdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[RemoveAdsAdResponse](../../models/operations/RemoveAdsAdResponse.md)**

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

        RemoveAdsCampaignResponse res = sdk.ads().removeAdsCampaign()
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

## removeAdsGroup

Remove a group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsGroup" method="delete" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsGroupRequest req = RemoveAdsGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsGroupResponse res = sdk.ads().removeAdsGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveAdsGroupRequest](../../models/operations/RemoveAdsGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveAdsGroupResponse](../../models/operations/RemoveAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsOrganization

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsOrganization" method="delete" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsOrganizationRequest req = RemoveAdsOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsOrganizationResponse res = sdk.ads().removeAdsOrganization()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAdsOrganizationRequest](../../models/operations/RemoveAdsOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAdsOrganizationResponse](../../models/operations/RemoveAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsAd

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsAd" method="put" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsAdRequest req = UpdateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsAdResponse res = sdk.ads().updateAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [UpdateAdsAdRequest](../../models/operations/UpdateAdsAdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[UpdateAdsAdResponse](../../models/operations/UpdateAdsAdResponse.md)**

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

        UpdateAdsCampaignResponse res = sdk.ads().updateAdsCampaign()
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

## updateAdsGroup

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsGroup" method="put" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsGroupRequest req = UpdateAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsGroupResponse res = sdk.ads().updateAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateAdsGroupRequest](../../models/operations/UpdateAdsGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateAdsGroupResponse](../../models/operations/UpdateAdsGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsOrganization" method="put" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsOrganizationRequest req = UpdateAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsOrganizationResponse res = sdk.ads().updateAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAdsOrganizationRequest](../../models/operations/UpdateAdsOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAdsOrganizationResponse](../../models/operations/UpdateAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |