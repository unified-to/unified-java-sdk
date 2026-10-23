# Ads

## Overview

### Available Operations

* [createAdsAd](#createadsad) - Create an ad
* [createAdsAsset](#createadsasset) - Create an asset
* [createAdsCampaign](#createadscampaign) - Create a campaign
* [createAdsCreative](#createadscreative) - Create a creative
* [createAdsGroup](#createadsgroup) - Create a group
* [createAdsInsertionorder](#createadsinsertionorder) - Create an insertionorder
* [createAdsOrganization](#createadsorganization) - Create an organization
* [getAdsAd](#getadsad) - Retrieve an ad
* [getAdsAsset](#getadsasset) - Retrieve an asset
* [getAdsCampaign](#getadscampaign) - Retrieve a campaign
* [getAdsCreative](#getadscreative) - Retrieve a creative
* [getAdsGroup](#getadsgroup) - Retrieve a group
* [getAdsInsertionorder](#getadsinsertionorder) - Retrieve an insertionorder
* [getAdsOrganization](#getadsorganization) - Retrieve an organization
* [getAdsPromoted](#getadspromoted) - Retrieve a promoted
* [getAdsTarget](#getadstarget) - Retrieve a target
* [listAdsAds](#listadsads) - List all ads
* [listAdsAssets](#listadsassets) - List all assets
* [listAdsCampaigns](#listadscampaigns) - List all campaigns
* [listAdsCreatives](#listadscreatives) - List all creatives
* [listAdsGroups](#listadsgroups) - List all groups
* [listAdsInsertionorders](#listadsinsertionorders) - List all insertionorders
* [listAdsOrganizations](#listadsorganizations) - List all organizations
* [listAdsPromoteds](#listadspromoteds) - List all promoteds
* [listAdsReports](#listadsreports) - List all reports
* [listAdsTargets](#listadstargets) - List all targets
* [patchAdsAd](#patchadsad) - Update an ad
* [patchAdsCampaign](#patchadscampaign) - Update a campaign
* [patchAdsCreative](#patchadscreative) - Update a creative
* [patchAdsGroup](#patchadsgroup) - Update a group
* [patchAdsInsertionorder](#patchadsinsertionorder) - Update an insertionorder
* [patchAdsOrganization](#patchadsorganization) - Update an organization
* [removeAdsAd](#removeadsad) - Remove an ad
* [removeAdsCampaign](#removeadscampaign) - Remove a campaign
* [removeAdsCreative](#removeadscreative) - Remove a creative
* [removeAdsGroup](#removeadsgroup) - Remove a group
* [removeAdsInsertionorder](#removeadsinsertionorder) - Remove an insertionorder
* [removeAdsOrganization](#removeadsorganization) - Remove an organization
* [updateAdsAd](#updateadsad) - Update an ad
* [updateAdsCampaign](#updateadscampaign) - Update a campaign
* [updateAdsCreative](#updateadscreative) - Update a creative
* [updateAdsGroup](#updateadsgroup) - Update a group
* [updateAdsInsertionorder](#updateadsinsertionorder) - Update an insertionorder
* [updateAdsOrganization](#updateadsorganization) - Update an organization

## createAdsAd

Creates a AdsAd. Provide the unified AdsAd fields in the request body; they are mapped to the provider's API. Returns the created AdsAd.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAd" method="post" path="/ads/{connection_id}/ad" example="ads_ad" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAdRequest req = CreateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .adCopy("Ascisco tolero caute sapiente. Valens unde comedo cursus crinis nobis thema. Cohaero nisi ullam tum unde ultio vilicus auditor capio.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Robel, Nader and Rau")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/LwOzrpr9/948/2793")
                    .description("Accedo vespillo carpo dolor decet stillicidium comptus tenuis.")
                    .finalUrl("https://improbable-sanity.com")
                    .id("f99bb936-8e4a-4d59-ac47-6a78b6e7a88e")
                    .metadata(List.of())
                    .name("Hermiston Group")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-06-19T09:07:00.061Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAdResponse res = sdk.ads().createAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
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

## createAdsAsset

Creates a AdsAsset. Provide the unified AdsAsset fields in the request body; they are mapped to the provider's API. Returns the created AdsAsset.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAsset" method="post" path="/ads/{connection_id}/asset" example="ads_asset" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAssetRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsAssetResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAssetRequest req = CreateAdsAssetRequest.builder()
                .adsAsset(AdsAsset.builder()
                    .createdAt(OffsetDateTime.parse("2020-03-27T20:14:38.603Z"))
                    .height(400d)
                    .id("0baeee5f-7772-4d48-b03a-0fe70290ec43")
                    .metadata(List.of())
                    .mimeType("IMAGE_PNG")
                    .name("Lockman - DuBuque")
                    .type(AdsAssetType.IMAGE)
                    .updatedAt(OffsetDateTime.parse("2022-03-25T19:07:14.902Z"))
                    .url("https://informal-perfection.com/")
                    .width(600d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAssetResponse res = sdk.ads().createAdsAsset()
                .request(req)
                .call();

        if (res.adsAsset().isPresent()) {
            System.out.println(res.adsAsset().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateAdsAssetRequest](../../models/operations/CreateAdsAssetRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateAdsAssetResponse](../../models/operations/CreateAdsAssetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsCampaign

Creates a AdsCampaign. Provide the unified AdsCampaign fields in the request body; they are mapped to the provider's API. Returns the created AdsCampaign.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCampaign" method="post" path="/ads/{connection_id}/campaign" example="ads_campaign" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCampaignRequest req = CreateAdsCampaignRequest.builder()
                .adsCampaign(AdsCampaign.builder()
                    .budgetAmount(8743.179536121897)
                    .budgetPeriod(BudgetPeriod.MONTHLY)
                    .category("CREDIT")
                    .createdAt(OffsetDateTime.parse("2022-05-21T08:51:41.868Z"))
                    .currency("USD")
                    .effectiveStatus(EffectiveStatus.NOT_ELIGIBLE)
                    .endAt(OffsetDateTime.parse("2025-06-02T08:13:28.012Z"))
                    .id("a0e9d3cc-c778-4da3-833d-0c3447a979b0")
                    .labels(List.of(
                        "comedo"))
                    .metadata(List.of())
                    .name("Emard Inc")
                    .startAt(OffsetDateTime.parse("2022-07-21T12:38:42.770Z"))
                    .status(AdsCampaignStatus.PROCESSING_FAILED)
                    .targeting(PropertyAdsCampaignTargeting.builder()
                        .build())
                    .totalSpendAmount(2349.8642875347286)
                    .updatedAt(OffsetDateTime.parse("2026-01-03T05:11:36.658Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCampaignResponse res = sdk.ads().createAdsCampaign()
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
| `request`                                                                       | [CreateAdsCampaignRequest](../../models/operations/CreateAdsCampaignRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAdsCampaignResponse](../../models/operations/CreateAdsCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsCreative

Creates a AdsCreative. Provide the unified AdsCreative fields in the request body; they are mapped to the provider's API. Returns the created AdsCreative.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCreative" method="post" path="/ads/{connection_id}/creative" example="ads_creative" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCreativeRequest req = CreateAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-17T11:24:51.093Z"))
                    .id("db8fcbdf-d0d3-41a0-9887-6880558dfe4c")
                    .labels(List.of(
                        "coma",
                        "accedo",
                        "termes"))
                    .metadata(List.of())
                    .name("Brekke, Bradtke and Robel")
                    .status(AdsCreativeStatus.PAUSED)
                    .updatedAt(OffsetDateTime.parse("2021-06-28T04:00:21.161Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCreativeResponse res = sdk.ads().createAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAdsCreativeRequest](../../models/operations/CreateAdsCreativeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAdsCreativeResponse](../../models/operations/CreateAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsGroup

Creates a AdsGroup. Provide the unified AdsGroup fields in the request body; they are mapped to the provider's API. Returns the created AdsGroup.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsGroup" method="post" path="/ads/{connection_id}/group" example="ads_group" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsGroupRequest req = CreateAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .bidAmount(26.16030164062977)
                    .budgetAmount(5099.175239447504)
                    .budgetPeriod(AdsGroupBudgetPeriod.MONTHLY)
                    .createdAt(OffsetDateTime.parse("2019-08-29T17:59:41.045Z"))
                    .currency("USD")
                    .effectiveStatus(AdsGroupEffectiveStatus.PAUSED)
                    .endAt(OffsetDateTime.parse("2026-06-26T23:07:58.804Z"))
                    .id("33aa1084-c192-4f50-ba7f-514c1cb59f6a")
                    .languageLocale("fr-FR")
                    .metadata(List.of())
                    .name("Stark - Baumbach")
                    .startAt(OffsetDateTime.parse("2026-01-11T01:19:20.030Z"))
                    .status(AdsGroupStatus.PROCESSING)
                    .targeting(PropertyAdsGroupTargeting.builder()
                        .build())
                    .updatedAt(OffsetDateTime.parse("2022-01-14T08:06:10.960Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsGroupResponse res = sdk.ads().createAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
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

## createAdsInsertionorder

Creates a AdsInsertionorder. Provide the unified AdsInsertionorder fields in the request body; they are mapped to the provider's API. Returns the created AdsInsertionorder.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsInsertionorder" method="post" path="/ads/{connection_id}/insertionorder" example="ads_insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsInsertionorderRequest req = CreateAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .createdAt(OffsetDateTime.parse("2021-04-10T06:57:36.611Z"))
                    .id("1b2ee6a0-4ac7-43a7-bba2-297ab9ee1078")
                    .metadata(List.of())
                    .name("Kunde, Smith and Reinger")
                    .status(AdsInsertionorderStatus.UNSPECIFIED)
                    .updatedAt(OffsetDateTime.parse("2021-04-28T20:13:45.759Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsInsertionorderResponse res = sdk.ads().createAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAdsInsertionorderRequest](../../models/operations/CreateAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAdsInsertionorderResponse](../../models/operations/CreateAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsOrganization

Creates a AdsOrganization. Provide the unified AdsOrganization fields in the request body; they are mapped to the provider's API. Returns the created AdsOrganization.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsOrganization" method="post" path="/ads/{connection_id}/organization" example="ads_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsOrganizationRequest req = CreateAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .accountNumber("LQUJx8zQBW")
                    .createdAt(OffsetDateTime.parse("2020-07-23T21:47:11.440Z"))
                    .currency("USD")
                    .id("cc7d1fb7-5e4c-476b-9d99-6396b0ba9e41")
                    .managers(List.of())
                    .metadata(List.of())
                    .name("Ankunding Inc")
                    .status(AdsOrganizationStatus.PROCESSING)
                    .timezone("Europe/Chisinau")
                    .updatedAt(OffsetDateTime.parse("2026-03-30T22:28:49.365Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsOrganizationResponse res = sdk.ads().createAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
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

Retrieves a single AdsAd by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.adsAd().get());
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

## getAdsAsset

Retrieves a single AdsAsset by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsAsset" method="get" path="/ads/{connection_id}/asset/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsAssetRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsAssetResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsAssetRequest req = GetAdsAssetRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsAssetResponse res = sdk.ads().getAdsAsset()
                .request(req)
                .call();

        if (res.adsAsset().isPresent()) {
            System.out.println(res.adsAsset().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetAdsAssetRequest](../../models/operations/GetAdsAssetRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetAdsAssetResponse](../../models/operations/GetAdsAssetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsCampaign

Retrieves a single AdsCampaign by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.adsCampaign().get());
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

## getAdsCreative

Retrieves a single AdsCreative by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsCreative" method="get" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsCreativeRequest req = GetAdsCreativeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsCreativeResponse res = sdk.ads().getAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAdsCreativeRequest](../../models/operations/GetAdsCreativeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAdsCreativeResponse](../../models/operations/GetAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsGroup

Retrieves a single AdsGroup by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.adsGroup().get());
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

## getAdsInsertionorder

Retrieves a single AdsInsertionorder by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsInsertionorder" method="get" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsInsertionorderRequest req = GetAdsInsertionorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsInsertionorderResponse res = sdk.ads().getAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAdsInsertionorderRequest](../../models/operations/GetAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAdsInsertionorderResponse](../../models/operations/GetAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsOrganization

Retrieves a single AdsOrganization by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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
            System.out.println(res.adsOrganization().get());
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

## getAdsPromoted

Retrieves a single AdsPromoted by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsPromoted" method="get" path="/ads/{connection_id}/promoted/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsPromotedRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsPromotedResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsPromotedRequest req = GetAdsPromotedRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsPromotedResponse res = sdk.ads().getAdsPromoted()
                .request(req)
                .call();

        if (res.adsPromoted().isPresent()) {
            System.out.println(res.adsPromoted().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAdsPromotedRequest](../../models/operations/GetAdsPromotedRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAdsPromotedResponse](../../models/operations/GetAdsPromotedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsTarget

Retrieves a single AdsTarget by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsTarget" method="get" path="/ads/{connection_id}/target/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsTargetRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsTargetResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsTargetRequest req = GetAdsTargetRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsTargetResponse res = sdk.ads().getAdsTarget()
                .request(req)
                .call();

        if (res.adsTarget().isPresent()) {
            System.out.println(res.adsTarget().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetAdsTargetRequest](../../models/operations/GetAdsTargetRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetAdsTargetResponse](../../models/operations/GetAdsTargetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsAds

Returns a list of AdsAds. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.adsAds().get());
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

## listAdsAssets

Returns a list of AdsAssets. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsAssets" method="get" path="/ads/{connection_id}/asset" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsAssetsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsAssetsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsAssetsRequest req = ListAdsAssetsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsAssetsResponse res = sdk.ads().listAdsAssets()
                .request(req)
                .call();

        if (res.adsAssets().isPresent()) {
            System.out.println(res.adsAssets().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListAdsAssetsRequest](../../models/operations/ListAdsAssetsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListAdsAssetsResponse](../../models/operations/ListAdsAssetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsCampaigns

Returns a list of AdsCampaigns. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.adsCampaigns().get());
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

## listAdsCreatives

Returns a list of AdsCreatives. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsCreatives" method="get" path="/ads/{connection_id}/creative" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsCreativesRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsCreativesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsCreativesRequest req = ListAdsCreativesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsCreativesResponse res = sdk.ads().listAdsCreatives()
                .request(req)
                .call();

        if (res.adsCreatives().isPresent()) {
            System.out.println(res.adsCreatives().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAdsCreativesRequest](../../models/operations/ListAdsCreativesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAdsCreativesResponse](../../models/operations/ListAdsCreativesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsGroups

Returns a list of AdsGroups. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.adsGroups().get());
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

## listAdsInsertionorders

Returns a list of AdsInsertionorders. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsInsertionorders" method="get" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionordersRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionordersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsInsertionordersRequest req = ListAdsInsertionordersRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsInsertionordersResponse res = sdk.ads().listAdsInsertionorders()
                .request(req)
                .call();

        if (res.adsInsertionorders().isPresent()) {
            System.out.println(res.adsInsertionorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAdsInsertionordersRequest](../../models/operations/ListAdsInsertionordersRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAdsInsertionordersResponse](../../models/operations/ListAdsInsertionordersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsOrganizations

Returns a list of AdsOrganizations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.adsOrganizations().get());
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

## listAdsPromoteds

Returns a list of AdsPromoteds. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsPromoteds" method="get" path="/ads/{connection_id}/promoted" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsPromotedsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsPromotedsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsPromotedsRequest req = ListAdsPromotedsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsPromotedsResponse res = sdk.ads().listAdsPromoteds()
                .request(req)
                .call();

        if (res.adsPromoteds().isPresent()) {
            System.out.println(res.adsPromoteds().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAdsPromotedsRequest](../../models/operations/ListAdsPromotedsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAdsPromotedsResponse](../../models/operations/ListAdsPromotedsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsReports

Returns a list of AdsReports. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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
            System.out.println(res.adsReports().get());
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

## listAdsTargets

Returns a list of AdsTargets. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsTargets" method="get" path="/ads/{connection_id}/target" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsTargetsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsTargetsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsTargetsRequest req = ListAdsTargetsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsTargetsResponse res = sdk.ads().listAdsTargets()
                .request(req)
                .call();

        if (res.adsTargets().isPresent()) {
            System.out.println(res.adsTargets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListAdsTargetsRequest](../../models/operations/ListAdsTargetsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListAdsTargetsResponse](../../models/operations/ListAdsTargetsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsAd

Updates the AdsAd identified by `id`. Provide the unified AdsAd fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsAd" method="patch" path="/ads/{connection_id}/ad/{id}" example="ads_ad" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsAdRequest req = PatchAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .adCopy("Ascisco tolero caute sapiente. Valens unde comedo cursus crinis nobis thema. Cohaero nisi ullam tum unde ultio vilicus auditor capio.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Robel, Nader and Rau")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/LwOzrpr9/948/2793")
                    .description("Accedo vespillo carpo dolor decet stillicidium comptus tenuis.")
                    .finalUrl("https://improbable-sanity.com")
                    .id("c4a2dccc-9f35-4678-8a74-b7893da9c84b")
                    .metadata(List.of())
                    .name("Hermiston Group")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-06-19T09:07:00.076Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsAdResponse res = sdk.ads().patchAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
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

Updates the AdsCampaign identified by `id`. Provide the unified AdsCampaign fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCampaign" method="patch" path="/ads/{connection_id}/campaign/{id}" example="ads_campaign" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCampaignRequest req = PatchAdsCampaignRequest.builder()
                .adsCampaign(AdsCampaign.builder()
                    .budgetAmount(8743.179536121897)
                    .budgetPeriod(BudgetPeriod.MONTHLY)
                    .category("CREDIT")
                    .createdAt(OffsetDateTime.parse("2022-05-21T08:51:41.868Z"))
                    .currency("USD")
                    .effectiveStatus(EffectiveStatus.NOT_ELIGIBLE)
                    .endAt(OffsetDateTime.parse("2025-06-02T08:13:28.096Z"))
                    .id("9ef1bb9b-b539-4c61-8332-5b0f68704f71")
                    .labels(List.of(
                        "comedo"))
                    .metadata(List.of())
                    .name("Emard Inc")
                    .startAt(OffsetDateTime.parse("2022-07-21T12:38:42.774Z"))
                    .status(AdsCampaignStatus.PROCESSING_FAILED)
                    .targeting(PropertyAdsCampaignTargeting.builder()
                        .build())
                    .totalSpendAmount(2349.8642875347286)
                    .updatedAt(OffsetDateTime.parse("2026-01-03T05:11:36.758Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCampaignResponse res = sdk.ads().patchAdsCampaign()
                .request(req)
                .call();

        if (res.adsCampaign().isPresent()) {
            System.out.println(res.adsCampaign().get());
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

## patchAdsCreative

Updates the AdsCreative identified by `id`. Provide the unified AdsCreative fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCreative" method="patch" path="/ads/{connection_id}/creative/{id}" example="ads_creative" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCreativeRequest req = PatchAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-17T11:24:51.093Z"))
                    .id("395a9ce7-58d0-4149-b558-42c00806bcb1")
                    .labels(List.of(
                        "coma",
                        "accedo",
                        "termes"))
                    .metadata(List.of())
                    .name("Brekke, Bradtke and Robel")
                    .status(AdsCreativeStatus.PAUSED)
                    .updatedAt(OffsetDateTime.parse("2021-06-28T04:00:21.170Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCreativeResponse res = sdk.ads().patchAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchAdsCreativeRequest](../../models/operations/PatchAdsCreativeRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchAdsCreativeResponse](../../models/operations/PatchAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsGroup

Updates the AdsGroup identified by `id`. Provide the unified AdsGroup fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsGroup" method="patch" path="/ads/{connection_id}/group/{id}" example="ads_group" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsGroupRequest req = PatchAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .bidAmount(26.16030164062977)
                    .budgetAmount(5099.175239447504)
                    .budgetPeriod(AdsGroupBudgetPeriod.MONTHLY)
                    .createdAt(OffsetDateTime.parse("2019-08-29T17:59:41.045Z"))
                    .currency("USD")
                    .effectiveStatus(AdsGroupEffectiveStatus.PAUSED)
                    .endAt(OffsetDateTime.parse("2026-06-26T23:07:58.945Z"))
                    .id("01f527a7-1e72-4c9d-a965-a5f84953ffe7")
                    .languageLocale("fr-FR")
                    .metadata(List.of())
                    .name("Stark - Baumbach")
                    .startAt(OffsetDateTime.parse("2026-01-11T01:19:20.161Z"))
                    .status(AdsGroupStatus.PROCESSING)
                    .targeting(PropertyAdsGroupTargeting.builder()
                        .build())
                    .updatedAt(OffsetDateTime.parse("2022-01-14T08:06:11.009Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsGroupResponse res = sdk.ads().patchAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
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

## patchAdsInsertionorder

Updates the AdsInsertionorder identified by `id`. Provide the unified AdsInsertionorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsInsertionorder" method="patch" path="/ads/{connection_id}/insertionorder/{id}" example="ads_insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsInsertionorderRequest req = PatchAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .createdAt(OffsetDateTime.parse("2021-04-10T06:57:36.611Z"))
                    .id("48cfd940-3ab9-459c-ac54-d578d5582da6")
                    .metadata(List.of())
                    .name("Kunde, Smith and Reinger")
                    .status(AdsInsertionorderStatus.UNSPECIFIED)
                    .updatedAt(OffsetDateTime.parse("2021-04-28T20:13:45.759Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsInsertionorderResponse res = sdk.ads().patchAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAdsInsertionorderRequest](../../models/operations/PatchAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAdsInsertionorderResponse](../../models/operations/PatchAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsOrganization

Updates the AdsOrganization identified by `id`. Provide the unified AdsOrganization fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsOrganization" method="patch" path="/ads/{connection_id}/organization/{id}" example="ads_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsOrganizationRequest req = PatchAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .accountNumber("LQUJx8zQBW")
                    .createdAt(OffsetDateTime.parse("2020-07-23T21:47:11.440Z"))
                    .currency("USD")
                    .id("d694fb53-442c-4d9b-982a-e501563b554b")
                    .managers(List.of())
                    .metadata(List.of())
                    .name("Ankunding Inc")
                    .status(AdsOrganizationStatus.PROCESSING)
                    .timezone("Europe/Chisinau")
                    .updatedAt(OffsetDateTime.parse("2026-03-30T22:28:49.383Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsOrganizationResponse res = sdk.ads().patchAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
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

Deletes the AdsAd identified by `id`.

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

Deletes the AdsCampaign identified by `id`.

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

## removeAdsCreative

Deletes the AdsCreative identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsCreative" method="delete" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsCreativeRequest req = RemoveAdsCreativeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsCreativeResponse res = sdk.ads().removeAdsCreative()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveAdsCreativeRequest](../../models/operations/RemoveAdsCreativeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveAdsCreativeResponse](../../models/operations/RemoveAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsGroup

Deletes the AdsGroup identified by `id`.

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

## removeAdsInsertionorder

Deletes the AdsInsertionorder identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsInsertionorder" method="delete" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsInsertionorderRequest req = RemoveAdsInsertionorderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsInsertionorderResponse res = sdk.ads().removeAdsInsertionorder()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAdsInsertionorderRequest](../../models/operations/RemoveAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAdsInsertionorderResponse](../../models/operations/RemoveAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsOrganization

Deletes the AdsOrganization identified by `id`.

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

Updates the AdsAd identified by `id`. Provide the unified AdsAd fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsAd" method="put" path="/ads/{connection_id}/ad/{id}" example="ads_ad" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAdResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsAdRequest req = UpdateAdsAdRequest.builder()
                .adsAd(AdsAd.builder()
                    .adCopy("Ascisco tolero caute sapiente. Valens unde comedo cursus crinis nobis thema. Cohaero nisi ullam tum unde ultio vilicus auditor capio.")
                    .adType(AdType.SOCIAL)
                    .advertiserName("Robel, Nader and Rau")
                    .createdAt(OffsetDateTime.parse("2022-11-08T03:38:20.978Z"))
                    .creativeAssetUrl("https://picsum.photos/seed/LwOzrpr9/948/2793")
                    .description("Accedo vespillo carpo dolor decet stillicidium comptus tenuis.")
                    .finalUrl("https://improbable-sanity.com")
                    .id("c4a2dccc-9f35-4678-8a74-b7893da9c84b")
                    .metadata(List.of())
                    .name("Hermiston Group")
                    .status(AdsAdStatus.ARCHIVED)
                    .updatedAt(OffsetDateTime.parse("2024-06-19T09:07:00.076Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsAdResponse res = sdk.ads().updateAdsAd()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
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

Updates the AdsCampaign identified by `id`. Provide the unified AdsCampaign fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCampaign" method="put" path="/ads/{connection_id}/campaign/{id}" example="ads_campaign" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCampaignRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCampaignResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCampaignRequest req = UpdateAdsCampaignRequest.builder()
                .adsCampaign(AdsCampaign.builder()
                    .budgetAmount(8743.179536121897)
                    .budgetPeriod(BudgetPeriod.MONTHLY)
                    .category("CREDIT")
                    .createdAt(OffsetDateTime.parse("2022-05-21T08:51:41.868Z"))
                    .currency("USD")
                    .effectiveStatus(EffectiveStatus.NOT_ELIGIBLE)
                    .endAt(OffsetDateTime.parse("2025-06-02T08:13:28.096Z"))
                    .id("9ef1bb9b-b539-4c61-8332-5b0f68704f71")
                    .labels(List.of(
                        "comedo"))
                    .metadata(List.of())
                    .name("Emard Inc")
                    .startAt(OffsetDateTime.parse("2022-07-21T12:38:42.774Z"))
                    .status(AdsCampaignStatus.PROCESSING_FAILED)
                    .targeting(PropertyAdsCampaignTargeting.builder()
                        .build())
                    .totalSpendAmount(2349.8642875347286)
                    .updatedAt(OffsetDateTime.parse("2026-01-03T05:11:36.758Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCampaignResponse res = sdk.ads().updateAdsCampaign()
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
| `request`                                                                       | [UpdateAdsCampaignRequest](../../models/operations/UpdateAdsCampaignRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAdsCampaignResponse](../../models/operations/UpdateAdsCampaignResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsCreative

Updates the AdsCreative identified by `id`. Provide the unified AdsCreative fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCreative" method="put" path="/ads/{connection_id}/creative/{id}" example="ads_creative" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreativeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreativeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCreativeRequest req = UpdateAdsCreativeRequest.builder()
                .adsCreative(AdsCreative.builder()
                    .createdAt(OffsetDateTime.parse("2020-02-17T11:24:51.093Z"))
                    .id("395a9ce7-58d0-4149-b558-42c00806bcb1")
                    .labels(List.of(
                        "coma",
                        "accedo",
                        "termes"))
                    .metadata(List.of())
                    .name("Brekke, Bradtke and Robel")
                    .status(AdsCreativeStatus.PAUSED)
                    .updatedAt(OffsetDateTime.parse("2021-06-28T04:00:21.170Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCreativeResponse res = sdk.ads().updateAdsCreative()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAdsCreativeRequest](../../models/operations/UpdateAdsCreativeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAdsCreativeResponse](../../models/operations/UpdateAdsCreativeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsGroup

Updates the AdsGroup identified by `id`. Provide the unified AdsGroup fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsGroup" method="put" path="/ads/{connection_id}/group/{id}" example="ads_group" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroupRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroupResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsGroupRequest req = UpdateAdsGroupRequest.builder()
                .adsGroup(AdsGroup.builder()
                    .bidAmount(26.16030164062977)
                    .budgetAmount(5099.175239447504)
                    .budgetPeriod(AdsGroupBudgetPeriod.MONTHLY)
                    .createdAt(OffsetDateTime.parse("2019-08-29T17:59:41.045Z"))
                    .currency("USD")
                    .effectiveStatus(AdsGroupEffectiveStatus.PAUSED)
                    .endAt(OffsetDateTime.parse("2026-06-26T23:07:58.945Z"))
                    .id("01f527a7-1e72-4c9d-a965-a5f84953ffe7")
                    .languageLocale("fr-FR")
                    .metadata(List.of())
                    .name("Stark - Baumbach")
                    .startAt(OffsetDateTime.parse("2026-01-11T01:19:20.161Z"))
                    .status(AdsGroupStatus.PROCESSING)
                    .targeting(PropertyAdsGroupTargeting.builder()
                        .build())
                    .updatedAt(OffsetDateTime.parse("2022-01-14T08:06:11.009Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsGroupResponse res = sdk.ads().updateAdsGroup()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
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

## updateAdsInsertionorder

Updates the AdsInsertionorder identified by `id`. Provide the unified AdsInsertionorder fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsInsertionorder" method="put" path="/ads/{connection_id}/insertionorder/{id}" example="ads_insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsInsertionorderRequest req = UpdateAdsInsertionorderRequest.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .createdAt(OffsetDateTime.parse("2021-04-10T06:57:36.611Z"))
                    .id("48cfd940-3ab9-459c-ac54-d578d5582da6")
                    .metadata(List.of())
                    .name("Kunde, Smith and Reinger")
                    .status(AdsInsertionorderStatus.UNSPECIFIED)
                    .updatedAt(OffsetDateTime.parse("2021-04-28T20:13:45.759Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsInsertionorderResponse res = sdk.ads().updateAdsInsertionorder()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAdsInsertionorderRequest](../../models/operations/UpdateAdsInsertionorderRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAdsInsertionorderResponse](../../models/operations/UpdateAdsInsertionorderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsOrganization

Updates the AdsOrganization identified by `id`. Provide the unified AdsOrganization fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsOrganization" method="put" path="/ads/{connection_id}/organization/{id}" example="ads_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsOrganizationRequest req = UpdateAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .accountNumber("LQUJx8zQBW")
                    .createdAt(OffsetDateTime.parse("2020-07-23T21:47:11.440Z"))
                    .currency("USD")
                    .id("d694fb53-442c-4d9b-982a-e501563b554b")
                    .managers(List.of())
                    .metadata(List.of())
                    .name("Ankunding Inc")
                    .status(AdsOrganizationStatus.PROCESSING)
                    .timezone("Europe/Chisinau")
                    .updatedAt(OffsetDateTime.parse("2026-03-30T22:28:49.383Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsOrganizationResponse res = sdk.ads().updateAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
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