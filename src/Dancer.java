public class Dancer extends Performer{
    private int shoeSize;
    public Dancer(String name, int age, Agent agent, int shoeSize)
    {
        super(name, age, agent);
        this.shoeSize = shoeSize;
    }

    public void pirouette(int spins){
        System.out.println("I am spinning "+ spins + " times!");
    }

    @Override
    public void rehearse(){
        pirouette(3);
        super.rehearse();
    }

    public void perform(boolean warmUp){
        if(warmUp)
        {
            this.rehearse();
        }
        perform();

    }

    public void callAgent(){
        super.callAgent();
        System.out.println("My shoes don’t fit!  Please pick me up a new pair.");
    }

    public void  callAgent(int correctSize){
        this.callAgent();
        System.out.println("I wear size " + correctSize + " by the way!");
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public String getName(){
        return super.getName() + " is a dancer!";
    }
}
