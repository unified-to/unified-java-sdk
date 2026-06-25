# Contact

## Overview

### Available Operations

* [createAccountingContact2](#createaccountingcontact2) - Create a contact
* [createCrmContact2](#createcrmcontact2) - Create a contact
* [createUcContact2](#createuccontact2) - Create a contact
* [getAccountingContact2](#getaccountingcontact2) - Retrieve a contact
* [getCrmContact2](#getcrmcontact2) - Retrieve a contact
* [getUcContact2](#getuccontact2) - Retrieve a contact
* [listAccountingContacts2](#listaccountingcontacts2) - List all contacts
* [listCrmContacts2](#listcrmcontacts2) - List all contacts
* [listUcContacts2](#listuccontacts2) - List all contacts
* [patchAccountingContact2](#patchaccountingcontact2) - Update a contact
* [patchCrmContact2](#patchcrmcontact2) - Update a contact
* [patchUcContact2](#patchuccontact2) - Update a contact
* [removeAccountingContact2](#removeaccountingcontact2) - Remove a contact
* [removeCrmContact2](#removecrmcontact2) - Remove a contact
* [removeUcContact2](#removeuccontact2) - Remove a contact
* [updateAccountingContact2](#updateaccountingcontact2) - Update a contact
* [updateCrmContact2](#updatecrmcontact2) - Update a contact
* [updateUcContact2](#updateuccontact2) - Update a contact

## createAccountingContact2

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingContact2" method="post" path="/accounting/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingContact2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingContact2Response;
import to.unified.unified_java_sdk.models.shared.AccountingContact;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingContact2Request req = CreateAccountingContact2Request.builder()
                .accountingContact(AccountingContact.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingContact2Response res = sdk.contact().createAccountingContact2()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAccountingContact2Request](../../models/operations/CreateAccountingContact2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAccountingContact2Response](../../models/operations/CreateAccountingContact2Response.md)**

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

        CreateCrmContact2Response res = sdk.contact().createCrmContact2()
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

## createUcContact2

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcContact2" method="post" path="/uc/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcContact2Request;
import to.unified.unified_java_sdk.models.operations.CreateUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcContact2Request req = CreateUcContact2Request.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcContact2Response res = sdk.contact().createUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateUcContact2Request](../../models/operations/CreateUcContact2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateUcContact2Response](../../models/operations/CreateUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingContact2

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingContact2" method="get" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingContact2Request;
import to.unified.unified_java_sdk.models.operations.GetAccountingContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingContact2Request req = GetAccountingContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingContact2Response res = sdk.contact().getAccountingContact2()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAccountingContact2Request](../../models/operations/GetAccountingContact2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAccountingContact2Response](../../models/operations/GetAccountingContact2Response.md)**

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

        GetCrmContact2Response res = sdk.contact().getCrmContact2()
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

## getUcContact2

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcContact2" method="get" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcContact2Request;
import to.unified.unified_java_sdk.models.operations.GetUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcContact2Request req = GetUcContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcContact2Response res = sdk.contact().getUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetUcContact2Request](../../models/operations/GetUcContact2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetUcContact2Response](../../models/operations/GetUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingContacts2

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingContacts2" method="get" path="/accounting/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingContacts2Request;
import to.unified.unified_java_sdk.models.operations.ListAccountingContacts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingContacts2Request req = ListAccountingContacts2Request.builder()
                .connectionId("<id>")
                .build();

        ListAccountingContacts2Response res = sdk.contact().listAccountingContacts2()
                .request(req)
                .call();

        if (res.accountingContacts().isPresent()) {
            System.out.println(res.accountingContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAccountingContacts2Request](../../models/operations/ListAccountingContacts2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAccountingContacts2Response](../../models/operations/ListAccountingContacts2Response.md)**

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

        ListCrmContacts2Response res = sdk.contact().listCrmContacts2()
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

## listUcContacts2

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcContacts2" method="get" path="/uc/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcContacts2Request;
import to.unified.unified_java_sdk.models.operations.ListUcContacts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcContacts2Request req = ListUcContacts2Request.builder()
                .connectionId("<id>")
                .build();

        ListUcContacts2Response res = sdk.contact().listUcContacts2()
                .request(req)
                .call();

        if (res.ucContacts().isPresent()) {
            System.out.println(res.ucContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListUcContacts2Request](../../models/operations/ListUcContacts2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListUcContacts2Response](../../models/operations/ListUcContacts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingContact2" method="patch" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingContact2Request;
import to.unified.unified_java_sdk.models.operations.PatchAccountingContact2Response;
import to.unified.unified_java_sdk.models.shared.AccountingContact;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingContact2Request req = PatchAccountingContact2Request.builder()
                .accountingContact(AccountingContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingContact2Response res = sdk.contact().patchAccountingContact2()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAccountingContact2Request](../../models/operations/PatchAccountingContact2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAccountingContact2Response](../../models/operations/PatchAccountingContact2Response.md)**

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

        PatchCrmContact2Response res = sdk.contact().patchCrmContact2()
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

## patchUcContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcContact2" method="patch" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcContact2Request;
import to.unified.unified_java_sdk.models.operations.PatchUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcContact2Request req = PatchUcContact2Request.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcContact2Response res = sdk.contact().patchUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchUcContact2Request](../../models/operations/PatchUcContact2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchUcContact2Response](../../models/operations/PatchUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingContact2

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingContact2" method="delete" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingContact2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingContact2Request req = RemoveAccountingContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingContact2Response res = sdk.contact().removeAccountingContact2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAccountingContact2Request](../../models/operations/RemoveAccountingContact2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAccountingContact2Response](../../models/operations/RemoveAccountingContact2Response.md)**

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

        RemoveCrmContact2Response res = sdk.contact().removeCrmContact2()
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

## removeUcContact2

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcContact2" method="delete" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcContact2Request;
import to.unified.unified_java_sdk.models.operations.RemoveUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcContact2Request req = RemoveUcContact2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcContact2Response res = sdk.contact().removeUcContact2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveUcContact2Request](../../models/operations/RemoveUcContact2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveUcContact2Response](../../models/operations/RemoveUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingContact2" method="put" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingContact2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingContact2Response;
import to.unified.unified_java_sdk.models.shared.AccountingContact;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingContact2Request req = UpdateAccountingContact2Request.builder()
                .accountingContact(AccountingContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingContact2Response res = sdk.contact().updateAccountingContact2()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAccountingContact2Request](../../models/operations/UpdateAccountingContact2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAccountingContact2Response](../../models/operations/UpdateAccountingContact2Response.md)**

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

        UpdateCrmContact2Response res = sdk.contact().updateCrmContact2()
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

## updateUcContact2

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcContact2" method="put" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcContact2Request;
import to.unified.unified_java_sdk.models.operations.UpdateUcContact2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.UcContact;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcContact2Request req = UpdateUcContact2Request.builder()
                .ucContact(UcContact.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcContact2Response res = sdk.contact().updateUcContact2()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateUcContact2Request](../../models/operations/UpdateUcContact2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateUcContact2Response](../../models/operations/UpdateUcContact2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |