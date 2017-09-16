import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	Scanner sc=new Scanner(System.in);
	//int z=-1;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
	
	Sytem.out.println("the students are");
	for(int i=0;i<=z;i++)
	if (students[i]==NULL{
	throw new IllegalArgumentException();}
	else
	{System.out.println(students[i]);}}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	int i;
	System.out.println("enter the number of students");
	int n=sc.nextInt();
	z=n-1;
        System.out.println("enter the student names");
	for(i=0;i<n;i++)
	{students[i]=sc.next();
	if (students[i]==NULL){
	throw new IllegalArgumentException();}
	}
	
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
	//System.out.println("enter the index positon");
	//int a=sc.nextint();
	if (index==0||index>=students.length();){
	throw new IllegalArgumentException();}
	else{
	System.out.println(students[index]);}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	if (index==0||index>=students.length();){
	throw new IllegalArgumentException();}
	else{
	//System.out.println("enter the student");
	student[index]=student;}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	if(student==NULL)
	{throw new IllegalArgumentException();}
	else{
	int z=students.lenght();
	for(i=z;i>0;i--)	
	{students[i]=students[i-1];
	}
	students[0]=student;}
	}
	@Override
	public void addLast(Student student) {
		// Add your implementation here
	if(student==NULL)
	{throw new IllegalArgumentException();}
	else{
	int z=students.lenght();
	students[z]=student;}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	if(student==NULL||index==0||index>=students.length();)
	{throw new IllegalArgumentException();}
	else
	{int z=students.lenght();
	for(i=z;i>index;i--)
	{students[i]=students[i-1];}
	students[index]=student;
	}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	if(index==0||index>=students.length();)
	{throw new IllegalArgumentException();}
	else{int z=students.lenght();
	z=z-1;
	for(i=index;i<z;i++)
	{students[i]=students[i+1];}
	}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	int index;
	if(student==NULL)
	{throw new IllegalArgumentException();}
	else{
	for(int i=0;i<students.length();i++)
	{if (students[i]==student){
	index=i;
	break;}
	}
	int z=students.lenght();
	z=z-1;
	for(i=index;i<z;i++)
	{students[i]=students[i+1];}
	}}
	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	if(index==0||index>=students.length();)
	{throw new IllegalArgumentException();}
	else{
	int z=students.lenght();
	z=z-1;
	for(i=z;i>index;i--)
	{students[i]=null;}
	}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	int index;
	if(student==NULL)
	{throw new IllegalArgumentException();}
	else{
	for(int i=0;i<students.length();i++)
	{if (students[i]==student){
	index=i;
	break;}}
	int z=students.lenght();
	z=z-1;
	for(i=z;i>index;i--)
	{students[i]=null;}
	}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	if(index==0||index>=students.length();)
	{throw new IllegalArgumentException();}
	else{
	for(i=0;i<index;i++)
	{students[i]=null;}
	}
	}
	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	int index;
	if(student==NULL)
	{throw new IllegalArgumentException();}
	else{
	for(int i=0;i<students.length();i++)
	{if (students[i]==student)
	{index=i;
	break;}}
	for(i=0;i<index;i++)
	{students[i]=null;}
	}
	}
	@Override
	public void bubbleSort() {
		// Add your implementation here
	int n = arr.length;  
        string temp;  
        for(int i=0; i < n; i++){  
        for(int j=1; j < (n-i); j++){  
        if(students[j-1] > students[j]){    
        temp =studenst[j-1];  
        arr[j-1] = students[j];  
        students[j] = temp;  
        }  
        }  
        }  
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
