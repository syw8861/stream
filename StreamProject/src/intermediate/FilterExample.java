package intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample
{
	public static void main(String[] args)
	{
		List<Employee> employees = Employee.persons();
		employees.stream().filter(g->g.getIncome()>2000&&g.isMale()).filter(s->s.getIncome()>4000)
		.peek(System.out::println).forEach(f-> f.setIncome(f.getIncome()*1.1));
		System.out.println("성과급지급후");
		employees.stream().forEach(System.out::println);
	}
}//end of class(FilterExample)




class Employee{
	public static enum Gender{
		MALE, FEMALE;
	}
	
	private long id;
	private String name;
	private Gender gender;
	private LocalDate dateOfBirth;
	private double income;
	
	public Employee(long id, String name, Gender gender, LocalDate dateOfBirth, double income)
	{
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.income = income;
		
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public double getIncome()
	{
		return income;
	}

	public void setIncome(double income)
	{
		this.income = income;
	}
	public boolean isMale() {
		return this.gender == Gender.MALE;
	}
	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}
	
	@Override
	public String toString() {
		String str = String.format("%s %s %s %s %.2f", id, name, gender, dateOfBirth, income);
		return str;
	}
	public static List<Employee> persons(){
		Employee e1 = new Employee(1, "Hong", Gender.MALE, LocalDate.of(1991, Month.JANUARY, 3), 2343.0);
		Employee e2 = new Employee(2, "Hwang", Gender.MALE, LocalDate.of(1931, Month.DECEMBER, 6), 7100.0);
		Employee e3 = new Employee(3, "Kang", Gender.MALE, LocalDate.of(2000, Month.AUGUST, 13), 3100.0);
		Employee e4 = new Employee(4, "Son", Gender.FEMALE, LocalDate.of(1995, Month.OCTOBER, 22), 4000.0);
		Employee e5 = new Employee(5, "Park", Gender.MALE, LocalDate.of(1993, Month.NOVEMBER, 28), 5200.0);
		Employee e6 = new Employee(6, "Kim", Gender.FEMALE, LocalDate.of(1977, Month.APRIL, 1), 6300.0);
		return Arrays.asList(e1,e2,e3,e4,e5,e6);
	}
	
}//end of class(Employee)