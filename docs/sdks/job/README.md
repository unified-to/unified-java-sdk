# Job
(*job*)

### Available Operations

* [createAtsJob](#createatsjob) - Create a job
* [getAtsJob](#getatsjob) - Retrieve a job
* [listAtsJobs](#listatsjobs) - List all jobs
* [patchAtsJob](#patchatsjob) - Update a job
* [removeAtsJob](#removeatsjob) - Remove a job
* [updateAtsJob](#updateatsjob) - Update a job

## createAtsJob

Create a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAtsJobResponse;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestion;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestionType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
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

            com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest req = new CreateAtsJobRequest(
                "<value>"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-01-14T18:31:06.376Z");
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-03-05T16:04:54.121Z");
                    departments = new String[]{{
                        add("<value>"),
                    }};
                    description = "Operative 24 hour methodology";
                    employmentType = EmploymentType.OTHER;
                    hiringManagerIds = new String[]{{
                        add("<value>"),
                    }};
                    id = "<id>";
                    languageLocale = "<value>";
                    name = "<value>";
                    numberOfOpenings = 8330.69d;
                    publicJobUrls = new String[]{{
                        add("<value>"),
                    }};
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsJobQuestion[]{{
                        add(new AtsJobQuestion(
                        "<value>",
                        AtsJobQuestionType.URL){{
                            question = "<value>";
                            type = AtsJobQuestionType.UNIVERSITY;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recruiterIds = new String[]{{
                        add("<value>"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2022-09-14T17:37:48.375Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAtsJobResponse res = sdk.job.createAtsJob(req);

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateAtsJobRequest](../../models/operations/CreateAtsJobRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAtsJobResponse](../../models/operations/CreateAtsJobResponse.md)**


## getAtsJob

Retrieve a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsJobResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest req = new GetAtsJobRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsJobResponse res = sdk.job.getAtsJob(req);

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetAtsJobRequest](../../models/operations/GetAtsJobRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsJobResponse](../../models/operations/GetAtsJobResponse.md)**


## listAtsJobs

List all jobs

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsJobsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest req = new ListAtsJobsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 3958.99d;
                offset = 3223.84d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-03-04T01:14:05.456Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsJobsResponse res = sdk.job.listAtsJobs(req);

            if (res.atsJobs != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListAtsJobsRequest](../../models/operations/ListAtsJobsRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsJobsResponse](../../models/operations/ListAtsJobsResponse.md)**


## patchAtsJob

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsJobResponse;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestion;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestionType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
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

            com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest req = new PatchAtsJobRequest(
                "<value>",
                "<value>"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-08-09T17:44:16.617Z");
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.SALARY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-03-27T20:59:56.374Z");
                    departments = new String[]{{
                        add("<value>"),
                    }};
                    description = "Extended empowering middleware";
                    employmentType = EmploymentType.FULL_TIME;
                    hiringManagerIds = new String[]{{
                        add("<value>"),
                    }};
                    id = "<id>";
                    languageLocale = "<value>";
                    name = "<value>";
                    numberOfOpenings = 238.34d;
                    publicJobUrls = new String[]{{
                        add("<value>"),
                    }};
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsJobQuestion[]{{
                        add(new AtsJobQuestion(
                        "<value>",
                        AtsJobQuestionType.TEXTAREA){{
                            question = "<value>";
                            type = AtsJobQuestionType.URL;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recruiterIds = new String[]{{
                        add("<value>"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2022-07-04T19:22:46.036Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAtsJobResponse res = sdk.job.patchAtsJob(req);

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchAtsJobRequest](../../models/operations/PatchAtsJobRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsJobResponse](../../models/operations/PatchAtsJobResponse.md)**


## removeAtsJob

Remove a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAtsJobResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest req = new RemoveAtsJobRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAtsJobResponse res = sdk.job.removeAtsJob(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest](../../models/operations/RemoveAtsJobRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAtsJobResponse](../../models/operations/RemoveAtsJobResponse.md)**


## updateAtsJob

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAtsJobResponse;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestion;
import com.unifiedapi.unifiedto.models.shared.AtsJobQuestionType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest req = new UpdateAtsJobRequest(
                "<value>",
                "<value>"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-10-21T07:41:08.131Z");
                    companyId = "<value>";
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.BONUS){{
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-01-19T17:41:10.086Z");
                    departments = new String[]{{
                        add("<value>"),
                    }};
                    description = "Re-contextualized 24 hour support";
                    employmentType = EmploymentType.CASUAL;
                    hiringManagerIds = new String[]{{
                        add("<value>"),
                    }};
                    id = "<id>";
                    languageLocale = "<value>";
                    name = "<value>";
                    numberOfOpenings = 983.08d;
                    publicJobUrls = new String[]{{
                        add("<value>"),
                    }};
                    questions = new com.unifiedapi.unifiedto.models.shared.AtsJobQuestion[]{{
                        add(new AtsJobQuestion(
                        "<value>",
                        AtsJobQuestionType.UNIVERSITY){{
                            question = "<value>";
                            type = AtsJobQuestionType.FILE;
                        }}),
                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    recruiterIds = new String[]{{
                        add("<value>"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2024-12-22T02:51:32.088Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAtsJobResponse res = sdk.job.updateAtsJob(req);

            if (res.atsJob != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.UpdateAtsJobRequest](../../models/operations/UpdateAtsJobRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAtsJobResponse](../../models/operations/UpdateAtsJobResponse.md)**

