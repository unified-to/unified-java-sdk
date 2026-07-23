# Cdp

## Overview

### Available Operations

* [createCdpActivation](#createcdpactivation) - Create an activation
* [createCdpDestination](#createcdpdestination) - Create a destination
* [createCdpEvent](#createcdpevent) - Create an event
* [createCdpProfile](#createcdpprofile) - Create a profile
* [createCdpSegment](#createcdpsegment) - Create a segment
* [createCdpSource](#createcdpsource) - Create a source
* [getCdpActivation](#getcdpactivation) - Retrieve an activation
* [getCdpDestination](#getcdpdestination) - Retrieve a destination
* [getCdpEvent](#getcdpevent) - Retrieve an event
* [getCdpProfile](#getcdpprofile) - Retrieve a profile
* [getCdpSegment](#getcdpsegment) - Retrieve a segment
* [getCdpSource](#getcdpsource) - Retrieve a source
* [listCdpActivations](#listcdpactivations) - List all activations
* [listCdpDestinations](#listcdpdestinations) - List all destinations
* [listCdpEvents](#listcdpevents) - List all events
* [listCdpProfiles](#listcdpprofiles) - List all profiles
* [listCdpSegments](#listcdpsegments) - List all segments
* [listCdpSources](#listcdpsources) - List all sources
* [patchCdpActivation](#patchcdpactivation) - Update an activation
* [patchCdpDestination](#patchcdpdestination) - Update a destination
* [patchCdpEvent](#patchcdpevent) - Update an event
* [patchCdpProfile](#patchcdpprofile) - Update a profile
* [patchCdpSegment](#patchcdpsegment) - Update a segment
* [patchCdpSource](#patchcdpsource) - Update a source
* [removeCdpActivation](#removecdpactivation) - Remove an activation
* [removeCdpDestination](#removecdpdestination) - Remove a destination
* [removeCdpEvent](#removecdpevent) - Remove an event
* [removeCdpProfile](#removecdpprofile) - Remove a profile
* [removeCdpSegment](#removecdpsegment) - Remove a segment
* [removeCdpSource](#removecdpsource) - Remove a source
* [updateCdpActivation](#updatecdpactivation) - Update an activation
* [updateCdpDestination](#updatecdpdestination) - Update a destination
* [updateCdpEvent](#updatecdpevent) - Update an event
* [updateCdpProfile](#updatecdpprofile) - Update a profile
* [updateCdpSegment](#updatecdpsegment) - Update a segment
* [updateCdpSource](#updatecdpsource) - Update a source

## createCdpActivation

Create an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpActivation" method="post" path="/cdp/{connection_id}/activation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.CdpActivation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpActivationRequest req = CreateCdpActivationRequest.builder()
                .cdpActivation(CdpActivation.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpActivationResponse res = sdk.cdp().createCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateCdpActivationRequest](../../models/operations/CreateCdpActivationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCdpActivationResponse](../../models/operations/CreateCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCdpDestination

Create a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpDestination" method="post" path="/cdp/{connection_id}/destination" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.CdpDestination;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpDestinationRequest req = CreateCdpDestinationRequest.builder()
                .cdpDestination(CdpDestination.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpDestinationResponse res = sdk.cdp().createCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateCdpDestinationRequest](../../models/operations/CreateCdpDestinationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateCdpDestinationResponse](../../models/operations/CreateCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCdpEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpEvent" method="post" path="/cdp/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.CdpEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpEventRequest req = CreateCdpEventRequest.builder()
                .cdpEvent(CdpEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpEventResponse res = sdk.cdp().createCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCdpEventRequest](../../models/operations/CreateCdpEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCdpEventResponse](../../models/operations/CreateCdpEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        CreateCdpProfileResponse res = sdk.cdp().createCdpProfile()
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

## createCdpSegment

Create a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpSegment" method="post" path="/cdp/{connection_id}/segment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.CdpSegment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpSegmentRequest req = CreateCdpSegmentRequest.builder()
                .cdpSegment(CdpSegment.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpSegmentResponse res = sdk.cdp().createCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCdpSegmentRequest](../../models/operations/CreateCdpSegmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCdpSegmentResponse](../../models/operations/CreateCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCdpSource

Create a source

### Example Usage

<!-- UsageSnippet language="java" operationID="createCdpSource" method="post" path="/cdp/{connection_id}/source" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.CreateCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.CdpSource;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCdpSourceRequest req = CreateCdpSourceRequest.builder()
                .cdpSource(CdpSource.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCdpSourceResponse res = sdk.cdp().createCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateCdpSourceRequest](../../models/operations/CreateCdpSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateCdpSourceResponse](../../models/operations/CreateCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpActivation

Retrieve an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpActivation" method="get" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpActivationRequest req = GetCdpActivationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpActivationResponse res = sdk.cdp().getCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCdpActivationRequest](../../models/operations/GetCdpActivationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCdpActivationResponse](../../models/operations/GetCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpDestination

Retrieve a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpDestination" method="get" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpDestinationRequest req = GetCdpDestinationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpDestinationResponse res = sdk.cdp().getCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetCdpDestinationRequest](../../models/operations/GetCdpDestinationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetCdpDestinationResponse](../../models/operations/GetCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpEvent" method="get" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpEventRequest req = GetCdpEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpEventResponse res = sdk.cdp().getCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCdpEventRequest](../../models/operations/GetCdpEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCdpEventResponse](../../models/operations/GetCdpEventResponse.md)**

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

        GetCdpProfileResponse res = sdk.cdp().getCdpProfile()
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

## getCdpSegment

Retrieve a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpSegment" method="get" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpSegmentRequest req = GetCdpSegmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpSegmentResponse res = sdk.cdp().getCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCdpSegmentRequest](../../models/operations/GetCdpSegmentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCdpSegmentResponse](../../models/operations/GetCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCdpSource

Retrieve a source

### Example Usage

<!-- UsageSnippet language="java" operationID="getCdpSource" method="get" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.GetCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCdpSourceRequest req = GetCdpSourceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCdpSourceResponse res = sdk.cdp().getCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetCdpSourceRequest](../../models/operations/GetCdpSourceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetCdpSourceResponse](../../models/operations/GetCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpActivations

List all activations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpActivations" method="get" path="/cdp/{connection_id}/activation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpActivationsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpActivationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpActivationsRequest req = ListCdpActivationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpActivationsResponse res = sdk.cdp().listCdpActivations()
                .request(req)
                .call();

        if (res.cdpActivations().isPresent()) {
            System.out.println(res.cdpActivations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCdpActivationsRequest](../../models/operations/ListCdpActivationsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCdpActivationsResponse](../../models/operations/ListCdpActivationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpDestinations

List all destinations

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpDestinations" method="get" path="/cdp/{connection_id}/destination" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpDestinationsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpDestinationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpDestinationsRequest req = ListCdpDestinationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpDestinationsResponse res = sdk.cdp().listCdpDestinations()
                .request(req)
                .call();

        if (res.cdpDestinations().isPresent()) {
            System.out.println(res.cdpDestinations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCdpDestinationsRequest](../../models/operations/ListCdpDestinationsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCdpDestinationsResponse](../../models/operations/ListCdpDestinationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpEvents" method="get" path="/cdp/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpEventsRequest req = ListCdpEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpEventsResponse res = sdk.cdp().listCdpEvents()
                .request(req)
                .call();

        if (res.cdpEvents().isPresent()) {
            System.out.println(res.cdpEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCdpEventsRequest](../../models/operations/ListCdpEventsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCdpEventsResponse](../../models/operations/ListCdpEventsResponse.md)**

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

        ListCdpProfilesResponse res = sdk.cdp().listCdpProfiles()
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

## listCdpSegments

List all segments

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpSegments" method="get" path="/cdp/{connection_id}/segment" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpSegmentsRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpSegmentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpSegmentsRequest req = ListCdpSegmentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpSegmentsResponse res = sdk.cdp().listCdpSegments()
                .request(req)
                .call();

        if (res.cdpSegments().isPresent()) {
            System.out.println(res.cdpSegments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListCdpSegmentsRequest](../../models/operations/ListCdpSegmentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListCdpSegmentsResponse](../../models/operations/ListCdpSegmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCdpSources

List all sources

### Example Usage

<!-- UsageSnippet language="java" operationID="listCdpSources" method="get" path="/cdp/{connection_id}/source" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCdpSourcesRequest;
import to.unified.unified_java_sdk.models.operations.ListCdpSourcesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCdpSourcesRequest req = ListCdpSourcesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCdpSourcesResponse res = sdk.cdp().listCdpSources()
                .request(req)
                .call();

        if (res.cdpSources().isPresent()) {
            System.out.println(res.cdpSources().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListCdpSourcesRequest](../../models/operations/ListCdpSourcesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListCdpSourcesResponse](../../models/operations/ListCdpSourcesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpActivation

Update an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpActivation" method="patch" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.CdpActivation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpActivationRequest req = PatchCdpActivationRequest.builder()
                .cdpActivation(CdpActivation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpActivationResponse res = sdk.cdp().patchCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchCdpActivationRequest](../../models/operations/PatchCdpActivationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCdpActivationResponse](../../models/operations/PatchCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpDestination

Update a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpDestination" method="patch" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.CdpDestination;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpDestinationRequest req = PatchCdpDestinationRequest.builder()
                .cdpDestination(CdpDestination.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpDestinationResponse res = sdk.cdp().patchCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchCdpDestinationRequest](../../models/operations/PatchCdpDestinationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchCdpDestinationResponse](../../models/operations/PatchCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpEvent" method="patch" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.CdpEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpEventRequest req = PatchCdpEventRequest.builder()
                .cdpEvent(CdpEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpEventResponse res = sdk.cdp().patchCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCdpEventRequest](../../models/operations/PatchCdpEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCdpEventResponse](../../models/operations/PatchCdpEventResponse.md)**

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

        PatchCdpProfileResponse res = sdk.cdp().patchCdpProfile()
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

## patchCdpSegment

Update a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpSegment" method="patch" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.CdpSegment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpSegmentRequest req = PatchCdpSegmentRequest.builder()
                .cdpSegment(CdpSegment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpSegmentResponse res = sdk.cdp().patchCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCdpSegmentRequest](../../models/operations/PatchCdpSegmentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCdpSegmentResponse](../../models/operations/PatchCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCdpSource

Update a source

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCdpSource" method="patch" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.PatchCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.CdpSource;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCdpSourceRequest req = PatchCdpSourceRequest.builder()
                .cdpSource(CdpSource.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCdpSourceResponse res = sdk.cdp().patchCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchCdpSourceRequest](../../models/operations/PatchCdpSourceRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchCdpSourceResponse](../../models/operations/PatchCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpActivation

Remove an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpActivation" method="delete" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpActivationRequest req = RemoveCdpActivationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpActivationResponse res = sdk.cdp().removeCdpActivation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveCdpActivationRequest](../../models/operations/RemoveCdpActivationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveCdpActivationResponse](../../models/operations/RemoveCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpDestination

Remove a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpDestination" method="delete" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpDestinationRequest req = RemoveCdpDestinationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpDestinationResponse res = sdk.cdp().removeCdpDestination()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveCdpDestinationRequest](../../models/operations/RemoveCdpDestinationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveCdpDestinationResponse](../../models/operations/RemoveCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpEvent

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpEvent" method="delete" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpEventRequest req = RemoveCdpEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpEventResponse res = sdk.cdp().removeCdpEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCdpEventRequest](../../models/operations/RemoveCdpEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCdpEventResponse](../../models/operations/RemoveCdpEventResponse.md)**

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

        RemoveCdpProfileResponse res = sdk.cdp().removeCdpProfile()
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

## removeCdpSegment

Remove a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpSegment" method="delete" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpSegmentRequest req = RemoveCdpSegmentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpSegmentResponse res = sdk.cdp().removeCdpSegment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCdpSegmentRequest](../../models/operations/RemoveCdpSegmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCdpSegmentResponse](../../models/operations/RemoveCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCdpSource

Remove a source

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCdpSource" method="delete" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCdpSourceRequest req = RemoveCdpSourceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCdpSourceResponse res = sdk.cdp().removeCdpSource()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveCdpSourceRequest](../../models/operations/RemoveCdpSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveCdpSourceResponse](../../models/operations/RemoveCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpActivation

Update an activation

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpActivation" method="put" path="/cdp/{connection_id}/activation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpActivationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpActivationResponse;
import to.unified.unified_java_sdk.models.shared.CdpActivation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpActivationRequest req = UpdateCdpActivationRequest.builder()
                .cdpActivation(CdpActivation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpActivationResponse res = sdk.cdp().updateCdpActivation()
                .request(req)
                .call();

        if (res.cdpActivation().isPresent()) {
            System.out.println(res.cdpActivation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateCdpActivationRequest](../../models/operations/UpdateCdpActivationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCdpActivationResponse](../../models/operations/UpdateCdpActivationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpDestination

Update a destination

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpDestination" method="put" path="/cdp/{connection_id}/destination/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpDestinationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpDestinationResponse;
import to.unified.unified_java_sdk.models.shared.CdpDestination;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpDestinationRequest req = UpdateCdpDestinationRequest.builder()
                .cdpDestination(CdpDestination.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpDestinationResponse res = sdk.cdp().updateCdpDestination()
                .request(req)
                .call();

        if (res.cdpDestination().isPresent()) {
            System.out.println(res.cdpDestination().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateCdpDestinationRequest](../../models/operations/UpdateCdpDestinationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateCdpDestinationResponse](../../models/operations/UpdateCdpDestinationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpEvent" method="put" path="/cdp/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpEventResponse;
import to.unified.unified_java_sdk.models.shared.CdpEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpEventRequest req = UpdateCdpEventRequest.builder()
                .cdpEvent(CdpEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpEventResponse res = sdk.cdp().updateCdpEvent()
                .request(req)
                .call();

        if (res.cdpEvent().isPresent()) {
            System.out.println(res.cdpEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCdpEventRequest](../../models/operations/UpdateCdpEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCdpEventResponse](../../models/operations/UpdateCdpEventResponse.md)**

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

        UpdateCdpProfileResponse res = sdk.cdp().updateCdpProfile()
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

## updateCdpSegment

Update a segment

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpSegment" method="put" path="/cdp/{connection_id}/segment/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSegmentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSegmentResponse;
import to.unified.unified_java_sdk.models.shared.CdpSegment;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpSegmentRequest req = UpdateCdpSegmentRequest.builder()
                .cdpSegment(CdpSegment.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpSegmentResponse res = sdk.cdp().updateCdpSegment()
                .request(req)
                .call();

        if (res.cdpSegment().isPresent()) {
            System.out.println(res.cdpSegment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCdpSegmentRequest](../../models/operations/UpdateCdpSegmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCdpSegmentResponse](../../models/operations/UpdateCdpSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCdpSource

Update a source

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCdpSource" method="put" path="/cdp/{connection_id}/source/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSourceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCdpSourceResponse;
import to.unified.unified_java_sdk.models.shared.CdpSource;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCdpSourceRequest req = UpdateCdpSourceRequest.builder()
                .cdpSource(CdpSource.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCdpSourceResponse res = sdk.cdp().updateCdpSource()
                .request(req)
                .call();

        if (res.cdpSource().isPresent()) {
            System.out.println(res.cdpSource().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateCdpSourceRequest](../../models/operations/UpdateCdpSourceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateCdpSourceResponse](../../models/operations/UpdateCdpSourceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |