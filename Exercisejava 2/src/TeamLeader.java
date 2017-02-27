
public class TeamLeader {

	 int ProjectNum;
	    String FullName;

	    public TeamLeader(int ProjectNum, String FullName) {
	        this.ProjectNum = ProjectNum;
	        this.FullName = FullName;
	    }
	   void Print(){
	       System.out.println(ProjectNum+" "+FullName.toUpperCase());
	   }
	}
