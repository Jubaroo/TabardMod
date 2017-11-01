
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
        new ItemTemplateCreatorJubaroo();
    }

    public void onServerStarted() {
        new CreationEntrys();
    }

    public void configure(Properties properties) {

        Constants.jennTabardId = Integer.parseInt(properties.getProperty("jennTabardId", Integer.toString(Constants.jennTabardId)));
        Constants.zjenTabardId = Integer.parseInt(properties.getProperty("zjenTabardId", Integer.toString(Constants.zjenTabardId)));
        Constants.dreaTabardId = Integer.parseInt(properties.getProperty("dreaTabardId", Integer.toString(Constants.dreaTabardId)));
        Constants.pandTabardId = Integer.parseInt(properties.getProperty("pandTabardId", Integer.toString(Constants.pandTabardId)));
        Constants.thecTabardId = Integer.parseInt(properties.getProperty("thecTabardId", Integer.toString(Constants.thecTabardId)));
        Constants.therTabardId = Integer.parseInt(properties.getProperty("therTabardId", Integer.toString(Constants.therTabardId)));
        Constants.hotsTabardId = Integer.parseInt(properties.getProperty("hotsTabardId", Integer.toString(Constants.hotsTabardId)));
        Constants.yvalTabardId = Integer.parseInt(properties.getProperty("yvalTabardId", Integer.toString(Constants.yvalTabardId)));
        Constants.blacTabardId = Integer.parseInt(properties.getProperty("blacTabardId", Integer.toString(Constants.blacTabardId)));
        Constants.ebonTabardId = Integer.parseInt(properties.getProperty("ebonTabardId", Integer.toString(Constants.ebonTabardId)));
        Constants.abraTabardId = Integer.parseInt(properties.getProperty("abraTabardId", Integer.toString(Constants.abraTabardId)));
        Constants.molrTabardId = Integer.parseInt(properties.getProperty("molrTabardId", Integer.toString(Constants.molrTabardId)));
        Constants.empiTabardId = Integer.parseInt(properties.getProperty("empiTabardId", Integer.toString(Constants.empiTabardId)));
        Constants.kosTabardId  = Integer.parseInt(properties.getProperty("kosTabardId",  Integer.toString(Constants.kosTabardId)));
        Constants.valhTabardId = Integer.parseInt(properties.getProperty("valhTabardId", Integer.toString(Constants.valhTabardId)));
        Constants.maceTabardId = Integer.parseInt(properties.getProperty("maceTabardId", Integer.toString(Constants.maceTabardId)));
        Constants.wurmTabardId = Integer.parseInt(properties.getProperty("wurmTabardId", Integer.toString(Constants.wurmTabardId)));
    }
}
