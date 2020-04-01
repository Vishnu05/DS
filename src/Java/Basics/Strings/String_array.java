package Java.String;

public class String_array {

    public static void main(String[] args) {

        String arr[]={"a","b","c","d"};
        System.out.println(arr[2]);

        String len = "rO0ABXNyACNvcmcubXVsZS5zZXNzaW9uLkRlZmF1bHRNdWxlU2Vzc2lvbi7rdtEW7GGKAwAFWgAFdmFsaWRMAA1mbG93Q29uc3RydWN0dAAmTG9yZy9tdWxlL2FwaS9jb25zdHJ1Y3QvRmxvd0NvbnN0cnVjdDtMAAJpZHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wACnByb3BlcnRpZXN0AA9MamF2YS91dGlsL01hcDtMAA9zZWN1cml0eUNvbnRleHR0ACdMb3JnL211bGUvYXBpL3NlY3VyaXR5L1NlY3VyaXR5Q29udGV4dDt4cAFwdAAkYzIzZWMxZTEtMWUzYS0xMWU5LTg0Y2MtMDAyMzI0OTkyYWM3c3IAJWphdmEudXRpbC5Db2xsZWN0aW9ucyRTeW5jaHJvbml6ZWRNYXAbc/kJS0s5ewMAAkwAAW1xAH4AA0wABW11dGV4dAASTGphdmEvbGFuZy9PYmplY3Q7eHBzcgAkb3JnLm11bGUudXRpbC5DYXNlSW5zZW5zaXRpdmVIYXNoTWFwndHZ72dFzgADAAB4cHcMP0AAAAAAABAAAAAAeHEAfgAJeHB4";
        //System.out.println(len.length());
        System.out.println(len.length());


        float a=Math.round(0.1f)+Math.round(0.2f);
        System.out.println(" "+a==0.3+" "+a);
        System.out.println(a);

        //precision problem
        if(0.1+0.2==0.3){
            System.out.println(true);
        }

        String as="12e3";
        int ad=Integer.parseInt(as);
        System.out.println(ad);

    }
}
