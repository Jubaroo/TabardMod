
package org.jubaroo.wurmunlimited.mods.tabards.items;

import org.jubaroo.wurmunlimited.mods.tabards.configurator.Constants;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemTemplateCreatorJubaroo {
    public ItemTemplateCreatorJubaroo() {
        final Logger logger = Logger.getLogger("Tabard Mod ItemTemplateCreatorJubaroo");

        try {
    com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.jennTabardId, "Jenn-Kellon tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.jenn.", 25.0f, 300, (byte) 17);
        } catch (IOException var0) {
            logger.log(Level.SEVERE, "Could not create Jenn-Kellon tabard item.", var0);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.zjenTabardId, "Jenn-Kellon II tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.zjen.", 25.0f, 300, (byte) 17);
        } catch (IOException var1) {
            logger.log(Level.SEVERE, "Could not create Jenn-Kellon II item.", var1);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.dreaTabardId, "Dreadnought tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.drea.", 25.0f, 300, (byte) 17);
        } catch (IOException var2) {
            logger.log(Level.SEVERE, "Could not create Dreadnought tabard item.", var2);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.pandTabardId, "Pandemonium tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.pand.", 25.0f, 300, (byte) 17);
        } catch (IOException var3) {
            logger.log(Level.SEVERE, "Could not create Pandemonium tabard item.", var3);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.thecTabardId, "Crusaders tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.thec.", 25.0f, 300, (byte) 17);
        } catch (IOException var5) {
            logger.log(Level.SEVERE, "Could not create Crusaders tabard item.", var5);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.therTabardId, "The Roman empire tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.ther.", 25.0f, 300, (byte) 17);
        } catch (IOException var6) {
            logger.log(Level.SEVERE, "Could not create The Roman empire tabard item.", var6);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.hotsTabardId, "HotS tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.hots.", 25.0f, 300, (byte) 17);
        } catch (IOException var7) {
            logger.log(Level.SEVERE, "Could not create HotS tabard.", var7);
            }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.yvalTabardId, "Valhalla II tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.yval.", 25.0f, 300, (byte) 17);
        } catch (IOException var8) {
            logger.log(Level.SEVERE, "Could not create Valhalla II tabard.", var8);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.blacTabardId, "Black Legion tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.blac.", 25.0f, 300, (byte) 17);
        } catch (IOException var9) {
            logger.log(Level.SEVERE, "Could not create Black Legion tabard.", var9);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.ebonTabardId, "Ebonaura tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.ebon.", 25.0f, 300, (byte) 17);
        } catch (IOException var10) {
            logger.log(Level.SEVERE, "Could not create Ebonaura tabard.", var10);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.abraTabardId, "Abralon tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.abra.", 25.0f, 300, (byte) 17);
        } catch (IOException var11) {
            logger.log(Level.SEVERE, "Could not create Abralon tabard.", var11);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.molrTabardId, "Mol-Rehan tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.molr.", 25.0f, 300, (byte) 17);
        } catch (IOException var12) {
            logger.log(Level.SEVERE, "Could not create Mol-Rehan tabard.", var12);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.empiTabardId, "Empire of Mol-Rehan tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.empi.", 25.0f, 300, (byte) 17);
        } catch (IOException var13) {
            logger.log(Level.SEVERE, "Could not create Empire of Mol-Rehan tabard.", var13);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.kosTabardId, "Kingdom of Sol tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.kos.", 25.0f, 300, (byte) 17);
        } catch (IOException var14) {
            logger.log(Level.SEVERE, "Could not create Kingdom of Sol tabard.", var14);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.valhTabardId, "Valhalla tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.valh.", 25.0f, 300, (byte) 17);
        } catch (IOException var15) {
            logger.log(Level.SEVERE, "Could not create Valhalla tabard.", var15);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.maceTabardId, "Macedon tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.mace.", 25.0f, 300, (byte) 17);
        } catch (IOException var16) {
            logger.log(Level.SEVERE, "Could not create Macedon tabard.", var16);
        }
        try {
        com.wurmonline.server.items.ItemTemplateCreator.createItemTemplate(Constants.wurmTabardId, "Wurm tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { 24, 44 }, (short) 307, (short) 1, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.wurm.", 25.0f, 300, (byte) 17);
        } catch (IOException var17) {
            logger.log(Level.SEVERE, "Could not create Wurm tabard.", var17);
        }
    }
}
