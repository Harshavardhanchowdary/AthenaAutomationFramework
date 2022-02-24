package com.hck.factories;

import com.hck.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

import java.util.Objects;

/**
 * added On: 23/02/2022 - 00:27
 *
 * @author hkavuri
 * @version 1.0
 * @since 1.0
 */
public final class ConfigFactory {

    private ConfigFactory() {
    }


    public static FrameworkConfig getConfig() {
        return ConfigCache.getOrCreate(FrameworkConfig.class);

    }
}
