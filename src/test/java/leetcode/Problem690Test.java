package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem690Test {
    private final Problem690 solution = new Problem690();

    @Test
    public void example1() {
        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;
        employee2.subordinates = Collections.emptyList();

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;
        employee3.subordinates = Collections.emptyList();

        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        employee1.subordinates = Arrays.asList(2, 3);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

        assertThat(solution.getImportance(employees, 1), is(11));
    }
}
