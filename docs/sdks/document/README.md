# document

### Available Operations

* [deleteAtsConnectionIdScorecardId](#deleteatsconnectionidscorecardid) - Remove a scorecard
* [getAtsConnectionIdScorecard](#getatsconnectionidscorecard) - List all scorecards
* [getAtsConnectionIdScorecardId](#getatsconnectionidscorecardid) - Retrieve a scorecard
* [patchAtsConnectionIdScorecardId](#patchatsconnectionidscorecardid) - Update a scorecard
* [postAtsConnectionIdScorecard](#postatsconnectionidscorecard) - Create a scorecard
* [putAtsConnectionIdScorecardId](#putatsconnectionidscorecardid) - Update a scorecard

## deleteAtsConnectionIdScorecardId

Remove a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteAtsConnectionIdScorecardIdRequest req = new DeleteAtsConnectionIdScorecardIdRequest("sint", "aliquid");            

            DeleteAtsConnectionIdScorecardIdResponse res = sdk.document.deleteAtsConnectionIdScorecardId(req, new DeleteAtsConnectionIdScorecardIdSecurity("repellat") {{
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdRequest](../../models/operations/DeleteAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdSecurity](../../models/operations/DeleteAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdResponse](../../models/operations/DeleteAtsConnectionIdScorecardIdResponse.md)**


## getAtsConnectionIdScorecard

List all scorecards

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdScorecardRequest req = new GetAtsConnectionIdScorecardRequest("sapiente") {{
                applicationId = "consectetur";
                candidateId = "eligendi";
                interviewId = "ullam";
                limit = 4713.15d;
                offset = 2628.91d;
                order = "dignissimos";
                query = "corporis";
                sort = "perferendis";
                updatedGte = LocalDate.parse("2022-10-09");
            }};            

            GetAtsConnectionIdScorecardResponse res = sdk.document.getAtsConnectionIdScorecard(req, new GetAtsConnectionIdScorecardSecurity("corporis") {{
                jwt = "";
            }});

            if (res.atsScorecards != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardRequest](../../models/operations/GetAtsConnectionIdScorecardRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardSecurity](../../models/operations/GetAtsConnectionIdScorecardSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardResponse](../../models/operations/GetAtsConnectionIdScorecardResponse.md)**


## getAtsConnectionIdScorecardId

Retrieve a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetAtsConnectionIdScorecardIdRequest req = new GetAtsConnectionIdScorecardIdRequest("nihil", "officiis");            

            GetAtsConnectionIdScorecardIdResponse res = sdk.document.getAtsConnectionIdScorecardId(req, new GetAtsConnectionIdScorecardIdSecurity("dolore") {{
                jwt = "";
            }});

            if (res.atsScorecard != null) {
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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdRequest](../../models/operations/GetAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdSecurity](../../models/operations/GetAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdResponse](../../models/operations/GetAtsConnectionIdScorecardIdResponse.md)**


## patchAtsConnectionIdScorecardId

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchAtsConnectionIdScorecardIdRequest req = new PatchAtsConnectionIdScorecardIdRequest("magnam", "maiores") {{
                atsScorecard = new AtsScorecard(                new PropertyAtsScorecardRaw();) {{
                    applicationId = "ipsam";
                    candidateId = "dicta";
                    createdAt = LocalDate.parse("2021-06-26");
                    id = "b084c319-7e19-43a2-8546-7f94874c2d5c";
                    interviewId = "porro";
                    interviewerId = "labore";
                    jobId = "perspiciatis";
                    recommendation = AtsScorecardRecommendation.NO;
                    updatedAt = LocalDate.parse("2022-10-25");
                }};;
            }};            

            PatchAtsConnectionIdScorecardIdResponse res = sdk.document.patchAtsConnectionIdScorecardId(req, new PatchAtsConnectionIdScorecardIdSecurity("consectetur") {{
                jwt = "";
            }});

            if (res.atsScorecard != null) {
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
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdRequest](../../models/operations/PatchAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdSecurity](../../models/operations/PatchAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdResponse](../../models/operations/PatchAtsConnectionIdScorecardIdResponse.md)**


## postAtsConnectionIdScorecard

Create a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardResponse;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostAtsConnectionIdScorecardRequest req = new PostAtsConnectionIdScorecardRequest("ratione") {{
                atsScorecard = new AtsScorecard(                new PropertyAtsScorecardRaw();) {{
                    applicationId = "saepe";
                    candidateId = "iure";
                    createdAt = LocalDate.parse("2022-04-06");
                    id = "d8fe5d00-b979-4ef2-8387-320590ccc109";
                    interviewId = "ea";
                    interviewerId = "eius";
                    jobId = "aperiam";
                    recommendation = AtsScorecardRecommendation.DEFINITELY_NO;
                    updatedAt = LocalDate.parse("2022-11-21");
                }};;
            }};            

            PostAtsConnectionIdScorecardResponse res = sdk.document.postAtsConnectionIdScorecard(req, new PostAtsConnectionIdScorecardSecurity("sequi") {{
                jwt = "";
            }});

            if (res.atsScorecard != null) {
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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardRequest](../../models/operations/PostAtsConnectionIdScorecardRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardSecurity](../../models/operations/PostAtsConnectionIdScorecardSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardResponse](../../models/operations/PostAtsConnectionIdScorecardResponse.md)**


## putAtsConnectionIdScorecardId

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdSecurity;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutAtsConnectionIdScorecardIdRequest req = new PutAtsConnectionIdScorecardIdRequest("rerum", "ipsum") {{
                atsScorecard = new AtsScorecard(                new PropertyAtsScorecardRaw();) {{
                    applicationId = "debitis";
                    candidateId = "quis";
                    createdAt = LocalDate.parse("2022-09-21");
                    id = "4f65fe72-dc40-477d-8cc3-f408efc15ceb";
                    interviewId = "dolore";
                    interviewerId = "illum";
                    jobId = "ea";
                    recommendation = AtsScorecardRecommendation.STRONG_YES;
                    updatedAt = LocalDate.parse("2022-02-12");
                }};;
            }};            

            PutAtsConnectionIdScorecardIdResponse res = sdk.document.putAtsConnectionIdScorecardId(req, new PutAtsConnectionIdScorecardIdSecurity("animi") {{
                jwt = "";
            }});

            if (res.atsScorecard != null) {
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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdRequest](../../models/operations/PutAtsConnectionIdScorecardIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdSecurity](../../models/operations/PutAtsConnectionIdScorecardIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdResponse](../../models/operations/PutAtsConnectionIdScorecardIdResponse.md)**

