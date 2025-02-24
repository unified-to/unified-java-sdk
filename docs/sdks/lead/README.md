# Lead
(*lead()*)

## Overview

### Available Operations

* [createCrmLead](#createcrmlead) - Create a lead
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [listCrmLeads](#listcrmleads) - List all leads
* [patchCrmLead](#patchcrmlead) - Update a lead
* [removeCrmLead](#removecrmlead) - Remove a lead
* [updateCrmLead](#updatecrmlead) - Update a lead

## createCrmLead

Create a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateCrmLeadRequest req = CreateCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmLeadResponse res = sdk.lead().createCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateCrmLeadRequest](../../models/operations/CreateCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateCrmLeadResponse](../../models/operations/CreateCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmLead

Retrieve a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        GetCrmLeadRequest req = GetCrmLeadRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmLeadResponse res = sdk.lead().getCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetCrmLeadRequest](../../models/operations/GetCrmLeadRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetCrmLeadResponse](../../models/operations/GetCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmLeads

List all leads

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListCrmLeadsRequest req = ListCrmLeadsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmLeadsResponse res = sdk.lead().listCrmLeads()
                .request(req)
                .call();

        if (res.crmLeads().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListCrmLeadsRequest](../../models/operations/ListCrmLeadsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListCrmLeadsResponse](../../models/operations/ListCrmLeadsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchCrmLeadRequest req = PatchCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmLeadResponse res = sdk.lead().patchCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchCrmLeadRequest](../../models/operations/PatchCrmLeadRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchCrmLeadResponse](../../models/operations/PatchCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmLead

Remove a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        RemoveCrmLeadRequest req = RemoveCrmLeadRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmLeadResponse res = sdk.lead().removeCrmLead()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveCrmLeadRequest](../../models/operations/RemoveCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveCrmLeadResponse](../../models/operations/RemoveCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateCrmLeadRequest req = UpdateCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmLeadResponse res = sdk.lead().updateCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateCrmLeadRequest](../../models/operations/UpdateCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateCrmLeadResponse](../../models/operations/UpdateCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |