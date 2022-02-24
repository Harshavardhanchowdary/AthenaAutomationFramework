package com.hck.config.convertors;

import com.hck.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * added On: 23/02/2022 - 00:18
 *
 * @author hkavuri
 * @version 1.0
 * @since 1.0
 */
public class StringToBrowserTypeConvertor implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> stringBrowserTypeMap = Map.of(
                "CHROME", BrowserType.CHROME,
                "FIREFOX", BrowserType.FIREFOX,
                "EDGE", BrowserType.EDGE,
                "OPERA", BrowserType.OPERA);
        return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
    }
}
