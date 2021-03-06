/**
 * Copyright 2018-2020 stylefeng & fengshuonan (sn93@qq.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.hanniu.hanniupk.system.constants;

/**
 * 鉴权相关的常量，gate中有一个相同的类，需同时维护
 *
 * @author fengshuonan
 * @date 2018-08-10 23:30
 */
public interface AuthConstants {

    /**
     * 鉴权请求头名称
     */
    String AUTH_HEADER = "Authorization";

    /**
     * 鉴权地址
     */
    String AUTH_ACTION_URL = "/gatewayAction/auth";

    /**
     * 检验token是否正确
     */
    String VALIDATE_TOKEN_URL = "/gatewayAction/validateToken";

    /**
     * 退出接口
     */
    String LOGOUT_URL = "/gatewayAction/logout";

    /**
     * 微信登录接口
     */
    String WX_LOGIN_URL = "/gatewayAction/wxLogin";

    /**
     * token是否过期
     */
    String IS_TOKEN_EXIST = "/isTokenExist";
}
