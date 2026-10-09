/*
 * Copyright (C) 2026 flyingfinger1
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.github.flyingfinger1.advancedchatbox.lang.de;

import io.github.darkkronicle.advancedchatbox.suggester.SpellCheckLanguageProvider;
import org.languagetool.Language;
import org.languagetool.language.GermanyGerman;

/**
 * Registers German as a spell-check language for AdvancedChatBox. Wired in via the
 * {@code advancedchatbox:spellcheck} entrypoint (see fabric.mod.json). The {@code language-de}
 * LanguageTool data is bundled in this add-on; the engine ({@code languagetool-core}) comes from Box.
 */
public class GermanProvider implements SpellCheckLanguageProvider {

    @Override
    public String code() {
        return "de";
    }

    @Override
    public String displayName() {
        return "Deutsch";
    }

    @Override
    public Language createLanguage() {
        return new GermanyGerman();
    }
}
