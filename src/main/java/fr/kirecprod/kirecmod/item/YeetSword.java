package fr.kirecprod.kirecmod.item;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class YeetSword extends SwordItem
{

    public YeetSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties)
    {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker)
    {
        if(pAttacker instanceof Player pPlayer) {
            pPlayer.getCooldowns().addCooldown(this, 40);
        }
        pTarget.knockback(100, pTarget.getYRot() * 100, pTarget.getYRot() * 100);

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
