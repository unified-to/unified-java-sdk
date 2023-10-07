# Apicall
(*apicall*)

### Available Operations

* [getUnifiedApicall](#getunifiedapicall) - Returns API Calls
* [getUnifiedApicallId](#getunifiedapicallid) - Retrieve specific API Call by its ID

## getUnifiedApicall

Returns API Calls

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("tesla"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedApicallRequest req = new GetUnifiedApicallRequest(){{
                connectionId = "green Hybrid Northwest";
                createdLte = OffsetDateTime.parse("2021-10-25T17:00:01.179Z");
                env = "Steel lime";
                error = false;
                externalXref = "indexing North";
                integrationType = "Faroe";
                limit = 8086.35d;
                offset = 4369.86d;
                order = "Practical online";
                sort = "envisioneer Executive Northwest";
                updatedGte = OffsetDateTime.parse("2023-03-02T12:58:56.214Z");
            }};            

            GetUnifiedApicallResponse res = sdk.apicall.getUnifiedApicall(req);

            if (res.apiCalls != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest](../../models/operations/GetUnifiedApicallRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallResponse](../../models/operations/GetUnifiedApicallResponse.md)**


## getUnifiedApicallId

Retrieve specific API Call by its ID

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("fuchsia"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedApicallIdRequest req = new GetUnifiedApicallIdRequest("Guadeloupe");            

            GetUnifiedApicallIdResponse res = sdk.apicall.getUnifiedApicallId(req);

            if (res.apiCall != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdRequest](../../models/operations/GetUnifiedApicallIdRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdResponse](../../models/operations/GetUnifiedApicallIdResponse.md)**

