package pw.chew.LeChewPlugin;
 
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin {
 
    @Override
    public void onEnable() {
       
    }
   
    @Override
    public void onDisable() {
       
    }
   
    @Override
    public boolean onCommand(CommandSender sender,
            Command command,
            String label,
            String[] args) {
        if (command.getName().equalsIgnoreCase("lcp")) {
            sender.sendMessage("You ran /lcp!");
            return true;
        }
        return false;
    }
   
}