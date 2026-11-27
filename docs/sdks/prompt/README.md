# Prompt

## Overview

### Available Operations

* [createGenaiPrompt](#creategenaiprompt) - Create a prompt

## createGenaiPrompt

Creates a GenaiPrompt. Provide the unified GenaiPrompt fields in the request body; they are mapped to the provider's API. Returns the created GenaiPrompt.

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiPrompt" method="post" path="/genai/{connection_id}/prompt" example="genai_prompt" -->
```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiPromptResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiPromptRequest req = CreateGenaiPromptRequest.builder()
                .genaiPrompt(GenaiPrompt.builder()
                    .answers(List.of(
                        GenaiAnswer.builder()
                            .id("DiYHdUlr")
                            .type(GenaiAnswerType.CHOICE)
                            .confidence(0.5384309098590165)
                            .probabilities(List.of(
                                GenaiAnswerProbability.builder()
                                    .option("ulterius")
                                    .probability(0.05683182482607663)
                                    .build(),
                                GenaiAnswerProbability.builder()
                                    .option("spiculum")
                                    .probability(0.1404057613108307)
                                    .build()))
                            .score(0.05974147981032729)
                            .value("vilicus")
                            .build()))
                    .hasThread(false)
                    .id("lGiOgAB6MLc1sMVUZnBJtXQG")
                    .maxTokens(0.4677782787475735)
                    .mcpAuthorizationToken("45c837a2-ed2d-458f-b4bc-782f4a6b065b")
                    .mcpDeferredTools(List.of())
                    .mcpUrl("https://svelte-offset.net")
                    .messages(List.of(
                        GenaiContent.builder()
                            .content("Facere statua depulso speciosus xiphias soleo trepide crinis crapula balbus.")
                            .images(List.of())
                            .role(Role.ASSISTANT)
                            .build(),
                        GenaiContent.builder()
                            .content("Circumvenio una demitto ventito chirographum culpo vos cohibeo complectus speciosus.")
                            .images(List.of())
                            .role(Role.SYSTEM)
                            .build()))
                    .questions(List.of(
                        GenaiQuestion.builder()
                            .id("9SIZCOoV")
                            .instructions("Supellex verbera universe.")
                            .type(GenaiQuestionType.BOOLEAN)
                            .options(List.of(
                                "dens",
                                "doloribus",
                                "degusto"))
                            .build(),
                        GenaiQuestion.builder()
                            .id("gsUyLAAa")
                            .instructions("Amplexus abundans caelestis patrocinor vulgivagus condico adduco tego apostolus.")
                            .type(GenaiQuestionType.CHOICE)
                            .options(List.of(
                                "decretum",
                                "vesica",
                                "amet"))
                            .build(),
                        GenaiQuestion.builder()
                            .id("Dwh6TeZp")
                            .instructions("Capio somnus pauper summisse veniam comes.")
                            .type(GenaiQuestionType.BOOLEAN)
                            .options(List.of(
                                "depulso",
                                "deficio",
                                "sustineo"))
                            .build()))
                    .responses(List.of(
                        "Vereor pecco avarus derideo sumptus."))
                    .temperature(0d)
                    .tokensUsed(975d)
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiPromptResponse res = sdk.prompt().createGenaiPrompt()
                .request(req)
                .call();

        if (res.genaiPrompt().isPresent()) {
            System.out.println(res.genaiPrompt().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateGenaiPromptRequest](../../models/operations/CreateGenaiPromptRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateGenaiPromptResponse](../../models/operations/CreateGenaiPromptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |