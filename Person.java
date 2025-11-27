
//(التجريد)كلاس الاب
public class Person {
 private String name;
 private String phon;
    //conestructer
    public Person(String name, String phon) {
        this.name = name;
        this.phon = phon;
    }
    //(التغليف) جعل  الخصائص الخاصه
    //getters and setters استخدام دوال
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }
    //(تعدد الاشكال) دالة لعرض جميع المعلومات
    //سيتم اعادة تعريفها في الوريث
    public void displayInfo(){ 
        System.out.println(" :الاسم"+name);
        System.out.println(" :رقم الجوال"+phon);
    
    }
    
    
}
