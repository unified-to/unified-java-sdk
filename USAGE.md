<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountSecurity;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.Status;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest req = new CreateAccountingAccountRequest(
                "<value>"){{
                accountingAccount = new AccountingAccount(
                    "<value>"){{
                    balance = 6602.56d;
                    createdAt = OffsetDateTime.parse("2023-09-02T22:12:31.771Z");
                    currency = "Saint Helena Pound";
                    customerDefinedCode = "<value>";
                    description = "Cross-group zero defect task-force";
                    id = "<id>";
                    isPayable = false;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    status = Status.ACTIVE;
                    type = Type.EQUITY;
                    updatedAt = OffsetDateTime.parse("2023-09-09T23:41:51.681Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse res = sdk.accounting.createAccountingAccount(req, new CreateAccountingAccountSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

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