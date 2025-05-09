package modelObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class WebTableModel {

    private String firstNameValue;
    private String lastNameValue;
    private String emailValue;
    private String ageValue;
    private String salaryValue;
    private String departmentValue;
    private String editSalaryValue;
    private String editDepartmentValue;
    private String editAgeValue;
    private int newTableSize;
    private int actualTableSize;

    public WebTableModel(String jsonFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readerForUpdating(this).readValue(new File(jsonFilePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load JSON file: " + jsonFilePath, e);
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }


    public String getLastNameValue() {
        return lastNameValue;
    }
    public String getEmailValue() {
        return emailValue;
    }
    public String getAgeValue() {
        return ageValue;
    }
    public String getSalaryValue() {
        return salaryValue;
    }
    public String getDepartmentValue() {
        return departmentValue;
    }
    public String getEditSalaryValue() {
        return editSalaryValue;
    }
    public String getEditDepartmentValue() {
        return editDepartmentValue;
    }
    public String getEditAgeValue() {
        return editAgeValue;
    }

    public int getNewTableSize() {
        return newTableSize;
    }

    public int getActualTableSize() {
        return actualTableSize;
    }

}
