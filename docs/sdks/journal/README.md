# Journal
(*journal*)

### Available Operations

* [createAccountingJournal](#createaccountingjournal) - Create a journal
* [getAccountingJournal](#getaccountingjournal) - Retrieve a journal
* [listAccountingJournals](#listaccountingjournals) - List all journals
* [patchAccountingJournal](#patchaccountingjournal) - Update a journal
* [removeAccountingJournal](#removeaccountingjournal) - Remove a journal
* [updateAccountingJournal](#updateaccountingjournal) - Update a journal

## createAccountingJournal

Create a journal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingJournal;
import com.unifiedapi.unifiedto.models.shared.AccountingJournalLineitem;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalRequest req = new CreateAccountingJournalRequest(
                "<value>"){{
                accountingJournal = new AccountingJournal(
){{
                    createdAt = "<value>";
                    currency = "North Korean Won";
                    description = "Polarised heuristic time-frame";
                    id = "<id>";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingJournalLineitem[]{{
                        add(new AccountingJournalLineitem(
                        ){{}}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 3484.82d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalResponse res = sdk.journal.createAccountingJournal(req);

            if (res.accountingJournal != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalRequest](../../models/operations/CreateAccountingJournalRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalResponse](../../models/operations/CreateAccountingJournalResponse.md)**


## getAccountingJournal

Retrieve a journal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingJournalRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingJournalResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingJournalRequest req = new GetAccountingJournalRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingJournalResponse res = sdk.journal.getAccountingJournal(req);

            if (res.accountingJournal != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingJournalRequest](../../models/operations/GetAccountingJournalRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingJournalResponse](../../models/operations/GetAccountingJournalResponse.md)**


## listAccountingJournals

List all journals

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsRequest req = new ListAccountingJournalsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 3732.99d;
                offset = 235.51d;
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-08-02T07:29:24.179Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsResponse res = sdk.journal.listAccountingJournals(req);

            if (res.accountingJournals != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsRequest](../../models/operations/ListAccountingJournalsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsResponse](../../models/operations/ListAccountingJournalsResponse.md)**


## patchAccountingJournal

Update a journal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingJournal;
import com.unifiedapi.unifiedto.models.shared.AccountingJournalLineitem;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalRequest req = new PatchAccountingJournalRequest(
                "<value>",
                "<value>"){{
                accountingJournal = new AccountingJournal(
){{
                    createdAt = "<value>";
                    currency = "Malaysian Ringgit";
                    description = "Digitized directional function";
                    id = "<id>";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingJournalLineitem[]{{
                        add(new AccountingJournalLineitem(
                        ){{}}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 904d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalResponse res = sdk.journal.patchAccountingJournal(req);

            if (res.accountingJournal != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalRequest](../../models/operations/PatchAccountingJournalRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalResponse](../../models/operations/PatchAccountingJournalResponse.md)**


## removeAccountingJournal

Remove a journal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalRequest req = new RemoveAccountingJournalRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalResponse res = sdk.journal.removeAccountingJournal(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalRequest](../../models/operations/RemoveAccountingJournalRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalResponse](../../models/operations/RemoveAccountingJournalResponse.md)**


## updateAccountingJournal

Update a journal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingJournal;
import com.unifiedapi.unifiedto.models.shared.AccountingJournalLineitem;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalRequest req = new UpdateAccountingJournalRequest(
                "<value>",
                "<value>"){{
                accountingJournal = new AccountingJournal(
){{
                    createdAt = "<value>";
                    currency = "Riel";
                    description = "Fundamental contextually-based challenge";
                    id = "<id>";
                    lineitems = new com.unifiedapi.unifiedto.models.shared.AccountingJournalLineitem[]{{
                        add(new AccountingJournalLineitem(
                        ){{}}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "<value>";
                    taxAmount = 6716.2d;
                    taxrateId = "<value>";
                    updatedAt = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalResponse res = sdk.journal.updateAccountingJournal(req);

            if (res.accountingJournal != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalRequest](../../models/operations/UpdateAccountingJournalRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalResponse](../../models/operations/UpdateAccountingJournalResponse.md)**

