import java.io.*;

public class EmployeeTest{
	public static void main(String[] args) {
		// ���ù�����������������
		Employee empOne = new Employee("Test 01");
		Employee empTwo = new Employee("Test 02");

		// ������2������ĳ�Ա����
		empOne.empAge(26);
		empOne.empDesignation("�߼�����Ա");
		empOne.empSalary(9000);
		empOne.printEmployee();
		
		empTwo.empAge(20);
		empTwo.empDesignation("�������Ա");
		empTwo.empSalary(2000);
		empTwo.printEmployee();
	}
}