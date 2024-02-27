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
import com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion;
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
                "<value>"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    comment = "The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J";
                    createdAt = OffsetDateTime.parse("2022-04-24T10:18:34.661Z");
                    id = "<id>";
                    interviewId = "<value>";
                    interviewerId = "<value>";
                    jobId = "<value>";
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion[]{{
                        add(new AtsScorecardQuestion(
                        "<value>"){{
                            text = "<value>";
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2023-04-02T03:31:06.456Z");

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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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
                "<value>"){{
                applicationId = "<value>";
                candidateId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                interviewId = "<value>";
                jobId = "<value>";
                limit = 5126.98d;
                offset = 8077.44d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-08-19T14:46:22.333Z");

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
import com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion;
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
                "<value>",
                "<value>"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    comment = "Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support";
                    createdAt = OffsetDateTime.parse("2024-10-06T13:32:29.533Z");
                    id = "<id>";
                    interviewId = "<value>";
                    interviewerId = "<value>";
                    jobId = "<value>";
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion[]{{
                        add(new AtsScorecardQuestion(
                        "<value>"){{
                            text = "<value>";
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recommendation = Recommendation.YES;
                    updatedAt = OffsetDateTime.parse("2022-11-28T15:13:55.563Z");

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
                "<value>",
                "<value>");

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
import com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion;
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
                "<value>",
                "<value>"){{
                atsScorecard = new AtsScorecard(
){{
                    applicationId = "<value>";
                    candidateId = "<value>";
                    comment = "The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive";
                    createdAt = OffsetDateTime.parse("2022-07-10T16:18:43.908Z");
                    id = "<id>";
                    interviewId = "<value>";
                    interviewerId = "<value>";
                    jobId = "<value>";
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsScorecardQuestion[]{{
                        add(new AtsScorecardQuestion(
                        "<value>"){{
                            text = "<value>";
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recommendation = Recommendation.NO;
                    updatedAt = OffsetDateTime.parse("2022-07-26T09:16:55.761Z");

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

