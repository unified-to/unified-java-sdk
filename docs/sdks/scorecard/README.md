# Scorecard
(*scorecard*)

### Available Operations

* [createAtsScorecard](#createatsscorecard) - Create a scorecard
* [getAtsScorecard](#getatsscorecard) - Retrieve a scorecard
* [listAtsScorecards](#listatsscorecards) - List all scorecards
* [patchAtsScorecard](#patchatsscorecard) - Update a scorecard
* [removeAtsScorecard](#removeatsscorecard) - Remove a scorecard
* [updateAtsScorecard](#updateatsscorecard) - Update a scorecard

## createAtsScorecard

Create a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest req = new CreateAtsScorecardRequest(
                "string"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J";
                    createdAt = OffsetDateTime.parse("2021-04-24T07:49:32.768Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    raw = new PropertyAtsScorecardRaw(
);
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2022-04-01T17:31:47.454Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse res = sdk.scorecard.createAtsScorecard(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardRequest](../../models/operations/CreateAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsScorecardResponse](../../models/operations/CreateAtsScorecardResponse.md)**


## getAtsScorecard

Retrieve a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest req = new GetAtsScorecardRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse res = sdk.scorecard.getAtsScorecard(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsScorecardRequest](../../models/operations/GetAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsScorecardResponse](../../models/operations/GetAtsScorecardResponse.md)**


## listAtsScorecards

List all scorecards

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest req = new ListAtsScorecardsRequest(
                "string"){{
                applicationId = "string";
                candidateId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                interviewId = "string";
                jobId = "string";
                limit = 5126.98d;
                offset = 8077.44d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-08-19T17:42:56.145Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse res = sdk.scorecard.listAtsScorecards(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsRequest](../../models/operations/ListAtsScorecardsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsScorecardsResponse](../../models/operations/ListAtsScorecardsResponse.md)**


## patchAtsScorecard

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest req = new PatchAtsScorecardRequest(
                "string",
                "string"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support";
                    createdAt = OffsetDateTime.parse("2023-10-06T15:26:03.447Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    raw = new PropertyAtsScorecardRaw(
);
                    recommendation = Recommendation.YES;
                    updatedAt = OffsetDateTime.parse("2021-11-28T07:58:12.100Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse res = sdk.scorecard.patchAtsScorecard(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardRequest](../../models/operations/PatchAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsScorecardResponse](../../models/operations/PatchAtsScorecardResponse.md)**


## removeAtsScorecard

Remove a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest req = new RemoveAtsScorecardRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse res = sdk.scorecard.removeAtsScorecard(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardRequest](../../models/operations/RemoveAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsScorecardResponse](../../models/operations/RemoveAtsScorecardResponse.md)**


## updateAtsScorecard

Update a scorecard

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse;
import com.unifiedapi.unifiedto.models.shared.AtsScorecard;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsScorecardRaw;
import com.unifiedapi.unifiedto.models.shared.Recommendation;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest req = new UpdateAtsScorecardRequest(
                "string",
                "string"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "string";
                    candidateId = "string";
                    comment = "The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive";
                    createdAt = OffsetDateTime.parse("2021-07-10T12:08:12.226Z");
                    id = "<ID>";
                    interviewId = "string";
                    interviewerId = "string";
                    jobId = "string";
                    raw = new PropertyAtsScorecardRaw(
);
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2021-07-26T04:45:45.856Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse res = sdk.scorecard.updateAtsScorecard(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardRequest](../../models/operations/UpdateAtsScorecardRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsScorecardResponse](../../models/operations/UpdateAtsScorecardResponse.md)**

