class Program38_2 
{

    public static void StrCpyX(char[] src, char[] dest)
     {
        int j = 0;

        for(char c : src) 
            {
            if(c != ' ') 
                {
                dest[j++] = c;
            }
        }
    }

    public static void main(String[] args) 
    {

        char src[] = "Marvel   lous Pyth   on".toCharArray();
        char dest[] = new char[src.length];

        StrCpyX(src, dest);

        System.out.println(new String(dest).trim());
    }
}
