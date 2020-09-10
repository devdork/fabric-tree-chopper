package com.skaggsm.treechoppermod

import me.sargunvohra.mcmods.autoconfig1u.ConfigData
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry

@Config(name = FabricTreeChopper.MODID)
class FabricTreeChopperConfig : ConfigData {
    var fastLeafDecay: Boolean = true
    var treeChopMode: ChopMode = ChopMode.GRAVITY_CHOP
    @ConfigEntry.Gui.Tooltip
    var fullChopDurabilityUsage: FullChopDurabilityMode = FullChopDurabilityMode.BREAK_MID_CHOP
    var sneakToDisable: Boolean = false
    var requireLeavesToChop: Boolean = true
}

enum class ChopMode {
    FULL_CHOP,
    SINGLE_CHOP,
    GRAVITY_CHOP,
    VANILLA_CHOP
}

enum class FullChopDurabilityMode {
    NO_DURABILITY_LOSS,
    BREAK_AFTER_CHOP,
    BREAK_MID_CHOP,
}
