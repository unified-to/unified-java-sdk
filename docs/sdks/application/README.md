# Application
(*application*)

### Available Operations

* [createAtsApplication](#createatsapplication) - Create an application
* [getAtsApplication](#getatsapplication) - Retrieve an application
* [listAtsApplications](#listatsapplications) - List all applications
* [patchAtsApplication](#patchatsapplication) - Update an application
* [removeAtsApplication](#removeatsapplication) - Remove an application
* [updateAtsApplication](#updateatsapplication) - Update an application

## createAtsApplication

Create an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
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

            com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest req = new CreateAtsApplicationRequest(
                "<value>"){{
                atsApplication = new AtsApplication(
){{
                    answers = new com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer[]{{
                        add(new AtsApplicationAnswer(
                        new String[]{{
                            add("<value>"),
                        }},
                        "<value>"){{
                            answers = new String[]{{
                                add("<value>"),
                            }};
                            questionId = "<value>";
                        }}),
                    }};
                    appliedAt = OffsetDateTime.parse("2024-03-09T05:03:52.917Z");
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-09-22T12:50:56.305Z");
                    hiredAt = OffsetDateTime.parse("2023-01-19T06:26:51.678Z");
                    id = "<id>";
                    jobId = "<value>";
                    originalStatus = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    rejectedAt = OffsetDateTime.parse("2023-01-30T06:58:14.500Z");
                    rejectedReason = "<value>";
                    source = "<value>";
                    status = AtsApplicationStatus.SECOND_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2024-09-21T21:31:42.360Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse res = sdk.application.createAtsApplication(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationRequest](../../models/operations/CreateAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsApplicationResponse](../../models/operations/CreateAtsApplicationResponse.md)**


## getAtsApplication

Retrieve an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest req = new GetAtsApplicationRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse res = sdk.application.getAtsApplication(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAtsApplicationRequest](../../models/operations/GetAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsApplicationResponse](../../models/operations/GetAtsApplicationResponse.md)**


## listAtsApplications

List all applications

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest req = new ListAtsApplicationsRequest(
                "<value>"){{
                candidateId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                jobId = "<value>";
                limit = 441.56d;
                offset = 1448.74d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-12-21T20:30:01.596Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse res = sdk.application.listAtsApplications(req);

            if (res.atsApplications != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsRequest](../../models/operations/ListAtsApplicationsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsApplicationsResponse](../../models/operations/ListAtsApplicationsResponse.md)**


## patchAtsApplication

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
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

            com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest req = new PatchAtsApplicationRequest(
                "<value>",
                "<value>"){{
                atsApplication = new AtsApplication(
){{
                    answers = new com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer[]{{
                        add(new AtsApplicationAnswer(
                        new String[]{{
                            add("<value>"),
                        }},
                        "<value>"){{
                            answers = new String[]{{
                                add("<value>"),
                            }};
                            questionId = "<value>";
                        }}),
                    }};
                    appliedAt = OffsetDateTime.parse("2023-12-15T20:36:09.499Z");
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-01-06T05:56:57.062Z");
                    hiredAt = OffsetDateTime.parse("2023-12-05T05:20:09.174Z");
                    id = "<id>";
                    jobId = "<value>";
                    originalStatus = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    rejectedAt = OffsetDateTime.parse("2022-07-13T02:34:40.392Z");
                    rejectedReason = "<value>";
                    source = "<value>";
                    status = AtsApplicationStatus.FIRST_INTERVIEW;
                    updatedAt = OffsetDateTime.parse("2024-01-24T17:35:54.628Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse res = sdk.application.patchAtsApplication(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationRequest](../../models/operations/PatchAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsApplicationResponse](../../models/operations/PatchAtsApplicationResponse.md)**


## removeAtsApplication

Remove an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest req = new RemoveAtsApplicationRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse res = sdk.application.removeAtsApplication(req);

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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationRequest](../../models/operations/RemoveAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsApplicationResponse](../../models/operations/RemoveAtsApplicationResponse.md)**


## updateAtsApplication

Update an application

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse;
import com.unifiedapi.unifiedto.models.shared.AtsApplication;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer;
import com.unifiedapi.unifiedto.models.shared.AtsApplicationStatus;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest req = new UpdateAtsApplicationRequest(
                "<value>",
                "<value>"){{
                atsApplication = new AtsApplication(
){{
                    answers = new com.unifiedapi.unifiedto.models.shared.AtsApplicationAnswer[]{{
                        add(new AtsApplicationAnswer(
                        new String[]{{
                            add("<value>"),
                        }},
                        "<value>"){{
                            answers = new String[]{{
                                add("<value>"),
                            }};
                            questionId = "<value>";
                        }}),
                    }};
                    appliedAt = OffsetDateTime.parse("2022-08-22T12:21:27.415Z");
                    candidateId = "<value>";
                    createdAt = OffsetDateTime.parse("2022-06-04T12:46:09.878Z");
                    hiredAt = OffsetDateTime.parse("2022-02-09T08:57:01.906Z");
                    id = "<id>";
                    jobId = "<value>";
                    originalStatus = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    rejectedAt = OffsetDateTime.parse("2024-07-19T04:47:20.215Z");
                    rejectedReason = "<value>";
                    source = "<value>";
                    status = AtsApplicationStatus.OFFERED;
                    updatedAt = OffsetDateTime.parse("2023-03-17T03:12:00.865Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse res = sdk.application.updateAtsApplication(req);

            if (res.atsApplication != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest](../../models/operations/UpdateAtsApplicationRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationResponse](../../models/operations/UpdateAtsApplicationResponse.md)**

