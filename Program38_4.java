class Program38_4 
{

    public static void StrCpySmall(char[] src, char[] dest)
     {
        for(int i = 0; i < src.length; i++)
             {
            if(src[i] >= 'A' && src[i] <= 'Z') 
                {
                dest[i] = (char)(src[i] + 32);
            } else
                 {
                dest[i] = src[i];
            }
        }
    }

    public static void main(String[] args)
     {

        char src[] = "Marvellous Python 2".toCharArray();
        char dest[] = new char[src.length];

        StrCpySmall(src, dest);

        System.out.println(new String(dest));
    }
}
