package Manager;

public class Manager extends Employee {
	private String department;
	private String bonus;
	
	public Manager(String name,double salary,String mDepartment,String mBonus) {
		super(name,salary);
		this.department=mDepartment;
		this.bonus = mBonus;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Bonus: " + bonus;
    }

}
