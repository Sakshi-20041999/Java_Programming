class Program38_1 
{

    public static void StrCpyRev(char[] src, char[] dest) 
    {
        int j = 0;
        for(int i = src.length - 1; i >= 0; i--) 
            {
            dest[j++] = src[i];
        }
    }

    public static void main(String[] args)
     {

        char src[] = "Marvellous Python".toCharArray();
        char dest[] = new char[src.length];

        StrCpyRev(src, dest);

        System.out.println(new String(dest));
    }
}

