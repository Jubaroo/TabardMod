
package org.jubaroo.wurmunlimited.mods.tabards;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.jubaroo.wurmunlimited.mods.tabards.items.CreationEntrys;
import org.jubaroo.wurmunlimited.mods.tabards.items.ItemTemplateCreatorJubaroo;

import java.util.Properties;
import java.util.logging.Logger;

import static org.jubaroo.wurmunlimited.mods.tabards.configurator.Constants.*;

public class Initiator implements WurmServerMod, ServerStartedListener, ItemTemplatesCreatedListener, Configurable {
    private static final Logger logger = Logger.getLogger(Initiator.class.getName() + " v1.2");
    private static boolean  debug;

    private static void debug(String msg) {
        if (debug) { logger.info(msg); }
    }

    public void onItemTemplatesCreated() { if (toggleTabards) { new ItemTemplateCreatorJubaroo(); } }

    public void onServerStarted() { if (tabardCrafting) { new CreationEntrys(); } }

    public void configure(Properties properties) {
        debug = Boolean.valueOf(properties.getProperty("debug", String.valueOf(false)));
        debug("debug enabled: Logging starting...");
        debug("Jenn_Kellon ID: " + jennTabardId);
        jennTabardId = Integer.parseInt(properties.getProperty("jennTabardId"));
        debug("Jenn_Kellon II ID: " + zjenTabardId);
        zjenTabardId = Integer.parseInt(properties.getProperty("zjenTabardId"));
        debug("Dreadnought ID: " + dreaTabardId);
        dreaTabardId = Integer.parseInt(properties.getProperty("dreaTabardId"));
        debug("Pandemonium ID: " + pandTabardId);
        pandTabardId = Integer.parseInt(properties.getProperty("pandTabardId"));
        debug("Crusaders ID: " + thecTabardId);
        thecTabardId = Integer.parseInt(properties.getProperty("thecTabardId"));
        debug("Roman Empire ID: " + therTabardId);
        therTabardId = Integer.parseInt(properties.getProperty("therTabardId"));
        debug("Horde of the Summoned ID: " + hotsTabardId);
        hotsTabardId = Integer.parseInt(properties.getProperty("hotsTabardId"));
        debug("Valhalla II ID: " + yvalTabardId);
        yvalTabardId = Integer.parseInt(properties.getProperty("yvalTabardId"));
        debug("Black Legion ID: " + blacTabardId);
        blacTabardId = Integer.parseInt(properties.getProperty("blacTabardId"));
        debug("Ebonaura ID: " + ebonTabardId);
        ebonTabardId = Integer.parseInt(properties.getProperty("ebonTabardId"));
        debug("Abralon ID: " + abraTabardId);
        abraTabardId = Integer.parseInt(properties.getProperty("abraTabardId"));
        debug("Mol-Rehan ID: " + molrTabardId);
        molrTabardId = Integer.parseInt(properties.getProperty("molrTabardId"));
        debug("Empire of Mol-Rehan ID: " + empiTabardId);
        empiTabardId = Integer.parseInt(properties.getProperty("empiTabardId"));
        debug("Kingdom of Sol ID: " + kosTabardId);
        kosTabardId  = Integer.parseInt(properties.getProperty("kosTabardId"));
        debug("Valhalla ID: " + valhTabardId);
        valhTabardId = Integer.parseInt(properties.getProperty("valhTabardId"));
        debug("Macedon ID: " + maceTabardId);
        maceTabardId = Integer.parseInt(properties.getProperty("maceTabardId"));
        debug("University of Wurm ID: " + wurmTabardId);
        wurmTabardId = Integer.parseInt(properties.getProperty("wurmTabardId"));
        debug("Legion of Anubis ID: " + legiTabardId);
        legiTabardId = Integer.parseInt(properties.getProperty("legiTabardId"));
        debug("Tabard Crafting = : " + tabardCrafting);
        tabardCrafting = Boolean.valueOf(properties.getProperty("tabardCrafting", String.valueOf(true)));
        debug("Tabards = : " + toggleTabards);
        toggleTabards = Boolean.valueOf(properties.getProperty("toggleTabards", String.valueOf(true)));

    }

}
