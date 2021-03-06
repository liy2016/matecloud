package vip.mate.uaa.service;

import vip.mate.core.common.api.Result;
import vip.mate.core.common.exception.CaptchaException;

public interface CaptchaService {


    /**
     * 获取验证码
     */
    Result<?> getCode();

    /**
     * 校验验证码
     * @param key　KEY
     * @param code 验证码
     * @throws CaptchaException
     */
    void check(String key, String code) throws CaptchaException;
}
