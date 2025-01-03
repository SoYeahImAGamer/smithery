package com.robinsplaza.smithery.mixin;

import java.util.Iterator;

import com.robinsplaza.smithery.datagen.ModItemTagProvider;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {

    //despite spitting out a "method unrecognized" error, this mixin does work
    //intellij is just dumb sometimes
    //also done with the help of Piglib https://github.com/Shnupbups/Piglib/blob/1.20/src/main/java/com/shnupbups/piglib/mixin/PiglinBrainMixin.java
    @Inject(method = "wearsGoldArmor(Lnet/minecraft/entity/LivingEntity;)Z", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;"), cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    private static void wearsGoldArmorInject(LivingEntity entity, CallbackInfoReturnable<Boolean> cir, Iterable<ItemStack> iterable, Iterator iterator, ItemStack stack, Item item) {
        if (stack.isIn(ModItemTagProvider.PIGLIN_SAFE)) cir.setReturnValue(true);
    }
}
