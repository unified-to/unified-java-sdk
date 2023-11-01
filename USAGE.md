<!-- Start SDK Example Usage -->


```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingCustomer;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
import com.unifiedapi.unifiedto.models.shared.Type;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("string"){{
                    jwt = "";
                }})
                .build();

            CreateAccountingCustomerRequest req = new CreateAccountingCustomerRequest("string"){{
                accountingCustomer = new AccountingCustomer(){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "New Raulfield";
                        country = "Libyan Arab Jamahiriya";
                        countryCode = "IN";
                        postalCode = "22232";
                        region = "string";
                        regionCode = "string";
                    }};
                    createdAt = OffsetDateTime.parse("2021-07-22T19:16:48.798Z");
                    currency = "Dalasi";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail("string"){{
                            email = "Loren78@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw();
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(){{
                        address1 = "string";
                        address2 = "string";
                        city = "North Stanford";
                        country = "Iceland";
                        countryCode = "AZ";
                        postalCode = "11906-2906";
                        region = "string";
                        regionCode = "string";
                    }};
                    taxExemption = TaxExemption.RESALE;
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone("string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-12-07T14:42:11.734Z");
                }};
            }};            

            CreateAccountingCustomerResponse res = sdk.accounting.createAccountingCustomer(req);

            if (res.accountingCustomer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->