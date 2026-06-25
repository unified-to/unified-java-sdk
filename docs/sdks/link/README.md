# Link

## Overview

### Available Operations

* [createCalendarLink2](#createcalendarlink2) - Create a link
* [createPaymentLink2](#createpaymentlink2) - Create a link
* [getCalendarLink2](#getcalendarlink2) - Retrieve a link
* [getPaymentLink2](#getpaymentlink2) - Retrieve a link
* [listCalendarLinks2](#listcalendarlinks2) - List all links
* [listPaymentLinks2](#listpaymentlinks2) - List all links
* [patchCalendarLink2](#patchcalendarlink2) - Update a link
* [patchPaymentLink2](#patchpaymentlink2) - Update a link
* [removeCalendarLink2](#removecalendarlink2) - Remove a link
* [removePaymentLink2](#removepaymentlink2) - Remove a link
* [updateCalendarLink2](#updatecalendarlink2) - Update a link
* [updatePaymentLink2](#updatepaymentlink2) - Update a link

## createCalendarLink2

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createCalendarLink2" method="post" path="/calendar/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.CreateCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCalendarLink2Request req = CreateCalendarLink2Request.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://prestigious-fort.name/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCalendarLink2Response res = sdk.link().createCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateCalendarLink2Request](../../models/operations/CreateCalendarLink2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateCalendarLink2Response](../../models/operations/CreateCalendarLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPaymentLink2

Create a link

### Example Usage

<!-- UsageSnippet language="java" operationID="createPaymentLink2" method="post" path="/payment/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.CreatePaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePaymentLink2Request req = CreatePaymentLink2Request.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreatePaymentLink2Response res = sdk.link().createPaymentLink2()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreatePaymentLink2Request](../../models/operations/CreatePaymentLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreatePaymentLink2Response](../../models/operations/CreatePaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCalendarLink2

Retrieve a link

### Example Usage

<!-- UsageSnippet language="java" operationID="getCalendarLink2" method="get" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.GetCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCalendarLink2Request req = GetCalendarLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCalendarLink2Response res = sdk.link().getCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetCalendarLink2Request](../../models/operations/GetCalendarLink2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetCalendarLink2Response](../../models/operations/GetCalendarLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPaymentLink2

Retrieve a link

### Example Usage

<!-- UsageSnippet language="java" operationID="getPaymentLink2" method="get" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.GetPaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPaymentLink2Request req = GetPaymentLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPaymentLink2Response res = sdk.link().getPaymentLink2()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetPaymentLink2Request](../../models/operations/GetPaymentLink2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetPaymentLink2Response](../../models/operations/GetPaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCalendarLinks2

List all links

### Example Usage

<!-- UsageSnippet language="java" operationID="listCalendarLinks2" method="get" path="/calendar/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinks2Request;
import to.unified.unified_java_sdk.models.operations.ListCalendarLinks2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCalendarLinks2Request req = ListCalendarLinks2Request.builder()
                .connectionId("<id>")
                .build();

        ListCalendarLinks2Response res = sdk.link().listCalendarLinks2()
                .request(req)
                .call();

        if (res.calendarLinks().isPresent()) {
            System.out.println(res.calendarLinks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListCalendarLinks2Request](../../models/operations/ListCalendarLinks2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListCalendarLinks2Response](../../models/operations/ListCalendarLinks2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPaymentLinks2

List all links

### Example Usage

<!-- UsageSnippet language="java" operationID="listPaymentLinks2" method="get" path="/payment/{connection_id}/link" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPaymentLinks2Request;
import to.unified.unified_java_sdk.models.operations.ListPaymentLinks2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPaymentLinks2Request req = ListPaymentLinks2Request.builder()
                .connectionId("<id>")
                .build();

        ListPaymentLinks2Response res = sdk.link().listPaymentLinks2()
                .request(req)
                .call();

        if (res.paymentLinks().isPresent()) {
            System.out.println(res.paymentLinks().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListPaymentLinks2Request](../../models/operations/ListPaymentLinks2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListPaymentLinks2Response](../../models/operations/ListPaymentLinks2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCalendarLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCalendarLink2" method="patch" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.PatchCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCalendarLink2Request req = PatchCalendarLink2Request.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://probable-accelerator.info")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCalendarLink2Response res = sdk.link().patchCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchCalendarLink2Request](../../models/operations/PatchCalendarLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchCalendarLink2Response](../../models/operations/PatchCalendarLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchPaymentLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="patchPaymentLink2" method="patch" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.PatchPaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchPaymentLink2Request req = PatchPaymentLink2Request.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchPaymentLink2Response res = sdk.link().patchPaymentLink2()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchPaymentLink2Request](../../models/operations/PatchPaymentLink2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchPaymentLink2Response](../../models/operations/PatchPaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCalendarLink2

Remove a link

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCalendarLink2" method="delete" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCalendarLink2Request req = RemoveCalendarLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCalendarLink2Response res = sdk.link().removeCalendarLink2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveCalendarLink2Request](../../models/operations/RemoveCalendarLink2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveCalendarLink2Response](../../models/operations/RemoveCalendarLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removePaymentLink2

Remove a link

### Example Usage

<!-- UsageSnippet language="java" operationID="removePaymentLink2" method="delete" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemovePaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.RemovePaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemovePaymentLink2Request req = RemovePaymentLink2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemovePaymentLink2Response res = sdk.link().removePaymentLink2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemovePaymentLink2Request](../../models/operations/RemovePaymentLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemovePaymentLink2Response](../../models/operations/RemovePaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCalendarLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCalendarLink2" method="put" path="/calendar/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLink2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarLink2Response;
import to.unified.unified_java_sdk.models.shared.CalendarLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCalendarLink2Request req = UpdateCalendarLink2Request.builder()
                .calendarLink(CalendarLink.builder()
                    .url("https://soupy-extension.net/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCalendarLink2Response res = sdk.link().updateCalendarLink2()
                .request(req)
                .call();

        if (res.calendarLink().isPresent()) {
            System.out.println(res.calendarLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateCalendarLink2Request](../../models/operations/UpdateCalendarLink2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateCalendarLink2Response](../../models/operations/UpdateCalendarLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePaymentLink2

Update a link

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePaymentLink2" method="put" path="/payment/{connection_id}/link/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLink2Request;
import to.unified.unified_java_sdk.models.operations.UpdatePaymentLink2Response;
import to.unified.unified_java_sdk.models.shared.PaymentLink;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdatePaymentLink2Request req = UpdatePaymentLink2Request.builder()
                .paymentLink(PaymentLink.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdatePaymentLink2Response res = sdk.link().updatePaymentLink2()
                .request(req)
                .call();

        if (res.paymentLink().isPresent()) {
            System.out.println(res.paymentLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdatePaymentLink2Request](../../models/operations/UpdatePaymentLink2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdatePaymentLink2Response](../../models/operations/UpdatePaymentLink2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |