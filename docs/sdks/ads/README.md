# Ads

## Overview

### Available Operations

* [createAdsAd2](#createadsad2) - Create an ad
* [createAdsCampaign2](#createadscampaign2) - Create a campaign
* [createAdsCreative2](#createadscreative2) - Create a creative
* [createAdsGroup2](#createadsgroup2) - Create a group
* [createAdsInsertionorder2](#createadsinsertionorder2) - Create an insertionorder
* [createAdsOrganization2](#createadsorganization2) - Create an organization
* [getAdsAd2](#getadsad2) - Retrieve an ad
* [getAdsCampaign2](#getadscampaign2) - Retrieve a campaign
* [getAdsCreative2](#getadscreative2) - Retrieve a creative
* [getAdsGroup2](#getadsgroup2) - Retrieve a group
* [getAdsInsertionorder2](#getadsinsertionorder2) - Retrieve an insertionorder
* [getAdsOrganization2](#getadsorganization2) - Retrieve an organization
* [getAdsPromoted2](#getadspromoted2) - Retrieve a promoted
* [getAdsTarget2](#getadstarget2) - Retrieve a target
* [listAdsAds2](#listadsads2) - List all ads
* [listAdsCampaigns2](#listadscampaigns2) - List all campaigns
* [listAdsCreatives2](#listadscreatives2) - List all creatives
* [listAdsGroups2](#listadsgroups2) - List all groups
* [listAdsInsertionorders2](#listadsinsertionorders2) - List all insertionorders
* [listAdsOrganizations2](#listadsorganizations2) - List all organizations
* [listAdsPromoteds2](#listadspromoteds2) - List all promoteds
* [listAdsReports2](#listadsreports2) - List all reports
* [listAdsTargets2](#listadstargets2) - List all targets
* [patchAdsAd2](#patchadsad2) - Update an ad
* [patchAdsCampaign2](#patchadscampaign2) - Update a campaign
* [patchAdsCreative2](#patchadscreative2) - Update a creative
* [patchAdsGroup2](#patchadsgroup2) - Update a group
* [patchAdsInsertionorder2](#patchadsinsertionorder2) - Update an insertionorder
* [patchAdsOrganization2](#patchadsorganization2) - Update an organization
* [removeAdsAd2](#removeadsad2) - Remove an ad
* [removeAdsCampaign2](#removeadscampaign2) - Remove a campaign
* [removeAdsCreative2](#removeadscreative2) - Remove a creative
* [removeAdsGroup2](#removeadsgroup2) - Remove a group
* [removeAdsInsertionorder2](#removeadsinsertionorder2) - Remove an insertionorder
* [removeAdsOrganization2](#removeadsorganization2) - Remove an organization
* [updateAdsAd2](#updateadsad2) - Update an ad
* [updateAdsCampaign2](#updateadscampaign2) - Update a campaign
* [updateAdsCreative2](#updateadscreative2) - Update a creative
* [updateAdsGroup2](#updateadsgroup2) - Update a group
* [updateAdsInsertionorder2](#updateadsinsertionorder2) - Update an insertionorder
* [updateAdsOrganization2](#updateadsorganization2) - Update an organization

## createAdsAd2

Create an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsAd2" method="post" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsAd2Request req = CreateAdsAd2Request.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsAd2Response res = sdk.ads().createAdsAd2()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreateAdsAd2Request](../../models/operations/CreateAdsAd2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateAdsAd2Response](../../models/operations/CreateAdsAd2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateAdsCampaign2Response res = sdk.ads().createAdsCampaign2()
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

## createAdsCreative2

Create a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsCreative2" method="post" path="/ads/{connection_id}/creative" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsCreative2Request req = CreateAdsCreative2Request.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsCreative2Response res = sdk.ads().createAdsCreative2()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAdsCreative2Request](../../models/operations/CreateAdsCreative2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAdsCreative2Response](../../models/operations/CreateAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsGroup2

Create a group

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsGroup2" method="post" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsGroup2Request req = CreateAdsGroup2Request.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsGroup2Response res = sdk.ads().createAdsGroup2()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateAdsGroup2Request](../../models/operations/CreateAdsGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateAdsGroup2Response](../../models/operations/CreateAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsInsertionorder2

Create an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsInsertionorder2" method="post" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsInsertionorder2Request req = CreateAdsInsertionorder2Request.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsInsertionorder2Response res = sdk.ads().createAdsInsertionorder2()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAdsInsertionorder2Request](../../models/operations/CreateAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAdsInsertionorder2Response](../../models/operations/CreateAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAdsOrganization2

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsOrganization2" method="post" path="/ads/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsOrganization2Request req = CreateAdsOrganization2Request.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsOrganization2Response res = sdk.ads().createAdsOrganization2()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateAdsOrganization2Request](../../models/operations/CreateAdsOrganization2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateAdsOrganization2Response](../../models/operations/CreateAdsOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsAd2

Retrieve an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsAd2" method="get" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsAd2Request req = GetAdsAd2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsAd2Response res = sdk.ads().getAdsAd2()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetAdsAd2Request](../../models/operations/GetAdsAd2Request.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetAdsAd2Response](../../models/operations/GetAdsAd2Response.md)**

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

        GetAdsCampaign2Response res = sdk.ads().getAdsCampaign2()
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

## getAdsCreative2

Retrieve a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsCreative2" method="get" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsCreative2Request req = GetAdsCreative2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsCreative2Response res = sdk.ads().getAdsCreative2()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAdsCreative2Request](../../models/operations/GetAdsCreative2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAdsCreative2Response](../../models/operations/GetAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsGroup2

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsGroup2" method="get" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsGroup2Request req = GetAdsGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsGroup2Response res = sdk.ads().getAdsGroup2()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetAdsGroup2Request](../../models/operations/GetAdsGroup2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetAdsGroup2Response](../../models/operations/GetAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsInsertionorder2

Retrieve an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsInsertionorder2" method="get" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsInsertionorder2Request req = GetAdsInsertionorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsInsertionorder2Response res = sdk.ads().getAdsInsertionorder2()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAdsInsertionorder2Request](../../models/operations/GetAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAdsInsertionorder2Response](../../models/operations/GetAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsOrganization2

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsOrganization2" method="get" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsOrganization2Request req = GetAdsOrganization2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsOrganization2Response res = sdk.ads().getAdsOrganization2()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAdsOrganization2Request](../../models/operations/GetAdsOrganization2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAdsOrganization2Response](../../models/operations/GetAdsOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsPromoted2

Retrieve a promoted

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsPromoted2" method="get" path="/ads/{connection_id}/promoted/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsPromoted2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsPromoted2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsPromoted2Request req = GetAdsPromoted2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsPromoted2Response res = sdk.ads().getAdsPromoted2()
                .request(req)
                .call();

        if (res.adsPromoted().isPresent()) {
            System.out.println(res.adsPromoted().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAdsPromoted2Request](../../models/operations/GetAdsPromoted2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAdsPromoted2Response](../../models/operations/GetAdsPromoted2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsTarget2

Retrieve a target

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsTarget2" method="get" path="/ads/{connection_id}/target/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsTarget2Request;
import to.unified.unified_java_sdk.models.operations.GetAdsTarget2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsTarget2Request req = GetAdsTarget2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsTarget2Response res = sdk.ads().getAdsTarget2()
                .request(req)
                .call();

        if (res.adsTarget().isPresent()) {
            System.out.println(res.adsTarget().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetAdsTarget2Request](../../models/operations/GetAdsTarget2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetAdsTarget2Response](../../models/operations/GetAdsTarget2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsAds2

List all ads

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsAds2" method="get" path="/ads/{connection_id}/ad" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsAds2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsAds2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsAds2Request req = ListAdsAds2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsAds2Response res = sdk.ads().listAdsAds2()
                .request(req)
                .call();

        if (res.adsAds().isPresent()) {
            System.out.println(res.adsAds().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListAdsAds2Request](../../models/operations/ListAdsAds2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListAdsAds2Response](../../models/operations/ListAdsAds2Response.md)**

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

        ListAdsCampaigns2Response res = sdk.ads().listAdsCampaigns2()
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

## listAdsCreatives2

List all creatives

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsCreatives2" method="get" path="/ads/{connection_id}/creative" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsCreatives2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsCreatives2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsCreatives2Request req = ListAdsCreatives2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsCreatives2Response res = sdk.ads().listAdsCreatives2()
                .request(req)
                .call();

        if (res.adsCreatives().isPresent()) {
            System.out.println(res.adsCreatives().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAdsCreatives2Request](../../models/operations/ListAdsCreatives2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAdsCreatives2Response](../../models/operations/ListAdsCreatives2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsGroups2

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsGroups2" method="get" path="/ads/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsGroups2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsGroups2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsGroups2Request req = ListAdsGroups2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsGroups2Response res = sdk.ads().listAdsGroups2()
                .request(req)
                .call();

        if (res.adsGroups().isPresent()) {
            System.out.println(res.adsGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListAdsGroups2Request](../../models/operations/ListAdsGroups2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListAdsGroups2Response](../../models/operations/ListAdsGroups2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsInsertionorders2

List all insertionorders

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsInsertionorders2" method="get" path="/ads/{connection_id}/insertionorder" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionorders2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsInsertionorders2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsInsertionorders2Request req = ListAdsInsertionorders2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsInsertionorders2Response res = sdk.ads().listAdsInsertionorders2()
                .request(req)
                .call();

        if (res.adsInsertionorders().isPresent()) {
            System.out.println(res.adsInsertionorders().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAdsInsertionorders2Request](../../models/operations/ListAdsInsertionorders2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAdsInsertionorders2Response](../../models/operations/ListAdsInsertionorders2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsOrganizations2

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsOrganizations2" method="get" path="/ads/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizations2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsOrganizations2Request req = ListAdsOrganizations2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsOrganizations2Response res = sdk.ads().listAdsOrganizations2()
                .request(req)
                .call();

        if (res.adsOrganizations().isPresent()) {
            System.out.println(res.adsOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAdsOrganizations2Request](../../models/operations/ListAdsOrganizations2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAdsOrganizations2Response](../../models/operations/ListAdsOrganizations2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsPromoteds2

List all promoteds

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsPromoteds2" method="get" path="/ads/{connection_id}/promoted" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsPromoteds2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsPromoteds2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsPromoteds2Request req = ListAdsPromoteds2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsPromoteds2Response res = sdk.ads().listAdsPromoteds2()
                .request(req)
                .call();

        if (res.adsPromoteds().isPresent()) {
            System.out.println(res.adsPromoteds().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAdsPromoteds2Request](../../models/operations/ListAdsPromoteds2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAdsPromoteds2Response](../../models/operations/ListAdsPromoteds2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsReports2

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsReports2" method="get" path="/ads/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsReports2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsReports2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsReports2Request req = ListAdsReports2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsReports2Response res = sdk.ads().listAdsReports2()
                .request(req)
                .call();

        if (res.adsReports().isPresent()) {
            System.out.println(res.adsReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAdsReports2Request](../../models/operations/ListAdsReports2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAdsReports2Response](../../models/operations/ListAdsReports2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsTargets2

List all targets

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsTargets2" method="get" path="/ads/{connection_id}/target" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsTargets2Request;
import to.unified.unified_java_sdk.models.operations.ListAdsTargets2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsTargets2Request req = ListAdsTargets2Request.builder()
                .connectionId("<id>")
                .build();

        ListAdsTargets2Response res = sdk.ads().listAdsTargets2()
                .request(req)
                .call();

        if (res.adsTargets().isPresent()) {
            System.out.println(res.adsTargets().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAdsTargets2Request](../../models/operations/ListAdsTargets2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAdsTargets2Response](../../models/operations/ListAdsTargets2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsAd2

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsAd2" method="patch" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsAd2Request req = PatchAdsAd2Request.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsAd2Response res = sdk.ads().patchAdsAd2()
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
| `request`                                                           | [PatchAdsAd2Request](../../models/operations/PatchAdsAd2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PatchAdsAd2Response](../../models/operations/PatchAdsAd2Response.md)**

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

        PatchAdsCampaign2Response res = sdk.ads().patchAdsCampaign2()
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

## patchAdsCreative2

Update a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsCreative2" method="patch" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsCreative2Request req = PatchAdsCreative2Request.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsCreative2Response res = sdk.ads().patchAdsCreative2()
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
| `request`                                                                       | [PatchAdsCreative2Request](../../models/operations/PatchAdsCreative2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchAdsCreative2Response](../../models/operations/PatchAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsGroup2" method="patch" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsGroup2Request req = PatchAdsGroup2Request.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsGroup2Response res = sdk.ads().patchAdsGroup2()
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
| `request`                                                                 | [PatchAdsGroup2Request](../../models/operations/PatchAdsGroup2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchAdsGroup2Response](../../models/operations/PatchAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsInsertionorder2

Update an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsInsertionorder2" method="patch" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsInsertionorder2Request req = PatchAdsInsertionorder2Request.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsInsertionorder2Response res = sdk.ads().patchAdsInsertionorder2()
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
| `request`                                                                                   | [PatchAdsInsertionorder2Request](../../models/operations/PatchAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAdsInsertionorder2Response](../../models/operations/PatchAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsOrganization2

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsOrganization2" method="patch" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsOrganization2Request req = PatchAdsOrganization2Request.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsOrganization2Response res = sdk.ads().patchAdsOrganization2()
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
| `request`                                                                               | [PatchAdsOrganization2Request](../../models/operations/PatchAdsOrganization2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchAdsOrganization2Response](../../models/operations/PatchAdsOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsAd2

Remove an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsAd2" method="delete" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsAd2Request req = RemoveAdsAd2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsAd2Response res = sdk.ads().removeAdsAd2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [RemoveAdsAd2Request](../../models/operations/RemoveAdsAd2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[RemoveAdsAd2Response](../../models/operations/RemoveAdsAd2Response.md)**

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

        RemoveAdsCampaign2Response res = sdk.ads().removeAdsCampaign2()
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

## removeAdsCreative2

Remove a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsCreative2" method="delete" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsCreative2Request req = RemoveAdsCreative2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsCreative2Response res = sdk.ads().removeAdsCreative2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveAdsCreative2Request](../../models/operations/RemoveAdsCreative2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveAdsCreative2Response](../../models/operations/RemoveAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsGroup2

Remove a group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsGroup2" method="delete" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsGroup2Request req = RemoveAdsGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsGroup2Response res = sdk.ads().removeAdsGroup2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveAdsGroup2Request](../../models/operations/RemoveAdsGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveAdsGroup2Response](../../models/operations/RemoveAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsInsertionorder2

Remove an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsInsertionorder2" method="delete" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsInsertionorder2Request req = RemoveAdsInsertionorder2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsInsertionorder2Response res = sdk.ads().removeAdsInsertionorder2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAdsInsertionorder2Request](../../models/operations/RemoveAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAdsInsertionorder2Response](../../models/operations/RemoveAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsOrganization2

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsOrganization2" method="delete" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsOrganization2Request req = RemoveAdsOrganization2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsOrganization2Response res = sdk.ads().removeAdsOrganization2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveAdsOrganization2Request](../../models/operations/RemoveAdsOrganization2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveAdsOrganization2Response](../../models/operations/RemoveAdsOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsAd2

Update an ad

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsAd2" method="put" path="/ads/{connection_id}/ad/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAd2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsAd2Response;
import to.unified.unified_java_sdk.models.shared.AdsAd;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsAd2Request req = UpdateAdsAd2Request.builder()
                .adsAd(AdsAd.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsAd2Response res = sdk.ads().updateAdsAd2()
                .request(req)
                .call();

        if (res.adsAd().isPresent()) {
            System.out.println(res.adsAd().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateAdsAd2Request](../../models/operations/UpdateAdsAd2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateAdsAd2Response](../../models/operations/UpdateAdsAd2Response.md)**

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

        UpdateAdsCampaign2Response res = sdk.ads().updateAdsCampaign2()
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

## updateAdsCreative2

Update a creative

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsCreative2" method="put" path="/ads/{connection_id}/creative/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreative2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsCreative2Response;
import to.unified.unified_java_sdk.models.shared.AdsCreative;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsCreative2Request req = UpdateAdsCreative2Request.builder()
                .adsCreative(AdsCreative.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsCreative2Response res = sdk.ads().updateAdsCreative2()
                .request(req)
                .call();

        if (res.adsCreative().isPresent()) {
            System.out.println(res.adsCreative().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAdsCreative2Request](../../models/operations/UpdateAdsCreative2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAdsCreative2Response](../../models/operations/UpdateAdsCreative2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsGroup2" method="put" path="/ads/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroup2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsGroup2Response;
import to.unified.unified_java_sdk.models.shared.AdsGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsGroup2Request req = UpdateAdsGroup2Request.builder()
                .adsGroup(AdsGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsGroup2Response res = sdk.ads().updateAdsGroup2()
                .request(req)
                .call();

        if (res.adsGroup().isPresent()) {
            System.out.println(res.adsGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateAdsGroup2Request](../../models/operations/UpdateAdsGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateAdsGroup2Response](../../models/operations/UpdateAdsGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsInsertionorder2

Update an insertionorder

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsInsertionorder2" method="put" path="/ads/{connection_id}/insertionorder/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorder2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsInsertionorder2Response;
import to.unified.unified_java_sdk.models.shared.AdsInsertionorder;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsInsertionorder2Request req = UpdateAdsInsertionorder2Request.builder()
                .adsInsertionorder(AdsInsertionorder.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsInsertionorder2Response res = sdk.ads().updateAdsInsertionorder2()
                .request(req)
                .call();

        if (res.adsInsertionorder().isPresent()) {
            System.out.println(res.adsInsertionorder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAdsInsertionorder2Request](../../models/operations/UpdateAdsInsertionorder2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAdsInsertionorder2Response](../../models/operations/UpdateAdsInsertionorder2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsOrganization2

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsOrganization2" method="put" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganization2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganization2Response;
import to.unified.unified_java_sdk.models.shared.AdsOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsOrganization2Request req = UpdateAdsOrganization2Request.builder()
                .adsOrganization(AdsOrganization.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsOrganization2Response res = sdk.ads().updateAdsOrganization2()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateAdsOrganization2Request](../../models/operations/UpdateAdsOrganization2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateAdsOrganization2Response](../../models/operations/UpdateAdsOrganization2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |