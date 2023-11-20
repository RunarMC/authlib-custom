package com.mojang.authlib;

public abstract class HttpUserAuthentication extends BaseUserAuthentication {

    public HttpUserAuthentication(HttpAuthenticationService authenticationService) {
        super(authenticationService);
    }

    public HttpAuthenticationService getAuthenticationService() {
        return (HttpAuthenticationService) super.getAuthenticationService();
    }
}
