package dk.shadow.utils;

import dk.shadow.Casino;
import org.bukkit.Location;

import java.util.HashMap;
import java.util.Map;

public class Locations {
    public static void addCrate(Location loc){
        int n = Casino.locationYML.getInt("Crates");
        n++;
        Casino.locationYML.set("Crates", n);
        Casino.locationYML.set("CrateLocations.CasinoCrate." + String.valueOf(n) + ".world", loc.getWorld().getName());
        Casino.locationYML.set("CrateLocations.CasinoCrate." + String.valueOf(n) + ".x", loc.getX());
        Casino.locationYML.set("CrateLocations.CasinoCrate." + String.valueOf(n) + ".y", loc.getY());
        Casino.locationYML.set("CrateLocations.CasinoCrate." + String.valueOf(n) + ".z", loc.getZ());
        Casino.location.saveConfig();
        Casino.location.reloadConfig();
    }

    public static void removeCrate(String id) {
        Casino.locationYML.set("CrateLocations.CasinoCrate." + id, null);
        Casino.location.saveConfig();
        Casino.location.reloadConfig();
    }


}
