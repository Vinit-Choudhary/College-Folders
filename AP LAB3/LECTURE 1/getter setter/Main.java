/*//My code
class Juet {
	int data;
	String name;

	public void set(int _data, String _name ) {
		data = _data;
		name= _name;
	}

	public void get() {
		System.out.println(data);
		System.out.println(name);
	}
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Juet juet= new Juet();
		juet.set(23, "vinit");
		juet.get();
	}
}
*/

/*//pp sir code:-
public class Main {
    // Private fields
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Adding a condition to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        Main person = new Main();

        // Using setters to set values
        person.setName("John");
        person.setAge(25);

        // Using getters to get values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
*/