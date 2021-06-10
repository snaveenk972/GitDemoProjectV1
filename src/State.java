import java.util.TreeSet;

public class State {
	private String name;
	private TreeSet cities = new TreeSet(new CustomComparator());
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeSet getCities() {
		return cities;
	}

	public void setCities(TreeSet cities) {
		this.cities = cities;
	}

	public State() {
		super();
	}

	public State(String name, TreeSet cities) {
		super();
		this.name = name;
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", cities=" + cities + "]";
	}
	
	
}
