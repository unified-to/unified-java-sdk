# PropertyWorkspaceIntegrationAuthOutput


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `clientId`                                                         | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | N/A                                                                |
| `consumerKey`                                                      | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | N/A                                                                |
| `needsPkce`                                                        | *Optional\<Boolean>*                                               | :heavy_minus_sign:                                                 | opt-in PKCE for OAuth2 when the integration app or org requires it |
| `samlIdpEntityId`                                                  | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | the SAML IdP issuer/entity ID                                      |
| `samlIdpUrl`                                                       | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | the SAML IdP SSO/login URL for end-user SAML login                 |
| `samlPem`                                                          | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | the SAML IdP signing certificate; PEM X.509 in Base64 ASCII format |