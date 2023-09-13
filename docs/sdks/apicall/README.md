# apicall

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
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedApicallRequest req = new GetUnifiedApicallRequest() {{
                connectionId = "modi";
                createdLte = LocalDate.parse("2022-08-08");
                env = "cupiditate";
                error = false;
                externalXref = "quos";
                integrationType = "perferendis";
                limit = 1649.4d;
                offset = 8289.4d;
                order = "ipsam";
                sort = "alias";
                updatedGte = LocalDate.parse("2022-04-28");
            }};            

            GetUnifiedApicallResponse res = sdk.apicall.getUnifiedApicall(req, new GetUnifiedApicallSecurity("excepturi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest](../../models/operations/GetUnifiedApicallRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallSecurity](../../models/operations/GetUnifiedApicallSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedApicallIdRequest req = new GetUnifiedApicallIdRequest("tempora");            

            GetUnifiedApicallIdResponse res = sdk.apicall.getUnifiedApicallId(req, new GetUnifiedApicallIdSecurity("facilis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdRequest](../../models/operations/GetUnifiedApicallIdRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdSecurity](../../models/operations/GetUnifiedApicallIdSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallIdResponse](../../models/operations/GetUnifiedApicallIdResponse.md)**

