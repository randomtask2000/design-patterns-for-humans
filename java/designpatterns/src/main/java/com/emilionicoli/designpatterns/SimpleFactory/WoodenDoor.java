public class WoodenDoor implements Door
{
    protected width;
    protected height;

    public WoodenDoor(float width, float height)
    {
        this.width = width;
        this.height = height;
    }

    public float getWidth()
    {
        return this.width;
    }

    public float getHeight()
    {
        return this.height;
    }
}