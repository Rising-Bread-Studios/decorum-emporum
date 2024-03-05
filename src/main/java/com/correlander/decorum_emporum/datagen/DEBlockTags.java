package com.correlander.decorum_emporum.datagen;

import com.correlander.decorum_emporum.DecorumEmporum;
import com.correlander.decorum_emporum.Registration;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class DEBlockTags extends BlockTagsProvider {
    //Figure out how to go through other tags recursively
    public DEBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper exfilHelp) {
        super(output, lookupProvider, DecorumEmporum.MODID, exfilHelp);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.COMPLEX_BLOCK.get(), Registration.SIMPLE_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.COMPLEX_BLOCK.get(), Registration.SIMPLE_BLOCK.get());
    }
}
