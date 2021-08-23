import java.io.Serializable;

public class Serialpapa implements Serializable{
	 private String username;
	private int userid;
	private
	 String userareaofexpert;
	public Serialpapa() {
	}
		public  void setusername(String  username) {
			this.username=username;
		}
		public  void setuserid(int  userid) {
			this.userid=userid;}
		
		public  void setuserareaofexpert(String  userareaofexpert) {
			this.userareaofexpert=userareaofexpert;
		}
		public String getusername() {
			return username;
		}
		public int getuserid() {
			return userid;
		}
		public  String getuserareaofexpert() {
		return userareaofexpert;
		}
	}

	


