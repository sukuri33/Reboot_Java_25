package day2_String;

public class String_Practices {
    public static void main(String[] args) {


        // print 1st and last name but make sure the 1st letter for both are in caps
        String sFname = "shuKur";
        String sLname = "alTaY";
        formatNames(sFname,sLname);


        //print email address by swapping the 1st and lastname.
        String email = "shukur_altay@gmail.com";
        sFname = email.substring(0, email.indexOf("_"));
        sLname = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println(email.replaceAll(email.substring(0,email.indexOf("@")), sLname+"_"+sFname));

        String urlStr = "w.google.gov";
        verifyValidWebAddress(urlStr);

        tipCalculator(4,'Y',100,"Great");
    }

    private static void  verifyValidWebAddress(String url){
/*        String urlPrefix = "";
        String urlSuffix = "";
        if(url.contains(".")){
            urlPrefix = url.substring(0,url.indexOf("."));
            urlSuffix = url.substring(url.lastIndexOf(".")+1,url.length());
        }
        if(urlPrefix.contentEquals("www")){
            if(urlSuffix.contains("com") || urlSuffix.contains("edu") || urlSuffix.contains("gov")){
                System.out.println(url+" is a valid web address");
            }else{
                System.out.println(url+" is not a valid web address");
            }
        }*/
        //below if statement i made a mistake hence if i enter w.google.com my program was printing it is a valid url, which is wrong because of incorrect logical grouping as per ChatGPT
        //if (url.startsWith("www.") && url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"))
        if (url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"))){
            System.out.println(url+" is a valid web address");

        }else{
            System.out.println(url+" is not a valid web address");
        }
    }
    private static void formatNames(String sFname, String sLname){
        //System.out.println(sFname.toLowerCase().replaceFirst(""+sFname.charAt(0), (""+sFname.charAt(0)).toUpperCase())+" "+(sLname.toLowerCase().replaceFirst(""+sLname.charAt(0), (""+sLname.charAt(0)).toUpperCase()))); By me,
        System.out.println(sFname.substring(0,1).toUpperCase() +sFname.substring(1).toLowerCase()+" "+sLname.substring(0,1).toUpperCase() +sLname.substring(1).toLowerCase());//By people smarter than me :)
    }

    private static void tipCalculator(int noOfPpl, char tipSplitFlag,double checkAmnt, String serviceQuality){
        double tipRate = 0;
        switch (serviceQuality){
            case "Excellent": tipRate = 0.25;
            break;
            case "Great": tipRate = 0.20;
            break;
            case "Good": tipRate = 0.15;
            break;
            case "Bad": tipRate = 0.10;
            break;
            case "Poor": tipRate = 0.05;
            break;
            default:
                System.out.println("No such service quality");
                break;
        }

        if (tipSplitFlag == 'N'){
            System.out.println("Total amount: "+(checkAmnt+(checkAmnt*tipRate)));
            System.out.println("Total tip: "+(checkAmnt*tipRate));
        }else if (tipSplitFlag == 'Y'){
            System.out.println("Total amount: "+(checkAmnt+checkAmnt*tipRate));
            System.out.println("Total tip: "+(checkAmnt*tipRate));
            System.out.println("Total person: "+((checkAmnt+checkAmnt*tipRate)/noOfPpl));
            System.out.println("Tip per person: "+(checkAmnt*tipRate/noOfPpl));
        }
    }
}
