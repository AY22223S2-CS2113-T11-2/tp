package seedu.penus.logic.commands;

import seedu.penus.common.exceptions.InvalidCommandException;
import seedu.penus.model.ModelManager;
import seedu.penus.model.ModuleList;

public class RemoveCommand extends Command {
    public static final String COMMAND_WORD = "remove";
    public static final String MESSAGE = 
            "\tModule has been removed:\n" 
            + "\t  %s";

    private final String moduleCode;

    public RemoveCommand(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    @Override
    public CommandResult execute(ModelManager model) throws InvalidCommandException {
        int index = -1;
        ModuleList list = model.getModuleList();
        for (int i = 0; i < list.size(); i++) {
            if (list.getModule(i).getCode().equals(moduleCode)) {
                index = i;
            }
        }
        if (index == -1) {
            throw new InvalidCommandException("No such module exists!");
        }
        model.removeModule(index);

        return new CommandResult(String.format(MESSAGE, list.getModule(index)));
    }
}
