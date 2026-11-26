<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingAccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingAccountRequest req = CreateAccountingAccountRequest.builder()
                .accountingAccount(AccountingAccount.builder()
                    .balance(12092d)
                    .createdAt(OffsetDateTime.parse("2022-07-03T17:57:07.391Z"))
                    .currency("CAD")
                    .customerDefinedCode("6170")
                    .description("Comedo vilitas harum cupiditate animus quo iste.")
                    .id("926fabf4-6cc0-44df-a63c-7b44d67d1db4")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Savings Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("vesper")
                            .originalType("peccatus")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-16T01:01:05.981Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingAccountResponse res = sdk.accounting().createAccountingAccount()
                .request(req)
                .call();

        if (res.accountingAccount().isPresent()) {
            System.out.println(res.accountingAccount().get());
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->