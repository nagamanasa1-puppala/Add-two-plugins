package plugina;


public class Model {
	int count;
	String empId;
	String empName;
	String empSal;
	String gen;
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(String empId, String empName, String empSal, String gen) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.gen = gen;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
}
