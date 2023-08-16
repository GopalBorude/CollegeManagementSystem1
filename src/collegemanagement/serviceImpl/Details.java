package collegemanagement.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import collegemanagement.model.Batch;
import collegemanagement.model.Course;
import collegemanagement.model.Faculty;
import collegemanagement.model.Student;
import collegemanagement.service.Aes;

public class Details implements Aes {
	Scanner sc = new Scanner(System.in);
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	public void addCourse() {
		Course course = new Course();

		System.out.println("Enter Course id: ");
		
		int cid = sc.nextInt();
		course.setCid(cid);
		System.out.println("Enter Course name: ");
		String cnm = sc.next();
		course.setCname(cnm);
		clist.add(course);
		System.out.println("Course Details added Successfully....");
	}

	public void viewCourse() {
		System.out.println("Following are the course Details:- ");
		for (Course cou : clist) {
			System.out.println("Course Id: " + cou.getCid());
			System.out.println("Course Name: " + cou.getCname());
		}
	}

	public void addFaculty() {
		boolean fflag = false;
		Faculty faculty = new Faculty();
		System.out.println("Enter Faculty id: ");
		int fid = sc.nextInt();
		faculty.setFid(fid);
		System.out.println("Enter Faculty name: ");
		String fnm = sc.next();
		faculty.setFname(fnm);
		System.out.println("Enter course id for faculty: ");
		int cid = sc.nextInt();
		for (Course course : clist) {
			if (cid == course.getCid()) {
				faculty.setCourse(course);
				flist.add(faculty);
				fflag = true;
				break;
			}
		}
		if (fflag == true) {
			System.out.println("Faculty Details added SucessFully......");
		} else {
			System.out.println("please enter valid course id");
		}
	}

	public void viewFaculty(){
		System.out.println("Following are the faculty Details:- ");
		Iterator<Faculty>itr=flist.iterator();
		for(Faculty fac:flist){
		System.out.println("Course Id: "+fac.getCourse().getCid());
		System.out.println("Course Name: "+ fac.getCourse().getCname());
		System.out.println("Faculty Id: "+fac.getFid());
		System.out.println("Faculty Name: "+fac.getFname());
		}
		}

	public void addBatch() {
		boolean bflag = false;
		Batch batch = new Batch();
		System.out.println("Enter Batch id: ");
		int bid = sc.nextInt();
		batch.setBid(bid);
		System.out.println("Enter Batch name: ");
		String bnm = sc.next();
		batch.setBname(bnm);
		System.out.println("Enter faculty id for batch: ");
		int fid = sc.nextInt();
		for (Faculty faculty : flist) {
			if (fid == faculty.getFid()) {
				batch.setFaculty(faculty);
				blist.add(batch);
				bflag = true;
				break;
			}
		}
		if (bflag == true) {
			System.out.println("Batch Details add SucessFully.............");
		} else {
			System.out.println("First add the Faculty");
		}
	}

	public void viewBatch() {
		System.out.println("Following are the batch Details:- ");
		for (Batch bat : blist) {
			System.out.println("Course Id: " + bat.getFaculty().getCourse().getCid());
			System.out.println("Course Name: " + bat.getFaculty().getCourse().getCname());
			System.out.println("Faculty Id: " + bat.getFaculty().getFid());
			System.out.println("Faculty Name: " + bat.getFaculty().getFname());
			System.out.println("Batch Id: " + bat.getBid());
			System.out.println("Batch Name: " + bat.getBname());
		}
	}

	public void addStudent() {
		boolean sflag = false;
		Student student = new Student();
		System.out.println("Enter Student id: ");
		int sid = sc.nextInt();
		student.setSid(sid);
		System.out.println("Enter Student name: ");
		String snm = sc.next();
		student.setSname(snm);
		System.out.println("Enter Batch id for student: ");
		int bid = sc.nextInt();
		for(Student student1:slist){
			if(bid==Batch.getBid()){
			student1.setBatch(Batch);
			slist.add(student1);
			sflag=true;
			break;
			}
		}
		if (sflag == true) {
			System.out.println("Student Details add SucessFully...........");
		} else {
			System.out.println("please enter valid batch id");
		}
	}

	public void viewStudent(){
				System.out.println("Following are the student Details:- ");
				for(Student stu:slist){
				System.out.println("Course Id: "+ stu.getBatch(). getFaculty().
				getCourse(). getCid());
				System.out.println("Course Name: "+stu.getBatch().
				getFaculty().getCourse().getCname());
				System.out.println("Faculty Id: "+ stu.getBatch().
				getFaculty().getFid());
				System.out.println("Faculty Name: "+stu.getBatch().
				getFaculty().getFname());
				

				}
	}
	
				}
