public class Television implements ISwitchable, IPlaySound, IDisplay
{
    private boolean iOnOffStatus;

    public void switchOn()
    {
        if (!iOnOffStatus) { iOnOffStatus = true; }
    }

    @Override
    public void switchOff()
    {
        if (iOnOffStatus) { iOnOffStatus = false; }
    }

    @Override
    public <T> void display(T tDisplayField)
    {
        if (tDisplayField != null)
        {
            System.out.println(tDisplayField);
        }
    }

    @Override
    public void playSound()
    {

    }

    @Override
    public void pauseSound()
    {

    }
}
