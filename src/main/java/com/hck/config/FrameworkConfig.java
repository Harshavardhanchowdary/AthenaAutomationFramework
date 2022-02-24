package com.hck.config;

import com.hck.config.convertors.StringToBrowserTypeConvertor;
import com.hck.enums.BrowserType;
import org.aeonbits.owner.Config;

/**
 * added On: 22/02/2022 - 23:58
 *
 * @author hkavuri
 * @version 1.0
 * @since 1.0
 */

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConvertor.class)
    BrowserType browser();
}
