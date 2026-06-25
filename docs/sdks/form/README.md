# Form

## Overview

### Available Operations

* [createFormsForm2](#createformsform2) - Create a form
* [getFormsForm2](#getformsform2) - Retrieve a form
* [listFormsForms2](#listformsforms2) - List all forms
* [patchFormsForm2](#patchformsform2) - Update a form
* [removeFormsForm2](#removeformsform2) - Remove a form
* [updateFormsForm2](#updateformsform2) - Update a form

## createFormsForm2

Create a form

### Example Usage

<!-- UsageSnippet language="java" operationID="createFormsForm2" method="post" path="/forms/{connection_id}/form" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateFormsForm2Request;
import to.unified.unified_java_sdk.models.operations.CreateFormsForm2Response;
import to.unified.unified_java_sdk.models.shared.FormsForm;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateFormsForm2Request req = CreateFormsForm2Request.builder()
                .formsForm(FormsForm.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateFormsForm2Response res = sdk.form().createFormsForm2()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateFormsForm2Request](../../models/operations/CreateFormsForm2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateFormsForm2Response](../../models/operations/CreateFormsForm2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFormsForm2

Retrieve a form

### Example Usage

<!-- UsageSnippet language="java" operationID="getFormsForm2" method="get" path="/forms/{connection_id}/form/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetFormsForm2Request;
import to.unified.unified_java_sdk.models.operations.GetFormsForm2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetFormsForm2Request req = GetFormsForm2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetFormsForm2Response res = sdk.form().getFormsForm2()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetFormsForm2Request](../../models/operations/GetFormsForm2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetFormsForm2Response](../../models/operations/GetFormsForm2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listFormsForms2

List all forms

### Example Usage

<!-- UsageSnippet language="java" operationID="listFormsForms2" method="get" path="/forms/{connection_id}/form" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListFormsForms2Request;
import to.unified.unified_java_sdk.models.operations.ListFormsForms2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListFormsForms2Request req = ListFormsForms2Request.builder()
                .connectionId("<id>")
                .build();

        ListFormsForms2Response res = sdk.form().listFormsForms2()
                .request(req)
                .call();

        if (res.formsForms().isPresent()) {
            System.out.println(res.formsForms().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListFormsForms2Request](../../models/operations/ListFormsForms2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListFormsForms2Response](../../models/operations/ListFormsForms2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchFormsForm2

Update a form

### Example Usage

<!-- UsageSnippet language="java" operationID="patchFormsForm2" method="patch" path="/forms/{connection_id}/form/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchFormsForm2Request;
import to.unified.unified_java_sdk.models.operations.PatchFormsForm2Response;
import to.unified.unified_java_sdk.models.shared.FormsForm;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchFormsForm2Request req = PatchFormsForm2Request.builder()
                .formsForm(FormsForm.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchFormsForm2Response res = sdk.form().patchFormsForm2()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchFormsForm2Request](../../models/operations/PatchFormsForm2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchFormsForm2Response](../../models/operations/PatchFormsForm2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeFormsForm2

Remove a form

### Example Usage

<!-- UsageSnippet language="java" operationID="removeFormsForm2" method="delete" path="/forms/{connection_id}/form/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveFormsForm2Request;
import to.unified.unified_java_sdk.models.operations.RemoveFormsForm2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveFormsForm2Request req = RemoveFormsForm2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveFormsForm2Response res = sdk.form().removeFormsForm2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveFormsForm2Request](../../models/operations/RemoveFormsForm2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveFormsForm2Response](../../models/operations/RemoveFormsForm2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateFormsForm2

Update a form

### Example Usage

<!-- UsageSnippet language="java" operationID="updateFormsForm2" method="put" path="/forms/{connection_id}/form/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateFormsForm2Request;
import to.unified.unified_java_sdk.models.operations.UpdateFormsForm2Response;
import to.unified.unified_java_sdk.models.shared.FormsForm;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateFormsForm2Request req = UpdateFormsForm2Request.builder()
                .formsForm(FormsForm.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateFormsForm2Response res = sdk.form().updateFormsForm2()
                .request(req)
                .call();

        if (res.formsForm().isPresent()) {
            System.out.println(res.formsForm().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateFormsForm2Request](../../models/operations/UpdateFormsForm2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateFormsForm2Response](../../models/operations/UpdateFormsForm2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |