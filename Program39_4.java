class Program39_4
{
    public static void Display()
    {
        DisplayX('A');
    }

    public static void DisplayX(char ch)
    {
        if(ch <= 'F')
        {
            System.out.print(ch + "\t");
            DisplayX((char)(ch + 1));
        }
    }

    public static void main(String[] args)
    {
        Display();
    }
}
