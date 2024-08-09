/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.Utils;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * PropertyConnectionAuth - An authentication object that represents a specific authorized user's connection to an integration.
 */

public class PropertyConnectionAuth {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_token")
    private Optional<String> accessToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_url")
    private Optional<String> apiUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_id")
    private Optional<String> appId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorize_url")
    private Optional<String> authorizeUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<String> clientId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<String> clientSecret;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consumer_key")
    private Optional<String> consumerKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consumer_secret")
    private Optional<String> consumerSecret;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dev_api_key")
    private Optional<String> devApiKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    private Optional<? extends List<String>> emails;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_in")
    private Optional<Double> expiresIn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiry_date")
    private Optional<OffsetDateTime> expiryDate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends Map<String, Object>> meta;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * When integration.auth_type = "other", this field contains the authentication credentials in the same order as token_names
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("other_auth_info")
    private Optional<? extends List<String>> otherAuthInfo;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pem")
    private Optional<String> pem;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    private Optional<String> refreshToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token_expires_date")
    private Optional<OffsetDateTime> refreshTokenExpiresDate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token_expires_in")
    private Optional<Double> refreshTokenExpiresIn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token")
    private Optional<String> token;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_url")
    private Optional<String> tokenUrl;

    @JsonCreator
    public PropertyConnectionAuth(
            @JsonProperty("access_token") Optional<String> accessToken,
            @JsonProperty("api_url") Optional<String> apiUrl,
            @JsonProperty("app_id") Optional<String> appId,
            @JsonProperty("authorize_url") Optional<String> authorizeUrl,
            @JsonProperty("client_id") Optional<String> clientId,
            @JsonProperty("client_secret") Optional<String> clientSecret,
            @JsonProperty("consumer_key") Optional<String> consumerKey,
            @JsonProperty("consumer_secret") Optional<String> consumerSecret,
            @JsonProperty("dev_api_key") Optional<String> devApiKey,
            @JsonProperty("emails") Optional<? extends List<String>> emails,
            @JsonProperty("expires_in") Optional<Double> expiresIn,
            @JsonProperty("expiry_date") Optional<OffsetDateTime> expiryDate,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("meta") Optional<? extends Map<String, Object>> meta,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("other_auth_info") Optional<? extends List<String>> otherAuthInfo,
            @JsonProperty("pem") Optional<String> pem,
            @JsonProperty("refresh_token") Optional<String> refreshToken,
            @JsonProperty("refresh_token_expires_date") Optional<OffsetDateTime> refreshTokenExpiresDate,
            @JsonProperty("refresh_token_expires_in") Optional<Double> refreshTokenExpiresIn,
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("token") Optional<String> token,
            @JsonProperty("token_url") Optional<String> tokenUrl) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(apiUrl, "apiUrl");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(authorizeUrl, "authorizeUrl");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(consumerKey, "consumerKey");
        Utils.checkNotNull(consumerSecret, "consumerSecret");
        Utils.checkNotNull(devApiKey, "devApiKey");
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(expiresIn, "expiresIn");
        Utils.checkNotNull(expiryDate, "expiryDate");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(otherAuthInfo, "otherAuthInfo");
        Utils.checkNotNull(pem, "pem");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(refreshTokenExpiresDate, "refreshTokenExpiresDate");
        Utils.checkNotNull(refreshTokenExpiresIn, "refreshTokenExpiresIn");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(tokenUrl, "tokenUrl");
        this.accessToken = accessToken;
        this.apiUrl = apiUrl;
        this.appId = appId;
        this.authorizeUrl = authorizeUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.devApiKey = devApiKey;
        this.emails = emails;
        this.expiresIn = expiresIn;
        this.expiryDate = expiryDate;
        this.key = key;
        this.meta = meta;
        this.name = name;
        this.otherAuthInfo = otherAuthInfo;
        this.pem = pem;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiresDate = refreshTokenExpiresDate;
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
        this.state = state;
        this.token = token;
        this.tokenUrl = tokenUrl;
    }
    
    public PropertyConnectionAuth() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Optional<String> apiUrl() {
        return apiUrl;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public Optional<String> authorizeUrl() {
        return authorizeUrl;
    }

    @JsonIgnore
    public Optional<String> clientId() {
        return clientId;
    }

    @JsonIgnore
    public Optional<String> clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public Optional<String> consumerKey() {
        return consumerKey;
    }

    @JsonIgnore
    public Optional<String> consumerSecret() {
        return consumerSecret;
    }

    @JsonIgnore
    public Optional<String> devApiKey() {
        return devApiKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> emails() {
        return (Optional<List<String>>) emails;
    }

    @JsonIgnore
    public Optional<Double> expiresIn() {
        return expiresIn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> expiryDate() {
        return expiryDate;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> meta() {
        return (Optional<Map<String, Object>>) meta;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * When integration.auth_type = "other", this field contains the authentication credentials in the same order as token_names
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> otherAuthInfo() {
        return (Optional<List<String>>) otherAuthInfo;
    }

    @JsonIgnore
    public Optional<String> pem() {
        return pem;
    }

    @JsonIgnore
    public Optional<String> refreshToken() {
        return refreshToken;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> refreshTokenExpiresDate() {
        return refreshTokenExpiresDate;
    }

    @JsonIgnore
    public Optional<Double> refreshTokenExpiresIn() {
        return refreshTokenExpiresIn;
    }

    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    @JsonIgnore
    public Optional<String> tokenUrl() {
        return tokenUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PropertyConnectionAuth withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    public PropertyConnectionAuth withAccessToken(Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    public PropertyConnectionAuth withApiUrl(String apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = Optional.ofNullable(apiUrl);
        return this;
    }

    public PropertyConnectionAuth withApiUrl(Optional<String> apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = apiUrl;
        return this;
    }

    public PropertyConnectionAuth withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public PropertyConnectionAuth withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public PropertyConnectionAuth withAuthorizeUrl(String authorizeUrl) {
        Utils.checkNotNull(authorizeUrl, "authorizeUrl");
        this.authorizeUrl = Optional.ofNullable(authorizeUrl);
        return this;
    }

    public PropertyConnectionAuth withAuthorizeUrl(Optional<String> authorizeUrl) {
        Utils.checkNotNull(authorizeUrl, "authorizeUrl");
        this.authorizeUrl = authorizeUrl;
        return this;
    }

    public PropertyConnectionAuth withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    public PropertyConnectionAuth withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public PropertyConnectionAuth withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    public PropertyConnectionAuth withClientSecret(Optional<String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    public PropertyConnectionAuth withConsumerKey(String consumerKey) {
        Utils.checkNotNull(consumerKey, "consumerKey");
        this.consumerKey = Optional.ofNullable(consumerKey);
        return this;
    }

    public PropertyConnectionAuth withConsumerKey(Optional<String> consumerKey) {
        Utils.checkNotNull(consumerKey, "consumerKey");
        this.consumerKey = consumerKey;
        return this;
    }

    public PropertyConnectionAuth withConsumerSecret(String consumerSecret) {
        Utils.checkNotNull(consumerSecret, "consumerSecret");
        this.consumerSecret = Optional.ofNullable(consumerSecret);
        return this;
    }

    public PropertyConnectionAuth withConsumerSecret(Optional<String> consumerSecret) {
        Utils.checkNotNull(consumerSecret, "consumerSecret");
        this.consumerSecret = consumerSecret;
        return this;
    }

    public PropertyConnectionAuth withDevApiKey(String devApiKey) {
        Utils.checkNotNull(devApiKey, "devApiKey");
        this.devApiKey = Optional.ofNullable(devApiKey);
        return this;
    }

    public PropertyConnectionAuth withDevApiKey(Optional<String> devApiKey) {
        Utils.checkNotNull(devApiKey, "devApiKey");
        this.devApiKey = devApiKey;
        return this;
    }

    public PropertyConnectionAuth withEmails(List<String> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = Optional.ofNullable(emails);
        return this;
    }

    public PropertyConnectionAuth withEmails(Optional<? extends List<String>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    public PropertyConnectionAuth withExpiresIn(double expiresIn) {
        Utils.checkNotNull(expiresIn, "expiresIn");
        this.expiresIn = Optional.ofNullable(expiresIn);
        return this;
    }

    public PropertyConnectionAuth withExpiresIn(Optional<Double> expiresIn) {
        Utils.checkNotNull(expiresIn, "expiresIn");
        this.expiresIn = expiresIn;
        return this;
    }

    public PropertyConnectionAuth withExpiryDate(OffsetDateTime expiryDate) {
        Utils.checkNotNull(expiryDate, "expiryDate");
        this.expiryDate = Optional.ofNullable(expiryDate);
        return this;
    }

    public PropertyConnectionAuth withExpiryDate(Optional<OffsetDateTime> expiryDate) {
        Utils.checkNotNull(expiryDate, "expiryDate");
        this.expiryDate = expiryDate;
        return this;
    }

    public PropertyConnectionAuth withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public PropertyConnectionAuth withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public PropertyConnectionAuth withMeta(Map<String, Object> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    public PropertyConnectionAuth withMeta(Optional<? extends Map<String, Object>> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    public PropertyConnectionAuth withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public PropertyConnectionAuth withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * When integration.auth_type = "other", this field contains the authentication credentials in the same order as token_names
     */
    public PropertyConnectionAuth withOtherAuthInfo(List<String> otherAuthInfo) {
        Utils.checkNotNull(otherAuthInfo, "otherAuthInfo");
        this.otherAuthInfo = Optional.ofNullable(otherAuthInfo);
        return this;
    }

    /**
     * When integration.auth_type = "other", this field contains the authentication credentials in the same order as token_names
     */
    public PropertyConnectionAuth withOtherAuthInfo(Optional<? extends List<String>> otherAuthInfo) {
        Utils.checkNotNull(otherAuthInfo, "otherAuthInfo");
        this.otherAuthInfo = otherAuthInfo;
        return this;
    }

    public PropertyConnectionAuth withPem(String pem) {
        Utils.checkNotNull(pem, "pem");
        this.pem = Optional.ofNullable(pem);
        return this;
    }

    public PropertyConnectionAuth withPem(Optional<String> pem) {
        Utils.checkNotNull(pem, "pem");
        this.pem = pem;
        return this;
    }

    public PropertyConnectionAuth withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = Optional.ofNullable(refreshToken);
        return this;
    }

    public PropertyConnectionAuth withRefreshToken(Optional<String> refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    public PropertyConnectionAuth withRefreshTokenExpiresDate(OffsetDateTime refreshTokenExpiresDate) {
        Utils.checkNotNull(refreshTokenExpiresDate, "refreshTokenExpiresDate");
        this.refreshTokenExpiresDate = Optional.ofNullable(refreshTokenExpiresDate);
        return this;
    }

    public PropertyConnectionAuth withRefreshTokenExpiresDate(Optional<OffsetDateTime> refreshTokenExpiresDate) {
        Utils.checkNotNull(refreshTokenExpiresDate, "refreshTokenExpiresDate");
        this.refreshTokenExpiresDate = refreshTokenExpiresDate;
        return this;
    }

    public PropertyConnectionAuth withRefreshTokenExpiresIn(double refreshTokenExpiresIn) {
        Utils.checkNotNull(refreshTokenExpiresIn, "refreshTokenExpiresIn");
        this.refreshTokenExpiresIn = Optional.ofNullable(refreshTokenExpiresIn);
        return this;
    }

    public PropertyConnectionAuth withRefreshTokenExpiresIn(Optional<Double> refreshTokenExpiresIn) {
        Utils.checkNotNull(refreshTokenExpiresIn, "refreshTokenExpiresIn");
        this.refreshTokenExpiresIn = refreshTokenExpiresIn;
        return this;
    }

    public PropertyConnectionAuth withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    public PropertyConnectionAuth withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public PropertyConnectionAuth withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }

    public PropertyConnectionAuth withToken(Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    public PropertyConnectionAuth withTokenUrl(String tokenUrl) {
        Utils.checkNotNull(tokenUrl, "tokenUrl");
        this.tokenUrl = Optional.ofNullable(tokenUrl);
        return this;
    }

    public PropertyConnectionAuth withTokenUrl(Optional<String> tokenUrl) {
        Utils.checkNotNull(tokenUrl, "tokenUrl");
        this.tokenUrl = tokenUrl;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyConnectionAuth other = (PropertyConnectionAuth) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.apiUrl, other.apiUrl) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.authorizeUrl, other.authorizeUrl) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.consumerKey, other.consumerKey) &&
            Objects.deepEquals(this.consumerSecret, other.consumerSecret) &&
            Objects.deepEquals(this.devApiKey, other.devApiKey) &&
            Objects.deepEquals(this.emails, other.emails) &&
            Objects.deepEquals(this.expiresIn, other.expiresIn) &&
            Objects.deepEquals(this.expiryDate, other.expiryDate) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.meta, other.meta) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.otherAuthInfo, other.otherAuthInfo) &&
            Objects.deepEquals(this.pem, other.pem) &&
            Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            Objects.deepEquals(this.refreshTokenExpiresDate, other.refreshTokenExpiresDate) &&
            Objects.deepEquals(this.refreshTokenExpiresIn, other.refreshTokenExpiresIn) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.token, other.token) &&
            Objects.deepEquals(this.tokenUrl, other.tokenUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            apiUrl,
            appId,
            authorizeUrl,
            clientId,
            clientSecret,
            consumerKey,
            consumerSecret,
            devApiKey,
            emails,
            expiresIn,
            expiryDate,
            key,
            meta,
            name,
            otherAuthInfo,
            pem,
            refreshToken,
            refreshTokenExpiresDate,
            refreshTokenExpiresIn,
            state,
            token,
            tokenUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PropertyConnectionAuth.class,
                "accessToken", accessToken,
                "apiUrl", apiUrl,
                "appId", appId,
                "authorizeUrl", authorizeUrl,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "consumerKey", consumerKey,
                "consumerSecret", consumerSecret,
                "devApiKey", devApiKey,
                "emails", emails,
                "expiresIn", expiresIn,
                "expiryDate", expiryDate,
                "key", key,
                "meta", meta,
                "name", name,
                "otherAuthInfo", otherAuthInfo,
                "pem", pem,
                "refreshToken", refreshToken,
                "refreshTokenExpiresDate", refreshTokenExpiresDate,
                "refreshTokenExpiresIn", refreshTokenExpiresIn,
                "state", state,
                "token", token,
                "tokenUrl", tokenUrl);
    }
    
    public final static class Builder {
 
        private Optional<String> accessToken = Optional.empty();
 
        private Optional<String> apiUrl = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> authorizeUrl = Optional.empty();
 
        private Optional<String> clientId = Optional.empty();
 
        private Optional<String> clientSecret = Optional.empty();
 
        private Optional<String> consumerKey = Optional.empty();
 
        private Optional<String> consumerSecret = Optional.empty();
 
        private Optional<String> devApiKey = Optional.empty();
 
        private Optional<? extends List<String>> emails = Optional.empty();
 
        private Optional<Double> expiresIn = Optional.empty();
 
        private Optional<OffsetDateTime> expiryDate = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<? extends Map<String, Object>> meta = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends List<String>> otherAuthInfo = Optional.empty();
 
        private Optional<String> pem = Optional.empty();
 
        private Optional<String> refreshToken = Optional.empty();
 
        private Optional<OffsetDateTime> refreshTokenExpiresDate = Optional.empty();
 
        private Optional<Double> refreshTokenExpiresIn = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> token = Optional.empty();
 
        private Optional<String> tokenUrl = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = Optional.ofNullable(accessToken);
            return this;
        }

        public Builder accessToken(Optional<String> accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        public Builder apiUrl(String apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = Optional.ofNullable(apiUrl);
            return this;
        }

        public Builder apiUrl(Optional<String> apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = apiUrl;
            return this;
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        public Builder authorizeUrl(String authorizeUrl) {
            Utils.checkNotNull(authorizeUrl, "authorizeUrl");
            this.authorizeUrl = Optional.ofNullable(authorizeUrl);
            return this;
        }

        public Builder authorizeUrl(Optional<String> authorizeUrl) {
            Utils.checkNotNull(authorizeUrl, "authorizeUrl");
            this.authorizeUrl = authorizeUrl;
            return this;
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        public Builder clientId(Optional<String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        public Builder clientSecret(Optional<String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder consumerKey(String consumerKey) {
            Utils.checkNotNull(consumerKey, "consumerKey");
            this.consumerKey = Optional.ofNullable(consumerKey);
            return this;
        }

        public Builder consumerKey(Optional<String> consumerKey) {
            Utils.checkNotNull(consumerKey, "consumerKey");
            this.consumerKey = consumerKey;
            return this;
        }

        public Builder consumerSecret(String consumerSecret) {
            Utils.checkNotNull(consumerSecret, "consumerSecret");
            this.consumerSecret = Optional.ofNullable(consumerSecret);
            return this;
        }

        public Builder consumerSecret(Optional<String> consumerSecret) {
            Utils.checkNotNull(consumerSecret, "consumerSecret");
            this.consumerSecret = consumerSecret;
            return this;
        }

        public Builder devApiKey(String devApiKey) {
            Utils.checkNotNull(devApiKey, "devApiKey");
            this.devApiKey = Optional.ofNullable(devApiKey);
            return this;
        }

        public Builder devApiKey(Optional<String> devApiKey) {
            Utils.checkNotNull(devApiKey, "devApiKey");
            this.devApiKey = devApiKey;
            return this;
        }

        public Builder emails(List<String> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = Optional.ofNullable(emails);
            return this;
        }

        public Builder emails(Optional<? extends List<String>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
            return this;
        }

        public Builder expiresIn(double expiresIn) {
            Utils.checkNotNull(expiresIn, "expiresIn");
            this.expiresIn = Optional.ofNullable(expiresIn);
            return this;
        }

        public Builder expiresIn(Optional<Double> expiresIn) {
            Utils.checkNotNull(expiresIn, "expiresIn");
            this.expiresIn = expiresIn;
            return this;
        }

        public Builder expiryDate(OffsetDateTime expiryDate) {
            Utils.checkNotNull(expiryDate, "expiryDate");
            this.expiryDate = Optional.ofNullable(expiryDate);
            return this;
        }

        public Builder expiryDate(Optional<OffsetDateTime> expiryDate) {
            Utils.checkNotNull(expiryDate, "expiryDate");
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder meta(Map<String, Object> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        public Builder meta(Optional<? extends Map<String, Object>> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * When integration.auth_type = "other", this field contains the authentication credentials in the same order as token_names
         */
        public Builder otherAuthInfo(List<String> otherAuthInfo) {
            Utils.checkNotNull(otherAuthInfo, "otherAuthInfo");
            this.otherAuthInfo = Optional.ofNullable(otherAuthInfo);
            return this;
        }

        /**
         * When integration.auth_type = "other", this field contains the authentication credentials in the same order as token_names
         */
        public Builder otherAuthInfo(Optional<? extends List<String>> otherAuthInfo) {
            Utils.checkNotNull(otherAuthInfo, "otherAuthInfo");
            this.otherAuthInfo = otherAuthInfo;
            return this;
        }

        public Builder pem(String pem) {
            Utils.checkNotNull(pem, "pem");
            this.pem = Optional.ofNullable(pem);
            return this;
        }

        public Builder pem(Optional<String> pem) {
            Utils.checkNotNull(pem, "pem");
            this.pem = pem;
            return this;
        }

        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = Optional.ofNullable(refreshToken);
            return this;
        }

        public Builder refreshToken(Optional<String> refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder refreshTokenExpiresDate(OffsetDateTime refreshTokenExpiresDate) {
            Utils.checkNotNull(refreshTokenExpiresDate, "refreshTokenExpiresDate");
            this.refreshTokenExpiresDate = Optional.ofNullable(refreshTokenExpiresDate);
            return this;
        }

        public Builder refreshTokenExpiresDate(Optional<OffsetDateTime> refreshTokenExpiresDate) {
            Utils.checkNotNull(refreshTokenExpiresDate, "refreshTokenExpiresDate");
            this.refreshTokenExpiresDate = refreshTokenExpiresDate;
            return this;
        }

        public Builder refreshTokenExpiresIn(double refreshTokenExpiresIn) {
            Utils.checkNotNull(refreshTokenExpiresIn, "refreshTokenExpiresIn");
            this.refreshTokenExpiresIn = Optional.ofNullable(refreshTokenExpiresIn);
            return this;
        }

        public Builder refreshTokenExpiresIn(Optional<Double> refreshTokenExpiresIn) {
            Utils.checkNotNull(refreshTokenExpiresIn, "refreshTokenExpiresIn");
            this.refreshTokenExpiresIn = refreshTokenExpiresIn;
            return this;
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = Optional.ofNullable(token);
            return this;
        }

        public Builder token(Optional<String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        public Builder tokenUrl(String tokenUrl) {
            Utils.checkNotNull(tokenUrl, "tokenUrl");
            this.tokenUrl = Optional.ofNullable(tokenUrl);
            return this;
        }

        public Builder tokenUrl(Optional<String> tokenUrl) {
            Utils.checkNotNull(tokenUrl, "tokenUrl");
            this.tokenUrl = tokenUrl;
            return this;
        }
        
        public PropertyConnectionAuth build() {
            return new PropertyConnectionAuth(
                accessToken,
                apiUrl,
                appId,
                authorizeUrl,
                clientId,
                clientSecret,
                consumerKey,
                consumerSecret,
                devApiKey,
                emails,
                expiresIn,
                expiryDate,
                key,
                meta,
                name,
                otherAuthInfo,
                pem,
                refreshToken,
                refreshTokenExpiresDate,
                refreshTokenExpiresIn,
                state,
                token,
                tokenUrl);
        }
    }
}

