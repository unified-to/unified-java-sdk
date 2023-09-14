# pipeline

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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdPipelineIdRequest req = new DeleteCrmConnectionIdPipelineIdRequest("modi", "sequi");            

            DeleteCrmConnectionIdPipelineIdResponse res = sdk.pipeline.deleteCrmConnectionIdPipelineId(req, new DeleteCrmConnectionIdPipelineIdSecurity("nisi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdRequest](../../models/operations/DeleteCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdSecurity](../../models/operations/DeleteCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdPipelineRequest req = new GetCrmConnectionIdPipelineRequest("autem") {{
                limit = 2725.62d;
                offset = 6534.92d;
                order = "quas";
                query = "hic";
                sort = "doloremque";
                updatedGte = OffsetDateTime.parse("2021-01-05T10:08:21.523Z");
            }};            

            GetCrmConnectionIdPipelineResponse res = sdk.pipeline.getCrmConnectionIdPipeline(req, new GetCrmConnectionIdPipelineSecurity("rem") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineRequest](../../models/operations/GetCrmConnectionIdPipelineRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineSecurity](../../models/operations/GetCrmConnectionIdPipelineSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdPipelineIdRequest req = new GetCrmConnectionIdPipelineIdRequest("quod", "commodi");            

            GetCrmConnectionIdPipelineIdResponse res = sdk.pipeline.getCrmConnectionIdPipelineId(req, new GetCrmConnectionIdPipelineIdSecurity("natus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdRequest](../../models/operations/GetCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdSecurity](../../models/operations/GetCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdPipelineIdRequest req = new PatchCrmConnectionIdPipelineIdRequest("beatae", "placeat") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2022-10-12T04:27:21.437Z");
                    dealProbability = false;
                    displayOrder = 1551.08d;
                    id = "d9fbaf94-76a2-4ae8-9cc5-0c8a3512c737";
                    name = "Theodore Leffler";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2022-07-05T07:47:31.296Z");
                }};;
            }};            

            PatchCrmConnectionIdPipelineIdResponse res = sdk.pipeline.patchCrmConnectionIdPipelineId(req, new PatchCrmConnectionIdPipelineIdSecurity("minima") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdRequest](../../models/operations/PatchCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdSecurity](../../models/operations/PatchCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdPipelineRequest req = new PostCrmConnectionIdPipelineRequest("eaque") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2022-12-31T22:43:49.219Z");
                    dealProbability = false;
                    displayOrder = 258.72d;
                    id = "e966ec73-6d43-4194-b98c-783c92398ed3";
                    name = "Allen O'Connell";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2020-12-29T00:25:34.871Z");
                }};;
            }};            

            PostCrmConnectionIdPipelineResponse res = sdk.pipeline.postCrmConnectionIdPipeline(req, new PostCrmConnectionIdPipelineSecurity("non") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineRequest](../../models/operations/PostCrmConnectionIdPipelineRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineSecurity](../../models/operations/PostCrmConnectionIdPipelineSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdPipelineIdRequest req = new PutCrmConnectionIdPipelineIdRequest("placeat", "veniam") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2021-02-08T05:06:00.074Z");
                    dealProbability = false;
                    displayOrder = 5484.03d;
                    id = "649a70cf-d5d6-4989-b720-6451077d19ea";
                    name = "Philip Schumm";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2022-01-24T10:39:05.897Z");
                }};;
            }};            

            PutCrmConnectionIdPipelineIdResponse res = sdk.pipeline.putCrmConnectionIdPipelineId(req, new PutCrmConnectionIdPipelineIdSecurity("quibusdam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdRequest](../../models/operations/PutCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdSecurity](../../models/operations/PutCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdResponse](../../models/operations/PutCrmConnectionIdPipelineIdResponse.md)**

