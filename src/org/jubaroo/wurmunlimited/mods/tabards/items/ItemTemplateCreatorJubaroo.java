
package org.jubaroo.wurmunlimited.mods.tabards.items;

import com.wurmonline.server.behaviours.BehaviourList;
import com.wurmonline.server.items.ItemTemplateCreator;
import com.wurmonline.server.items.ItemTypes;
import com.wurmonline.shared.constants.ItemMaterials;
import org.jubaroo.wurmunlimited.mods.tabards.configurator.Constants;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ItemTemplateCreatorJubaroo implements ItemTypes, BehaviourList, ItemMaterials {

    public ItemTemplateCreatorJubaroo() {
        final Logger logger = Logger.getLogger(ItemTemplateCreatorJubaroo.class.getName() + " v1.4");

        try {
        ItemTemplateCreator.createItemTemplate(Constants.jennTabardId, "Jenn-Kellon tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.jenn.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var0) {
            logger.log(Level.SEVERE, "Could not create Jenn-Kellon tabard item.", var0);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.zjenTabardId, "Jenn-Kellon II tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.zjen.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var1) {
            logger.log(Level.SEVERE, "Could not create Jenn-Kellon II item.", var1);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.dreaTabardId, "Dreadnought tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.drea.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var2) {
            logger.log(Level.SEVERE, "Could not create Dreadnought tabard item.", var2);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.pandTabardId, "Pandemonium tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.pand.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var3) {
            logger.log(Level.SEVERE, "Could not create Pandemonium tabard item.", var3);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.thecTabardId, "Crusaders tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.thec.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var5) {
            logger.log(Level.SEVERE, "Could not create Crusaders tabard item.", var5);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.therTabardId, "The Roman empire tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.ther.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var6) {
            logger.log(Level.SEVERE, "Could not create The Roman empire tabard item.", var6);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.hotsTabardId, "HotS tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.hots.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var7) {
            logger.log(Level.SEVERE, "Could not create HotS tabard.", var7);
            }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.yvalTabardId, "Valhalla II tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.yval.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var8) {
            logger.log(Level.SEVERE, "Could not create Valhalla II tabard.", var8);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.blacTabardId, "Black Legion tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.blac.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var9) {
            logger.log(Level.SEVERE, "Could not create Black Legion tabard.", var9);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.ebonTabardId, "Ebonaura tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.ebon.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var10) {
            logger.log(Level.SEVERE, "Could not create Ebonaura tabard.", var10);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.abraTabardId, "Abralon tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.abra.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var11) {
            logger.log(Level.SEVERE, "Could not create Abralon tabard.", var11);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.molrTabardId, "Mol-Rehan tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.molr.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var12) {
            logger.log(Level.SEVERE, "Could not create Mol-Rehan tabard.", var12);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.empiTabardId, "Empire of Mol-Rehan tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.empi.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var13) {
            logger.log(Level.SEVERE, "Could not create Empire of Mol-Rehan tabard.", var13);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.kosTabardId, "Kingdom of Sol tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.kos.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var14) {
            logger.log(Level.SEVERE, "Could not create Kingdom of Sol tabard.", var14);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.valhTabardId, "Valhalla tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] {ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.valh.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var15) {
            logger.log(Level.SEVERE, "Could not create Valhalla tabard.", var15);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.maceTabardId, "Macedon tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.mace.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var16) {
            logger.log(Level.SEVERE, "Could not create Macedon tabard.", var16);
        }
        try {
        ItemTemplateCreator.createItemTemplate(Constants.wurmTabardId, "Wurm tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.wurm.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var17) {
            logger.log(Level.SEVERE, "Could not create Wurm tabard.", var17);
        }
        try {
            ItemTemplateCreator.createItemTemplate(Constants.wurmTabardId, "Legion of Anubis tabard", "kingdom tabards", "excellent", "good", "ok", "poor", "A tabard that is worn to show off which kingdom you belong to.", new short[] { ITEM_TYPE_CLOTH, ITEM_TYPE_REPAIRABLE }, (short) 307, itemBehaviour, 0, 3024000L, 30, 30, 5, -10, new byte[] { 35 }, "model.clothing.tabard.legi.", 25.0f, 300, MATERIAL_COTTON);
        } catch (IOException var18) {
            logger.log(Level.SEVERE, "Could not create Legion of Anubis tabard.", var18);
        }

    }
}
