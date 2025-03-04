package org;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricDocsReference implements ModInitializer {

    public static final String FOXLAMP = "foxlamp";
    public static final Logger LOGGER = LoggerFactory.getLogger(FOXLAMP);

    @Override
    public void onInitialize() {

        LOGGER.info("Hello Fabric world!");
    }
}