package intermediate;



public class Student implements Comparable<Student>
{
	private String name;
	private int score;
	
	@Override
	public int compareTo(Student o)
	{
		// -1(음수)오름차순
		// 1(양수) 내림차순
		// 0아무거토아님
//		return this.score - o.score;
		return this.name.compareTo(o.name);
	}
	
	public int getScore() {
		return this.score;
	}
	
	public Student(String name, int score)
	{
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString()
	{
		String str = String.format("%s %s", name, score);
		return str;
	}


	@Override
	public int hashCode()
	{
		return this.name.hashCode() + this.score;
	}


	@Override
	public boolean equals(Object obj)
	{
		Student std = (Student) obj;
		boolean stdBool = this.name.equals(std.name);
		boolean scoreBool = this.score == std.score;
		return super.equals(obj);
	}



	
	
}
