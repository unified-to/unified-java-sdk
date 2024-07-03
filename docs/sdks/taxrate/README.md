# Taxrate
(*taxrate*)

### Available Operations

* [createAccountingTaxrate](#createaccountingtaxrate) - Create a taxrate
* [getAccountingTaxrate](#getaccountingtaxrate) - Retrieve a taxrate
* [listAccountingTaxrates](#listaccountingtaxrates) - List all taxrates
* [patchAccountingTaxrate](#patchaccountingtaxrate) - Update a taxrate
* [removeAccountingTaxrate](#removeaccountingtaxrate) - Remove a taxrate
* [updateAccountingTaxrate](#updateaccountingtaxrate) - Update a taxrate

## createAccountingTaxrate

Create a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest req = new CreateAccountingTaxrateRequest(
                "<value>"){{
                accountingTaxrate = new AccountingTaxrate(
){{
                    createdAt = OffsetDateTime.parse("2022-07-08T09:55:20.238Z");
                    description = "Enterprise-wide content-based productivity";
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    rate = 6789.7d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-12-27T23:06:27.112Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse res = sdk.taxrate.createAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest](../../models/operations/CreateAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse](../../models/operations/CreateAccountingTaxrateResponse.md)**


## getAccountingTaxrate

Retrieve a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest req = new GetAccountingTaxrateRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse res = sdk.taxrate.getAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest](../../models/operations/GetAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse](../../models/operations/GetAccountingTaxrateResponse.md)**


## listAccountingTaxrates

List all taxrates

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest req = new ListAccountingTaxratesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 1599.19d;
                offset = 1097.48d;
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2023-06-14T14:31:13.247Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse res = sdk.taxrate.listAccountingTaxrates(req);

            if (res.accountingTaxrates != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest](../../models/operations/ListAccountingTaxratesRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse](../../models/operations/ListAccountingTaxratesResponse.md)**


## patchAccountingTaxrate

Update a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest req = new PatchAccountingTaxrateRequest(
                "<value>",
                "<value>"){{
                accountingTaxrate = new AccountingTaxrate(
){{
                    createdAt = OffsetDateTime.parse("2023-10-19T15:57:03.731Z");
                    description = "Quality-focused user-facing complexity";
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    rate = 220.78d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2024-01-17T10:44:31.599Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse res = sdk.taxrate.patchAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest](../../models/operations/PatchAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse](../../models/operations/PatchAccountingTaxrateResponse.md)**


## removeAccountingTaxrate

Remove a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest req = new RemoveAccountingTaxrateRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse res = sdk.taxrate.removeAccountingTaxrate(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest](../../models/operations/RemoveAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse](../../models/operations/RemoveAccountingTaxrateResponse.md)**


## updateAccountingTaxrate

Update a taxrate

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingTaxrate;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest req = new UpdateAccountingTaxrateRequest(
                "<value>",
                "<value>"){{
                accountingTaxrate = new AccountingTaxrate(
){{
                    createdAt = OffsetDateTime.parse("2023-01-06T18:04:39.999Z");
                    description = "Switchable intangible initiative";
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    rate = 2580.61d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-03-21T10:57:59.053Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse res = sdk.taxrate.updateAccountingTaxrate(req);

            if (res.accountingTaxrate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest](../../models/operations/UpdateAccountingTaxrateRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse](../../models/operations/UpdateAccountingTaxrateResponse.md)**

