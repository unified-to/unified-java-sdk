<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccount2Response;
import to.unified.unified_java_sdk.models.shared.AccountingAccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccount2Request req = CreateAccountingAccount2Request.builder()
                .accountingAccount(AccountingAccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccount2Response res = sdk.accounting().createAccountingAccount2()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->