package com.correlander.decorum_emporum.datagen;

import com.correlander.decorum_emporum.DecorumEmporum;
import com.correlander.decorum_emporum.Registration;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DEItemModels extends ItemModelProvider {
    public DEItemModels(PackOutput output, ExistingFileHelper exfilHelp) {
        super(output, DecorumEmporum.MODID, exfilHelp);
    }

    //private void generatedBlockItemModel(Block block, String filePath) {
    //    withExistingParent(Registration.block.getId().getPath(), modLoc(filePath));
    //}

    @Override
    protected void registerModels() {
        //generatedBlockItemModel(SIMPLE_BLOCK, "block/simple_block");
        withExistingParent(Registration.SIMPLE_BLOCK.getId().getPath(), modLoc("block/simple_block"));
        withExistingParent(Registration.COMPLEX_BLOCK.getId().getPath(), modLoc("block/simple_block"));
    }
}
