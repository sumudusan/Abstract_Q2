abstract class Vehicle
{
    public String model;

    public Vehicle(String model)
    {
        this.model=model;
    }

    public abstract void start();
    public abstract void stop();
}
