package seedu.penus.model;

import java.util.ArrayList;
import java.util.List;

public class ModuleList {
    public final List<Module> modules;
    //private final ResourceStorage resource;
    //private final List<String[]> moduleDetails;


    //private User user = new User();

    /**
     * Overloaded constructor for the creation of a ModuleList object.
     */
    public ModuleList() {
        this.modules = new ArrayList<>();
        //this.resource = new ResourceStorage();
        //this.moduleDetails = resource.getAllModuleDetails();
        //this.user = new User();
    }

    /**
     * Constructor for the creation of a ModuleList object.
     *
     * @param mods List of mods to be included in ModuleLIst after creation.
     */
    public ModuleList(List<Module> mods) {
        this.modules = mods;
        //this.resource = new ResourceStorage();
        //this.moduleDetails = resource.getAllModuleDetails();
        //this.user = user;
    }

    /**
     * Gets the list of modules.
     *
     * @return List of modules inline separated by commas
     */
    public List<Module> getModuleList() {
        return this.modules;
    }

    /**
     * Gets a module from the module list by index
     *
     * @param index the index of the module
     * @return the module corresponding to the given index
     */
    public Module getModule(int index) {
        return modules.get(index);
    }

    public boolean hasModule(Module module) {
        for (Module m : modules) {
            if (m.getCode().equals(module.getCode())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a given module to the ModuleList object.
     *
     * @param module The module to be added.
     */
    public void addModule(Module module) {
        this.modules.add(module);
    }

    /**
     * Deletes the module identified by its code from the ModuleList
     *
     * @param index The index corresponding to the module to be deleted.
     */
    public void removeModule(int index) {
        this.modules.remove(index);
    }

    /**
     * Returns the number of modules in the module list
     *
     * @return the number of modules in the module list
     */
    public int size() {
        return modules.size();
    }

    /**
     * Returns the module code of GESS module if exist and taken, "" if does not exist
     *
     * @return the module code of GESS module if exist and taken, "" if does not exist
     */
    public String getGESS() {
        for (Module module : modules) {
            if (module.moduleCode.substring(0, 4).equals("GESS") && module.isTaken) {
                return module.moduleCode;
            }
        }
        return "";
    }

    /**
     * Returns the module code of GEC module if exist and taken, "" if does not exist
     *
     * @return the module code of GEC module if exist and taken, "" if does not exist
     */
    public String getGEC() {
        for (Module module : modules) {
            if (module.moduleCode.substring(0, 3).equals("GEC") && module.isTaken) {
                return module.moduleCode;
            }
        }
        return "";
    }

    /**
     * Returns the module code of GEN module if exist and taken, "" if does not exist
     *
     * @return the module code of GEN module if exist and taken, "" if does not exist
     */
    public String getGEN() {
        for (Module module : modules) {
            if (module.moduleCode.substring(0, 3).equals("GEN") && module.isTaken) {
                return module.moduleCode;
            }
        }
        return "";
    }
}
