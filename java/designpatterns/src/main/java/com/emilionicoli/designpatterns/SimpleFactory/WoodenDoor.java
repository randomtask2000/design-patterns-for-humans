public class WoodenDoor implements Door
{
    protected width;
    protected height;

    public WoodenDoor(float width, float height)
    {
        this.width = width;
        this.height = height;
    }

    public void getWidth(): float
    {
        return this.width;
    }

    public void getHeight(): float
    {
        return this.height;
    }
}