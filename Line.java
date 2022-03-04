public class Line {
    private int id;
	private static int count = 0;
	private boolean isBusy;
	private String state;

	Line(){
		id = count;
		count++;

		isBusy = false;
		this.state = "idle";
	}

	public String getState(){
		return this.state;
	}

	public int getID(){
		return this.id;
	}

	public void setState(String state){
		this.state = state;
	}

	public String toString(){
		return "Line ID: " + id + ", in state: " + state;
	}
}
