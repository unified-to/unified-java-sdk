# Enrich
(*enrich*)

### Available Operations

* [listEnrichCompanies](#listenrichcompanies) - Retrieve enrichment information for a company
* [listEnrichPeople](#listenrichpeople) - Retrieve enrichment information for a person

## listEnrichCompanies

Retrieve enrichment information for a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesResponse;
import com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesRequest req = new ListEnrichCompaniesRequest(
                "<value>"){{
                domain = "dismal-cornmeal.org";
                name = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesResponse res = sdk.enrich.listEnrichCompanies(req, new ListEnrichCompaniesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.enrichCompany != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesRequest](../../models/operations/ListEnrichCompaniesRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesSecurity](../../models/operations/ListEnrichCompaniesSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesResponse](../../models/operations/ListEnrichCompaniesResponse.md)**


## listEnrichPeople

Retrieve enrichment information for a person

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleRequest;
import com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleResponse;
import com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleRequest req = new ListEnrichPeopleRequest(
                "<value>"){{
                email = "Rosendo53@gmail.com";
                linkedinUrl = "<value>";
                name = "<value>";
                twitter = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleResponse res = sdk.enrich.listEnrichPeople(req, new ListEnrichPeopleSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
            }});

            if (res.enrichPerson != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleRequest](../../models/operations/ListEnrichPeopleRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleSecurity](../../models/operations/ListEnrichPeopleSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleResponse](../../models/operations/ListEnrichPeopleResponse.md)**

