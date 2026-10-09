# AdvancedChatBox Language: Deutsch

German spell-check data for [AdvancedChatBox](https://github.com/flyingfinger1/AdvancedChatBox).

AdvancedChatBox ships only the LanguageTool **engine**; each language's dictionary and NLP data is
large and lives in its own small add-on. Install this mod to enable **German** spell-checking in the
chat box. It plugs into Box through the `advancedchatbox:spellcheck` entrypoint and is picked
automatically when your Minecraft language is German (`de_de`).

## Requirements

| | Version |
| --- | --- |
| Minecraft | **26.3** |
| Java | **25** |
| [AdvancedChatBox](https://github.com/flyingfinger1/AdvancedChatBox) | **1.2.3+** |

AdvancedChatBox (and its own dependencies — AdvancedChatCore, MaLiLib, Fabric API) must be installed.
Without AdvancedChatBox this mod does nothing.

## What's bundled

The `language-de` data plus the German-specific pieces LanguageTool needs that Box and Minecraft do
not already provide: the German POS dictionary (`german-pos-dict`), `jwordsplitter`, `openregex`,
the Aho-Corasick trie and a small guava shim. German spelling uses the Hunspell backend, whose shared
binding ships with the AdvancedChatBox engine.

## Building

Publish AdvancedChatBox locally first, then build:

```
# in the AdvancedChatBox clone
./gradlew publishToMavenLocal

# then here
./gradlew build
```

The build needs a **JDK 25** toolchain.

## License

MPL-2.0.
