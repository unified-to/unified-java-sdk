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
                    .description("Voluptatibus valde spoliatio.")
                    .id("4c2bc402-a7bf-450d-bb55-223b2200260f")
                    .isPayable(false)
                    .metadata(List.of())
                    .name("Auto Loan Account")
                    .status(Status.ARCHIVED)
                    .taxonomy(List.of(
                        AccountingAccountTaxonomy.builder()
                            .type(AccountingAccountTaxonomyType.SUBGROUP)
                            .value("comedo")
                            .originalType("vilitas")
                            .build()))
                    .type(Type.ACCOUNTS_RECEIVABLE)
                    .updatedAt(OffsetDateTime.parse("2023-08-07T16:10:06.240Z"))
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