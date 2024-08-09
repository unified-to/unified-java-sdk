/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;

public interface HTTPClient {

    /**
     * Sends an HTTP request and returns the response.
     * 
     * <p>Note that {@link HttpRequest} is immutable. To modify the request you can use
     * {@link HttpRequest#newBuilder(HttpRequest, BiPredicate<String, String>)} with 
     * JDK 16 and later (which will copy the request for modification in a builder). 
     * If that method is not available then use {@link Helpers#copy} (which also returns
     * a builder).  
     * 
     * @param request HTTP request
     * @return HTTP response
     * @throws IOException
     * @throws InterruptedException
     * @throws URISyntaxException
     */    
    HttpResponse<InputStream> send(HttpRequest request)
            throws IOException, InterruptedException, URISyntaxException;
}
