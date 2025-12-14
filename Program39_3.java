class Program39_3
{
    public static void Display()
    {
        DisplayX(5);
    }

    public static void DisplayX(int i)
    {
        if(i >= 1)
        {
            System.out.print(i + "\t");
            DisplayX(i - 1);
        }
    }

    public static void main(String[] args)
    {
        Display();
    }
}
