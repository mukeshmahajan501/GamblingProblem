public class GamblingSimulation{
	//declare constant variable
	final static int STAKE_AMOUNT = 100;
	final static int BET_AMOUNT = 1;
	
	public static void main(String args[]){
	//to get random number between 0 or 1
	int randomCheck = (int)Math.floor(Math.random()*10%2);
	if(randomCheck == 1)
	{
		System.out.println("you won $1");
	}
	else
	{
		System.out.println("you loose $1");
	}

}
	
}
