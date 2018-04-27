
package org.jubaroo.wurmunlimited.mods.tabards;

import org.gotti.wurmunlimited.modloader.interfaces.Configurable;
import org.gotti.wurmunlimited.modloader.interfaces.ItemTemplatesCreatedListener;
import org.gotti.wurmunlimited.modloader.interfaces.ServerStartedListener;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;
import org.jubaroo.wurmunlimited.mods.tabards.configurator.Constants;
import org.jubaroo.wurmunlimited.mods.tabards.items.CreationEntrys;
import org.jubaroo.wurmunlimited.mods.tabards.items.ItemTemplateCreatorJubaroo;

import java.util.Properties;

public class Initiator implements WurmServerMod, ServerStartedListener, ItemTemplatesCreatedListener, Configurable {

    public void onItemTemplatesCreated() {
        if (Constants.toggleTabards) { new ItemTemplateCreatorJubaroo(); }
    }

    public void onServerStarted() {
        if (Constants.tabardCrafting) { new CreationEntrys(); }
    }

    public void configure(Properties properties) {
        Constants.jennTabardId = Integer.parseInt(properties.getProperty("jennTabardId"));
        Constants.zjenTabardId = Integer.parseInt(properties.getProperty("zjenTabardId"));
        Constants.dreaTabardId = Integer.parseInt(properties.getProperty("dreaTabardId"));
        Constants.pandTabardId = Integer.parseInt(properties.getProperty("pandTabardId"));
        Constants.thecTabardId = Integer.parseInt(properties.getProperty("thecTabardId"));
        Constants.therTabardId = Integer.parseInt(properties.getProperty("therTabardId"));
        Constants.hotsTabardId = Integer.parseInt(properties.getProperty("hotsTabardId"));
        Constants.yvalTabardId = Integer.parseInt(properties.getProperty("yvalTabardId"));
        Constants.blacTabardId = Integer.parseInt(properties.getProperty("blacTabardId"));
        Constants.ebonTabardId = Integer.parseInt(properties.getProperty("ebonTabardId"));
        Constants.abraTabardId = Integer.parseInt(properties.getProperty("abraTabardId"));
        Constants.molrTabardId = Integer.parseInt(properties.getProperty("molrTabardId"));
        Constants.empiTabardId = Integer.parseInt(properties.getProperty("empiTabardId"));
        Constants.kosTabardId  = Integer.parseInt(properties.getProperty("kosTabardId"));
        Constants.valhTabardId = Integer.parseInt(properties.getProperty("valhTabardId"));
        Constants.maceTabardId = Integer.parseInt(properties.getProperty("maceTabardId"));
        Constants.wurmTabardId = Integer.parseInt(properties.getProperty("wurmTabardId"));
        Constants.legiTabardId = Integer.parseInt(properties.getProperty("legiTabardId"));
        Constants.tabardCrafting = Boolean.valueOf(properties.getProperty("tabardCrafting", String.valueOf(true)));
        Constants.toggleTabards = Boolean.valueOf(properties.getProperty("toggleTabards", String.valueOf(true)));
    }

}
