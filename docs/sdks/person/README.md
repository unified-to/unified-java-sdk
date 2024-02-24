# Person
(*person*)

### Available Operations

* [listEnrichPeople](#listenrichpeople) - Retrieve enrichment information for a person

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

            com.unifiedapi.unifiedto.models.operations.ListEnrichPeopleResponse res = sdk.person.listEnrichPeople(req, new ListEnrichPeopleSecurity(
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

