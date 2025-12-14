class Program38_3 
{

    public static void StrCpyCap(char[] src, char[] dest)
     {
        for(int i = 0; i < src.length; i++)
             {
            if(src[i] >= 'a' && src[i] <= 'z')
                 {
                dest[i] = (char)(src[i] - 32);
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

        StrCpyCap(src, dest);

        System.out.println(new String(dest));
    }
}
