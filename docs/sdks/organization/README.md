# Organization
(*organization*)

### Available Operations

* [getAccountingOrganization](#getaccountingorganization) - Retrieve an organization
* [listAccountingOrganizations](#listaccountingorganizations) - List all organizations

## getAccountingOrganization

Retrieve an organization

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationResponse;
import com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest req = new GetAccountingOrganizationRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationResponse res = sdk.organization.getAccountingOrganization(req, new GetAccountingOrganizationSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingOrganization != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest](../../models/operations/GetAccountingOrganizationRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationSecurity](../../models/operations/GetAccountingOrganizationSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationResponse](../../models/operations/GetAccountingOrganizationResponse.md)**


## listAccountingOrganizations

List all organizations

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsResponse;
import com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest req = new ListAccountingOrganizationsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4896.89d;
                offset = 9817.05d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-04-02T18:55:09.644Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsResponse res = sdk.organization.listAccountingOrganizations(req, new ListAccountingOrganizationsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.accountingOrganizations != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest](../../models/operations/ListAccountingOrganizationsRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsSecurity](../../models/operations/ListAccountingOrganizationsSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsResponse](../../models/operations/ListAccountingOrganizationsResponse.md)**

