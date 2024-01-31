<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest req = new CreateAccountingAccountRequest(
                "string"){{
                accountingAccount = new AccountingAccount(
                    "string"){{
                    balance = 6602.56d;
                    createdAt = OffsetDateTime.parse("2023-09-02T22:12:31.771Z");
                    currency = "Saint Helena Pound";
                    customerDefinedCode = "string";
                    description = "Cross-group zero defect task-force";
                    id = "<ID>";
                    isPayable = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    status = Status.ACTIVE;
                    type = Type.EQUITY;
                    updatedAt = OffsetDateTime.parse("2023-09-09T23:41:51.681Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse res = sdk.accounting.createAccountingAccount(req);

            if (res.accountingAccount != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->