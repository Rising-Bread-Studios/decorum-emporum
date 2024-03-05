package com.correlander.decorum_emporum.datagen;

import com.correlander.decorum_emporum.DecorumEmporum;
import com.correlander.decorum_emporum.Registration;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class DELangProvider extends LanguageProvider {
    public DELangProvider(PackOutput output, String locale) {
        super(output, DecorumEmporum.MODID, locale);
    }
    @Override
    protected void addTranslations() {
        add(Registration.SIMPLE_BLOCK.get(), "Simple Block");
        add(Registration.COMPLEX_BLOCK.get(), "Complex Block");
    }
}
