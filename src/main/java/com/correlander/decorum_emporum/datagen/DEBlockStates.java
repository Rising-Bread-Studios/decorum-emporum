package com.correlander.decorum_emporum.datagen;

import com.correlander.decorum_emporum.DecorumEmporum;
import com.correlander.decorum_emporum.Registration;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DEBlockStates extends BlockStateProvider {
    public DEBlockStates(PackOutput output, ExistingFileHelper exfilHelp) {
        super(output, DecorumEmporum.MODID, exfilHelp);
    }
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.SIMPLE_BLOCK.get());
        simpleBlock(Registration.COMPLEX_BLOCK.get());
    }
}
