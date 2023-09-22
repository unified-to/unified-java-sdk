# Pipeline

### Available Operations

* [deleteCrmConnectionIdPipelineId](#deletecrmconnectionidpipelineid) - Remove a pipeline
* [getCrmConnectionIdPipeline](#getcrmconnectionidpipeline) - List all pipelines
* [getCrmConnectionIdPipelineId](#getcrmconnectionidpipelineid) - Retrieve a pipeline
* [patchCrmConnectionIdPipelineId](#patchcrmconnectionidpipelineid) - Update a pipeline
* [postCrmConnectionIdPipeline](#postcrmconnectionidpipeline) - Create a pipeline
* [putCrmConnectionIdPipelineId](#putcrmconnectionidpipelineid) - Update a pipeline

## deleteCrmConnectionIdPipelineId

Remove a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("culpa") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdPipelineIdRequest req = new DeleteCrmConnectionIdPipelineIdRequest("tenetur", "molestias");            

            DeleteCrmConnectionIdPipelineIdResponse res = sdk.pipeline.deleteCrmConnectionIdPipelineId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdRequest](../../models/operations/DeleteCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdResponse](../../models/operations/DeleteCrmConnectionIdPipelineIdResponse.md)**


## getCrmConnectionIdPipeline

List all pipelines

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("magnam") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdPipelineRequest req = new GetCrmConnectionIdPipelineRequest("voluptate") {{
                limit = 3969.05d;
                offset = 6426.52d;
                order = "qui";
                query = "animi";
                sort = "vero";
                updatedGte = OffsetDateTime.parse("2021-05-09T10:10:01.467Z");
            }};            

            GetCrmConnectionIdPipelineResponse res = sdk.pipeline.getCrmConnectionIdPipeline(req);

            if (res.crmPipelines != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineRequest](../../models/operations/GetCrmConnectionIdPipelineRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineResponse](../../models/operations/GetCrmConnectionIdPipelineResponse.md)**


## getCrmConnectionIdPipelineId

Retrieve a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("optio") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdPipelineIdRequest req = new GetCrmConnectionIdPipelineIdRequest("quo", "ullam");            

            GetCrmConnectionIdPipelineIdResponse res = sdk.pipeline.getCrmConnectionIdPipelineId(req);

            if (res.crmPipeline != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdRequest](../../models/operations/GetCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdResponse](../../models/operations/GetCrmConnectionIdPipelineIdResponse.md)**


## patchCrmConnectionIdPipelineId

Update a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("ipsa") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdPipelineIdRequest req = new PatchCrmConnectionIdPipelineIdRequest("placeat", "quas") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2022-07-13T10:33:44.013Z");
                    dealProbability = false;
                    displayOrder = 3455.88d;
                    id = "12c73784-8930-4750-a00e-966ec736d431";
                    name = "Calvin Donnelly";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2021-07-31T07:27:36.168Z");
                }};;
            }};            

            PatchCrmConnectionIdPipelineIdResponse res = sdk.pipeline.patchCrmConnectionIdPipelineId(req);

            if (res.crmPipeline != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdRequest](../../models/operations/PatchCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdResponse](../../models/operations/PatchCrmConnectionIdPipelineIdResponse.md)**


## postCrmConnectionIdPipeline

Create a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineResponse;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("atque") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdPipelineRequest req = new PostCrmConnectionIdPipelineRequest("dolor") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2021-04-01T21:30:28.639Z");
                    dealProbability = false;
                    displayOrder = 1577.51d;
                    id = "398ed3d3-ab7c-4a3c-9ca8-649a70cfd5d6";
                    name = "Sidney Moore";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2022-12-21T22:06:02.543Z");
                }};;
            }};            

            PostCrmConnectionIdPipelineResponse res = sdk.pipeline.postCrmConnectionIdPipeline(req);

            if (res.crmPipeline != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineRequest](../../models/operations/PostCrmConnectionIdPipelineRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineResponse](../../models/operations/PostCrmConnectionIdPipelineResponse.md)**


## putCrmConnectionIdPipelineId

Update a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("voluptas") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdPipelineIdRequest req = new PutCrmConnectionIdPipelineIdRequest("magnam", "ad") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2022-12-11T13:51:05.168Z");
                    dealProbability = false;
                    displayOrder = 4377.85d;
                    id = "7d19ea83-d492-4ed1-8b8a-2c1954545e95";
                    name = "Mable Runte IV";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2022-02-02T02:12:59.696Z");
                }};;
            }};            

            PutCrmConnectionIdPipelineIdResponse res = sdk.pipeline.putCrmConnectionIdPipelineId(req);

            if (res.crmPipeline != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdRequest](../../models/operations/PutCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdResponse](../../models/operations/PutCrmConnectionIdPipelineIdResponse.md)**

