class Program39_1
{
    public static void Display()
    {
        DisplayX(1);
    }

    public static void DisplayX(int i)
    {
        if(i <= 5)
        {
            System.out.print("*\t");
            DisplayX(i + 1);
        }
    }

    public static void main(String[] args)
    {
        Display();
    }
}
