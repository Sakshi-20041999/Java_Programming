class Program38_5 
{

    public static void StrCpyToggle(char[] src, char[] dest)
     {
        for(int i = 0; i < src.length; i++) 
            {
            if(src[i] >= 'A' && src[i] <= 'Z') 
                {
                dest[i] = (char)(src[i] + 32);
            }
            else if(src[i] >= 'a' && src[i] <= 'z') 
                {
                dest[i] = (char)(src[i] - 32);
            }
            else 
                {
                dest[i] = src[i];
            }
        }
    }

    public static void main(String[] args) 
    {

        char src[] = "Marvellous Python 2".toCharArray();
        char dest[] = new char[src.length];

        StrCpyToggle(src, dest);

        System.out.println(new String(dest));
    }
}
