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
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
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
                "string"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-01-14T18:31:06.376Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-03-05T16:04:54.121Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Operative 24 hour methodology";
                    employmentType = EmploymentType.OTHER;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new PropertyAtsJobRaw(
);
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.CLOSED;
                    updatedAt = OffsetDateTime.parse("2024-01-25T02:40:27.531Z");

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
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
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
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 3958.99d;
                offset = 3223.84d;
                order = "string";
                query = "string";
                sort = "string";
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
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
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
                "string",
                "string"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-08-09T17:44:16.617Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.SALARY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-03-27T20:59:56.374Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Extended empowering middleware";
                    employmentType = EmploymentType.FULL_TIME;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new PropertyAtsJobRaw(
);
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.ARCHIVED;
                    updatedAt = OffsetDateTime.parse("2024-10-30T00:43:07.001Z");

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
                "string",
                "string");

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
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.EmploymentType;
import com.unifiedapi.unifiedto.models.shared.Frequency;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
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
                "string",
                "string"){{
                atsJob = new AtsJob(
){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(
                        ){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-10-21T07:41:08.131Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(
                        AtsCompensationType.BONUS){{
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-01-19T17:41:10.086Z");
                    departments = new String[]{{
                        add("string"),
                    }};
                    description = "Re-contextualized 24 hour support";
                    employmentType = EmploymentType.CASUAL;
                    hiringManagerIds = new String[]{{
                        add("string"),
                    }};
                    id = "<ID>";
                    languageLocale = "string";
                    name = "string";
                    publicJobUrls = new String[]{{
                        add("string"),
                    }};
                    raw = new PropertyAtsJobRaw(
);
                    recruiterIds = new String[]{{
                        add("string"),
                    }};
                    remote = false;
                    status = AtsJobStatus.ARCHIVED;
                    updatedAt = OffsetDateTime.parse("2023-05-27T07:16:42.656Z");

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

