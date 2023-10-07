# Document
(*document*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Account"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdScorecardIdRequest req = new DeleteAtsConnectionIdScorecardIdRequest("intrepid", "Faroe");            

            DeleteAtsConnectionIdScorecardIdResponse res = sdk.document.deleteAtsConnectionIdScorecardId(req);

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
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdScorecardIdRequest](../../models/operations/DeleteAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("FTP"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdScorecardRequest req = new GetAtsConnectionIdScorecardRequest("Gasoline"){{
                applicationId = "Southeast";
                candidateId = "deep Tamarac maximize";
                interviewId = "drive vibrate USB";
                limit = 2304.86d;
                offset = 1149.65d;
                order = "Northeast Northwest Table";
                query = "musty";
                sort = "Bronze";
                updatedGte = OffsetDateTime.parse("2023-02-18T10:02:20.781Z");
            }};            

            GetAtsConnectionIdScorecardResponse res = sdk.document.getAtsConnectionIdScorecard(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardRequest](../../models/operations/GetAtsConnectionIdScorecardRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Aston"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdScorecardIdRequest req = new GetAtsConnectionIdScorecardIdRequest("mobile", "Mini");            

            GetAtsConnectionIdScorecardIdResponse res = sdk.document.getAtsConnectionIdScorecardId(req);

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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdScorecardIdRequest](../../models/operations/GetAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("conventional"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdScorecardIdRequest req = new PatchAtsConnectionIdScorecardIdRequest("Cisgender", "Cambridgeshire"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "functionalities Hybrid";
                    candidateId = "gold";
                    createdAt = OffsetDateTime.parse("2022-04-13T14:51:20.146Z");
                    id = "<ID>";
                    interviewId = "Soft target";
                    interviewerId = "blue against";
                    jobId = "Buckinghamshire";
                    recommendation = AtsScorecardRecommendation.STRONG_YES;
                    updatedAt = OffsetDateTime.parse("2021-04-03T02:42:12.059Z");
                }};
            }};            

            PatchAtsConnectionIdScorecardIdResponse res = sdk.document.patchAtsConnectionIdScorecardId(req);

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdScorecardIdRequest](../../models/operations/PatchAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("cultivate"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdScorecardRequest req = new PostAtsConnectionIdScorecardRequest("Infrastructure"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "compelling grey Cotton";
                    candidateId = "Granite uniform now";
                    createdAt = OffsetDateTime.parse("2022-03-02T00:20:35.044Z");
                    id = "<ID>";
                    interviewId = "Legacy tan";
                    interviewerId = "programming And Southeast";
                    jobId = "Frozen";
                    recommendation = AtsScorecardRecommendation.DEFINITELY_NO;
                    updatedAt = OffsetDateTime.parse("2023-05-04T04:13:26.389Z");
                }};
            }};            

            PostAtsConnectionIdScorecardResponse res = sdk.document.postAtsConnectionIdScorecard(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdScorecardRequest](../../models/operations/PostAtsConnectionIdScorecardRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.AtsScorecardRecommendation;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("primary"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdScorecardIdRequest req = new PutAtsConnectionIdScorecardIdRequest("Incredible", "Draper"){{
                atsScorecard = new AtsScorecard(new PropertyAtsScorecardRaw()){{
                    applicationId = "Computer Electric";
                    candidateId = "Bugatti Minivan";
                    createdAt = OffsetDateTime.parse("2021-08-13T02:19:12.551Z");
                    id = "<ID>";
                    interviewId = "Optional Oregon Adventure";
                    interviewerId = "AI";
                    jobId = "eveniet Home";
                    recommendation = AtsScorecardRecommendation.YES;
                    updatedAt = OffsetDateTime.parse("2021-08-24T23:05:01.366Z");
                }};
            }};            

            PutAtsConnectionIdScorecardIdResponse res = sdk.document.putAtsConnectionIdScorecardId(req);

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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdRequest](../../models/operations/PutAtsConnectionIdScorecardIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdScorecardIdResponse](../../models/operations/PutAtsConnectionIdScorecardIdResponse.md)**

