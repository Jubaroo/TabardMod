
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
    private static final Logger logger = Logger.getLogger(Initiator.class.getName() + "Tabard Mod v1.2");
    private static boolean  debug;

    private static void debug(String msg) {
        if (debug) { logger.info(msg); }
    }

    public void onItemTemplatesCreated() { if (toggleTabards) { new ItemTemplateCreatorJubaroo(); }
        debug("debug enabled: Logging starting...");
        debug("Jenn_Kellon ID: " + jennTabardId);
        debug("Jenn_Kellon II ID: " + zjenTabardId);
        debug("Dreadnought ID: " + dreaTabardId);
        debug("Pandemonium ID: " + pandTabardId);
        debug("Crusaders ID: " + thecTabardId);
        debug("Roman Empire ID: " + therTabardId);
        debug("Horde of the Summoned ID: " + hotsTabardId);
        debug("Valhalla II ID: " + yvalTabardId);
        debug("Black Legion ID: " + blacTabardId);
        debug("Ebonaura ID: " + ebonTabardId);
        debug("Abralon ID: " + abraTabardId);
        debug("Mol-Rehan ID: " + molrTabardId);
        debug("Empire of Mol-Rehan ID: " + empiTabardId);
        debug("Kingdom of Sol ID: " + kosTabardId);
        debug("Valhalla ID: " + valhTabardId);
        debug("Macedon ID: " + maceTabardId);
        debug("University of Wurm ID: " + wurmTabardId);
        debug("Legion of Anubis ID: " + legiTabardId);
        debug("Tabard Crafting = : " + tabardCrafting);
        debug("Tabards = : " + toggleTabards);
    }

    public void onServerStarted() { if (tabardCrafting) { new CreationEntrys(); } }

    public void configure(Properties properties) {
        debug = Boolean.valueOf(properties.getProperty("debug", String.valueOf(false)));
        tabardCrafting = Boolean.valueOf(properties.getProperty("tabardCrafting", String.valueOf(true)));
        toggleTabards = Boolean.valueOf(properties.getProperty("toggleTabards", String.valueOf(true)));
        jennTabardId = Integer.parseInt(properties.getProperty("jennTabardId", String.valueOf(11000)));
        zjenTabardId = Integer.parseInt(properties.getProperty("zjenTabardId", String.valueOf(11001)));
        dreaTabardId = Integer.parseInt(properties.getProperty("dreaTabardId", String.valueOf(11002)));
        pandTabardId = Integer.parseInt(properties.getProperty("pandTabardId", String.valueOf(11003)));
        thecTabardId = Integer.parseInt(properties.getProperty("thecTabardId", String.valueOf(11004)));
        therTabardId = Integer.parseInt(properties.getProperty("therTabardId", String.valueOf(11005)));
        hotsTabardId = Integer.parseInt(properties.getProperty("hotsTabardId", String.valueOf(11006)));
        yvalTabardId = Integer.parseInt(properties.getProperty("yvalTabardId", String.valueOf(11007)));
        blacTabardId = Integer.parseInt(properties.getProperty("blacTabardId", String.valueOf(11008)));
        ebonTabardId = Integer.parseInt(properties.getProperty("ebonTabardId", String.valueOf(11009)));
        abraTabardId = Integer.parseInt(properties.getProperty("abraTabardId", String.valueOf(11010)));
        molrTabardId = Integer.parseInt(properties.getProperty("molrTabardId", String.valueOf(11011)));
        empiTabardId = Integer.parseInt(properties.getProperty("empiTabardId", String.valueOf(11012)));
        valhTabardId = Integer.parseInt(properties.getProperty("valhTabardId", String.valueOf(11013)));
        maceTabardId = Integer.parseInt(properties.getProperty("maceTabardId", String.valueOf(11014)));
        wurmTabardId = Integer.parseInt(properties.getProperty("wurmTabardId", String.valueOf(11015)));
        legiTabardId = Integer.parseInt(properties.getProperty("legiTabardId", String.valueOf(11016)));
        kosTabardId  = Integer.parseInt(properties.getProperty("kosTabardId", String.valueOf(11017)));

    }

}
