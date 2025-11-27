 
/*:كلاس العمليات الاربع
 اضافه+ تعديل+حذف +عرض +بحث 
*/
import java.util.ArrayList;//لتخزين المستفيدين
import java.util.Scanner;//لادخال بيانات المستخدم
import caritymanagamensystemt.BeneficiaryController;
public class BeneficiaryController {
    
 private ArrayList<Beneficiary> list =new ArrayList<>();
 private Scanner input=new Scanner(System.in);
 
 //دالة اضافة مستفيد
 public void addBeneficitary(){
  System.out.println(":ادخل الاسم ");
  String name=input.nextLine(); //نقرا الاسم من المستخدم
  System.out.println(":ادخل رقم الجوال ");
  String phon=input.nextLine(); //نقرا رقم الجوال من المستخدم
  System.out.println(":ادخل رقم الهويه ");
  String id=input.nextLine(); //نقرا رقم الهويه من المستخد 
  System.out.println(":ادخل نوع المساعده ");
  String aidType=input.nextLine();
  
  BeneficiaryController b =new BeneficiaryController();
  list.add(b);
     System.out.println("********تمت اضافة المستفيد بنجاح**********");}
  
 //عملية تعديل مستفيد
  public void updateBeneficitary(){
     System.out.println(":ادخل رقم الهويه لتعديل المستفيد");
     String id=input.nextLine(); //نقرا رقم الهويه من المستخد 
     
     Beneficiary found =null; //متغير لتخزين المستفيد اذا وجدناه
     for (Beneficiary b :list){ //نبحث داخل قائمة المستفيدين
     if(b.getId().equals(id)){ //اذا رقم الهويةة تطابق
     found=b; //نخزن رقم الهويه هنا
     break;
     }}
     if (found!=null){ //اذا وجدنا المستفيد
         System.out.println(":ادخل رقم جوال جديد");
         found.setPhon(input.nextLine()); //تعديل رقم الجوال
         System.out.println(":ادخل نوع مساعده جديده");
          found.setAidType(input.nextLine()); //تعديل نلوع المساعدة
         System.out.println("***********تم تعديل بيانات المستفيد بنجاح***********");
     }
     //اذا ماوجدنا شيء مستفيد
     else {
         System.out.println("المستفيد غير موجود");
     
     }}
     //حذف مستفيد
      public void deleteBeneficitary(){
     System.out.println(":ادخل رقم الهويه لحذف المستفيد");
     String id=input.nextLine(); //نقرا رقم الهويه من المستخدم 
   
     for (Beneficiary b :list){
       if (b.getId().equals(id)){
       list.remove(b);
           System.out.println("*************تم حذف المستفيد بنجاح*************");
         return ;
       }}
          System.out.println("المستفيد غير موجود ");}
      
      //عرض المستفيدين
       public void displayAll(){
       if(list.isEmpty()){
        System.out.println("");}
       else{
        System.out.println("");
        for (Beneficiary b: list){
         b.displayInfo(); }}}
       
       //البحث عن مستفيد
       // دالة البحث عن مستفيد حسب الاسم أو رقم الهوية
public void searchBeneficiary() {
    System.out.print("أدخل الاسم أو رقم الهوية للبحث: ");
    String key = input.nextLine(); // المستخدم يدخل الاسم أو رقم الهوية

    boolean found = false; // متغير لمعرفة إذا تم العثور على مستفيد

    for (Beneficiary b : list) { // نفحص كل المستفيدين في القائمة
        // إذا الاسم أو رقم الهوية يطابق البحث
        //نقارن الاسم بدون المقارنه بين الحروف الصغيره والكبيره
        if (b.getName().equalsIgnoreCase(key) || b.getId().equals(key)) {
            System.out.println("تم العثور على المستفيد:");
            b.displayInfo(); // عرض بيانات المستفيد
            found = true;
            break; // توقف بعد العثور على أول مستفيد مطابق
        }
    }

    if (!found) {
        System.out.println("لم يتم العثور على المستفيد المطلوب ");
    }
}
}
    

     
      
      
      
      
   
          
          
 

