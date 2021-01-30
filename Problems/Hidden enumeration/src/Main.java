public class Main {

    public static void main(String[] args) {
        int counter = 0;
    for (Secret status : Secret.values()){
        if (status.toString().startsWith("STAR")) {
            counter+=1;
        }
    }
        System.out.println(counter);
    }
}

