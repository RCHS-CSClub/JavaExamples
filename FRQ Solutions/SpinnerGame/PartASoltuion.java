public class PartASoltuion {
    public int spin(int min, int max)
{
    int result;

    result =(int)(Math.random() * ((max+1)-min) + min);

    return result;

}

}
