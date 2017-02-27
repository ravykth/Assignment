
import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0,n,o,s ;
        Scanner input=new Scanner(System.in);
        
        System.out.print("1.Employee\n2.Developer\n3.TeamLeader\n Please Choice: ");
        choice=input.nextInt();
        switch(choice){
                case 1:{
                    System.out.print("Please Enter Amoung Of Employee Object:");
                    n=input.nextInt();
                    Employee EmpObject[]=new Employee[n];
                    for(int i=0;i<n;i++){
                        double salary;
                        String holiday;
                        int years;
                        String lastName,birthDate,firstName;
                        System.out.print("Please Enter first Name:");
                        firstName=input.next();
                        System.out.print("Please Enter Last Name:");
                        lastName=input.next();
                        System.out.print("Please Enter BirthDate:");
                        birthDate=input.next();
                        System.out.print("Please Enter salary:");
                        salary=input.nextDouble();
                        System.out.print("Please Enter Holiday:");
                        holiday=input.next();
                        System.out.print("Please Enter years:");
                        years=input.nextInt();
                       EmpObject[i]=new Employee(salary, holiday, years, lastName, birthDate, firstName);
                       System.out.print("-----------------------------------");
                    }
                     System.out.println("Info of Employee");
                     for(int i=0;i<n;i++){
                        System.out.println(EmpObject[i].getDataView()); 
                        System.out.println("++++++++++++++++++++++++");
                    }
                    break;
            }
            case 2:{
                  System.out.print("Please Enter Amoung Of Developer Object:");
                o=input.nextInt();
                Developer DevObject[]=new Developer[o];
                for(int i=0;i<o;i++){
                  double salary;
                  String holiday;
                  int years;
                  String lastName,birthDate,firstName,comment;
                  System.out.print("Please Enter first Name:");
                  firstName=input.next();
                  System.out.print("Please Enter Last Name:");
                  lastName=input.next();
                  System.out.print("Please Enter BirthDate:");
                  birthDate=input.next();
                  System.out.print("Please Enter salary:");
                  salary=input.nextDouble();
                  System.out.print("Please Enter Holiday:");
                  holiday=input.next();
                  System.out.print("Please Enter years:");
                  years=input.nextInt();
                  System.out.print("Please Enter Comment:");
                  comment=input.next();
                 DevObject[i]=new Developer(comment, salary, holiday, years, lastName, birthDate, firstName);
                 System.out.println("------------------------------------------------------------------------");
                    }
                System.out.println("Info of Developer");
                for(int i=0;i<o;i++){
                    DevObject[i].Print();
                    System.out.println("++++++++++++++++++++++++");
                }  
                break;
            }
            case 3:{
                System.out.print("Please Enter Amoung Of TeamLeader Object:");
                s=input.nextInt();
                TeamLeader TeamObject[]=new TeamLeader[s];
                for(int i=0;i<s;i++){
                    int ProjectNum;
                      String FullName;
                      System.out.print("Please Enter Project Number:");
                      ProjectNum=input.nextInt();
                      System.out.print("Please Enter Full Name:");
                      FullName=input.next();
                      TeamObject[i]=new TeamLeader(ProjectNum, FullName);
                      System.out.println("------------------------------");
                }
                System.out.println("Info of TeamLeader");
                for(int i=0;i<s;i++){
                    TeamObject[i].Print();
                    System.out.println("++++++++++++++++++++++++");
                }
                break;
            }
        }
}

}
