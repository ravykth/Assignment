import java.util.*;

public class DCommon {
	 int id ;
	    String CreatedDate ,UpdatedDate,Createdby,Updatedby,State,Version ;

	    public DCommon(int id, String CreatedDate, String UpdatedDate, String Createdby, String Updatedby, String State, String Version) {
	        this.id = id;
	        this.CreatedDate = CreatedDate;
	        this.UpdatedDate = UpdatedDate;
	        this.Createdby = Createdby;
	        this.Updatedby = Updatedby;
	        this.State = State;
	        this.Version = Version;
	    }

	    int getid(){
	        return id;
	    }
	    String getCreatedDate(){
	        return CreatedDate;
	    }
	    String getUpdatedDate(){
	        return UpdatedDate;
	    }
	    String getCreatedby(){
	        return Createdby;
	    }
	    String getUpdatedby(){
	        return Updatedby;
	    }
	    String getState(){
	        return State;
	    }
	    String getVersion(){
	        return Version;
	    }
	    void print(){
	        System.out.println("id: "+id+"CreatedDate: "+CreatedDate+"UpdatedDate: "+UpdatedDate+"Createdby: "+Createdby+"Updatedby: "+Updatedby+
	                "State: "+State+"Version: "+Version);
	    }
	    
	}
