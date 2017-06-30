package Assignment_3;

class student {
	private String Branch;
	private String Name;

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		this.Branch = branch;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

}

public class keyword_this {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		s1.setBranch("Computer Science");
		s1.setName("Raj");
		s2.setBranch("Electronics");
		s2.setName("Mukesh");

		System.out.println("Details of S1: Branch name = " + s1.getBranch() + ", Name = " + s1.getName());
		System.out.println("Details of S2: Branch name = " + s2.getBranch() + ", Name = " + s2.getName());

	}
}
