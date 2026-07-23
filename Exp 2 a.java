
class Main {

    public static void main(String[] args) {
        String text="Shreyash kapade 9006";
        String result=encrypt(text,3);
        System.out.println("Encryption result of text :"+text+" is :"+result);
        
        System.out.println("Decryption result of text :"+result +" is :"+decrypt(result,3));
        
        
    }
    public static String decrypt( String text,int k)
    {
        return encrypt(text,26-(k%26));
    }
    public static String encrypt( String text,int k)
    {
        StringBuilder sb=new StringBuilder();
        for(char ch:text.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                char c=(char)((ch-'A'+k)%26+'A');
                sb.append(c);
                
            }
            else if(Character.isLowerCase(ch))
            {
                char c=(char)((ch-'a'+k)%26+'a');
                sb.append(c);
                
            }
            else
            {
                sb.append(ch);
                
            }
        }
        return sb.toString();
    }
}
