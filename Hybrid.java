
class student
{
	int roll_no;
	void getNumber(int n)
	{
		roll_no = n;
	}
	void putNumber()
	{
		System.out.println("Roll no. is"+roll_no);
	}
}

class Test extends student
{
	float part1, part2;
	
	void getMarks(float m1, float m2)
	{
		part1 = m1;
		part2 = m2;
	}
	void putmarks()
	{
		System.out.println("Mark Obtained");
		System.out.println("Part1"+part1);
		System.out.println("Part2"+part2);
	}
}
interface sports
{
	float sportwt = 6.0f;
	void putwt();
}
class result extends Test implements sports
{
	float total;
	public void putwt()
	{
		System.out.println("Sport="+sportwt);
	}
	void display()
	{
		total = part1+part2+sportwt;
		
		putNumber();
		putmarks();
		putwt();
		
		System.out.println("Total marks"+total);
		
	}
}

class Hybrid {

	public static void main(String[] args) {
		result student1 = new result ();
		
		student1.getNumber(578);
		student1.getMarks(28.6f, 33.0f);
		student1.display();

	}

}
