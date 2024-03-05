package com.correlander.decorum_emporum.datagen;

import com.correlander.decorum_emporum.DecorumEmporum;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class DEItemTags extends ItemTagsProvider {
    public DEItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper exfilHelp) {
        super(output, lookupProvider, blockTags.contentsGetter(), DecorumEmporum.MODID, exfilHelp);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
    }
}
