/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.identity.authenticator.mepin;

public class MepinConstants {
    public static final String AUTHENTICATOR_NAME = "MePINAuthenticator";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "MePIN";

    public static final String MEPIN_ENDPOINT = "https://api.mepin.com/4.0/s/endpoint";

    //mepin actions
    public static final String USER_INFO_GET = "userinfo/get";
    public static final String TRANSACTIONS_GET = "transactions/get";
    public static final String TRANSACTIONS_CREATE = "transactions/create";

    public static final String MEPIN_APPICATION_ID = "ApplicationId";
    public static final String MEPIN_USERNAME = "Username";
    public static final String MEPIN_PASSWORD = "Password";
    public static final String MEPIN_CALLBACK_URL = "callbackUrl";
    public static final String MEPIN_ACCESSTOKEN = "access_token";
    public static final String MEPIN_ID = "mepin_id";
    public static final String MEPIN_CLIENT_ID = "ClientId";
    public static final String MEPIN_SHORT_MESSAGE = "ShortMessage";
    public static final String MEPIN_MESSAGE = "Message";
    public static final String MEPIN_EXPIRY_TIME = "ExpiryTime";
    public static final String MEPIN_HEADER = "Header";
    public static final String MEPIN_CONFIRMATION_POLICY = "ConfirmationPolicy";
    public static final String MEPIN_QUERY = "identifier=%s&short_message=%s&header=%s&message=%s&client_id=%s&account=%s&expiry_time=%s&callback_url=%s&confirmation_policy=%s";
    public static final String MEPIN_TRANSACTION_ID = "transaction_id";
    public static final String MEPIN_TRANSACTION_STATUS = "transaction_status";
    public static final String MEPIN_ALLOW = "allow";
    public static final String MEPIN_COMPLETED = "completed";
    public static final String MEPIN_CANCELED = "canceled";
    public static final String MEPIN_EXPIRED = "expired";
    public static final String MEPIN_ERROR = "error";
    public static final String MEPIN_STATUS = "status";
    public static final String MEPIN_OK = "ok";
    public static final String MEPIN_LOGIN = "mepinLogin";
    public static final String LOGIN_PAGE = "authenticationendpoint/login.do";
    public static final String MEPIN_PAGE = "mepinauthenticationendpoint/mepin.jsp";
    public static final String MEPIN_DATA = "mepin_data=";

    public static final String HTTP_GET = "GET";
    public static final String HTTP_POST = "POST";
    public static final String HTTP_ACCEPT = "Accept";
    public static final String HTTP_AUTHORIZATION = "Authorization";
    public static final String HTTP_AUTHORIZATION_BASIC = "Basic ";
    public static final String HTTP_CONTENT_TYPE = "application/json";
    public static final String HTTP_POST_CONTENT_TYPE = "application/x-www-form-urlencoded;charset=UTF-8";
    public static final String CHARSET = "UTF-8";
    public static final String HTTP_ACCEPT_CHARSET = "Accept-Charset";
    public static final String TRUE = "true";
    public static final String FAILED = "Failed";
    public static final String AUTH_HEADER = "authHeader";
    public static final String IS_SECOND_STEP = "isSecondStep";
    public static final String AUTHENTICATION = "authentication";
    public static final String BASIC = "basic";
    public static final String SUPER_TENANT = "carbon.super";
    public static final String FEDERETOR = "federator";
    public static final String USER_NAME = "username";
    public static final String AUTHENTICATED_USER = "authenticatedUser";
    public static final String USER_MEPIN_DISABLED_CLAIM_URI = "http://wso2.org/claims/identity/mepin_disabled";
    public static final String IS_MEPIN_MANDATORY = "MepinMandatory";
    public static final String IS_MEPIN_ENABLE_BY_USER = "MepinEnableByUserClaim";
    public static final String MEPIN_AUTHENTICATION_ENDPOINT_URL = "MepinAuthenticationEndpointURL";
    public static final String MEPIN_AUTHENTICATION_ERROR_PAGE_URL = "MepinAuthenticationEndpointErrorPage";
    public static final String ERROR_PAGE = "mepinauthenticationendpoint/mepinError.jsp";
    public static final String NAME_OF_AUTHENTICATORS = "authenticators=";
    public static final String ERROR_MEPIN_DISABLE = "&authFailure=true&authFailureMsg=mepin.disable";
    public static final String MEPIN_ID_CLAIM = "http://wso2.org/claims/identity/mepinid";
    public static final String ACCESS_TOKEN_QUERY_PARAM = "access_token=%s";
}