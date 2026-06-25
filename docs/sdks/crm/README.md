# Crm

## Overview

### Available Operations

* [createCrmCompany2](#createcrmcompany2) - Create a company
* [createCrmContact2](#createcrmcontact2) - Create a contact
* [createCrmDeal2](#createcrmdeal2) - Create a deal
* [createCrmEvent2](#createcrmevent2) - Create an event
* [createCrmLead2](#createcrmlead2) - Create a lead
* [createCrmPipeline2](#createcrmpipeline2) - Create a pipeline
* [getCrmCompany2](#getcrmcompany2) - Retrieve a company
* [getCrmContact2](#getcrmcontact2) - Retrieve a contact
* [getCrmDeal2](#getcrmdeal2) - Retrieve a deal
* [getCrmEvent2](#getcrmevent2) - Retrieve an event
* [getCrmLead2](#getcrmlead2) - Retrieve a lead
* [getCrmPipeline2](#getcrmpipeline2) - Retrieve a pipeline
* [listCrmCompanies2](#listcrmcompanies2) - List all companies
* [listCrmContacts2](#listcrmcontacts2) - List all contacts
* [listCrmDeals2](#listcrmdeals2) - List all deals
* [listCrmEvents2](#listcrmevents2) - List all events
* [listCrmLeads2](#listcrmleads2) - List all leads
* [listCrmPipelines2](#listcrmpipelines2) - List all pipelines
* [patchCrmCompany2](#patchcrmcompany2) - Update a company
* [patchCrmContact2](#patchcrmcontact2) - Update a contact
* [patchCrmDeal2](#patchcrmdeal2) - Update a deal
* [patchCrmEvent2](#patchcrmevent2) - Update an event
* [patchCrmLead2](#patchcrmlead2) - Update a lead
* [patchCrmPipeline2](#patchcrmpipeline2) - Update a pipeline
* [removeCrmCompany2](#removecrmcompany2) - Remove a company
* [removeCrmContact2](#removecrmcontact2) - Remove a contact
* [removeCrmDeal2](#removecrmdeal2) - Remove a deal
* [removeCrmEvent2](#removecrmevent2) - Remove an event
* [removeCrmLead2](#removecrmlead2) - Remove a lead
* [removeCrmPipeline2](#removecrmpipeline2) - Remove a pipeline
* [updateCrmCompany2](#updatecrmcompany2) - Update a company
* [updateCrmContact2](#updatecrmcontact2) - Update a contact
* [updateCrmDeal2](#updatecrmdeal2) - Update a deal
* [updateCrmEvent2](#updatecrmevent2) - Update an event
* [updateCrmLead2](#updatecrmlead2) - Update a lead
* [updateCrmPipeline2](#updatecrmpipeline2) - Update a pipeline

## createCrmCompany2

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmCompany2" method="post" path="/crm/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmCompany2Request req = CreateCrmCompany2Request.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmCompany2Response res = sdk.crm().createCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateCrmCompany2Request](../../models/operations/CreateCrmCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateCrmCompany2Response](../../models/operations/CreateCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmContact2

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmContact2" method="post" path="/crm/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmContact2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmContact2Response;
import to.unified.unified_java_sdk.models.shared.CrmContact;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmContact2Request req = CreateCrmContact2Request.builder()
                .crmContact(CrmContact.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmContact2Response res = sdk.crm().createCrmContact2()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateCrmContact2Request](../../models/operations/CreateCrmContact2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateCrmContact2Response](../../models/operations/CreateCrmContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmDeal2

Create a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmDeal2" method="post" path="/crm/{connection_id}/deal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.CrmDeal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmDeal2Request req = CreateCrmDeal2Request.builder()
                .crmDeal(CrmDeal.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmDeal2Response res = sdk.crm().createCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCrmDeal2Request](../../models/operations/CreateCrmDeal2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCrmDeal2Response](../../models/operations/CreateCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmEvent2

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmEvent2" method="post" path="/crm/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.CrmEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmEvent2Request req = CreateCrmEvent2Request.builder()
                .crmEvent(CrmEvent.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmEvent2Response res = sdk.crm().createCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateCrmEvent2Request](../../models/operations/CreateCrmEvent2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateCrmEvent2Response](../../models/operations/CreateCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmLead2

Create a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmLead2" method="post" path="/crm/{connection_id}/lead" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.CrmLead;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmLead2Request req = CreateCrmLead2Request.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmLead2Response res = sdk.crm().createCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCrmLead2Request](../../models/operations/CreateCrmLead2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCrmLead2Response](../../models/operations/CreateCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmPipeline2

Create a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmPipeline2" method="post" path="/crm/{connection_id}/pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.CrmPipeline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmPipeline2Request req = CreateCrmPipeline2Request.builder()
                .crmPipeline(CrmPipeline.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmPipeline2Response res = sdk.crm().createCrmPipeline2()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateCrmPipeline2Request](../../models/operations/CreateCrmPipeline2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateCrmPipeline2Response](../../models/operations/CreateCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmCompany2

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmCompany2" method="get" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmCompany2Request req = GetCrmCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmCompany2Response res = sdk.crm().getCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCrmCompany2Request](../../models/operations/GetCrmCompany2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCrmCompany2Response](../../models/operations/GetCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmContact2

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmContact2" method="get" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmContact2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmContact2Request req = GetCrmContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmContact2Response res = sdk.crm().getCrmContact2()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCrmContact2Request](../../models/operations/GetCrmContact2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCrmContact2Response](../../models/operations/GetCrmContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmDeal2

Retrieve a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmDeal2" method="get" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmDeal2Request req = GetCrmDeal2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmDeal2Response res = sdk.crm().getCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCrmDeal2Request](../../models/operations/GetCrmDeal2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCrmDeal2Response](../../models/operations/GetCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmEvent2

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmEvent2" method="get" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmEvent2Request req = GetCrmEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmEvent2Response res = sdk.crm().getCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetCrmEvent2Request](../../models/operations/GetCrmEvent2Request.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetCrmEvent2Response](../../models/operations/GetCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmLead2

Retrieve a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmLead2" method="get" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmLead2Request req = GetCrmLead2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmLead2Response res = sdk.crm().getCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCrmLead2Request](../../models/operations/GetCrmLead2Request.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCrmLead2Response](../../models/operations/GetCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmPipeline2

Retrieve a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmPipeline2" method="get" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.GetCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmPipeline2Request req = GetCrmPipeline2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmPipeline2Response res = sdk.crm().getCrmPipeline2()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetCrmPipeline2Request](../../models/operations/GetCrmPipeline2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetCrmPipeline2Response](../../models/operations/GetCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmCompanies2

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmCompanies2" method="get" path="/crm/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmCompanies2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmCompanies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmCompanies2Request req = ListCrmCompanies2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmCompanies2Response res = sdk.crm().listCrmCompanies2()
                .request(req)
                .call();

        if (res.crmCompanies().isPresent()) {
            System.out.println(res.crmCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmCompanies2Request](../../models/operations/ListCrmCompanies2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmCompanies2Response](../../models/operations/ListCrmCompanies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmContacts2

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmContacts2" method="get" path="/crm/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmContacts2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmContacts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmContacts2Request req = ListCrmContacts2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmContacts2Response res = sdk.crm().listCrmContacts2()
                .request(req)
                .call();

        if (res.crmContacts().isPresent()) {
            System.out.println(res.crmContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmContacts2Request](../../models/operations/ListCrmContacts2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmContacts2Response](../../models/operations/ListCrmContacts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmDeals2

List all deals

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmDeals2" method="get" path="/crm/{connection_id}/deal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmDeals2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmDeals2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmDeals2Request req = ListCrmDeals2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmDeals2Response res = sdk.crm().listCrmDeals2()
                .request(req)
                .call();

        if (res.crmDeals().isPresent()) {
            System.out.println(res.crmDeals().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCrmDeals2Request](../../models/operations/ListCrmDeals2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCrmDeals2Response](../../models/operations/ListCrmDeals2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmEvents2

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmEvents2" method="get" path="/crm/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmEvents2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmEvents2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmEvents2Request req = ListCrmEvents2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmEvents2Response res = sdk.crm().listCrmEvents2()
                .request(req)
                .call();

        if (res.crmEvents().isPresent()) {
            System.out.println(res.crmEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListCrmEvents2Request](../../models/operations/ListCrmEvents2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListCrmEvents2Response](../../models/operations/ListCrmEvents2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmLeads2

List all leads

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmLeads2" method="get" path="/crm/{connection_id}/lead" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmLeads2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmLeads2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmLeads2Request req = ListCrmLeads2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmLeads2Response res = sdk.crm().listCrmLeads2()
                .request(req)
                .call();

        if (res.crmLeads().isPresent()) {
            System.out.println(res.crmLeads().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCrmLeads2Request](../../models/operations/ListCrmLeads2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCrmLeads2Response](../../models/operations/ListCrmLeads2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmPipelines2

List all pipelines

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmPipelines2" method="get" path="/crm/{connection_id}/pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelines2Request;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelines2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmPipelines2Request req = ListCrmPipelines2Request.builder()
                .connectionId("<id>")
                .build();

        ListCrmPipelines2Response res = sdk.crm().listCrmPipelines2()
                .request(req)
                .call();

        if (res.crmPipelines().isPresent()) {
            System.out.println(res.crmPipelines().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmPipelines2Request](../../models/operations/ListCrmPipelines2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmPipelines2Response](../../models/operations/ListCrmPipelines2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmCompany2" method="patch" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmCompany2Request req = PatchCrmCompany2Request.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmCompany2Response res = sdk.crm().patchCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchCrmCompany2Request](../../models/operations/PatchCrmCompany2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchCrmCompany2Response](../../models/operations/PatchCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmContact2" method="patch" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmContact2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmContact2Response;
import to.unified.unified_java_sdk.models.shared.CrmContact;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmContact2Request req = PatchCrmContact2Request.builder()
                .crmContact(CrmContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmContact2Response res = sdk.crm().patchCrmContact2()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchCrmContact2Request](../../models/operations/PatchCrmContact2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchCrmContact2Response](../../models/operations/PatchCrmContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmDeal2

Update a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmDeal2" method="patch" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.CrmDeal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmDeal2Request req = PatchCrmDeal2Request.builder()
                .crmDeal(CrmDeal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmDeal2Response res = sdk.crm().patchCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCrmDeal2Request](../../models/operations/PatchCrmDeal2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCrmDeal2Response](../../models/operations/PatchCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmEvent2" method="patch" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.CrmEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmEvent2Request req = PatchCrmEvent2Request.builder()
                .crmEvent(CrmEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmEvent2Response res = sdk.crm().patchCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchCrmEvent2Request](../../models/operations/PatchCrmEvent2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchCrmEvent2Response](../../models/operations/PatchCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmLead2

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmLead2" method="patch" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.CrmLead;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmLead2Request req = PatchCrmLead2Request.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmLead2Response res = sdk.crm().patchCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCrmLead2Request](../../models/operations/PatchCrmLead2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCrmLead2Response](../../models/operations/PatchCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmPipeline2

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmPipeline2" method="patch" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.CrmPipeline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmPipeline2Request req = PatchCrmPipeline2Request.builder()
                .crmPipeline(CrmPipeline.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmPipeline2Response res = sdk.crm().patchCrmPipeline2()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchCrmPipeline2Request](../../models/operations/PatchCrmPipeline2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchCrmPipeline2Response](../../models/operations/PatchCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmCompany2

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmCompany2" method="delete" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmCompany2Request req = RemoveCrmCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmCompany2Response res = sdk.crm().removeCrmCompany2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveCrmCompany2Request](../../models/operations/RemoveCrmCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveCrmCompany2Response](../../models/operations/RemoveCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmContact2

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmContact2" method="delete" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmContact2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmContact2Request req = RemoveCrmContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmContact2Response res = sdk.crm().removeCrmContact2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveCrmContact2Request](../../models/operations/RemoveCrmContact2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveCrmContact2Response](../../models/operations/RemoveCrmContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmDeal2

Remove a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmDeal2" method="delete" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmDeal2Request req = RemoveCrmDeal2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmDeal2Response res = sdk.crm().removeCrmDeal2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCrmDeal2Request](../../models/operations/RemoveCrmDeal2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCrmDeal2Response](../../models/operations/RemoveCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmEvent2

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmEvent2" method="delete" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmEvent2Request req = RemoveCrmEvent2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmEvent2Response res = sdk.crm().removeCrmEvent2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveCrmEvent2Request](../../models/operations/RemoveCrmEvent2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveCrmEvent2Response](../../models/operations/RemoveCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmLead2

Remove a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmLead2" method="delete" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmLead2Request req = RemoveCrmLead2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmLead2Response res = sdk.crm().removeCrmLead2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCrmLead2Request](../../models/operations/RemoveCrmLead2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCrmLead2Response](../../models/operations/RemoveCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmPipeline2

Remove a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmPipeline2" method="delete" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmPipeline2Request req = RemoveCrmPipeline2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmPipeline2Response res = sdk.crm().removeCrmPipeline2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveCrmPipeline2Request](../../models/operations/RemoveCrmPipeline2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveCrmPipeline2Response](../../models/operations/RemoveCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmCompany2" method="put" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompany2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompany2Response;
import to.unified.unified_java_sdk.models.shared.CrmCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmCompany2Request req = UpdateCrmCompany2Request.builder()
                .crmCompany(CrmCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmCompany2Response res = sdk.crm().updateCrmCompany2()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCrmCompany2Request](../../models/operations/UpdateCrmCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCrmCompany2Response](../../models/operations/UpdateCrmCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmContact2" method="put" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmContact2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmContact2Response;
import to.unified.unified_java_sdk.models.shared.CrmContact;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmContact2Request req = UpdateCrmContact2Request.builder()
                .crmContact(CrmContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmContact2Response res = sdk.crm().updateCrmContact2()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCrmContact2Request](../../models/operations/UpdateCrmContact2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCrmContact2Response](../../models/operations/UpdateCrmContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmDeal2

Update a deal

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmDeal2" method="put" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDeal2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDeal2Response;
import to.unified.unified_java_sdk.models.shared.CrmDeal;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmDeal2Request req = UpdateCrmDeal2Request.builder()
                .crmDeal(CrmDeal.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmDeal2Response res = sdk.crm().updateCrmDeal2()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCrmDeal2Request](../../models/operations/UpdateCrmDeal2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCrmDeal2Response](../../models/operations/UpdateCrmDeal2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmEvent2" method="put" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEvent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEvent2Response;
import to.unified.unified_java_sdk.models.shared.CrmEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmEvent2Request req = UpdateCrmEvent2Request.builder()
                .crmEvent(CrmEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmEvent2Response res = sdk.crm().updateCrmEvent2()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateCrmEvent2Request](../../models/operations/UpdateCrmEvent2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateCrmEvent2Response](../../models/operations/UpdateCrmEvent2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmLead2

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmLead2" method="put" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLead2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLead2Response;
import to.unified.unified_java_sdk.models.shared.CrmLead;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmLead2Request req = UpdateCrmLead2Request.builder()
                .crmLead(CrmLead.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmLead2Response res = sdk.crm().updateCrmLead2()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCrmLead2Request](../../models/operations/UpdateCrmLead2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCrmLead2Response](../../models/operations/UpdateCrmLead2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmPipeline2

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmPipeline2" method="put" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipeline2Request;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipeline2Response;
import to.unified.unified_java_sdk.models.shared.CrmPipeline;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmPipeline2Request req = UpdateCrmPipeline2Request.builder()
                .crmPipeline(CrmPipeline.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmPipeline2Response res = sdk.crm().updateCrmPipeline2()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateCrmPipeline2Request](../../models/operations/UpdateCrmPipeline2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateCrmPipeline2Response](../../models/operations/UpdateCrmPipeline2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |