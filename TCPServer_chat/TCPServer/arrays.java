import java.net.Socket;
import java.util.ArrayList;


public class arrays {

	private String note ; 
	private Socket incoming;
	private int team ;
	private String nickName;
	
	arrays(String note , Socket incoming , String nickName )
	{
		this.note = note;
		this.incoming = incoming;
		this.team = team ; 
		this.nickName = nickName;
		
	}

	public String getNote() {
		return note;
	}

	

	public Socket getIncoming() {
		return incoming;
	}

	

	public int getTeam() {
		return team;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	
	
}
