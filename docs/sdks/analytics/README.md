# Analytics

## Overview

### Available Operations

* [createAnalyticsEvent2](#createanalyticsevent2) - Create an event
* [createAnalyticsProperty2](#createanalyticsproperty2) - Create a property
* [createAnalyticsVisitor2](#createanalyticsvisitor2) - Create a visitor
* [getAnalyticsEvent2](#getanalyticsevent2) - Retrieve an event
* [getAnalyticsProperty2](#getanalyticsproperty2) - Retrieve a property
* [getAnalyticsSession2](#getanalyticssession2) - Retrieve a session
* [getAnalyticsVisitor2](#getanalyticsvisitor2) - Retrieve a visitor
* [listAnalyticsEvents2](#listanalyticsevents2) - List all events
* [listAnalyticsProperties2](#listanalyticsproperties2) - List all properties
* [listAnalyticsReports2](#listanalyticsreports2) - List all reports
* [listAnalyticsSessions2](#listanalyticssessions2) - List all sessions
* [listAnalyticsVisitors2](#listanalyticsvisitors2) - List all visitors
* [patchAnalyticsProperty2](#patchanalyticsproperty2) - Update a property
* [patchAnalyticsVisitor2](#patchanalyticsvisitor2) - Update a visitor
* [removeAnalyticsProperty2](#removeanalyticsproperty2) - Remove a property
* [removeAnalyticsVisitor2](#removeanalyticsvisitor2) - Remove a visitor
* [updateAnalyticsProperty2](#updateanalyticsproperty2) - Update a property
* [updateAnalyticsVisitor2](#updateanalyticsvisitor2) - Update a visitor

## createAnalyticsEvent2

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsEvent2" method="post" path="/analytics/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsEvent2Request;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsEvent2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsEvent2Request req = CreateAnalyticsEvent2Request.builder()
                .analyticsEvent(AnalyticsEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsEvent2Response res = sdk.analytics().createAnalyticsEvent2()
                .request(req)
                .call();

        if (res.analyticsEvent().isPresent()) {
            System.out.println(res.analyticsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAnalyticsEvent2Request](../../models/operations/CreateAnalyticsEvent2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAnalyticsEvent2Response](../../models/operations/CreateAnalyticsEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAnalyticsProperty2

Create a property

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsProperty2" method="post" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsProperty2Request req = CreateAnalyticsProperty2Request.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsProperty2Response res = sdk.analytics().createAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAnalyticsProperty2Request](../../models/operations/CreateAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAnalyticsProperty2Response](../../models/operations/CreateAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAnalyticsVisitor2

Create a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="createAnalyticsVisitor2" method="post" path="/analytics/{connection_id}/visitor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.CreateAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAnalyticsVisitor2Request req = CreateAnalyticsVisitor2Request.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAnalyticsVisitor2Response res = sdk.analytics().createAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAnalyticsVisitor2Request](../../models/operations/CreateAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAnalyticsVisitor2Response](../../models/operations/CreateAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsEvent2

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsEvent2" method="get" path="/analytics/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsEvent2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsEvent2Request req = GetAnalyticsEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsEvent2Response res = sdk.analytics().getAnalyticsEvent2()
                .request(req)
                .call();

        if (res.analyticsEvent().isPresent()) {
            System.out.println(res.analyticsEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAnalyticsEvent2Request](../../models/operations/GetAnalyticsEvent2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAnalyticsEvent2Response](../../models/operations/GetAnalyticsEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsProperty2

Retrieve a property

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsProperty2" method="get" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsProperty2Request req = GetAnalyticsProperty2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsProperty2Response res = sdk.analytics().getAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAnalyticsProperty2Request](../../models/operations/GetAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAnalyticsProperty2Response](../../models/operations/GetAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsSession2

Retrieve a session

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsSession2" method="get" path="/analytics/{connection_id}/session/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsSession2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsSession2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsSession2Request req = GetAnalyticsSession2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsSession2Response res = sdk.analytics().getAnalyticsSession2()
                .request(req)
                .call();

        if (res.analyticsSession().isPresent()) {
            System.out.println(res.analyticsSession().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalyticsSession2Request](../../models/operations/GetAnalyticsSession2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalyticsSession2Response](../../models/operations/GetAnalyticsSession2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAnalyticsVisitor2

Retrieve a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="getAnalyticsVisitor2" method="get" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.GetAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAnalyticsVisitor2Request req = GetAnalyticsVisitor2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAnalyticsVisitor2Response res = sdk.analytics().getAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalyticsVisitor2Request](../../models/operations/GetAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalyticsVisitor2Response](../../models/operations/GetAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsEvents2

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsEvents2" method="get" path="/analytics/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsEvents2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsEvents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsEvents2Request req = ListAnalyticsEvents2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsEvents2Response res = sdk.analytics().listAnalyticsEvents2()
                .request(req)
                .call();

        if (res.analyticsEvents().isPresent()) {
            System.out.println(res.analyticsEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAnalyticsEvents2Request](../../models/operations/ListAnalyticsEvents2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAnalyticsEvents2Response](../../models/operations/ListAnalyticsEvents2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsProperties2

List all properties

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsProperties2" method="get" path="/analytics/{connection_id}/property" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsProperties2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsProperties2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsProperties2Request req = ListAnalyticsProperties2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsProperties2Response res = sdk.analytics().listAnalyticsProperties2()
                .request(req)
                .call();

        if (res.analyticsProperties().isPresent()) {
            System.out.println(res.analyticsProperties().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListAnalyticsProperties2Request](../../models/operations/ListAnalyticsProperties2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListAnalyticsProperties2Response](../../models/operations/ListAnalyticsProperties2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsReports2

List all reports

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsReports2" method="get" path="/analytics/{connection_id}/report" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsReports2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsReports2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsReports2Request req = ListAnalyticsReports2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsReports2Response res = sdk.analytics().listAnalyticsReports2()
                .request(req)
                .call();

        if (res.analyticsReports().isPresent()) {
            System.out.println(res.analyticsReports().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAnalyticsReports2Request](../../models/operations/ListAnalyticsReports2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAnalyticsReports2Response](../../models/operations/ListAnalyticsReports2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsSessions2

List all sessions

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsSessions2" method="get" path="/analytics/{connection_id}/session" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsSessions2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsSessions2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsSessions2Request req = ListAnalyticsSessions2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsSessions2Response res = sdk.analytics().listAnalyticsSessions2()
                .request(req)
                .call();

        if (res.analyticsSessions().isPresent()) {
            System.out.println(res.analyticsSessions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAnalyticsSessions2Request](../../models/operations/ListAnalyticsSessions2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAnalyticsSessions2Response](../../models/operations/ListAnalyticsSessions2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAnalyticsVisitors2

List all visitors

### Example Usage

<!-- UsageSnippet language="java" operationID="listAnalyticsVisitors2" method="get" path="/analytics/{connection_id}/visitor" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsVisitors2Request;
import to.unified.unified_java_sdk.models.operations.ListAnalyticsVisitors2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAnalyticsVisitors2Request req = ListAnalyticsVisitors2Request.builder()
                .connectionId("<id>")
                .build();

        ListAnalyticsVisitors2Response res = sdk.analytics().listAnalyticsVisitors2()
                .request(req)
                .call();

        if (res.analyticsVisitors().isPresent()) {
            System.out.println(res.analyticsVisitors().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAnalyticsVisitors2Request](../../models/operations/ListAnalyticsVisitors2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAnalyticsVisitors2Response](../../models/operations/ListAnalyticsVisitors2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsProperty2

Update a property

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsProperty2" method="patch" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsProperty2Request req = PatchAnalyticsProperty2Request.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsProperty2Response res = sdk.analytics().patchAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAnalyticsProperty2Request](../../models/operations/PatchAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAnalyticsProperty2Response](../../models/operations/PatchAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAnalyticsVisitor2

Update a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAnalyticsVisitor2" method="patch" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.PatchAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAnalyticsVisitor2Request req = PatchAnalyticsVisitor2Request.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAnalyticsVisitor2Response res = sdk.analytics().patchAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAnalyticsVisitor2Request](../../models/operations/PatchAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAnalyticsVisitor2Response](../../models/operations/PatchAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsProperty2

Remove a property

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsProperty2" method="delete" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsProperty2Request req = RemoveAnalyticsProperty2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsProperty2Response res = sdk.analytics().removeAnalyticsProperty2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAnalyticsProperty2Request](../../models/operations/RemoveAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAnalyticsProperty2Response](../../models/operations/RemoveAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAnalyticsVisitor2

Remove a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAnalyticsVisitor2" method="delete" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAnalyticsVisitor2Request req = RemoveAnalyticsVisitor2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAnalyticsVisitor2Response res = sdk.analytics().removeAnalyticsVisitor2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAnalyticsVisitor2Request](../../models/operations/RemoveAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAnalyticsVisitor2Response](../../models/operations/RemoveAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAnalyticsProperty2

Update a property

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsProperty2" method="put" path="/analytics/{connection_id}/property/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsProperty2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsProperty2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsProperty;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsProperty2Request req = UpdateAnalyticsProperty2Request.builder()
                .analyticsProperty(AnalyticsProperty.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsProperty2Response res = sdk.analytics().updateAnalyticsProperty2()
                .request(req)
                .call();

        if (res.analyticsProperty().isPresent()) {
            System.out.println(res.analyticsProperty().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAnalyticsProperty2Request](../../models/operations/UpdateAnalyticsProperty2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAnalyticsProperty2Response](../../models/operations/UpdateAnalyticsProperty2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAnalyticsVisitor2

Update a visitor

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAnalyticsVisitor2" method="put" path="/analytics/{connection_id}/visitor/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitor2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAnalyticsVisitor2Response;
import to.unified.unified_java_sdk.models.shared.AnalyticsVisitor;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAnalyticsVisitor2Request req = UpdateAnalyticsVisitor2Request.builder()
                .analyticsVisitor(AnalyticsVisitor.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAnalyticsVisitor2Response res = sdk.analytics().updateAnalyticsVisitor2()
                .request(req)
                .call();

        if (res.analyticsVisitor().isPresent()) {
            System.out.println(res.analyticsVisitor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAnalyticsVisitor2Request](../../models/operations/UpdateAnalyticsVisitor2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAnalyticsVisitor2Response](../../models/operations/UpdateAnalyticsVisitor2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |