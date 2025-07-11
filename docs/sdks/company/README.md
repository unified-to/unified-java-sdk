# Company
(*company()*)

## Overview

### Available Operations

* [createAtsCompany](#createatscompany) - Create a company
* [createCrmCompany](#createcrmcompany) - Create a company
* [createHrisCompany](#createhriscompany) - Create a company
* [getAtsCompany](#getatscompany) - Retrieve a company
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [getHrisCompany](#gethriscompany) - Retrieve a company
* [listAtsCompanies](#listatscompanies) - List all companies
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listEnrichCompanies](#listenrichcompanies) - Retrieve enrichment information for a company
* [listHrisCompanies](#listhriscompanies) - List all companies
* [patchAtsCompany](#patchatscompany) - Update a company
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [patchHrisCompany](#patchhriscompany) - Update a company
* [removeAtsCompany](#removeatscompany) - Remove a company
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [removeHrisCompany](#removehriscompany) - Remove a company
* [updateAtsCompany](#updateatscompany) - Update a company
* [updateCrmCompany](#updatecrmcompany) - Update a company
* [updateHrisCompany](#updatehriscompany) - Update a company

## createAtsCompany

Create a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsCompanyRequest req = CreateAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsCompanyResponse res = sdk.company().createAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateAtsCompanyRequest](../../models/operations/CreateAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateAtsCompanyResponse](../../models/operations/CreateAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmCompany

Create a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmCompanyRequest req = CreateCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmCompanyResponse res = sdk.company().createCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCrmCompanyRequest](../../models/operations/CreateCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCrmCompanyResponse](../../models/operations/CreateCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisCompany

Create a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisCompanyRequest req = CreateHrisCompanyRequest.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisCompanyResponse res = sdk.company().createHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisCompanyRequest](../../models/operations/CreateHrisCompanyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisCompanyResponse](../../models/operations/CreateHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsCompanyRequest req = GetAtsCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsCompanyResponse res = sdk.company().getAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetAtsCompanyRequest](../../models/operations/GetAtsCompanyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetAtsCompanyResponse](../../models/operations/GetAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmCompanyRequest req = GetCrmCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmCompanyResponse res = sdk.company().getCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCrmCompanyRequest](../../models/operations/GetCrmCompanyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCrmCompanyResponse](../../models/operations/GetCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisCompanyRequest req = GetHrisCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisCompanyResponse res = sdk.company().getHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisCompanyRequest](../../models/operations/GetHrisCompanyRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisCompanyResponse](../../models/operations/GetHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsCompanies

List all companies

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsCompaniesRequest req = ListAtsCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsCompaniesResponse res = sdk.company().listAtsCompanies()
                .request(req)
                .call();

        if (res.atsCompanies().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAtsCompaniesRequest](../../models/operations/ListAtsCompaniesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAtsCompaniesResponse](../../models/operations/ListAtsCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmCompanies

List all companies

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmCompaniesRequest req = ListCrmCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmCompaniesResponse res = sdk.company().listCrmCompanies()
                .request(req)
                .call();

        if (res.crmCompanies().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmCompaniesRequest](../../models/operations/ListCrmCompaniesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmCompaniesResponse](../../models/operations/ListCrmCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEnrichCompanies

Retrieve enrichment information for a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListEnrichCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListEnrichCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListEnrichCompaniesRequest req = ListEnrichCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListEnrichCompaniesResponse res = sdk.company().listEnrichCompanies()
                .request(req)
                .call();

        if (res.enrichCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListEnrichCompaniesRequest](../../models/operations/ListEnrichCompaniesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListEnrichCompaniesResponse](../../models/operations/ListEnrichCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisCompanies

List all companies

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisCompaniesRequest req = ListHrisCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisCompaniesResponse res = sdk.company().listHrisCompanies()
                .request(req)
                .call();

        if (res.hrisCompanies().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisCompaniesRequest](../../models/operations/ListHrisCompaniesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisCompaniesResponse](../../models/operations/ListHrisCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsCompany

Update a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsCompanyRequest req = PatchAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsCompanyResponse res = sdk.company().patchAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchAtsCompanyRequest](../../models/operations/PatchAtsCompanyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchAtsCompanyResponse](../../models/operations/PatchAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmCompany

Update a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmCompanyRequest req = PatchCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmCompanyResponse res = sdk.company().patchCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCrmCompanyRequest](../../models/operations/PatchCrmCompanyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCrmCompanyResponse](../../models/operations/PatchCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisCompany

Update a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisCompanyRequest req = PatchHrisCompanyRequest.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisCompanyResponse res = sdk.company().patchHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisCompanyRequest](../../models/operations/PatchHrisCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisCompanyResponse](../../models/operations/PatchHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsCompany

Remove a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsCompanyRequest req = RemoveAtsCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsCompanyResponse res = sdk.company().removeAtsCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveAtsCompanyRequest](../../models/operations/RemoveAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveAtsCompanyResponse](../../models/operations/RemoveAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmCompany

Remove a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmCompanyRequest req = RemoveCrmCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmCompanyResponse res = sdk.company().removeCrmCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCrmCompanyRequest](../../models/operations/RemoveCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCrmCompanyResponse](../../models/operations/RemoveCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisCompany

Remove a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisCompanyRequest req = RemoveHrisCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisCompanyResponse res = sdk.company().removeHrisCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisCompanyRequest](../../models/operations/RemoveHrisCompanyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisCompanyResponse](../../models/operations/RemoveHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsCompany

Update a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsCompanyRequest req = UpdateAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .name("<value>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsCompanyResponse res = sdk.company().updateAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateAtsCompanyRequest](../../models/operations/UpdateAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateAtsCompanyResponse](../../models/operations/UpdateAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmCompany

Update a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmCompanyRequest req = UpdateCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmCompanyResponse res = sdk.company().updateCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCrmCompanyRequest](../../models/operations/UpdateCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCrmCompanyResponse](../../models/operations/UpdateCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisCompany

Update a company

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisCompanyRequest req = UpdateHrisCompanyRequest.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisCompanyResponse res = sdk.company().updateHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisCompanyRequest](../../models/operations/UpdateHrisCompanyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisCompanyResponse](../../models/operations/UpdateHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |