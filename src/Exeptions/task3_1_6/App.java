package Exeptions.task3_1_6;

public class App {
    public static void main(String[] args) {
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }
public static String getCallerClassAndMethodName() {
   // StackTraceElement[] methods = Thread.currentThread().getStackTrace();
//    StringBuilder str = new StringBuilder();
//    if(methods.length==1){
//        str.append(methods[0].getModuleName());
//    }
//    for (int i = 1; i < methods.length; i++) {
//        str.append(methods[i].getClassName()).append("#").append(methods[i].getMethodName());
//    }

  //  String method = new Throwable().getStackTrace()[1].getMethodName();
   // String class = new Throwable().getStackTrace()[1].getClassName();
    return (new Throwable().getStackTrace().length<3)?null:new Throwable().getStackTrace()[1].getClassName()+"#"+new Throwable().getStackTrace()[1].getMethodName();
}
}


//    if(stackTraceElements.length >= 3) {
//        StackTraceElement element = stackTraceElements[2];
//        String className = element.getClassName();
//        String methodName = element.getMethodName();
//        message = className + ": " + methodName;




