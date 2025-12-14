class Program39_5
{
    public static void Display()
    {
        DisplayX('a');
    }

    public static void DisplayX(char ch)
    {
        if(ch <= 'f')
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
