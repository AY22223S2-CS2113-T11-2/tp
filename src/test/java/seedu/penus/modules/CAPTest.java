package seedu.penus.modules;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import seedu.penus.exceptions.DuplicateModuleException;
import seedu.penus.exceptions.InvalidGradeException;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CAPTest {
    private ModuleList moduleList;
    private List<String[]> semArray;
    //private Module module;

    @BeforeEach
    public void setUp() {
        moduleList = new ModuleList();
        semArray = new ArrayList<>();
    }

    //public Module(String moduleCode, Integer year, Integer semester)
    @Test
    void CalculateOverallCAP_moduleList_success() throws
            DuplicateModuleException, InvalidGradeException {
        moduleList.addModule(new Module("CS1010", 1, 1, "B+"));
        moduleList.addModule(new Module("CS2113", 2, 2, "A+"));
        double CAP = Double.parseDouble(new DecimalFormat("#.##").
                format(seedu.penus.modules.CAP.calculateOverallCAP(moduleList.getModuleList())));
        assertEquals(CAP, 4.50);
    }

    @Test
    void calculateSemCAP_semArray_success() throws InvalidGradeException {
        Module module1 = new Module("CS1010", 1, 1, "A+");
        Module module2 = new Module("CG1111A", 1, 1, "A+");
        Module module3 = new Module("CG2111A", 1, 1, "B+");
        semArray.add(new String[] { module1.getCode(), module1.getGrade()});
        semArray.add(new String[] { module2.getCode(), module2.getGrade()});
        semArray.add(new String[] { module3.getCode(), module3.getGrade()});
        double CAP = Double.parseDouble(new DecimalFormat("#.##").
                format(seedu.penus.modules.CAP.calculateSemCAP(semArray)));
        assertEquals(CAP, 4.67);
    }
}
