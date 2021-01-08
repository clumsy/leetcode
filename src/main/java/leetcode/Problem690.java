package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class Problem690 {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> idToEmployee = new HashMap<>(employees.size(), 1);
        for (Employee employee : employees) {
            idToEmployee.put(employee.id, employee);
        }
        return getTotalImportance(id, idToEmployee);
    }

    private int getTotalImportance(int id, Map<Integer, Employee> idToEmployee) {
        Employee employee = idToEmployee.get(id);
        int totalImportance = employee.importance;
        for (int subordinate : employee.subordinates) {
            totalImportance += getTotalImportance(subordinate, idToEmployee);
        }
        return totalImportance;
    }
}
