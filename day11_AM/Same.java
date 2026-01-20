package day11_AM;
import java.util.Objects;

public class Same {
	static class Person {
		int id;
		String name;

		Person(int id, String name){
			this.id=id;
			this.name=name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}
	}

	public static boolean isSame(Person p1, Person p2) {
		return p1.hashCode() == p2.hashCode();
	}

	public static void main(String[] args) {
		Person p1 = new Person(10, "XYZ");
		Person p2 = new Person(11, "XYZ");

		boolean result = isSame(p1, p2);
		System.out.println(result);
	}
}
