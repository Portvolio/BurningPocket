package wtf.violet.portvolio.burningpocket.listener;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;
import wtf.violet.portvolio.common.UtilPlayer;

public class DamageListener implements Listener
{

    @EventHandler
    public void onEntityDamage(final EntityDamageEvent event)
    {
        DamageCause cause = event.getCause();

        if (
            event.getEntityType() == EntityType.PLAYER &&
                (cause == DamageCause.LAVA || cause == DamageCause.FIRE)
        )
        {
            final ItemStack stack = UtilPlayer.findRandomFilledSlot((Player) event.getEntity());

            if (stack != null)
            {
                stack.setType(Material.CHARCOAL);
                stack.setAmount(1);
            }
        }
    }

}
