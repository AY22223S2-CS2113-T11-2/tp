package seedu.penus.logic.utils;
import seedu.penus.common.exceptions.InvalidModuleAPIException;
import seedu.penus.common.exceptions.PenusException;

public class DetailsCompiler extends ModuleRetriever{
    protected String ModuleCode;

    public static String getDetails(String module) {
        try {
            String title = getTitle2223(module);
            String description = "\t" + getDescription(module);
            String prereqs = "\tPre-Requisites: " + getPrerequisite(module);
            String credits = "\tMCs: " + getModuleCredit2223(module);

            boolean suStatus = getSUstatus(module);
            String suStatusDescription;
            if (suStatus) {
                suStatusDescription = "\tModule can be SU-ed.";
            } else {
                suStatusDescription = "\tModule cannot be SU-ed.";
            }
            return title + "\n" + description + "\n" + prereqs + "\n" + credits + "\n" + suStatusDescription;
        } catch (Exception e) {
            return "This information is not available";
        }
    }
}