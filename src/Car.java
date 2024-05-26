public class Car extends Vehicle
{
    public Car(String model)
    {
        super(model);
    }

    @Override
    public void start()
    {
        System.out.println("Car Start");
    }

    public void stop()
    {
        System.out.println("car stop");
    }
}
