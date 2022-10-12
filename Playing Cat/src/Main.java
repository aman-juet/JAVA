abstract class Sample
{
    public int varA;
    Sample ()
    {
        varA = 100;
    }
    abstract public void setVarA (int varA);
    abstract final public void getVarA ();
}
class Test extends Sample
{

    public void setVarA (int varA)
    {
        this.varA = varA;
    }
    final public void getVarA ()
    {
        System.out.println ("varA = " + varA);
    }
    public static void main (String[]args)
    {
        Test obj = new Test ();
        obj.setVarA (200);
        obj.getVarA ();
    }
}