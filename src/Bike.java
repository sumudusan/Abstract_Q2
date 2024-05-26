public class Bike extends Vehicle
{
    public Bike(String model)
    {
        super(model);
    }

    @Override
    public void start()
    {
        System.out.println("Bike start");
    }

    public void stop()
    {
        System.out.println("Bike stop");
    }
}
