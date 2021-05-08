package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";

        // first comma
        System.out.println(technologies.indexOf(","));//4
        // last comma
        System.out.println(technologies.lastIndexOf(","));
        //for middle one, we need to loop

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " +indexOfJava);

        int indexOfCss = technologies.indexOf("Css");
        System.out.println("Css is at index" +indexOfCss);


        int indexOfCucumber = technologies.indexOf("Cucumber");
        System.out.println("Cucumber is at index " +indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index" + indexOfSql);

    if (technologies.contains("maven")) {
        System.out.println("maven is present");
    }else {
        System.out.println("maven is not present");

    }


if (technologies.indexOf("maven")> -1) {
    System.out.println("maven is present");
} else {
    System.out.println("maven is not present");

}
    }
}
