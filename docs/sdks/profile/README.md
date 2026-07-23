# Profile

## Overview

### Available Operations

* [createCdpProfile](#createcdpprofile) - Create a profile
* [getCdpProfile](#getcdpprofile) - Retrieve a profile
* [listCdpProfiles](#listcdpprofiles) - List all profiles
* [patchCdpProfile](#patchcdpprofile) - Update a profile
* [removeCdpProfile](#removecdpprofile) - Remove a profile
* [updateCdpProfile](#updatecdpprofile) - Update a profile

## createCdpProfile

Create a profile

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpProfile" method="post" path="/cdp/{connection_id}/profile" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpProfileRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpProfileResponse;
import to.unified.unified_java_sdk.models.shared.CdpProfile;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpProfileRequest req = CreateCdpProfileRequest.builder()
                .cdpProfile(CdpProfile.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpProfileResponse res = sdk.profile().createCdpProfile()
                .request(req)
                .call();

        if (res.cdpProfile().isPresent()) {
            System.out.println(res.cdpProfile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCdpProfileRequest](../../models/operations/CreateCdpProfileRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCdpProfileResponse](../../models/operations/CreateCdpProfileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpProfile

Retrieve a profile

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpProfile" method="get" path="/cdp/{connection_id}/profile/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpProfileRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpProfileResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpProfileRequest req = GetCdpProfileRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpProfileResponse res = sdk.profile().getCdpProfile()
                .request(req)
                .call();

        if (res.cdpProfile().isPresent()) {
            System.out.println(res.cdpProfile().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCdpProfileRequest](../../models/operations/GetCdpProfileRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCdpProfileResponse](../../models/operations/GetCdpProfileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpProfiles

List all profiles

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpProfiles" method="get" path="/cdp/{connection_id}/profile" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpProfilesRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpProfilesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpProfilesRequest req = ListCdpProfilesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpProfilesResponse res = sdk.profile().listCdpProfiles()
                .request(req)
                .call();

        if (res.cdpProfiles().isPresent()) {
            System.out.println(res.cdpProfiles().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListCdpProfilesRequest](../../models/operations/ListCdpProfilesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListCdpProfilesResponse](../../models/operations/ListCdpProfilesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpProfile

Update a profile

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpProfile" method="patch" path="/cdp/{connection_id}/profile/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpProfileRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpProfileResponse;
import to.unified.unified_java_sdk.models.shared.CdpProfile;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpProfileRequest req = PatchCdpProfileRequest.builder()
                .cdpProfile(CdpProfile.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpProfileResponse res = sdk.profile().patchCdpProfile()
                .request(req)
                .call();

        if (res.cdpProfile().isPresent()) {
            System.out.println(res.cdpProfile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCdpProfileRequest](../../models/operations/PatchCdpProfileRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCdpProfileResponse](../../models/operations/PatchCdpProfileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpProfile

Remove a profile

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpProfile" method="delete" path="/cdp/{connection_id}/profile/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpProfileRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpProfileResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpProfileRequest req = RemoveCdpProfileRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpProfileResponse res = sdk.profile().removeCdpProfile()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCdpProfileRequest](../../models/operations/RemoveCdpProfileRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCdpProfileResponse](../../models/operations/RemoveCdpProfileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpProfile

Update a profile

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpProfile" method="put" path="/cdp/{connection_id}/profile/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpProfileRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpProfileResponse;
import to.unified.unified_java_sdk.models.shared.CdpProfile;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpProfileRequest req = UpdateCdpProfileRequest.builder()
                .cdpProfile(CdpProfile.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpProfileResponse res = sdk.profile().updateCdpProfile()
                .request(req)
                .call();

        if (res.cdpProfile().isPresent()) {
            System.out.println(res.cdpProfile().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCdpProfileRequest](../../models/operations/UpdateCdpProfileRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCdpProfileResponse](../../models/operations/UpdateCdpProfileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |