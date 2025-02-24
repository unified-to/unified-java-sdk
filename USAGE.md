<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingAccountResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingAccount;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->