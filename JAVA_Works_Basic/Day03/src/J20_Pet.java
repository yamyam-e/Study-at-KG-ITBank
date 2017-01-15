import javax.swing.JOptionPane;

public class J20_Pet {
	
	private String name;
	private int age;
	private double weight;
	
	public J20_Pet() {
		setName();
		setAge();
		setWeight();
	}
		
	public void setName() {
		String rcv = JOptionPane.showInputDialog("Input the name of pet");
		this.name = rcv;
	}
	
	public void setAge() {
		String rcv = JOptionPane.showInputDialog("Input the age of pet");
		this.age = Integer.parseInt(rcv);
	}
	
	public void setWeight() {
		String rcv = JOptionPane.showInputDialog("Input the wieght of pet");
		this.weight = Double.parseDouble(rcv);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAge() {
		return this.name;
	}
	
	public String getWeight() {
		return this.name;
	}
	
	public String toString() {
		return "Pet Name  : " + this.name + "\n"
			 + "Pet Age   : " + this.age + "\n"
			 + "Pet Weight: " + this.weight;
	}

}
