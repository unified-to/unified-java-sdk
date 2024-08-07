/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.Hooks;
import com.unifiedapi.unifiedto.utils.RetryConfig;
import java.lang.String;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
    public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "1.0";
    public String sdkVersion = "0.19.0";
    public String genVersion = "2.390.6";
    public String userAgent = "speakeasy-sdk/java 0.19.0 2.390.6 1.0 com.unifiedapi.unifiedto";

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {

    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
