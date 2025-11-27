
//كلاس الوراثه يرث من الاشخاص
public class Beneficiary extends Person {
   private String id; // رقم الهويه
   private String aidType; //نوع المساعده
  

    public Beneficiary(String id, String aidType, String status, String name, String phon) {
        super(name, phon);//تستدعي خصائص الاب
        this.id = id;
        this.aidType = aidType;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAidType() {
        return aidType;
    }

    public void setAidType(String aidType) {
        this.aidType = aidType;
    }

    
    //تخبر المترجم ان هذه الداله تعيد تعريف داله موجوده في السوبر كلاس
     @Override 
     public void displayInfo(){
         System.out.println(":الاسم "+getName());
         System.out.println(":رقم الهويه "+id);
         System.out.println(":رقم الجوال "+getPhon());
         System.out.println(":نوع المساعده "+aidType);
         System.out.println("*****************************");
     
     
     }      
           
    
    
}
