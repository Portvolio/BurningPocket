package wtf.violet.portvolio.burningpocket;

import org.bukkit.plugin.java.JavaPlugin;
import wtf.violet.portvolio.burningpocket.listener.DamageListener;

public final class BurningPocket extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new DamageListener(), this);
    }

}
